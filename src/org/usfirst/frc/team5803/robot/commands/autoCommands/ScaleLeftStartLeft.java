package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.arcs.ScaleLeftStartLeftArc;
import org.usfirst.frc.team5803.robot.arcs.ScaleLeftStartRightArc;
import org.usfirst.frc.team5803.robot.arcs.ScaleRightStartRightArc;
import org.usfirst.frc.team5803.robot.commands.FollowArc;
//import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
//import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
//import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.SpitCubeManual;
import org.usfirst.frc.team5803.robot.commands.driveBaseCommands.Drive;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.models.*;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with motion profiling.
 * It will drive forward 5 feet. 
 */
public class ScaleLeftStartLeft extends CommandGroup {
//	SrxTrajectoryImporter importer = new SrxTrajectoryImporter("/home/lvuser/Autos");
//	SrxTrajectory toFollow = null;
    public ScaleLeftStartLeft() {
//        	try {
//    			this.toFollow = importer.importSrxTrajectory("ScaleLeftStartLeft");
//    			System.out.println("import" + this.toFollow); 
//    		} catch (IOException | ParseException e) {
//    			// TODO Auto-generated catch block
//    			e.printStackTrace();
//    		}
    	addParallel(new IntakeCreep(), 6);
    	addSequential(new FollowArc(new ScaleLeftStartLeftArc()));
    	System.out.println("Driving ScaleLeftStartLeft");
    	addSequential(new RotateArmAngle(80), 2);
    	addSequential(new PunchCube(), 2);
    	addSequential(new RetractPuncher());
    }
}
