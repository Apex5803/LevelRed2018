package org.usfirst.frc.team5803.robot.commands.armCommands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5803.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class RotateArmAngle extends Command {
	private double angle;

	public RotateArmAngle(double setAngle) {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.kArm);
		this.angle = setAngle;
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.kArm.moveTo(this.angle);
	}
	
	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		double movevalue = Robot.kArm.vgiver();
		double targetvalue=this.angle*4096/360;
		//System.out.println("In isFinished() before check, value: " + movevalue + "target: " + targetvalue);

		if((targetvalue+10)<movevalue || movevalue<(targetvalue-10)) {
			//System.out.println("I'm not finished, value: " + movevalue + "target: " + targetvalue);
			return false;	
		}
		else return true;
	}
	
	@Override
	protected void end() {
		Robot.kArm.move(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
 