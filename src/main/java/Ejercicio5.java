import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese el punto x: ");
			int x = scanner.nextInt();

			System.out.print("Ingrese el punto c: ");
			int y = scanner.nextInt();

			System.out.print("Ingrese el punto a: ");
			int a = scanner.nextInt();

			System.out.print("Ingrese el punto b: ");
			int b = scanner.nextInt();

			System.out.println("La menor distancia para llegar al borde es: " + distanciaAlBorde(x, y, a, b));
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
