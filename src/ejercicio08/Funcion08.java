package ejercicio08;

import ejercicio07.Funcion07;

public class Funcion08 {

	// Función contadorPrimos()
	static int contadorDivisoresPrimos(int n) {
		
		// Declaramos la variable del contador de divisores primos
		int contadorDivisoresPrimos = 0;
		
		// Bucle for desde el 2 hasta la raíz cuadrada del parámetro
		for (int i = 2; i <= Math.sqrt(n); i++) {
			
			/*
			 * Por cada uno de ellos que sea primo y divisor del parámetro, nuestro contador
			 * se incrementará
			 */
			if (Funcion07.esPrimo(i) == true && n % i == 0)
				contadorDivisoresPrimos++;
		}
		// Devolverá el valor de nuestro contador
		return contadorDivisoresPrimos;
	}
}
