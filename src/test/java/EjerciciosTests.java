/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EjerciciosTests {
	@Test
	void testValorAbsoluto() {
		assertEquals(10, Ejercicio1.valorAbsoluto(10));
		assertEquals(5, Ejercicio1.valorAbsoluto(-5));
		assertEquals(7.5f, Ejercicio1.valorAbsoluto(-7.5f));
	}

	@Test
	void testEsPar() {
		assertTrue(Ejercicio2.esPar(2));
		assertTrue(Ejercicio2.esPar(-10));
		assertFalse(Ejercicio2.esPar(13));
	}

	@Test
	void testTipoTriangulo() {
		assertEquals(TipoTriangulo.EQUILATERO, Ejercicio3.tipoTriangulo(10, 10, 10));
		assertEquals(TipoTriangulo.ISOSCELES, Ejercicio3.tipoTriangulo(5, 10, 10));
		assertEquals(TipoTriangulo.ISOSCELES, Ejercicio3.tipoTriangulo(15, 15, 15.5f));
		assertEquals(TipoTriangulo.ISOSCELES, Ejercicio3.tipoTriangulo(30, 10, 30));
		assertEquals(TipoTriangulo.ESCALENO, Ejercicio3.tipoTriangulo(20, 30, 8));
	}

	@Test
	void testJuegoDeDardos() {
		assertEquals(15, Ejercicio4.juegoDeDardos(-0.2f, 0.9f));
		assertEquals(15, Ejercicio4.juegoDeDardos(0, 1));

		assertEquals(9, Ejercicio4.juegoDeDardos(1.2f, 1.6f));
		assertEquals(9, Ejercicio4.juegoDeDardos(0.63f, 1.2f));

		assertEquals(5, Ejercicio4.juegoDeDardos(2.8f, -2.24f));
		assertEquals(5, Ejercicio4.juegoDeDardos(1.1f, 2.43f));

		assertEquals(2, Ejercicio4.juegoDeDardos(-3.71f, -3.9f));
		assertEquals(2, Ejercicio4.juegoDeDardos(3.2f, -2.4f));

		assertEquals(1, Ejercicio4.juegoDeDardos(4.18f, -4.45f));
		assertEquals(1, Ejercicio4.juegoDeDardos(0.25f, 4.2f));

		assertEquals(0, Ejercicio4.juegoDeDardos(7.2f, 1.4f));
	}

	@Test
	void testDistanciaAlBorde() {
		assertEquals(2, Ejercicio5.distanciaAlBorde(8, 6, 10, 10));
		assertEquals(2, Ejercicio5.distanciaAlBorde(2, 6, 10, 10));
		assertEquals(4, Ejercicio5.distanciaAlBorde(5, 4, 10, 10));
	}

	@Test
	void testEncuentroEnLaUniversidad() {
		assertEquals(6, Ejercicio6.encuentroEnLaUniversidad(1, 2, 3));
		assertEquals(12, Ejercicio6.encuentroEnLaUniversidad(4, 3, 2));
	}

	@Test
	void testEsPrimo() {
		assertFalse(Ejercicio7.esPrimo(1));
		assertTrue(Ejercicio7.esPrimo(2));
		assertTrue(Ejercicio7.esPrimo(3));
		assertFalse(Ejercicio7.esPrimo(4));
		assertTrue(Ejercicio7.esPrimo(5));
		assertTrue(Ejercicio7.esPrimo(7));
		assertFalse(Ejercicio7.esPrimo(81));
		assertFalse(Ejercicio7.esPrimo(120));
	}

	@Test
	void testConjeturaDeGoldbach() {
		assertArrayEquals(new int[] { 2, 2 }, Ejercicio8.conjeturaDeGoldbach(4));
		assertArrayEquals(new int[] { 3, 3 }, Ejercicio8.conjeturaDeGoldbach(6));
		assertArrayEquals(new int[] { 3, 5 }, Ejercicio8.conjeturaDeGoldbach(8));
		assertArrayEquals(new int[] { 7, 1193 }, Ejercicio8.conjeturaDeGoldbach(1200));
	}
}