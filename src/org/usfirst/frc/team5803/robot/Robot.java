// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team5803.robot;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team5803.robot.commands.*;
import org.usfirst.frc.team5803.robot.commands.driveBaseCommands.Drive;
//import org.usfirst.frc5803.RobotTestBench.commands.autonomous.DriveForwardFiveFeet;
import org.usfirst.frc.team5803.robot.subsystems.*;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {

    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();
	public static TalonSRX Arm1;
	public static VictorSPX Arm2;
	
    public static OI oi;
    public static DriveBase driveTrain;
    public static Arm arm;
    public static CubeEater kCubeEater;
    
    
    
    Compressor compressor = new Compressor (0);
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {

    	
    	RobotMap.init();



    	CameraServer.getInstance().startAutomaticCapture();
	    //camera->SetResolution(320., 240.);
    	  
        Arm1 = new TalonSRX(PortMap.ARM_EXTENDER_FOLLOWER);
		int absolutePosition = Arm1.getSensorCollection().getPulseWidthPosition();
		absolutePosition &= 0xFFF;
		Arm1.setSelectedSensorPosition(absolutePosition - 3220, 0, 0);
		System.out.println("Set arm encoder 0");
		
		Arm1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
		Arm1.setInverted(false);
		Arm1.setSensorPhase(true);
//		Arm1.configForwardSoftLimitEnable(false, 0);		
		Arm1.configForwardSoftLimitEnable(true, 0);
		Arm1.configForwardSoftLimitThreshold(1350,0); //max = ~1100 
//		Arm1.configReverseSoftLimitEnable(false, 0);		
		Arm1.configReverseSoftLimitEnable(true, 0);
		Arm1.configReverseSoftLimitThreshold(-20,0);
		Arm1.configMotionCruiseVelocity(1000,0);
		Arm1.configMotionAcceleration(1000,0);
		Arm1.configNominalOutputForward(0, 0);
		Arm1.configNominalOutputReverse(0, 0);
		Arm1.configPeakOutputForward(1, 0);
		Arm1.configPeakOutputReverse(-0.1, 0);
		Arm1.configAllowableClosedloopError(10, 0, 0);
		//ARM2 RUNS THE SAME DIRECTION AS ARM1
		Arm2 = new VictorSPX(PortMap.ARM_FOLLOWER);
		Arm2.follow(Arm1);
		Arm2.setInverted(false);
	
        
        
        driveTrain = new DriveBase();
        arm = new Arm();
        kCubeEater = new CubeEater();
        compressor.setClosedLoopControl(true);
        arm.configPIDF(2.2, 0, 0, 1.6);
        // p = 1.8 
        arm.configPIDFextender(0.2, 0, 0, 0); 
        

        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();
//        int absolutePosition = RobotMap.Arm1.getSensorCollection().getPulseWidthPosition() - 9230;
		/* mask out overflows, keep bottom 12 bits */
//		absolutePosition &= 0xFFF;
//		absolutePosition *= -1;
//		if (Constants.kSensorPhase)
//			absolutePosition *= -1;
//		if (Constants.kMotorInvert)
//			absolutePosition *= -1;
		/* set the quadrature (relative) sensor to match absolute */
//		RobotMap.Arm1.setSelectedSensorPosition(absolutePosition, 0, 0);
//RobotMap.Extender1.setSelectedSensorPosition(0, 0, 0);

/*
 * lets grab the 360 degree position of the MagEncoder's absolute
 * position, and intitally set the relative sensor to match.
 */
//int absolutePosition1 = RobotMap.Extender1.getSensorCollection().getPulseWidthPosition() - 5030;
/* mask out overflows, keep bottom 12 bits */
//absolutePosition1 &= 0xFFF;
//if (0)
//	absolutePosition1 *= -1;
//if (0)
//	absolutePosition1 *= -1;
/* set the quadrature (relative) sensor to match absolute */
	RobotMap.Extender1.setSelectedSensorPosition(0, 0, 0);

        // Add commands to Autonomous Sendable Chooser

        //chooser.addDefault("Autonomous Command", new AutonomousCommand());
        //chooser.addObject("other auto", new AutonomousCommand());

        SmartDashboard.putData("Auto mode", chooser);
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){

    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Arm 1 encoderPosition", Arm1.getSelectedSensorPosition(0));
        //3SmartDashboard.putNumber("Arm1 encoder speed", RobotMap.Arm1.getSelectedSensorVelocity(0));
        SmartDashboard.putNumber("L1 encoderPosition", RobotMap.L1.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("R1 encoderPosition", RobotMap.R1.getSelectedSensorPosition(0));
        //SmartDashboard.putNumber("Extender2 encoderPosition", RobotMap.Extender2.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("Extender1 encoderPosition", RobotMap.Extender1.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("RollerT1 encoder Postion", RobotMap.RollerT1.getSelectedSensorPosition(0));
//		SmartDashboard.putNumber("RobotAngle", 50. * OI.xbox2.getY(Hand.kLeft));;

    }

    @Override
    public void autonomousInit() {
    	/*
        autonomousCommand = chooser.getSelected();
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    */
    	//autonomousCommand = new DriveForwardFiveFeet();
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
    	Scheduler.getInstance().run();
    	 //SmartDashboard.putNumber("Left Encoder Position", RobotMap.driveTrainDriveTrainL1.getSelectedSensorPosition(0));
         //SmartDashboard.putNumber("Left Encoder Velocity", RobotMap.driveTrainDriveTrainL1.getSelectedSensorVelocity(0));
         //SmartDashboard.putNumber("Right Encoder Position", RobotMap.driveTrainDriveTrainR1.getSelectedSensorPosition(0));
         //SmartDashboard.putNumber("Right Encoder Velocity", RobotMap.driveTrainDriveTrainR1.getSelectedSensorVelocity(0));

    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        arm.secure();
        arm.IsSecured = true;
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("Arm 1 encoderPosition", Arm1.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("Extender1 encoderPosition", RobotMap.Extender1.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("RollerT1 encoder position", RobotMap.RollerT1.getSelectedSensorPosition(0));
        SmartDashboard.putNumber("Arm1 encoder speed", Arm1.getSelectedSensorVelocity(0));
       
		SmartDashboard.putNumber("Intake Power", OI.xbox2.getTriggerAxis(Hand.kLeft));

        //SmartDashboard.putNumber("Arm 1 error", RobotMap.Arm1.get)
//		SmartDashboard.putNumber("RobotAngle", 50. * OI.xbox2.getY(Hand.kLeft));;

    }
}
