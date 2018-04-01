package org.usfirst.frc.team5803.robot.arcs;

import org.usfirst.frc.team5803.robot.models.SrxMotionProfile;
import org.usfirst.frc.team5803.robot.utils.SrxTrajectory;

public class CenterToRightScaleArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.93,13.08,0.00)
	// (9.31,5.08,-45.00)
	
    public CenterToRightScaleArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterToRightScaleArc(boolean flipped) {
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
				{78.771,162.975,10.000,0.000},
				{96.233,186.257,10.000,0.000},
				{116.100,211.091,10.000,0.000},
				{138.528,237.477,10.000,-0.010},
				{163.673,265.416,10.000,-0.010},
				{191.689,294.907,10.000,-0.010},
				{222.732,325.949,10.000,-0.010},
				{256.879,356.992,10.000,-0.020},
				{294.130,388.035,10.000,-0.020},
				{334.486,419.078,10.000,-0.030},
				{377.946,450.120,10.000,-0.040},
				{424.510,481.163,10.000,-0.050},
				{474.179,512.206,10.000,-0.060},
				{526.951,543.249,10.000,-0.080},
				{582.828,574.292,10.000,-0.100},
				{641.810,605.334,10.000,-0.120},
				{703.895,636.377,10.000,-0.140},
				{769.085,667.420,10.000,-0.170},
				{837.379,698.463,10.000,-0.200},
				{908.778,729.506,10.000,-0.230},
				{983.280,760.548,10.000,-0.270},
				{1060.887,791.591,10.000,-0.320},
				{1141.599,822.634,10.000,-0.370},
				{1225.414,853.677,10.000,-0.420},
				{1312.334,884.720,10.000,-0.480},
				{1402.358,915.762,10.000,-0.550},
				{1495.487,946.805,10.000,-0.620},
				{1591.719,977.848,10.000,-0.710},
				{1691.056,1008.891,10.000,-0.800},
				{1793.497,1039.934,10.000,-0.890},
				{1899.043,1070.976,10.000,-1.000},
				{2007.693,1102.019,10.000,-1.120},
				{2119.447,1133.062,10.000,-1.250},
				{2234.305,1164.105,10.000,-1.380},
				{2352.268,1195.148,10.000,-1.530},
				{2473.335,1226.190,10.000,-1.700},
				{2597.506,1257.233,10.000,-1.870},
				{2724.781,1288.276,10.000,-2.060},
				{2855.161,1319.319,10.000,-2.260},
				{2988.645,1350.361,10.000,-2.480},
				{3125.233,1381.404,10.000,-2.720},
				{3264.926,1412.447,10.000,-2.970},
				{3407.723,1443.490,10.000,-3.250},
				{3553.624,1474.533,10.000,-3.540},
				{3702.629,1505.575,10.000,-3.860},
				{3854.739,1536.618,10.000,-4.190},
				{4009.953,1567.661,10.000,-4.560},
				{4168.271,1598.704,10.000,-4.940},
				{4329.694,1629.747,10.000,-5.360},
				{4494.220,1660.789,10.000,-5.810},
				{4661.851,1691.832,10.000,-6.290},
				{4832.587,1722.875,10.000,-6.800},
				{5006.426,1753.918,10.000,-7.350},
				{5183.370,1784.961,10.000,-7.940},
				{5363.419,1816.003,10.000,-8.570},
				{5546.571,1847.046,10.000,-9.240},
				{5732.828,1878.089,10.000,-9.970},
				{5922.189,1909.132,10.000,-10.750},
				{6114.654,1940.175,10.000,-11.580},
				{6310.224,1971.217,10.000,-12.480},
				{6508.898,2002.260,10.000,-13.440},
				{6710.676,2033.303,10.000,-14.470},
				{6915.558,2064.346,10.000,-15.580},
				{7123.545,2095.389,10.000,-16.770},
				{7334.636,2126.431,10.000,-18.040},
				{7548.831,2157.474,10.000,-19.410},
				{7766.131,2188.517,10.000,-20.880},
				{7986.534,2219.560,10.000,-22.450},
				{8210.043,2250.602,10.000,-24.130},
				{8436.655,2281.645,10.000,-25.920},
				{8666.372,2312.688,10.000,-27.820},
				{8899.115,2342.179,10.000,-29.840},
				{9134.730,2370.117,10.000,-31.980},
				{9373.061,2396.504,10.000,-34.220},
				{9613.953,2421.338,10.000,-36.560},
				{9857.251,2444.620,10.000,-38.990},
				{10102.799,2466.350,10.000,-41.480},
				{10350.443,2486.528,10.000,-44.030},
				{10600.027,2505.153,10.000,-46.610},
				{10851.396,2522.227,10.000,-49.190},
				{11104.395,2537.748,10.000,-51.760},
				{11358.868,2551.718,10.000,-54.280},
				{11614.661,2564.135,10.000,-56.750},
				{11871.618,2575.000,10.000,-59.130},
				{12129.583,2584.312,10.000,-61.420},
				{12388.403,2592.073,10.000,-63.590},
				{12647.920,2598.282,10.000,-65.660},
				{12907.981,2602.938,10.000,-67.590},
				{13168.430,2606.042,10.000,-69.410},
				{13429.112,2607.595,10.000,-71.100},
				{13689.872,2607.595,10.000,-72.670},
				{13950.631,2607.595,10.000,-74.110},
				{14211.391,2607.595,10.000,-75.450},
				{14472.150,2607.595,10.000,-76.670},
				{14732.909,2607.595,10.000,-77.790},
				{14993.669,2607.595,10.000,-78.820},
				{15254.428,2607.595,10.000,-79.750},
				{15515.188,2607.595,10.000,-80.590},
				{15775.947,2607.595,10.000,-81.350},
				{16036.707,2607.595,10.000,-82.030},
				{16297.466,2607.595,10.000,-82.640},
				{16558.226,2607.595,10.000,-83.170},
				{16818.985,2607.595,10.000,-83.640},
				{17079.745,2607.595,10.000,-84.050},
				{17340.504,2607.595,10.000,-84.390},
				{17601.188,2606.094,10.000,-84.670},
				{17861.645,2603.042,10.000,-84.900},
				{18121.719,2598.438,10.000,-85.070},
				{18381.255,2592.281,10.000,-85.180},
				{18640.098,2584.572,10.000,-85.240},
				{18898.092,2575.311,10.000,-85.250},
				{19155.082,2564.498,10.000,-85.210},
				{19410.914,2552.133,10.000,-85.120},
				{19665.431,2538.216,10.000,-84.990},
				{19918.480,2522.746,10.000,-84.800},
				{20169.903,2505.724,10.000,-84.570},
				{20419.547,2487.151,10.000,-84.290},
				{20667.256,2467.025,10.000,-83.960},
				{20912.874,2445.347,10.000,-83.590},
				{21156.247,2422.117,10.000,-83.180},
				{21397.220,2397.334,10.000,-82.730},
				{21635.637,2371.000,10.000,-82.230},
				{21871.342,2343.113,10.000,-81.690},
				{22104.182,2313.675,10.000,-81.110},
				{22334.000,2282.684,10.000,-80.500},
				{22560.716,2251.641,10.000,-79.840},
				{22784.328,2220.598,10.000,-79.150},
				{23004.835,2189.555,10.000,-78.430},
				{23222.239,2158.512,10.000,-77.670},
				{23436.538,2127.470,10.000,-76.890},
				{23647.733,2096.427,10.000,-76.070},
				{23855.823,2065.384,10.000,-75.220},
				{24060.810,2034.341,10.000,-74.350},
				{24262.691,2003.299,10.000,-73.460},
				{24461.469,1972.256,10.000,-72.540},
				{24657.143,1941.213,10.000,-71.610},
				{24849.712,1910.170,10.000,-70.660},
				{25039.177,1879.127,10.000,-69.690},
				{25225.537,1848.085,10.000,-68.720},
				{25408.794,1817.042,10.000,-67.740},
				{25588.946,1785.999,10.000,-66.760},
				{25765.993,1754.956,10.000,-65.770},
				{25939.937,1723.913,10.000,-64.790},
				{26110.776,1692.871,10.000,-63.820},
				{26278.511,1661.828,10.000,-62.860},
				{26443.142,1630.785,10.000,-61.900},
				{26604.668,1599.742,10.000,-60.970},
				{26763.090,1568.699,10.000,-60.050},
				{26918.408,1537.657,10.000,-59.150},
				{27070.621,1506.614,10.000,-58.280},
				{27219.731,1475.571,10.000,-57.430},
				{27365.736,1444.528,10.000,-56.600},
				{27508.636,1413.485,10.000,-55.810},
				{27648.433,1382.443,10.000,-55.040},
				{27785.125,1351.400,10.000,-54.310},
				{27918.713,1320.357,10.000,-53.610},
				{28049.196,1289.314,10.000,-52.940},
				{28176.575,1258.271,10.000,-52.300},
				{28300.850,1227.229,10.000,-51.690},
				{28422.021,1196.186,10.000,-51.120},
				{28540.088,1165.143,10.000,-50.580},
				{28655.050,1134.100,10.000,-50.070},
				{28766.908,1103.058,10.000,-49.600},
				{28875.661,1072.015,10.000,-49.150},
				{28981.311,1040.972,10.000,-48.740},
				{29083.856,1009.929,10.000,-48.350},
				{29183.297,978.886,10.000,-47.990},
				{29279.633,947.844,10.000,-47.660},
				{29372.865,916.801,10.000,-47.360},
				{29462.993,885.758,10.000,-47.080},
				{29550.017,854.715,10.000,-46.830},
				{29633.936,823.672,10.000,-46.600},
				{29714.751,792.630,10.000,-46.390},
				{29792.462,761.587,10.000,-46.200},
				{29867.069,730.544,10.000,-46.030},
				{29938.571,699.501,10.000,-45.880},
				{30006.969,668.458,10.000,-45.750},
				{30072.263,637.416,10.000,-45.630},
				{30134.452,606.373,10.000,-45.530},
				{30193.537,575.330,10.000,-45.440},
				{30249.518,544.287,10.000,-45.360},
				{30302.395,513.244,10.000,-45.290},
				{30352.167,482.202,10.000,-45.240},
				{30398.835,451.159,10.000,-45.190},
				{30442.399,420.116,10.000,-45.150},
				{30482.858,389.073,10.000,-45.110},
				{30520.213,358.030,10.000,-45.090},
				{30554.464,326.988,10.000,-45.070},
				{30585.611,295.945,10.000,-45.050},
				{30613.728,266.402,10.000,-45.040},
				{30638.969,238.412,10.000,-45.030},
				{30661.488,211.974,10.000,-45.020},
				{30681.441,187.087,10.000,-45.010},
				{30698.983,163.753,10.000,-45.010},
				{30714.270,141.972,10.000,-45.010},
				{30727.455,121.742,10.000,-45.000},
				{30738.696,103.064,10.000,-45.000},
				{30748.146,85.939,10.000,-45.000},
				{30755.961,70.365,10.000,-45.000},
				{30762.296,56.344,10.000,-45.000},
				{30767.307,43.875,10.000,-45.000},
				{30771.149,32.958,10.000,-45.000},
				{30773.977,23.594,10.000,-45.000},
				{30775.945,15.781,10.000,-45.000},
				{30777.210,9.521,10.000,-45.000},
				{30777.927,4.812,10.000,-45.000},
				{30778.251,1.656,10.000,-45.000},
				{30778.336,0.052,10.000,-45.000},
				{30778.339,0.000,10.000,-45.000},
				{30778.339,0.000,10.000,-45.000}		};

}