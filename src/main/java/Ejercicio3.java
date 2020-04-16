import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese la longitud del lado a del triangulo: ");
			float ladoA = scanner.nextFloat();

			System.out.print("Ingrese la longitud del lado b del triangulo: ");
			float ladoB = scanner.nextFloat();

			System.out.print("Ingrese la longitud del lado c del triangulo: ");
			float ladoC = scanner.nextFloat();

			System.out.println("El tipo del triangulo es: " + tipoTriangulo(ladoA, ladoB, ladoC));
		}
	}

	public static TipoTriangulo tipoTriangulo(float ladoA, float ladoB, float ladoC) {
		if (ladoA == ladoB && ladoB == ladoC) {
			return TipoTriangulo.EQUILATERO;
		}

		if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
			return TipoTriangulo.ISOSCELES;
		}

		return TipoTriangulo.ESCALENO;
	}

}

enum TipoTriangulo {
	EQUILATERO, ISOSCELES, ESCALENO
}
