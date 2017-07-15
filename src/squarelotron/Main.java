package squarelotron;

public class Main {

	public static void main(String[] args) {
		Squarelotron testSquarelotron = new Squarelotron(5);
		printSquarelotron(testSquarelotron);
	}

	public static void printSquarelotron(Squarelotron n) {
		for (int i = 0; i < n.size; i++) {
			for (int j = 0; j < n.size; j++) {
				System.out.print(n.squarelotron[i][j]);
			}
			System.out.println(" ");
		}
	}

}
