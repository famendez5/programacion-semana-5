import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese cada cuantos dias va Ana a la universidad: ");
			int a = scanner.nextInt();

			System.out.print("Ingrese cada cuantos dias va Bernardo a la universidad: ");
			int b = scanner.nextInt();

			System.out.print("Ingrese cada cuantos dias va Carlos a la universidad: ");
			int c = scanner.nextInt();

			int siguienteEncuentro = encuentroEnLaUniversidad(a, b, c);
			System.out.println("Si todos van a la universidad hoy, los tres iran nuevamente en " + siguienteEncuentro + " dias ");
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
