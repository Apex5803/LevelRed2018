package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class CenterToRightSwitchPt2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (9.63,9.08,0.00)
	// (3.25,14.08,0.00)
	
    public CenterToRightSwitchPt2Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchPt2Arc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{-0.075,-1.490,10.000,0.000},
				{-0.373,-4.470,10.000,0.000},
				{-1.043,-8.940,10.000,0.000},
				{-2.235,-14.901,10.000,0.000},
				{-4.098,-22.351,10.000,0.000},
				{-6.780,-31.291,10.000,0.000},
				{-10.430,-41.722,10.000,0.000},
				{-15.199,-53.642,10.000,0.000},
				{-21.233,-67.052,10.000,0.000},
				{-28.684,-81.953,10.000,0.000},
				{-37.698,-98.344,10.000,0.000},
				{-48.427,-116.224,10.000,0.000},
				{-61.018,-135.595,10.000,0.000},
				{-75.620,-156.456,10.000,-0.010},
				{-92.309,-177.316,10.000,-0.010},
				{-111.084,-198.177,10.000,-0.010},
				{-131.944,-219.038,10.000,-0.020},
				{-154.891,-239.899,10.000,-0.030},
				{-179.924,-260.759,10.000,-0.040},
				{-207.043,-281.620,10.000,-0.050},
				{-236.248,-302.481,10.000,-0.060},
				{-267.539,-323.342,10.000,-0.080},
				{-300.916,-344.202,10.000,-0.100},
				{-336.380,-365.063,10.000,-0.130},
				{-373.929,-385.924,10.000,-0.160},
				{-413.565,-406.785,10.000,-0.190},
				{-455.286,-427.646,10.000,-0.230},
				{-499.094,-448.506,10.000,-0.280},
				{-544.987,-469.367,10.000,-0.330},
				{-592.967,-490.228,10.000,-0.390},
				{-643.033,-511.089,10.000,-0.460},
				{-695.185,-531.949,10.000,-0.540},
				{-749.423,-552.810,10.000,-0.620},
				{-805.747,-573.671,10.000,-0.720},
				{-864.157,-594.532,10.000,-0.820},
				{-924.653,-615.392,10.000,-0.940},
				{-987.235,-636.253,10.000,-1.070},
				{-1051.904,-657.114,10.000,-1.220},
				{-1118.658,-677.975,10.000,-1.370},
				{-1187.499,-698.835,10.000,-1.540},
				{-1258.425,-719.696,10.000,-1.730},
				{-1331.438,-740.557,10.000,-1.930},
				{-1406.537,-761.418,10.000,-2.160},
				{-1483.721,-782.278,10.000,-2.400},
				{-1562.992,-803.139,10.000,-2.660},
				{-1644.349,-824.000,10.000,-2.940},
				{-1727.792,-844.861,10.000,-3.240},
				{-1813.321,-865.721,10.000,-3.570},
				{-1900.936,-886.582,10.000,-3.920},
				{-1990.638,-907.443,10.000,-4.310},
				{-2082.425,-928.304,10.000,-4.710},
				{-2176.298,-949.164,10.000,-5.150},
				{-2272.258,-970.025,10.000,-5.620},
				{-2370.303,-990.886,10.000,-6.130},
				{-2470.435,-1011.747,10.000,-6.660},
				{-2572.653,-1032.607,10.000,-7.240},
				{-2676.957,-1053.468,10.000,-7.860},
				{-2783.346,-1074.329,10.000,-8.510},
				{-2891.822,-1095.190,10.000,-9.210},
				{-3002.384,-1116.050,10.000,-9.960},
				{-3115.032,-1136.911,10.000,-10.760},
				{-3229.767,-1157.772,10.000,-11.600},
				{-3346.587,-1178.633,10.000,-12.500},
				{-3465.493,-1199.494,10.000,-13.460},
				{-3586.486,-1220.354,10.000,-14.470},
				{-3709.564,-1241.215,10.000,-15.540},
				{-3834.729,-1262.076,10.000,-16.680},
				{-3961.979,-1282.937,10.000,-17.880},
				{-4091.316,-1303.797,10.000,-19.140},
				{-4222.739,-1324.658,10.000,-20.470},
				{-4356.248,-1345.519,10.000,-21.860},
				{-4491.842,-1366.380,10.000,-23.320},
				{-4629.523,-1387.240,10.000,-24.850},
				{-4769.291,-1408.101,10.000,-26.430},
				{-4911.144,-1428.962,10.000,-28.080},
				{-5055.083,-1449.823,10.000,-29.770},
				{-5201.108,-1470.683,10.000,-31.520},
				{-5349.220,-1491.544,10.000,-33.310},
				{-5499.417,-1512.405,10.000,-35.140},
				{-5651.701,-1533.266,10.000,-36.990},
				{-5806.070,-1554.126,10.000,-38.860},
				{-5962.526,-1574.987,10.000,-40.740},
				{-6121.068,-1595.848,10.000,-42.610},
				{-6281.695,-1616.709,10.000,-44.470},
				{-6444.409,-1637.569,10.000,-46.310},
				{-6609.209,-1658.430,10.000,-48.120},
				{-6776.095,-1679.291,10.000,-49.880},
				{-6945.067,-1700.152,10.000,-51.600},
				{-7116.126,-1721.012,10.000,-53.270},
				{-7289.270,-1741.873,10.000,-54.870},
				{-7464.500,-1762.734,10.000,-56.410},
				{-7641.817,-1783.595,10.000,-57.880},
				{-7821.219,-1804.455,10.000,-59.290},
				{-8002.708,-1825.316,10.000,-60.610},
				{-8186.282,-1846.177,10.000,-61.870},
				{-8371.943,-1867.038,10.000,-63.050},
				{-8559.690,-1887.898,10.000,-64.160},
				{-8749.523,-1908.759,10.000,-65.200},
				{-8941.442,-1929.620,10.000,-66.160},
				{-9135.447,-1950.481,10.000,-67.050},
				{-9331.463,-1969.851,10.000,-67.870},
				{-9529.343,-1987.732,10.000,-68.620},
				{-9728.935,-2004.123,10.000,-69.310},
				{-9930.093,-2019.023,10.000,-69.920},
				{-10132.666,-2032.434,10.000,-70.470},
				{-10336.505,-2044.354,10.000,-70.950},
				{-10541.462,-2054.785,10.000,-71.370},
				{-10747.387,-2063.725,10.000,-71.730},
				{-10954.132,-2071.175,10.000,-72.020},
				{-11161.548,-2077.135,10.000,-72.250},
				{-11369.485,-2081.606,10.000,-72.410},
				{-11577.794,-2084.586,10.000,-72.520},
				{-11786.328,-2086.076,10.000,-72.570},
				{-11994.899,-2085.345,10.000,-72.550},
				{-12203.322,-2083.125,10.000,-72.480},
				{-12411.449,-2079.414,10.000,-72.340},
				{-12619.130,-2074.214,10.000,-72.140},
				{-12826.217,-2067.523,10.000,-71.880},
				{-13032.561,-2059.342,10.000,-71.560},
				{-13238.011,-2049.671,10.000,-71.170},
				{-13442.420,-2038.511,10.000,-70.720},
				{-13645.639,-2025.860,10.000,-70.210},
				{-13847.518,-2011.719,10.000,-69.630},
				{-14047.908,-1996.088,10.000,-68.980},
				{-14246.661,-1978.967,10.000,-68.260},
				{-14443.627,-1960.356,10.000,-67.480},
				{-14638.658,-1940.255,10.000,-66.620},
				{-14831.640,-1919.394,10.000,-65.700},
				{-15022.536,-1898.533,10.000,-64.700},
				{-15211.347,-1877.672,10.000,-63.630},
				{-15398.071,-1856.812,10.000,-62.480},
				{-15582.709,-1835.951,10.000,-61.270},
				{-15765.261,-1815.090,10.000,-59.970},
				{-15945.727,-1794.229,10.000,-58.610},
				{-16124.107,-1773.369,10.000,-57.170},
				{-16300.401,-1752.508,10.000,-55.670},
				{-16474.608,-1731.647,10.000,-54.100},
				{-16646.730,-1710.786,10.000,-52.460},
				{-16816.766,-1689.926,10.000,-50.770},
				{-16984.715,-1669.065,10.000,-49.030},
				{-17150.579,-1648.204,10.000,-47.240},
				{-17314.356,-1627.343,10.000,-45.410},
				{-17476.047,-1606.483,10.000,-43.560},
				{-17635.653,-1585.622,10.000,-41.690},
				{-17793.172,-1564.761,10.000,-39.820},
				{-17948.605,-1543.900,10.000,-37.940},
				{-18101.952,-1523.040,10.000,-36.080},
				{-18253.213,-1502.179,10.000,-34.240},
				{-18402.387,-1481.318,10.000,-32.430},
				{-18549.476,-1460.457,10.000,-30.660},
				{-18694.479,-1439.597,10.000,-28.940},
				{-18837.396,-1418.736,10.000,-27.270},
				{-18978.226,-1397.875,10.000,-25.650},
				{-19116.971,-1377.014,10.000,-24.090},
				{-19253.629,-1356.153,10.000,-22.600},
				{-19388.201,-1335.293,10.000,-21.170},
				{-19520.687,-1314.432,10.000,-19.810},
				{-19651.088,-1293.571,10.000,-18.510},
				{-19779.402,-1272.710,10.000,-17.280},
				{-19905.630,-1251.850,10.000,-16.120},
				{-20029.772,-1230.989,10.000,-15.010},
				{-20151.828,-1210.128,10.000,-13.970},
				{-20271.797,-1189.267,10.000,-12.980},
				{-20389.681,-1168.407,10.000,-12.060},
				{-20505.479,-1147.546,10.000,-11.180},
				{-20619.190,-1126.685,10.000,-10.360},
				{-20730.816,-1105.824,10.000,-9.590},
				{-20840.355,-1084.964,10.000,-8.870},
				{-20947.808,-1064.103,10.000,-8.190},
				{-21053.176,-1043.242,10.000,-7.550},
				{-21156.457,-1022.381,10.000,-6.950},
				{-21257.652,-1001.521,10.000,-6.400},
				{-21356.761,-980.660,10.000,-5.880},
				{-21453.784,-959.799,10.000,-5.390},
				{-21548.721,-938.938,10.000,-4.930},
				{-21641.572,-918.078,10.000,-4.510},
				{-21732.336,-897.217,10.000,-4.120},
				{-21821.015,-876.356,10.000,-3.750},
				{-21907.608,-855.495,10.000,-3.410},
				{-21992.114,-834.635,10.000,-3.090},
				{-22074.534,-813.774,10.000,-2.800},
				{-22154.869,-792.913,10.000,-2.530},
				{-22233.117,-772.052,10.000,-2.280},
				{-22309.279,-751.192,10.000,-2.050},
				{-22383.355,-730.331,10.000,-1.830},
				{-22455.345,-709.470,10.000,-1.640},
				{-22525.249,-688.609,10.000,-1.460},
				{-22593.067,-667.749,10.000,-1.290},
				{-22658.799,-646.888,10.000,-1.140},
				{-22722.445,-626.027,10.000,-1.010},
				{-22784.004,-605.166,10.000,-0.880},
				{-22843.478,-584.305,10.000,-0.770},
				{-22900.866,-563.445,10.000,-0.670},
				{-22956.167,-542.584,10.000,-0.580},
				{-23009.382,-521.723,10.000,-0.500},
				{-23060.512,-500.862,10.000,-0.430},
				{-23109.555,-480.002,10.000,-0.360},
				{-23156.512,-459.141,10.000,-0.310},
				{-23201.383,-438.280,10.000,-0.260},
				{-23244.168,-417.419,10.000,-0.210},
				{-23284.867,-396.559,10.000,-0.180},
				{-23323.480,-375.698,10.000,-0.140},
				{-23360.007,-354.837,10.000,-0.120},
				{-23394.447,-333.976,10.000,-0.090},
				{-23426.802,-313.116,10.000,-0.070},
				{-23457.070,-292.255,10.000,-0.060},
				{-23485.253,-271.394,10.000,-0.040},
				{-23511.349,-250.533,10.000,-0.030},
				{-23535.359,-229.673,10.000,-0.020},
				{-23557.284,-208.812,10.000,-0.020},
				{-23577.122,-187.951,10.000,-0.010},
				{-23594.874,-167.090,10.000,-0.010},
				{-23610.540,-146.230,10.000,-0.010},
				{-23624.156,-126.099,10.000,0.000},
				{-23635.834,-107.459,10.000,0.000},
				{-23645.723,-90.309,10.000,0.000},
				{-23653.971,-74.649,10.000,0.000},
				{-23660.727,-60.479,10.000,0.000},
				{-23666.141,-47.798,10.000,0.000},
				{-23670.361,-36.608,10.000,0.000},
				{-23673.537,-26.909,10.000,0.000},
				{-23675.817,-18.699,10.000,0.000},
				{-23677.351,-11.979,10.000,0.000},
				{-23678.288,-6.749,10.000,0.000},
				{-23678.775,-3.009,10.000,0.000},
				{-23678.964,-0.760,10.000,0.000},
				{-23679.002,-0.000,10.000,0.000},
				{-23679.002,-0.000,10.000,0.000}		};

}