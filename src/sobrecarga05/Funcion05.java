package sobrecarga05;

import java.util.Random;

public class Funcion05 {
	static void numerosAleatorios(int cantNumeros) {
		Random r = new Random();

		for (int i = 1; i <= cantNumeros; i++) {
			r.nextDouble(0, 1);
		}
	}

	static void numerosAleatorios(int cantNumeros, int valorMaximo) {
		Random r = new Random();

		for (int i = 1; i <= cantNumeros; i++) {
			r.nextInt(0, valorMaximo);
		}
	}

	static void numerosAleatorios(int cantNumeros, int valorMinimo, int valorMaximo) {
		Random r = new Random();

		for (int i = 1; i <= cantNumeros; i++) {
			r.nextInt(valorMinimo, valorMaximo);
		}
	}
}
