package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class CenterToLeftSwitchArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.63,13.08,0.00)
	// (10.00,18.08,0.00)
	
    public CenterToLeftSwitchArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToLeftSwitchArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.078,1.552,10.000,0.000},
				{0.388,4.656,10.000,0.000},
				{1.086,9.313,10.000,0.000},
				{2.328,15.521,10.000,0.000},
				{4.268,23.282,10.000,0.000},
				{7.062,32.595,10.000,0.000},
				{10.865,43.460,10.000,0.000},
				{15.832,55.877,10.000,0.000},
				{22.118,69.846,10.000,0.000},
				{29.879,85.368,10.000,0.000},
				{39.269,102.441,10.000,0.000},
				{50.445,121.067,10.000,0.000},
				{63.560,141.245,10.000,0.000},
				{78.771,162.975,10.000,0.010},
				{96.233,186.257,10.000,0.010},
				{116.100,211.091,10.000,0.010},
				{138.528,237.477,10.000,0.020},
				{163.673,265.416,10.000,0.020},
				{191.689,294.907,10.000,0.030},
				{222.732,325.949,10.000,0.040},
				{256.879,356.992,10.000,0.060},
				{294.130,388.035,10.000,0.070},
				{334.486,419.078,10.000,0.090},
				{377.946,450.120,10.000,0.120},
				{424.510,481.163,10.000,0.150},
				{474.179,512.206,10.000,0.190},
				{526.951,543.249,10.000,0.230},
				{582.828,574.292,10.000,0.280},
				{641.810,605.334,10.000,0.340},
				{703.895,636.377,10.000,0.410},
				{769.085,667.420,10.000,0.490},
				{837.379,698.463,10.000,0.580},
				{908.778,729.506,10.000,0.680},
				{983.280,760.548,10.000,0.790},
				{1060.887,791.591,10.000,0.920},
				{1141.599,822.634,10.000,1.060},
				{1225.414,853.677,10.000,1.210},
				{1312.334,884.720,10.000,1.390},
				{1402.358,915.762,10.000,1.580},
				{1495.487,946.805,10.000,1.790},
				{1591.719,977.848,10.000,2.020},
				{1691.056,1008.891,10.000,2.280},
				{1793.497,1039.934,10.000,2.550},
				{1899.043,1070.976,10.000,2.850},
				{2007.693,1102.019,10.000,3.180},
				{2119.447,1133.062,10.000,3.530},
				{2234.305,1164.105,10.000,3.920},
				{2352.268,1195.148,10.000,4.330},
				{2473.335,1226.190,10.000,4.780},
				{2597.506,1257.233,10.000,5.260},
				{2724.781,1288.276,10.000,5.770},
				{2855.161,1319.319,10.000,6.320},
				{2988.645,1350.361,10.000,6.920},
				{3125.233,1381.404,10.000,7.550},
				{3264.926,1412.447,10.000,8.220},
				{3407.723,1443.490,10.000,8.940},
				{3553.624,1474.533,10.000,9.700},
				{3702.629,1505.575,10.000,10.520},
				{3854.739,1536.618,10.000,11.380},
				{4009.953,1567.661,10.000,12.290},
				{4168.271,1598.704,10.000,13.250},
				{4329.694,1629.747,10.000,14.260},
				{4494.220,1660.789,10.000,15.330},
				{4661.851,1691.832,10.000,16.450},
				{4832.587,1722.875,10.000,17.620},
				{5006.426,1753.918,10.000,18.840},
				{5183.370,1784.961,10.000,20.120},
				{5363.419,1816.003,10.000,21.440},
				{5546.571,1847.046,10.000,22.810},
				{5732.828,1878.089,10.000,24.220},
				{5922.189,1909.132,10.000,25.660},
				{6114.654,1940.175,10.000,27.140},
				{6310.224,1971.217,10.000,28.650},
				{6508.898,2002.260,10.000,30.180},
				{6710.676,2033.303,10.000,31.720},
				{6915.558,2064.346,10.000,33.270},
				{7123.545,2095.389,10.000,34.820},
				{7334.636,2126.431,10.000,36.360},
				{7548.831,2157.474,10.000,37.890},
				{7766.131,2188.517,10.000,39.390},
				{7986.534,2219.560,10.000,40.870},
				{8210.043,2250.602,10.000,42.310},
				{8436.655,2281.645,10.000,43.710},
				{8666.372,2312.688,10.000,45.060},
				{8899.115,2342.179,10.000,46.360},
				{9134.730,2370.117,10.000,47.610},
				{9373.061,2396.504,10.000,48.790},
				{9613.953,2421.338,10.000,49.910},
				{9857.251,2444.620,10.000,50.960},
				{10102.799,2466.350,10.000,51.940},
				{10350.443,2486.528,10.000,52.860},
				{10600.027,2505.153,10.000,53.700},
				{10851.396,2522.227,10.000,54.480},
				{11104.395,2537.748,10.000,55.180},
				{11358.868,2551.718,10.000,55.810},
				{11614.661,2564.135,10.000,56.380},
				{11871.618,2575.000,10.000,56.870},
				{12129.583,2584.312,10.000,57.290},
				{12388.403,2592.073,10.000,57.650},
				{12647.920,2598.282,10.000,57.940},
				{12907.981,2602.938,10.000,58.160},
				{13168.430,2606.042,10.000,58.310},
				{13429.112,2607.595,10.000,58.400},
				{13689.872,2607.595,10.000,58.420},
				{13950.600,2606.977,10.000,58.370},
				{14211.189,2604.806,10.000,58.260},
				{14471.484,2601.084,10.000,58.080},
				{14731.329,2595.810,10.000,57.830},
				{14990.568,2588.983,10.000,57.520},
				{15249.048,2580.604,10.000,57.130},
				{15506.611,2570.674,10.000,56.680},
				{15763.105,2559.191,10.000,56.160},
				{16018.372,2546.155,10.000,55.570},
				{16272.258,2531.568,10.000,54.910},
				{16524.608,2515.429,10.000,54.180},
				{16775.266,2497.737,10.000,53.370},
				{17024.078,2478.494,10.000,52.500},
				{17270.887,2457.698,10.000,51.560},
				{17515.540,2435.350,10.000,50.550},
				{17757.880,2411.450,10.000,49.470},
				{17997.752,2385.997,10.000,48.330},
				{18235.002,2358.993,10.000,47.120},
				{18469.473,2330.436,10.000,45.850},
				{18701.011,2300.328,10.000,44.530},
				{18929.492,2269.285,10.000,43.160},
				{19154.868,2238.242,10.000,41.740},
				{19377.140,2207.199,10.000,40.290},
				{19596.308,2176.157,10.000,38.800},
				{19812.372,2145.114,10.000,37.290},
				{20025.331,2114.071,10.000,35.750},
				{20235.186,2083.028,10.000,34.210},
				{20441.937,2051.985,10.000,32.660},
				{20645.583,2020.943,10.000,31.110},
				{20846.125,1989.900,10.000,29.570},
				{21043.563,1958.857,10.000,28.050},
				{21237.897,1927.814,10.000,26.550},
				{21429.126,1896.772,10.000,25.090},
				{21617.251,1865.729,10.000,23.650},
				{21802.272,1834.686,10.000,22.260},
				{21984.188,1803.643,10.000,20.910},
				{22163.000,1772.600,10.000,19.610},
				{22338.708,1741.558,10.000,18.350},
				{22511.312,1710.515,10.000,17.150},
				{22680.811,1679.472,10.000,16.000},
				{22847.206,1648.429,10.000,14.900},
				{23010.497,1617.386,10.000,13.860},
				{23170.683,1586.344,10.000,12.860},
				{23327.766,1555.301,10.000,11.920},
				{23481.744,1524.258,10.000,11.030},
				{23632.617,1493.215,10.000,10.190},
				{23780.387,1462.172,10.000,9.400},
				{23925.052,1431.130,10.000,8.650},
				{24066.613,1400.087,10.000,7.950},
				{24205.069,1369.044,10.000,7.290},
				{24340.421,1338.001,10.000,6.680},
				{24472.669,1306.958,10.000,6.100},
				{24601.813,1275.916,10.000,5.560},
				{24727.852,1244.873,10.000,5.060},
				{24850.788,1213.830,10.000,4.600},
				{24970.618,1182.787,10.000,4.160},
				{25087.345,1151.744,10.000,3.760},
				{25200.967,1120.702,10.000,3.390},
				{25311.485,1089.659,10.000,3.050},
				{25418.899,1058.616,10.000,2.730},
				{25523.209,1027.573,10.000,2.440},
				{25624.414,996.531,10.000,2.170},
				{25722.515,965.488,10.000,1.930},
				{25817.511,934.445,10.000,1.710},
				{25909.404,903.402,10.000,1.500},
				{25998.192,872.359,10.000,1.320},
				{26083.876,841.317,10.000,1.150},
				{26166.455,810.274,10.000,1.000},
				{26245.930,779.231,10.000,0.860},
				{26322.301,748.188,10.000,0.740},
				{26395.568,717.145,10.000,0.640},
				{26465.730,686.103,10.000,0.540},
				{26532.788,655.060,10.000,0.460},
				{26596.742,624.017,10.000,0.380},
				{26657.592,592.974,10.000,0.320},
				{26715.337,561.931,10.000,0.260},
				{26769.978,530.889,10.000,0.210},
				{26821.515,499.846,10.000,0.170},
				{26869.947,468.803,10.000,0.140},
				{26915.275,437.760,10.000,0.110},
				{26957.499,406.717,10.000,0.090},
				{26996.619,375.675,10.000,0.070},
				{27032.634,344.632,10.000,0.050},
				{27065.545,313.589,10.000,0.040},
				{27095.383,283.164,10.000,0.030},
				{27122.256,254.292,10.000,0.020},
				{27146.319,226.971,10.000,0.010},
				{27167.728,201.203,10.000,0.010},
				{27186.637,176.987,10.000,0.010},
				{27203.203,154.322,10.000,0.000},
				{27217.579,133.211,10.000,0.000},
				{27229.922,113.651,10.000,0.000},
				{27240.387,95.643,10.000,0.000},
				{27249.129,79.188,10.000,0.000},
				{27256.302,64.284,10.000,0.000},
				{27262.063,50.933,10.000,0.000},
				{27266.566,39.134,10.000,0.000},
				{27269.967,28.887,10.000,0.000},
				{27272.421,20.192,10.000,0.000},
				{27274.083,13.049,10.000,0.000},
				{27275.109,7.459,10.000,0.000},
				{27275.653,3.420,10.000,0.000},
				{27275.870,0.934,10.000,0.000},
				{27275.917,0.000,10.000,0.000},
				{27275.917,0.000,10.000,0.000}		};

}