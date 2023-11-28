package sobrecarga05;

import java.util.Random;

public class Funcion05 {

	// Funcion que muestra números comprendidos entre 0 y 1, tantos como indique el
	// parámetro
	static void numerosAleatorios(int cantNumeros) {
		double numAleatorio;
		Random r = new Random();

		System.out.print(cantNumeros + " Número(s) aleatorio(s) entre 0 y 1: ");
		for (int i = 1; i <= cantNumeros; i++) {
			numAleatorio = r.nextDouble(0, 1);
			System.out.print(numAleatorio + " ");
		}
		System.out.println();
	}

	// Igual que el anterior pero con números entre 0 y el segundo valor del
	// parámetro
	static void numerosAleatorios(int cantNumeros, int valorMaximo) {
		int numAleatorio;
		Random r = new Random();

		System.out.print(cantNumeros + " Número(s) aleatorio(s) entre 1 y " + valorMaximo + ": ");
		for (int i = 1; i <= cantNumeros; i++) {
			numAleatorio = r.nextInt(1, valorMaximo + 1);
			System.out.print(numAleatorio + " ");
		}
		System.out.println();
	}

	// Igual que el primero pero con números entre el segundo y el tercer valor del
	// parámetro
	static void numerosAleatorios(int cantNumeros, int valorMinimo, int valorMaximo) {
		int numAleatorio;
		Random r = new Random();

		System.out.print(cantNumeros + " Número(s) aleatorio(s9 entre " + valorMinimo + " y " + valorMaximo + ": ");
		for (int i = 1; i <= cantNumeros; i++) {
			numAleatorio = r.nextInt(valorMinimo, valorMaximo + 1);
			System.out.print(numAleatorio + " ");
		}
		System.out.println();
	}
}
