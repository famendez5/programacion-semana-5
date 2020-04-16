import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

		}
	}

	public static int encuentroEnLaUniversidad(int a, int b, int c) {
		int i = 0;

		do {
			i++;
		} while (i % a != 0 || i % b != 0 || i % c != 0);

		return i;
	}

}
