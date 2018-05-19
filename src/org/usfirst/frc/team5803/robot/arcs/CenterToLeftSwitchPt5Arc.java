package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class CenterToLeftSwitchPt5Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (6.38,13.08,0.00)
	// (14.38,19.08,0.00)
	
    public CenterToLeftSwitchPt5Arc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftSwitchPt5Arc(boolean flipped) {
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
				{75.620,156.456,10.000,0.000},
				{92.309,177.316,10.000,0.010},
				{111.084,198.177,10.000,0.010},
				{131.944,219.038,10.000,0.010},
				{154.891,239.899,10.000,0.020},
				{179.924,260.759,10.000,0.020},
				{207.043,281.620,10.000,0.030},
				{236.248,302.481,10.000,0.040},
				{267.539,323.342,10.000,0.050},
				{300.916,344.202,10.000,0.070},
				{336.380,365.063,10.000,0.090},
				{373.929,385.924,10.000,0.110},
				{413.565,406.785,10.000,0.130},
				{455.286,427.646,10.000,0.160},
				{499.094,448.506,10.000,0.190},
				{544.987,469.367,10.000,0.220},
				{592.967,490.228,10.000,0.260},
				{643.033,511.089,10.000,0.310},
				{695.185,531.949,10.000,0.360},
				{749.423,552.810,10.000,0.420},
				{805.747,573.671,10.000,0.480},
				{864.157,594.532,10.000,0.560},
				{924.653,615.392,10.000,0.640},
				{987.235,636.253,10.000,0.720},
				{1051.904,657.114,10.000,0.820},
				{1118.658,677.975,10.000,0.920},
				{1187.499,698.835,10.000,1.040},
				{1258.425,719.696,10.000,1.170},
				{1331.438,740.557,10.000,1.300},
				{1406.537,761.418,10.000,1.450},
				{1483.721,782.278,10.000,1.610},
				{1562.992,803.139,10.000,1.790},
				{1644.349,824.000,10.000,1.970},
				{1727.792,844.861,10.000,2.180},
				{1813.321,865.721,10.000,2.390},
				{1900.936,886.582,10.000,2.630},
				{1990.638,907.443,10.000,2.880},
				{2082.425,928.304,10.000,3.150},
				{2176.298,949.164,10.000,3.440},
				{2272.258,970.025,10.000,3.740},
				{2370.303,990.886,10.000,4.070},
				{2470.435,1011.747,10.000,4.420},
				{2572.653,1032.607,10.000,4.800},
				{2676.957,1053.468,10.000,5.200},
				{2783.346,1074.329,10.000,5.620},
				{2891.822,1095.190,10.000,6.070},
				{3002.384,1116.050,10.000,6.550},
				{3115.032,1136.911,10.000,7.060},
				{3229.767,1157.772,10.000,7.590},
				{3346.587,1178.633,10.000,8.170},
				{3465.493,1199.494,10.000,8.770},
				{3586.486,1220.354,10.000,9.410},
				{3709.564,1241.215,10.000,10.090},
				{3834.729,1262.076,10.000,10.800},
				{3961.979,1282.937,10.000,11.560},
				{4091.316,1303.797,10.000,12.350},
				{4222.739,1324.658,10.000,13.190},
				{4356.248,1345.519,10.000,14.080},
				{4491.842,1366.380,10.000,15.010},
				{4629.523,1387.240,10.000,15.980},
				{4769.291,1408.101,10.000,17.010},
				{4911.144,1428.962,10.000,18.080},
				{5055.083,1449.823,10.000,19.200},
				{5201.108,1470.683,10.000,20.370},
				{5349.220,1491.544,10.000,21.590},
				{5499.417,1512.405,10.000,22.860},
				{5651.701,1533.266,10.000,24.180},
				{5806.070,1554.126,10.000,25.550},
				{5962.526,1574.987,10.000,26.950},
				{6121.068,1595.848,10.000,28.400},
				{6281.695,1616.709,10.000,29.890},
				{6444.409,1637.569,10.000,31.410},
				{6609.209,1658.430,10.000,32.960},
				{6776.095,1679.291,10.000,34.530},
				{6945.067,1700.152,10.000,36.120},
				{7116.126,1721.012,10.000,37.730},
				{7289.270,1741.873,10.000,39.340},
				{7464.500,1762.734,10.000,40.940},
				{7641.817,1783.595,10.000,42.540},
				{7821.219,1804.455,10.000,44.130},
				{8002.708,1825.316,10.000,45.690},
				{8186.282,1846.177,10.000,47.230},
				{8371.943,1867.038,10.000,48.740},
				{8559.690,1887.898,10.000,50.210},
				{8749.523,1908.759,10.000,51.640},
				{8941.442,1929.620,10.000,53.020},
				{9135.447,1950.481,10.000,54.360},
				{9331.463,1969.851,10.000,55.640},
				{9529.343,1987.732,10.000,56.880},
				{9728.935,2004.123,10.000,58.050},
				{9930.093,2019.023,10.000,59.170},
				{10132.666,2032.434,10.000,60.220},
				{10336.505,2044.354,10.000,61.220},
				{10541.462,2054.785,10.000,62.160},
				{10747.387,2063.725,10.000,63.040},
				{10954.132,2071.175,10.000,63.870},
				{11161.548,2077.135,10.000,64.630},
				{11369.485,2081.606,10.000,65.340},
				{11577.794,2084.586,10.000,65.990},
				{11786.328,2086.076,10.000,66.600},
				{11994.935,2086.076,10.000,67.140},
				{12203.543,2086.076,10.000,67.640},
				{12412.150,2086.076,10.000,68.090},
				{12620.758,2086.076,10.000,68.490},
				{12829.365,2086.076,10.000,68.850},
				{13037.973,2086.076,10.000,69.160},
				{13246.581,2086.076,10.000,69.420},
				{13455.188,2086.076,10.000,69.650},
				{13663.796,2086.076,10.000,69.830},
				{13872.403,2086.076,10.000,69.970},
				{14081.011,2086.076,10.000,70.070},
				{14289.618,2086.076,10.000,70.130},
				{14498.226,2086.076,10.000,70.140},
				{14706.833,2086.076,10.000,70.120},
				{14915.441,2086.076,10.000,70.060},
				{15124.049,2086.076,10.000,69.960},
				{15332.656,2086.076,10.000,69.810},
				{15541.264,2086.076,10.000,69.630},
				{15749.871,2086.076,10.000,69.400},
				{15958.479,2086.076,10.000,69.130},
				{16167.086,2086.076,10.000,68.810},
				{16375.694,2086.076,10.000,68.450},
				{16584.302,2086.076,10.000,68.050},
				{16792.909,2086.076,10.000,67.590},
				{17001.517,2086.076,10.000,67.090},
				{17210.117,2085.928,10.000,66.540},
				{17418.628,2084.290,10.000,65.930},
				{17626.900,2081.163,10.000,65.270},
				{17834.786,2076.545,10.000,64.560},
				{18042.135,2070.437,10.000,63.790},
				{18248.799,2062.839,10.000,62.960},
				{18454.628,2053.751,10.000,62.070},
				{18659.475,2043.174,10.000,61.130},
				{18863.189,2031.106,10.000,60.120},
				{19065.621,2017.547,10.000,59.060},
				{19266.624,2002.499,10.000,57.940},
				{19466.047,1985.961,10.000,56.760},
				{19663.741,1967.933,10.000,55.520},
				{19859.559,1948.415,10.000,54.230},
				{20053.357,1927.554,10.000,52.890},
				{20245.069,1906.693,10.000,51.500},
				{20434.696,1885.832,10.000,50.070},
				{20622.236,1864.972,10.000,48.590},
				{20807.690,1844.111,10.000,47.080},
				{20991.058,1823.250,10.000,45.540},
				{21172.340,1802.389,10.000,43.970},
				{21351.536,1781.529,10.000,42.390},
				{21528.646,1760.668,10.000,40.780},
				{21703.670,1739.807,10.000,39.180},
				{21876.607,1718.946,10.000,37.570},
				{22047.459,1698.086,10.000,35.970},
				{22216.224,1677.225,10.000,34.380},
				{22382.904,1656.364,10.000,32.810},
				{22547.497,1635.503,10.000,31.260},
				{22710.004,1614.643,10.000,29.740},
				{22870.426,1593.782,10.000,28.260},
				{23028.761,1572.921,10.000,26.810},
				{23185.010,1552.060,10.000,25.410},
				{23339.173,1531.200,10.000,24.050},
				{23491.250,1510.339,10.000,22.740},
				{23641.241,1489.478,10.000,21.470},
				{23789.145,1468.617,10.000,20.260},
				{23934.964,1447.756,10.000,19.090},
				{24078.697,1426.896,10.000,17.970},
				{24220.343,1406.035,10.000,16.900},
				{24359.904,1385.174,10.000,15.880},
				{24497.378,1364.313,10.000,14.910},
				{24632.766,1343.453,10.000,13.990},
				{24766.069,1322.592,10.000,13.110},
				{24897.285,1301.731,10.000,12.270},
				{25026.415,1280.870,10.000,11.480},
				{25153.459,1260.010,10.000,10.730},
				{25278.417,1239.149,10.000,10.020},
				{25401.289,1218.288,10.000,9.350},
				{25522.074,1197.427,10.000,8.710},
				{25640.774,1176.567,10.000,8.110},
				{25757.388,1155.706,10.000,7.540},
				{25871.915,1134.845,10.000,7.000},
				{25984.357,1113.984,10.000,6.500},
				{26094.712,1093.124,10.000,6.020},
				{26202.981,1072.263,10.000,5.580},
				{26309.165,1051.402,10.000,5.160},
				{26413.262,1030.541,10.000,4.760},
				{26515.273,1009.681,10.000,4.390},
				{26615.198,988.820,10.000,4.040},
				{26713.037,967.959,10.000,3.710},
				{26808.790,947.098,10.000,3.410},
				{26902.457,926.238,10.000,3.120},
				{26994.037,905.377,10.000,2.850},
				{27083.532,884.516,10.000,2.600},
				{27170.940,863.655,10.000,2.370},
				{27256.263,842.795,10.000,2.150},
				{27339.499,821.934,10.000,1.950},
				{27420.650,801.073,10.000,1.770},
				{27499.714,780.212,10.000,1.590},
				{27576.692,759.352,10.000,1.440},
				{27651.584,738.491,10.000,1.290},
				{27724.390,717.630,10.000,1.150},
				{27795.110,696.769,10.000,1.030},
				{27863.744,675.908,10.000,0.910},
				{27930.292,655.048,10.000,0.810},
				{27994.754,634.187,10.000,0.710},
				{28057.129,613.326,10.000,0.630},
				{28117.419,592.465,10.000,0.550},
				{28175.622,571.605,10.000,0.480},
				{28231.740,550.744,10.000,0.410},
				{28285.771,529.883,10.000,0.360},
				{28337.717,509.022,10.000,0.310},
				{28387.576,488.162,10.000,0.260},
				{28435.349,467.301,10.000,0.220},
				{28481.036,446.440,10.000,0.190},
				{28524.637,425.579,10.000,0.150},
				{28566.152,404.719,10.000,0.130},
				{28605.581,383.858,10.000,0.100},
				{28642.923,362.997,10.000,0.080},
				{28678.180,342.136,10.000,0.070},
				{28711.351,321.276,10.000,0.050},
				{28742.435,300.415,10.000,0.040},
				{28771.434,279.554,10.000,0.030},
				{28798.346,258.693,10.000,0.020},
				{28823.172,237.833,10.000,0.020},
				{28845.913,216.972,10.000,0.010},
				{28866.567,196.111,10.000,0.010},
				{28885.135,175.250,10.000,0.010},
				{28901.617,154.390,10.000,0.000},
				{28916.020,133.676,10.000,0.000},
				{28928.427,114.453,10.000,0.000},
				{28938.985,96.720,10.000,0.000},
				{28947.845,80.477,10.000,0.000},
				{28955.155,65.724,10.000,0.000},
				{28961.064,52.461,10.000,0.000},
				{28965.722,40.688,10.000,0.000},
				{28969.277,30.406,10.000,0.000},
				{28971.878,21.613,10.000,0.000},
				{28973.674,14.310,10.000,0.000},
				{28974.814,8.498,10.000,0.000},
				{28975.448,4.175,10.000,0.000},
				{28975.724,1.342,10.000,0.000},
				{28975.791,0.000,10.000,0.000},
				{28975.791,0.000,10.000,0.000}		};

}