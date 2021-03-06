import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese la posicion x del dardo: ");
			float x = scanner.nextFloat();

			System.out.print("Ingrese la posicion y del dardo: ");
			float y = scanner.nextFloat();

			System.out.println("El puntaje obtenido es: " + juegoDeDardos(x, y));
		}
	}

	public static int juegoDeDardos(float x, float y) {
		x = Ejercicio1.valorAbsoluto(x);
		y = Ejercicio1.valorAbsoluto(y);

		float max = x > y ? x : y;

		// Rojo
		if (max <= 1) {
			return 15;
		}

		// Naranja
		if (max <= 2) {
			return 9;
		}

		// Amarillo
		if (max <= 3) {
			return 5;
		}

		// Verde
		if (max <= 4) {
			return 2;
		}

		// Azul
		if (max <= 5) {
			return 1;
		}

		return 0;
	}

}
