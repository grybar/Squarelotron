package squarelotron;

public class Squarelotron {
	int size;
	int[][] squarelotron;
	
	public Squarelotron(int n) {
		size = n;
		squarelotron = new int[n][n];
		
		int row = 0,column = 0, finalNumber = n * n;
		for (int i = 1;i <= finalNumber; i++) {
			squarelotron[row][column] = i;	
			column++;
			if (column > size - 1) {
				column = 0;
			}
			if (i % 5 == 0) {
				row++;
			}
		}
	}
	
	
}
