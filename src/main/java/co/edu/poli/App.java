/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package co.edu.poli;

public class App {
    public static void main(String[] args) {
    	
    }

	public static float valorAbsoluto(float numero) {
		if (numero < 0) {
			return -numero;
		}

		return numero;
	}

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
}
