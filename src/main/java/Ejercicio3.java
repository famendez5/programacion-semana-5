import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

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
