package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class CenterToRightSwitchArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.08,0.00)
	// (9.63,9.08,0.00)
	
    public CenterToRightSwitchArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightSwitchArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.075,1.490,10.000,0.000},
				{0.373,4.470,10.000,0.000},
				{1.043,8.940,10.000,0.000},
				{2.235,14.901,10.000,0.000},
				{4.098,22.351,10.000,0.000},
				{6.780,31.291,10.000,0.000},
				{10.430,41.722,10.000,0.000},
				{15.199,53.642,10.000,0.000},
				{21.233,67.052,10.000,0.000},
				{28.684,81.953,10.000,0.000},
				{37.698,98.344,10.000,0.000},
				{48.427,116.224,10.000,0.000},
				{61.018,135.595,10.000,0.000},
				{75.620,156.456,10.000,-0.010},
				{92.309,177.316,10.000,-0.010},
				{111.084,198.177,10.000,-0.010},
				{131.944,219.038,10.000,-0.020},
				{154.891,239.899,10.000,-0.020},
				{179.924,260.759,10.000,-0.030},
				{207.043,281.620,10.000,-0.040},
				{236.248,302.481,10.000,-0.060},
				{267.539,323.342,10.000,-0.070},
				{300.916,344.202,10.000,-0.090},
				{336.380,365.063,10.000,-0.110},
				{373.929,385.924,10.000,-0.140},
				{413.565,406.785,10.000,-0.170},
				{455.286,427.646,10.000,-0.200},
				{499.094,448.506,10.000,-0.240},
				{544.987,469.367,10.000,-0.290},
				{592.967,490.228,10.000,-0.340},
				{643.033,511.089,10.000,-0.400},
				{695.185,531.949,10.000,-0.470},
				{749.423,552.810,10.000,-0.540},
				{805.747,573.671,10.000,-0.620},
				{864.157,594.532,10.000,-0.710},
				{924.653,615.392,10.000,-0.810},
				{987.235,636.253,10.000,-0.920},
				{1051.904,657.114,10.000,-1.050},
				{1118.658,677.975,10.000,-1.180},
				{1187.499,698.835,10.000,-1.320},
				{1258.425,719.696,10.000,-1.480},
				{1331.438,740.557,10.000,-1.650},
				{1406.537,761.418,10.000,-1.840},
				{1483.721,782.278,10.000,-2.040},
				{1562.992,803.139,10.000,-2.250},
				{1644.349,824.000,10.000,-2.480},
				{1727.792,844.861,10.000,-2.730},
				{1813.321,865.721,10.000,-3.000},
				{1900.936,886.582,10.000,-3.280},
				{1990.638,907.443,10.000,-3.590},
				{2082.425,928.304,10.000,-3.910},
				{2176.298,949.164,10.000,-4.260},
				{2272.258,970.025,10.000,-4.620},
				{2370.303,990.886,10.000,-5.010},
				{2470.435,1011.747,10.000,-5.430},
				{2572.653,1032.607,10.000,-5.860},
				{2676.957,1053.468,10.000,-6.330},
				{2783.346,1074.329,10.000,-6.810},
				{2891.822,1095.190,10.000,-7.330},
				{3002.384,1116.050,10.000,-7.870},
				{3115.032,1136.911,10.000,-8.440},
				{3229.767,1157.772,10.000,-9.030},
				{3346.587,1178.633,10.000,-9.660},
				{3465.493,1199.494,10.000,-10.320},
				{3586.486,1220.354,10.000,-11.000},
				{3709.564,1241.215,10.000,-11.720},
				{3834.729,1262.076,10.000,-12.460},
				{3961.979,1282.937,10.000,-13.240},
				{4091.316,1303.797,10.000,-14.040},
				{4222.739,1324.658,10.000,-14.880},
				{4356.248,1345.519,10.000,-15.750},
				{4491.842,1366.380,10.000,-16.640},
				{4629.523,1387.240,10.000,-17.560},
				{4769.291,1408.101,10.000,-18.510},
				{4911.144,1428.962,10.000,-19.490},
				{5055.083,1449.823,10.000,-20.490},
				{5201.108,1470.683,10.000,-21.510},
				{5349.220,1491.544,10.000,-22.550},
				{5499.417,1512.405,10.000,-23.600},
				{5651.701,1533.266,10.000,-24.680},
				{5806.070,1554.126,10.000,-25.760},
				{5962.526,1574.987,10.000,-26.860},
				{6121.068,1595.848,10.000,-27.960},
				{6281.695,1616.709,10.000,-29.060},
				{6444.409,1637.569,10.000,-30.170},
				{6609.209,1658.430,10.000,-31.270},
				{6776.095,1679.291,10.000,-32.360},
				{6945.067,1700.152,10.000,-33.440},
				{7116.126,1721.012,10.000,-34.510},
				{7289.270,1741.873,10.000,-35.560},
				{7464.500,1762.734,10.000,-36.600},
				{7641.817,1783.595,10.000,-37.610},
				{7821.219,1804.455,10.000,-38.590},
				{8002.708,1825.316,10.000,-39.550},
				{8186.282,1846.177,10.000,-40.470},
				{8371.943,1867.038,10.000,-41.360},
				{8559.690,1887.898,10.000,-42.220},
				{8749.523,1908.759,10.000,-43.040},
				{8941.442,1929.620,10.000,-43.820},
				{9135.447,1950.481,10.000,-44.570},
				{9331.463,1969.851,10.000,-45.270},
				{9529.343,1987.732,10.000,-45.920},
				{9728.935,2004.123,10.000,-46.540},
				{9930.093,2019.023,10.000,-47.100},
				{10132.666,2032.434,10.000,-47.630},
				{10336.505,2044.354,10.000,-48.100},
				{10541.462,2054.785,10.000,-48.530},
				{10747.387,2063.725,10.000,-48.910},
				{10954.132,2071.175,10.000,-49.240},
				{11161.548,2077.135,10.000,-49.520},
				{11369.485,2081.606,10.000,-49.750},
				{11577.794,2084.586,10.000,-49.930},
				{11786.328,2086.076,10.000,-50.070},
				{11994.935,2086.076,10.000,-50.150},
				{12203.543,2086.076,10.000,-50.190},
				{12412.150,2086.076,10.000,-50.180},
				{12620.758,2086.076,10.000,-50.120},
				{12829.333,2085.430,10.000,-50.020},
				{13037.769,2083.294,10.000,-49.860},
				{13245.917,2079.668,10.000,-49.650},
				{13453.628,2074.552,10.000,-49.400},
				{13660.753,2067.946,10.000,-49.100},
				{13867.143,2059.850,10.000,-48.750},
				{14072.649,2050.264,10.000,-48.350},
				{14277.121,2039.187,10.000,-47.900},
				{14480.412,2026.621,10.000,-47.410},
				{14682.371,2012.565,10.000,-46.860},
				{14882.850,1997.018,10.000,-46.280},
				{15081.700,1979.982,10.000,-45.640},
				{15278.772,1961.455,10.000,-44.970},
				{15473.917,1941.439,10.000,-44.250},
				{15667.018,1920.578,10.000,-43.490},
				{15858.032,1899.717,10.000,-42.690},
				{16046.961,1878.857,10.000,-41.850},
				{16233.804,1857.996,10.000,-40.980},
				{16418.560,1837.135,10.000,-40.080},
				{16601.231,1816.274,10.000,-39.140},
				{16781.815,1795.414,10.000,-38.170},
				{16960.313,1774.553,10.000,-37.170},
				{17136.726,1753.692,10.000,-36.150},
				{17311.052,1732.831,10.000,-35.110},
				{17483.292,1711.971,10.000,-34.050},
				{17653.446,1691.110,10.000,-32.980},
				{17821.514,1670.249,10.000,-31.890},
				{17987.496,1649.388,10.000,-30.790},
				{18151.392,1628.528,10.000,-29.690},
				{18313.201,1607.667,10.000,-28.590},
				{18472.925,1586.806,10.000,-27.480},
				{18630.563,1565.945,10.000,-26.380},
				{18786.114,1545.085,10.000,-25.290},
				{18939.579,1524.224,10.000,-24.210},
				{19090.959,1503.363,10.000,-23.150},
				{19240.252,1482.502,10.000,-22.090},
				{19387.459,1461.642,10.000,-21.060},
				{19532.580,1440.781,10.000,-20.050},
				{19675.615,1419.920,10.000,-19.060},
				{19816.564,1399.059,10.000,-18.100},
				{19955.427,1378.198,10.000,-17.160},
				{20092.204,1357.338,10.000,-16.250},
				{20226.895,1336.477,10.000,-15.370},
				{20359.499,1315.616,10.000,-14.520},
				{20490.018,1294.755,10.000,-13.690},
				{20618.451,1273.895,10.000,-12.900},
				{20744.797,1253.034,10.000,-12.140},
				{20869.057,1232.173,10.000,-11.400},
				{20991.232,1211.312,10.000,-10.700},
				{21111.320,1190.452,10.000,-10.030},
				{21229.322,1169.591,10.000,-9.390},
				{21345.238,1148.730,10.000,-8.770},
				{21459.068,1127.869,10.000,-8.190},
				{21570.812,1107.009,10.000,-7.630},
				{21680.470,1086.148,10.000,-7.100},
				{21788.042,1065.287,10.000,-6.600},
				{21893.527,1044.426,10.000,-6.120},
				{21996.927,1023.566,10.000,-5.670},
				{22098.240,1002.705,10.000,-5.250},
				{22197.468,981.844,10.000,-4.840},
				{22294.609,960.983,10.000,-4.460},
				{22389.664,940.123,10.000,-4.110},
				{22482.634,919.262,10.000,-3.770},
				{22573.517,898.401,10.000,-3.450},
				{22662.314,877.540,10.000,-3.160},
				{22749.025,856.680,10.000,-2.880},
				{22833.650,835.819,10.000,-2.620},
				{22916.189,814.958,10.000,-2.380},
				{22996.641,794.097,10.000,-2.160},
				{23075.008,773.237,10.000,-1.950},
				{23151.289,752.376,10.000,-1.760},
				{23225.483,731.515,10.000,-1.580},
				{23297.592,710.654,10.000,-1.410},
				{23367.614,689.794,10.000,-1.260},
				{23435.550,668.933,10.000,-1.120},
				{23501.401,648.072,10.000,-0.990},
				{23565.165,627.211,10.000,-0.880},
				{23626.843,606.350,10.000,-0.770},
				{23686.435,585.490,10.000,-0.670},
				{23743.941,564.629,10.000,-0.590},
				{23799.361,543.768,10.000,-0.510},
				{23852.695,522.907,10.000,-0.440},
				{23903.942,502.047,10.000,-0.370},
				{23953.104,481.186,10.000,-0.320},
				{24000.179,460.325,10.000,-0.270},
				{24045.169,439.464,10.000,-0.230},
				{24088.072,418.604,10.000,-0.190},
				{24128.890,397.743,10.000,-0.150},
				{24167.621,376.882,10.000,-0.130},
				{24204.266,356.021,10.000,-0.100},
				{24238.825,335.161,10.000,-0.080},
				{24271.298,314.300,10.000,-0.060},
				{24301.685,293.439,10.000,-0.050},
				{24329.986,272.578,10.000,-0.040},
				{24356.201,251.718,10.000,-0.030},
				{24380.330,230.857,10.000,-0.020},
				{24402.372,209.996,10.000,-0.020},
				{24422.329,189.135,10.000,-0.010},
				{24440.199,168.275,10.000,-0.010},
				{24455.984,147.414,10.000,0.000},
				{24469.714,127.199,10.000,0.000},
				{24481.498,108.474,10.000,0.000},
				{24491.484,91.239,10.000,0.000},
				{24499.820,75.495,10.000,0.000},
				{24506.657,61.240,10.000,0.000},
				{24512.143,48.475,10.000,0.000},
				{24516.427,37.201,10.000,0.000},
				{24519.657,27.416,10.000,0.000},
				{24521.984,19.122,10.000,0.000},
				{24523.556,12.317,10.000,0.000},
				{24524.522,7.003,10.000,0.000},
				{24525.031,3.178,10.000,0.000},
				{24525.232,0.844,10.000,0.000},
				{24525.275,0.000,10.000,0.000},
				{24525.275,0.000,10.000,0.000}		};

}