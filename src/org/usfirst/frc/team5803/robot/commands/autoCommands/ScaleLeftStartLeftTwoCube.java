package org.usfirst.frc.team5803.robot.commands.autoCommands;

import org.usfirst.frc.team5803.robot.arcs.ScaleLeftStartLeftArc;
import org.usfirst.frc.team5803.robot.arcs.ScaleLeftStartLeftTwoCubeArc;
import org.usfirst.frc.team5803.robot.arcs.ScaleLeftStartLeftpt2Arc;
import org.usfirst.frc.team5803.robot.arcs.ScaleLeftStartLeftpt3Arc;
import org.usfirst.frc.team5803.robot.arcs.ScaleRightStartRightArc;
import org.usfirst.frc.team5803.robot.arcs.ScaleRightStartRightpt2Arc;
import org.usfirst.frc.team5803.robot.arcs.ScaleRightStartRightpt3Arc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
import org.usfirst.frc.team5803.robot.commands.armCommands.LockArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.EatCubeStandard;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class ScaleLeftStartLeftTwoCube extends CommandGroup {
	public ScaleLeftStartLeftTwoCube() {
		addParallel(new IntakeCreep(), 3);
		addSequential(new FollowArc(new ScaleLeftStartLeftTwoCubeArc()));
		// //addSequential(new IntakeCreep(), 1);
		System.out.println("Driving ScaleLeftTwoCube");
		addSequential(new ReleaseArm(), 0.1);
		addSequential(new RotateArmAngle(80));
		addSequential(new PunchCube(), 0.5);
		addParallel(new RetractPuncher(), 0.1); 
		addParallel(new ReleaseArm(), 0.1);
		addSequential (new RotateArmAngle(5));
		addParallel(new LockArm(), 0.1);
		addParallel(new EatCubeStandard(), 3.5);
		addSequential(new FollowArc(new ScaleLeftStartLeftpt2Arc()));
		addSequential(new FollowArc(new ScaleLeftStartLeftpt3Arc()));
		addParallel(new IntakeCreep(), 4);
		addSequential(new RotateArmAngle(80));
		addSequential(new PunchCube(), 1);
		addSequential(new RetractPuncher(), 1); 
		addSequential(new LockArm(), 0.1);
	}
}