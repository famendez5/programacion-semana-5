import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese un numero real: ");
			float abs = valorAbsoluto(scanner.nextFloat());
			System.out.println("El valor absoluto del numero es: " + abs);
		}
	}

	public static float valorAbsoluto(float numero) {
		if (numero < 0) {
			return -numero;
		}

		return numero;
	}

}
