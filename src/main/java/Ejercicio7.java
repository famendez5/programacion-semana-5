import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese un numero: ");

			int numero = scanner.nextInt();

			if (esPrimo(numero)) {
				System.out.println("El numero ingresado es primo");
			} else {
				System.out.println("El numero ingresado no es primo");
			}
		}
	}

	public static boolean esPrimo(int n) {
		if (n <= 1) {
			return false;
		}

		if (n == 2) {
			return true;
		}

		if (n % 2 == 0) {
			return false;
		}

		int limite = (int) Math.sqrt(n);

		for (int i = 3; i < limite; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
