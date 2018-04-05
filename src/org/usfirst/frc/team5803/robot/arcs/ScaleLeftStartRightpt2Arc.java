package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class ScaleLeftStartRightpt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (10.00,0.00,0.00)
	
    public ScaleLeftStartRightpt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public ScaleLeftStartRightpt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.076,-1.518,10.000,0.000},
				{-0.379,-4.553,10.000,0.000},
				{-1.062,-9.106,10.000,0.000},
				{-2.276,-15.176,10.000,0.000},
				{-4.173,-22.764,10.000,0.000},
				{-6.905,-31.870,10.000,0.000},
				{-10.623,-42.493,10.000,0.000},
				{-15.480,-54.634,10.000,0.000},
				{-21.626,-68.292,10.000,0.000},
				{-29.214,-83.468,10.000,0.000},
				{-38.395,-100.162,10.000,0.000},
				{-49.322,-118.373,10.000,0.000},
				{-62.146,-138.102,10.000,0.000},
				{-77.018,-159.349,10.000,0.000},
				{-94.092,-182.113,10.000,0.000},
				{-113.517,-206.394,10.000,0.000},
				{-135.446,-232.194,10.000,0.000},
				{-159.956,-257.993,10.000,0.000},
				{-187.045,-283.792,10.000,0.000},
				{-216.714,-309.591,10.000,0.000},
				{-248.963,-335.391,10.000,0.000},
				{-283.792,-361.190,10.000,0.000},
				{-321.201,-386.989,10.000,0.000},
				{-361.190,-412.789,10.000,0.000},
				{-403.759,-438.588,10.000,0.000},
				{-448.908,-464.387,10.000,0.000},
				{-496.636,-490.186,10.000,0.000},
				{-546.945,-515.986,10.000,0.000},
				{-599.833,-541.785,10.000,0.000},
				{-655.302,-567.584,10.000,0.000},
				{-713.350,-593.384,10.000,0.000},
				{-773.979,-619.183,10.000,0.000},
				{-837.187,-644.982,10.000,0.000},
				{-902.975,-670.781,10.000,0.000},
				{-971.343,-696.581,10.000,0.000},
				{-1042.291,-722.380,10.000,0.000},
				{-1115.819,-748.179,10.000,0.000},
				{-1191.927,-773.979,10.000,0.000},
				{-1270.615,-799.778,10.000,0.000},
				{-1351.883,-825.577,10.000,0.000},
				{-1435.730,-851.376,10.000,0.000},
				{-1522.158,-877.176,10.000,0.000},
				{-1611.165,-902.975,10.000,0.000},
				{-1702.753,-928.774,10.000,0.000},
				{-1796.920,-954.574,10.000,0.000},
				{-1893.668,-980.373,10.000,0.000},
				{-1992.995,-1006.172,10.000,0.000},
				{-2094.902,-1031.971,10.000,0.000},
				{-2199.389,-1057.771,10.000,0.000},
				{-2306.456,-1083.570,10.000,0.000},
				{-2416.103,-1109.369,10.000,0.000},
				{-2528.330,-1135.169,10.000,0.000},
				{-2643.137,-1160.968,10.000,0.000},
				{-2760.524,-1186.767,10.000,0.000},
				{-2880.490,-1212.566,10.000,0.000},
				{-3003.037,-1238.366,10.000,0.000},
				{-3128.163,-1264.165,10.000,0.000},
				{-3255.870,-1289.964,10.000,0.000},
				{-3386.156,-1315.764,10.000,0.000},
				{-3519.022,-1341.563,10.000,0.000},
				{-3654.469,-1367.362,10.000,0.000},
				{-3792.495,-1393.161,10.000,0.000},
				{-3933.101,-1418.961,10.000,0.000},
				{-4076.287,-1444.760,10.000,0.000},
				{-4222.053,-1470.559,10.000,0.000},
				{-4370.399,-1496.359,10.000,0.000},
				{-4521.325,-1522.158,10.000,0.000},
				{-4674.830,-1547.957,10.000,0.000},
				{-4830.916,-1573.756,10.000,0.000},
				{-4989.582,-1599.556,10.000,0.000},
				{-5150.827,-1625.355,10.000,0.000},
				{-5314.653,-1651.154,10.000,0.000},
				{-5481.058,-1676.954,10.000,0.000},
				{-5650.043,-1702.753,10.000,0.000},
				{-5821.609,-1728.552,10.000,0.000},
				{-5995.754,-1754.351,10.000,0.000},
				{-6172.479,-1780.151,10.000,0.000},
				{-6351.784,-1805.950,10.000,0.000},
				{-6533.669,-1831.749,10.000,0.000},
				{-6718.134,-1857.549,10.000,0.000},
				{-6905.179,-1883.348,10.000,0.000},
				{-7094.803,-1909.147,10.000,0.000},
				{-7287.008,-1934.946,10.000,0.000},
				{-7481.793,-1960.746,10.000,0.000},
				{-7679.157,-1986.545,10.000,0.000},
				{-7879.102,-2012.344,10.000,0.000},
				{-8081.626,-2038.144,10.000,0.000},
				{-8286.730,-2063.943,10.000,0.000},
				{-8494.415,-2089.742,10.000,0.000},
				{-8704.679,-2115.541,10.000,0.000},
				{-8917.523,-2141.341,10.000,0.000},
				{-9132.947,-2167.140,10.000,0.000},
				{-9350.951,-2192.939,10.000,0.000},
				{-9571.459,-2217.221,10.000,0.000},
				{-9794.319,-2239.985,10.000,0.000},
				{-10019.380,-2261.231,10.000,0.000},
				{-10246.490,-2280.960,10.000,0.000},
				{-10475.496,-2299.172,10.000,0.000},
				{-10706.248,-2315.865,10.000,0.000},
				{-10938.593,-2331.041,10.000,0.000},
				{-11172.380,-2344.700,10.000,0.000},
				{-11407.457,-2356.841,10.000,0.000},
				{-11643.673,-2367.464,10.000,0.000},
				{-11880.874,-2376.569,10.000,0.000},
				{-12118.911,-2384.157,10.000,0.000},
				{-12357.630,-2390.228,10.000,0.000},
				{-12596.880,-2394.781,10.000,0.000},
				{-12836.510,-2397.816,10.000,0.000},
				{-13076.343,-2398.848,10.000,0.000},
				{-13316.128,-2396.845,10.000,0.000},
				{-13555.636,-2393.324,10.000,0.000},
				{-13794.717,-2388.285,10.000,0.000},
				{-14033.218,-2381.729,10.000,0.000},
				{-14270.987,-2373.655,10.000,0.000},
				{-14507.873,-2364.064,10.000,0.000},
				{-14743.724,-2352.955,10.000,0.000},
				{-14978.388,-2340.328,10.000,0.000},
				{-15211.713,-2326.184,10.000,0.000},
				{-15443.549,-2310.523,10.000,0.000},
				{-15673.742,-2293.343,10.000,0.000},
				{-15902.142,-2274.646,10.000,0.000},
				{-16128.595,-2254.432,10.000,0.000},
				{-16352.952,-2232.699,10.000,0.000},
				{-16575.059,-2209.450,10.000,0.000},
				{-16794.766,-2184.682,10.000,0.000},
				{-17011.944,-2158.883,10.000,0.000},
				{-17226.543,-2133.084,10.000,0.000},
				{-17438.561,-2107.284,10.000,0.000},
				{-17648.000,-2081.485,10.000,0.000},
				{-17854.858,-2055.686,10.000,0.000},
				{-18059.137,-2029.887,10.000,0.000},
				{-18260.835,-2004.087,10.000,0.000},
				{-18459.954,-1978.288,10.000,0.000},
				{-18656.493,-1952.489,10.000,0.000},
				{-18850.452,-1926.689,10.000,0.000},
				{-19041.831,-1900.890,10.000,0.000},
				{-19230.630,-1875.091,10.000,0.000},
				{-19416.849,-1849.292,10.000,0.000},
				{-19600.488,-1823.492,10.000,0.000},
				{-19781.548,-1797.693,10.000,0.000},
				{-19960.027,-1771.894,10.000,0.000},
				{-20135.926,-1746.094,10.000,0.000},
				{-20309.246,-1720.295,10.000,0.000},
				{-20479.985,-1694.496,10.000,0.000},
				{-20648.145,-1668.697,10.000,0.000},
				{-20813.725,-1642.897,10.000,0.000},
				{-20976.724,-1617.098,10.000,0.000},
				{-21137.144,-1591.299,10.000,0.000},
				{-21294.984,-1565.499,10.000,0.000},
				{-21450.244,-1539.700,10.000,0.000},
				{-21602.924,-1513.901,10.000,0.000},
				{-21753.024,-1488.102,10.000,0.000},
				{-21900.545,-1462.302,10.000,0.000},
				{-22045.485,-1436.503,10.000,0.000},
				{-22187.845,-1410.704,10.000,0.000},
				{-22327.626,-1384.904,10.000,0.000},
				{-22464.826,-1359.105,10.000,0.000},
				{-22599.447,-1333.306,10.000,0.000},
				{-22731.487,-1307.507,10.000,0.000},
				{-22860.948,-1281.707,10.000,0.000},
				{-22987.829,-1255.908,10.000,0.000},
				{-23112.130,-1230.109,10.000,0.000},
				{-23233.850,-1204.309,10.000,0.000},
				{-23352.991,-1178.510,10.000,0.000},
				{-23469.552,-1152.711,10.000,0.000},
				{-23583.534,-1126.912,10.000,0.000},
				{-23694.935,-1101.112,10.000,0.000},
				{-23803.756,-1075.313,10.000,0.000},
				{-23909.997,-1049.514,10.000,0.000},
				{-24013.659,-1023.714,10.000,0.000},
				{-24114.740,-997.915,10.000,0.000},
				{-24213.242,-972.116,10.000,0.000},
				{-24309.163,-946.317,10.000,0.000},
				{-24402.505,-920.517,10.000,0.000},
				{-24493.267,-894.718,10.000,0.000},
				{-24581.449,-868.919,10.000,0.000},
				{-24667.051,-843.119,10.000,0.000},
				{-24750.073,-817.320,10.000,0.000},
				{-24830.515,-791.521,10.000,0.000},
				{-24908.377,-765.722,10.000,0.000},
				{-24983.659,-739.922,10.000,0.000},
				{-25056.361,-714.123,10.000,0.000},
				{-25126.484,-688.324,10.000,0.000},
				{-25194.026,-662.524,10.000,0.000},
				{-25258.989,-636.725,10.000,0.000},
				{-25321.371,-610.926,10.000,0.000},
				{-25381.174,-585.127,10.000,0.000},
				{-25438.396,-559.327,10.000,0.000},
				{-25493.039,-533.528,10.000,0.000},
				{-25545.102,-507.729,10.000,0.000},
				{-25594.585,-481.929,10.000,0.000},
				{-25641.488,-456.130,10.000,0.000},
				{-25685.811,-430.331,10.000,0.000},
				{-25727.554,-404.532,10.000,0.000},
				{-25766.717,-378.732,10.000,0.000},
				{-25803.301,-352.933,10.000,0.000},
				{-25837.304,-327.134,10.000,0.000},
				{-25868.727,-301.334,10.000,0.000},
				{-25897.571,-275.535,10.000,0.000},
				{-25923.834,-249.736,10.000,0.000},
				{-25947.518,-223.937,10.000,0.000},
				{-25968.646,-198.623,10.000,0.000},
				{-25987.319,-174.827,10.000,0.000},
				{-26003.687,-152.549,10.000,0.000},
				{-26017.904,-131.788,10.000,0.000},
				{-26030.121,-112.545,10.000,0.000},
				{-26040.489,-94.819,10.000,0.000},
				{-26049.160,-78.611,10.000,0.000},
				{-26056.287,-63.921,10.000,0.000},
				{-26062.021,-50.748,10.000,0.000},
				{-26066.513,-39.093,10.000,0.000},
				{-26069.915,-28.955,10.000,0.000},
				{-26072.380,-20.336,10.000,0.000},
				{-26074.058,-13.233,10.000,0.000},
				{-26075.102,-7.649,10.000,0.000},
				{-26075.664,-3.581,10.000,0.000},
				{-26075.894,-1.032,10.000,0.000},
				{-26075.946,-0.000,10.000,0.000},
				{-26075.946,-0.000,10.000,0.000}		};

}