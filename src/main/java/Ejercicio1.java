import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			
		}
	}

	public static float valorAbsoluto(float numero) {
		if (numero < 0) {
			return -numero;
		}

		return numero;
	}

}
