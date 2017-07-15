package squarelotron;

public class Squarelotron {
	int size;
	int[][] squarelotron;
	
	public Squarelotron(int n) {
		size = n;
		squarelotron = new int[n][n];
		
		for (int i = 0;i < n; i++) {
			for (int j = 0;j < n; j++) {
				squarelotron[i][j] = i * j;
			}
		}
	}
}
