package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class CrossTheLineArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (10.00,0.00,0.00)
	
    public CrossTheLineArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CrossTheLineArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.564,11.280,10.000,0.000},
				{2.820,33.840,10.000,0.000},
				{7.896,67.680,10.000,0.000},
				{16.920,112.801,10.000,0.000},
				{31.020,169.201,10.000,0.000},
				{51.324,236.881,10.000,0.000},
				{78.960,315.841,10.000,0.000},
				{115.057,406.082,10.000,0.000},
				{160.741,507.602,10.000,0.000},
				{217.141,620.403,10.000,0.000},
				{285.385,744.483,10.000,0.000},
				{366.602,879.844,10.000,0.000},
				{461.918,1026.485,10.000,0.000},
				{572.463,1184.406,10.000,0.000},
				{698.799,1342.326,10.000,0.000},
				{840.928,1500.247,10.000,0.000},
				{998.849,1658.168,10.000,0.000},
				{1172.561,1816.089,10.000,0.000},
				{1362.066,1974.009,10.000,0.000},
				{1567.363,2131.930,10.000,0.000},
				{1788.452,2289.851,10.000,0.000},
				{2025.333,2447.771,10.000,0.000},
				{2278.007,2605.692,10.000,0.000},
				{2546.472,2763.613,10.000,0.000},
				{2830.729,2921.534,10.000,0.000},
				{3130.779,3079.454,10.000,0.000},
				{3446.620,3237.375,10.000,0.000},
				{3778.254,3395.296,10.000,0.000},
				{4125.679,3553.217,10.000,0.000},
				{4488.897,3711.137,10.000,0.000},
				{4867.907,3869.058,10.000,0.000},
				{5262.709,4026.979,10.000,0.000},
				{5673.303,4184.900,10.000,0.000},
				{6099.689,4342.820,10.000,0.000},
				{6541.867,4500.741,10.000,0.000},
				{6999.837,4658.662,10.000,0.000},
				{7473.599,4816.583,10.000,0.000},
				{7963.153,4974.503,10.000,0.000},
				{8468.500,5132.424,10.000,0.000},
				{8989.638,5290.345,10.000,0.000},
				{9526.569,5448.266,10.000,0.000},
				{10079.291,5606.186,10.000,0.000},
				{10647.806,5764.107,10.000,0.000},
				{11232.113,5922.028,10.000,0.000},
				{11832.211,6079.948,10.000,0.000},
				{12448.102,6237.869,10.000,0.000},
				{13079.785,6395.790,10.000,0.000},
				{13727.260,6553.711,10.000,0.000},
				{14390.527,6711.631,10.000,0.000},
				{15069.587,6869.552,10.000,0.000},
				{15764.438,7027.473,10.000,0.000},
				{16475.081,7185.394,10.000,0.000},
				{17201.517,7343.314,10.000,0.000},
				{17943.744,7501.235,10.000,0.000},
				{18701.764,7659.156,10.000,0.000},
				{19475.575,7817.077,10.000,0.000},
				{20265.179,7974.997,10.000,0.000},
				{21070.575,8132.918,10.000,0.000},
				{21891.763,8290.839,10.000,0.000},
				{22728.742,8448.760,10.000,0.000},
				{23581.514,8606.680,10.000,0.000},
				{24450.079,8764.601,10.000,0.000},
				{25334.435,8922.522,10.000,0.000},
				{26234.583,9080.443,10.000,0.000},
				{27150.523,9238.363,10.000,0.000},
				{28082.256,9396.284,10.000,0.000},
				{29029.780,9554.205,10.000,0.000},
				{29993.096,9712.125,10.000,0.000},
				{30972.205,9870.046,10.000,0.000},
				{31967.106,10027.967,10.000,0.000},
				{32977.798,10185.888,10.000,0.000},
				{34004.283,10343.808,10.000,0.000},
				{35046.560,10501.729,10.000,0.000},
				{36104.629,10659.650,10.000,0.000},
				{37178.490,10817.571,10.000,0.000},
				{38268.143,10975.491,10.000,0.000},
				{39373.588,11133.412,10.000,0.000},
				{40494.826,11291.333,10.000,0.000},
				{41631.855,11449.254,10.000,0.000},
				{42784.676,11607.174,10.000,0.000},
				{43953.290,11765.095,10.000,0.000},
				{45137.695,11923.016,10.000,0.000},
				{46337.893,12080.937,10.000,0.000},
				{47553.883,12238.857,10.000,0.000},
				{48785.664,12396.778,10.000,0.000},
				{50033.238,12554.699,10.000,0.000},
				{51296.604,12712.620,10.000,0.000},
				{52575.762,12870.540,10.000,0.000},
				{53870.712,13028.461,10.000,0.000},
				{55181.454,13186.382,10.000,0.000},
				{56507.989,13344.302,10.000,0.000},
				{57850.315,13502.223,10.000,0.000},
				{59208.433,13660.144,10.000,0.000},
				{60582.344,13818.065,10.000,0.000},
				{61972.046,13975.985,10.000,0.000},
				{63377.541,14133.906,10.000,0.000},
				{64798.827,14291.827,10.000,0.000},
				{66235.906,14449.748,10.000,0.000},
				{67688.777,14607.668,10.000,0.000},
				{69157.440,14765.589,10.000,0.000},
				{70641.895,14923.510,10.000,0.000},
				{72142.142,15081.431,10.000,0.000},
				{73658.181,15239.351,10.000,0.000},
				{75190.012,15397.272,10.000,0.000},
				{76737.635,15555.193,10.000,0.000},
				{78301.051,15713.114,10.000,0.000},
				{79879.694,15859.754,10.000,0.000},
				{81472.438,15995.115,10.000,0.000},
				{83078.153,16119.195,10.000,0.000},
				{84695.713,16231.996,10.000,0.000},
				{86323.988,16333.516,10.000,0.000},
				{87961.852,16423.757,10.000,0.000},
				{89608.176,16502.717,10.000,0.000},
				{91261.831,16570.398,10.000,0.000},
				{92921.691,16626.798,10.000,0.000},
				{94586.627,16671.918,10.000,0.000},
				{96255.511,16705.758,10.000,0.000},
				{97927.215,16728.318,10.000,0.000},
				{99600.424,16735.861,10.000,0.000},
				{101273.259,16720.843,10.000,0.000},
				{102944.028,16694.545,10.000,0.000},
				{104611.604,16656.968,10.000,0.000},
				{106274.858,16608.110,10.000,0.000},
				{107932.662,16547.972,10.000,0.000},
				{109583.888,16476.554,10.000,0.000},
				{111227.409,16393.856,10.000,0.000},
				{112862.095,16299.878,10.000,0.000},
				{114486.820,16194.620,10.000,0.000},
				{116100.455,16078.081,10.000,0.000},
				{117701.872,15950.263,10.000,0.000},
				{119289.944,15811.165,10.000,0.000},
				{120863.541,15660.787,10.000,0.000},
				{122421.724,15502.866,10.000,0.000},
				{123964.115,15344.945,10.000,0.000},
				{125490.713,15187.024,10.000,0.000},
				{127001.519,15029.104,10.000,0.000},
				{128496.534,14871.183,10.000,0.000},
				{129975.756,14713.262,10.000,0.000},
				{131439.186,14555.342,10.000,0.000},
				{132886.824,14397.421,10.000,0.000},
				{134318.670,14239.500,10.000,0.000},
				{135734.724,14081.579,10.000,0.000},
				{137134.986,13923.659,10.000,0.000},
				{138519.456,13765.738,10.000,0.000},
				{139888.134,13607.817,10.000,0.000},
				{141241.020,13449.896,10.000,0.000},
				{142578.113,13291.976,10.000,0.000},
				{143899.415,13134.055,10.000,0.000},
				{145204.924,12976.134,10.000,0.000},
				{146494.641,12818.213,10.000,0.000},
				{147768.567,12660.293,10.000,0.000},
				{149026.700,12502.372,10.000,0.000},
				{150269.041,12344.451,10.000,0.000},
				{151495.590,12186.530,10.000,0.000},
				{152706.347,12028.610,10.000,0.000},
				{153901.312,11870.689,10.000,0.000},
				{155080.485,11712.768,10.000,0.000},
				{156243.866,11554.847,10.000,0.000},
				{157391.454,11396.927,10.000,0.000},
				{158523.251,11239.006,10.000,0.000},
				{159639.256,11081.085,10.000,0.000},
				{160739.468,10923.164,10.000,0.000},
				{161823.889,10765.244,10.000,0.000},
				{162892.517,10607.323,10.000,0.000},
				{163945.353,10449.402,10.000,0.000},
				{164982.397,10291.482,10.000,0.000},
				{166003.649,10133.561,10.000,0.000},
				{167009.110,9975.640,10.000,0.000},
				{167998.777,9817.719,10.000,0.000},
				{168972.653,9659.799,10.000,0.000},
				{169930.737,9501.878,10.000,0.000},
				{170873.029,9343.957,10.000,0.000},
				{171799.529,9186.036,10.000,0.000},
				{172710.236,9028.116,10.000,0.000},
				{173605.152,8870.195,10.000,0.000},
				{174484.275,8712.274,10.000,0.000},
				{175347.607,8554.353,10.000,0.000},
				{176195.146,8396.433,10.000,0.000},
				{177026.893,8238.512,10.000,0.000},
				{177842.848,8080.591,10.000,0.000},
				{178643.011,7922.670,10.000,0.000},
				{179427.382,7764.750,10.000,0.000},
				{180195.961,7606.829,10.000,0.000},
				{180948.748,7448.908,10.000,0.000},
				{181685.743,7290.987,10.000,0.000},
				{182406.946,7133.067,10.000,0.000},
				{183112.356,6975.146,10.000,0.000},
				{183801.975,6817.225,10.000,0.000},
				{184475.801,6659.305,10.000,0.000},
				{185133.836,6501.384,10.000,0.000},
				{185776.078,6343.463,10.000,0.000},
				{186402.528,6185.542,10.000,0.000},
				{187013.187,6027.622,10.000,0.000},
				{187608.053,5869.701,10.000,0.000},
				{188187.127,5711.780,10.000,0.000},
				{188750.409,5553.859,10.000,0.000},
				{189297.899,5395.939,10.000,0.000},
				{189829.596,5238.018,10.000,0.000},
				{190345.502,5080.097,10.000,0.000},
				{190845.616,4922.176,10.000,0.000},
				{191329.937,4764.256,10.000,0.000},
				{191798.467,4606.335,10.000,0.000},
				{192251.204,4448.414,10.000,0.000},
				{192688.150,4290.493,10.000,0.000},
				{193109.303,4132.573,10.000,0.000},
				{193514.664,3974.652,10.000,0.000},
				{193904.233,3816.731,10.000,0.000},
				{194278.011,3658.810,10.000,0.000},
				{194635.996,3500.890,10.000,0.000},
				{194978.189,3342.969,10.000,0.000},
				{195304.589,3185.048,10.000,0.000},
				{195615.198,3027.128,10.000,0.000},
				{195910.015,2869.207,10.000,0.000},
				{196189.040,2711.286,10.000,0.000},
				{196452.272,2553.365,10.000,0.000},
				{196699.713,2395.445,10.000,0.000},
				{196931.361,2237.524,10.000,0.000},
				{197147.217,2079.603,10.000,0.000},
				{197347.282,1921.682,10.000,0.000},
				{197531.554,1763.762,10.000,0.000},
				{197700.034,1605.841,10.000,0.000},
				{197852.722,1447.920,10.000,0.000},
				{197989.618,1289.999,10.000,0.000},
				{198110.722,1132.079,10.000,0.000},
				{198216.221,977.896,10.000,0.000},
				{198306.865,834.992,10.000,0.000},
				{198383.783,703.369,10.000,0.000},
				{198448.103,583.027,10.000,0.000},
				{198500.952,473.964,10.000,0.000},
				{198543.460,376.181,10.000,0.000},
				{198576.753,289.678,10.000,0.000},
				{198601.959,214.455,10.000,0.000},
				{198620.208,150.513,10.000,0.000},
				{198632.626,97.850,10.000,0.000},
				{198640.342,56.467,10.000,0.000},
				{198644.483,26.365,10.000,0.000},
				{198646.179,7.542,10.000,0.000},
				{198646.556,0.000,10.000,0.000},
				{198646.556,0.000,10.000,0.000}		};

}