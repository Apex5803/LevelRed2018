package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class OneFootArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (1.00,0.00,0.00)
	
    public OneFootArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public OneFootArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.077,1.531,10.000,0.000},
				{0.383,4.593,10.000,0.000},
				{1.072,9.186,10.000,0.000},
				{2.297,15.311,10.000,0.000},
				{4.210,22.966,10.000,0.000},
				{6.966,32.152,10.000,0.000},
				{10.717,42.870,10.000,0.000},
				{15.617,55.118,10.000,0.000},
				{21.818,68.898,10.000,0.000},
				{29.473,84.209,10.000,0.000},
				{38.736,101.050,10.000,0.000},
				{49.760,119.423,10.000,0.000},
				{62.697,139.327,10.000,0.000},
				{77.702,160.762,10.000,0.000},
				{94.926,183.728,10.000,0.000},
				{114.524,208.225,10.000,0.000},
				{136.648,234.253,10.000,0.000},
				{161.451,261.813,10.000,0.000},
				{189.087,290.903,10.000,0.000},
				{219.708,321.524,10.000,0.000},
				{253.392,352.146,10.000,0.000},
				{290.061,381.236,10.000,0.000},
				{329.562,408.795,10.000,0.000},
				{371.743,434.823,10.000,0.000},
				{416.451,459.320,10.000,0.000},
				{463.531,482.286,10.000,0.000},
				{512.831,503.721,10.000,0.000},
				{564.199,523.625,10.000,0.000},
				{617.480,541.998,10.000,0.000},
				{672.522,558.840,10.000,0.000},
				{729.171,574.151,10.000,0.000},
				{787.275,587.930,10.000,0.000},
				{846.681,600.179,10.000,0.000},
				{907.234,610.896,10.000,0.000},
				{968.783,620.083,10.000,0.000},
				{1031.174,627.738,10.000,0.000},
				{1094.254,633.862,10.000,0.000},
				{1157.870,638.455,10.000,0.000},
				{1221.869,641.518,10.000,0.000},
				{1286.097,643.049,10.000,0.000},
				{1350.368,642.360,10.000,0.000},
				{1414.493,640.141,10.000,0.000},
				{1478.319,636.391,10.000,0.000},
				{1541.694,631.109,10.000,0.000},
				{1604.465,624.297,10.000,0.000},
				{1666.477,615.953,10.000,0.000},
				{1727.579,606.079,10.000,0.000},
				{1787.616,594.673,10.000,0.000},
				{1846.437,581.736,10.000,0.000},
				{1903.887,567.268,10.000,0.000},
				{1959.814,551.270,10.000,0.000},
				{2014.064,533.740,10.000,0.000},
				{2066.485,514.679,10.000,0.000},
				{2116.924,494.087,10.000,0.000},
				{2165.226,471.963,10.000,0.000},
				{2211.240,448.309,10.000,0.000},
				{2254.811,423.124,10.000,0.000},
				{2295.788,396.407,10.000,0.000},
				{2334.016,368.160,10.000,0.000},
				{2369.343,338.382,10.000,0.000},
				{2401.650,307.760,10.000,0.000},
				{2430.930,277.827,10.000,0.000},
				{2457.292,249.425,10.000,0.000},
				{2480.891,222.554,10.000,0.000},
				{2501.880,197.214,10.000,0.000},
				{2520.411,173.405,10.000,0.000},
				{2536.637,151.127,10.000,0.000},
				{2550.713,130.380,10.000,0.000},
				{2562.790,111.165,10.000,0.000},
				{2573.022,93.480,10.000,0.000},
				{2581.563,77.327,10.000,0.000},
				{2588.564,62.704,10.000,0.000},
				{2594.180,49.613,10.000,0.000},
				{2598.563,38.052,10.000,0.000},
				{2601.867,28.023,10.000,0.000},
				{2604.244,19.525,10.000,0.000},
				{2605.849,12.558,10.000,0.000},
				{2606.833,7.122,10.000,0.000},
				{2607.349,3.217,10.000,0.000},
				{2607.552,0.843,10.000,0.000},
				{2607.595,0.000,10.000,0.000},
				{2607.595,0.000,10.000,0.000}		};

}