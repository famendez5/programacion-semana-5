import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

		}
	}

	public static int distanciaAlBorde(int x, int y, int a, int b) {
		int min = x;

		if (y < min) {
			min = y;
		}
		if (a - x < min) {
			min = a - x;
		}

		if (b - y < min) {
			min = b - y;
		}

		return min;
	}

}
