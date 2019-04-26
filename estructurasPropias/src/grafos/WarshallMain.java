package grafos;

public class WarshallMain {

	private static int infinityWar = Integer.MAX_VALUE;
	
	public WarshallMain() {

		
		int[][] test = new int[5][5];
		test[0][0] = 0;
		test[0][1] = 3;
		test[0][2] = 1;
		test[0][3] = 4;
		test[0][4] = infinityWar;
		test[1][0] = 3;
		test[1][1] = 0;
		test[1][2] = 5;
		test[1][3] = infinityWar;
		test[1][4] = 8;
		test[2][0] = 1;
		test[2][1] = 5;
		test[2][2] = 0;
		test[2][3] = 2;
		test[2][4] = infinityWar;
		test[3][0] = 4;
		test[3][1] = infinityWar;
		test[3][2] = 2;
		test[3][3] = 0;
		test[3][4] = 1;
		test[4][0] = infinityWar;
		test[4][1] = 8;
		test[4][2] = infinityWar;
		test[4][3] = 1;
		test[4][4] = 0;

		Floydwarshall fw = new Floydwarshall();

		int [][] result = fw.minimumDistance(test);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {

				System.out.println("[" + i + "]" + "[" + j + "] = " + result[i][j]);

			}
		}

	}

	public static void main(String[] args) {

		WarshallMain WM = new WarshallMain();

	}

}
