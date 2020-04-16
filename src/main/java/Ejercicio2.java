import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese un numero entero: ");

			if (esPar(scanner.nextInt())) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero no es par");
			}
		}
	}

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

}
