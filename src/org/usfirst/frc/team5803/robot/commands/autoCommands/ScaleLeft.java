package org.usfirst.frc.team5803.robot.commands.autoCommands;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.usfirst.frc.team5803.robot.models.SrxTrajectory;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectoryImporter;
import org.usfirst.frc.team5803.robot.commands.FollowTrajectory;
import org.usfirst.frc.team5803.robot.commands.armCommands.ReleaseArm;
import org.usfirst.frc.team5803.robot.commands.armCommands.RotateArmAngle;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.IntakeCreep;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.PunchCube;
import org.usfirst.frc.team5803.robot.commands.cubeCommands.RetractPuncher;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team5803.robot.utils.*;
import org.usfirst.frc.team5803.robot.models.*;

/**
 * This autonomous routine is used for tuning the FollowTrajectory command with motion profiling.
 * It will drive forward 5 feet. 
 */
public class ScaleLeft extends CommandGroup {
	SrxTrajectoryImporter importer = new SrxTrajectoryImporter("/home/lvuser/Autos");
	SrxTrajectory toFollow = null;
    public ScaleLeft() {
        	try {
    			this.toFollow = importer.importSrxTrajectory("ScaleLeft");
    			System.out.println("import" + this.toFollow); 
    		} catch (IOException | ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        	addSequential(new IntakeCreep());
        	addParallel(new FollowTrajectory("ScaleLeft"));
        	System.out.println("Driving ScaleLeft");
        	addSequential(new RotateArmAngle(75), 2);
        	addSequential(new PunchCube(), 2);
        	addSequential(new RetractPuncher());
    }
}
