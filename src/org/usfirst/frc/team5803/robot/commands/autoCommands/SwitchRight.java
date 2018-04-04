package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchArc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt2Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt3Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt4Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToLeftSwitchPt5Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchArc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt2Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt3Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt4Arc;
import org.usfirst.frc.team5803.robot.arcs.CenterToRightSwitchPt5Arc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import org.usfirst.frc.team5803.robot.commands.armCommands.LockArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.EatCubeStandard;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeAuto;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeStandard;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.models.*;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with motion profiling.
 * It will drive forward 5 feet. 
 */
public class SwitchRight extends CommandGroup {
//	SrxTrajectoryImporter importer = new SrxTrajectoryImporter("/home/lvuser/Autos");
//	SrxTrajectory toFollow = null;
    public SwitchRight() {
//        	try {
//    			this.toFollow = importer.importSrxTrajectory("SwitchRight");
//    			System.out.println("import" + this.toFollow); 
//    		} catch (IOException | ParseException e) {
//    			// TODO Auto-generated catch block
//    			e.printStackTrace();
//    		}
//        	
        addParallel(new IntakeCreep(), 3);
    	addParallel(new FollowArc(new CenterToRightSwitchArc()));
//    	//addSequential(new IntakeCreep(), 1);
    	System.out.println("Driving SwitchRight");
    	addSequential(new WaitCommand(2.5));
    	addSequential(new ReleaseArm() , 0.1);
    	addSequential(new RotateArmAngle(40), .5);        	
    	addSequential(new SpitCubeAuto(), .5);
    	addSequential(new LockArm() , 0.1);  	
    	addParallel(new FollowArc(new CenterToRightSwitchPt2Arc()));
    	addSequential(new WaitCommand(1));
    	addParallel(new RotateArmAngle(5), .5);
    	addParallel(new EatCubeStandard(), 3.5);
    	addSequential(new WaitCommand(2));
    	addSequential (new FollowArc(new CenterToRightSwitchPt3Arc()));
    	addParallel(new IntakeCreep(), 3);
    	addSequential (new FollowArc(new CenterToRightSwitchPt4Arc()));
    	addParallel(new RotateArmAngle(40), .5);        	
    	addSequential (new FollowArc(new CenterToRightSwitchPt5Arc()));
    	addSequential(new SpitCubeAuto(), .5);
    	addSequential(new LockArm() , 0.1);
    }
}
