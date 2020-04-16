import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

		}
	}

	public static int[] conjeturaDeGoldbach(int numero) {
		for (int i = 2; i < numero; i++) {
			if (!Ejercicio7.esPrimo(i)) {
				continue;
			}

			for (int j = 2; j < numero; j++) {
				if (!Ejercicio7.esPrimo(j)) {
					continue;
				}

				if (i + j == numero) {
					return new int[] { i, j };
				}
			}
		}

		return null;
	}

}
