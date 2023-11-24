package ejercicio08;

import ejercicio07.Funcion07;

public class Funcion08 {

	// Función contadorPrimos()
	static int contadorDivisoresPrimos(int n) {

		// Declaramos la variable del contador de divisores primos
		int contadorDivisoresPrimos = 0;

		// Declaramos la variable esPrimo
		boolean esPrimo;

		// Bucle for desde el 2 hasta la raíz cuadrada del parámetro
		for (int i = 2; i <= n; i++) {

			/* Asignamos el valor de nuestro booleano llamando a la función esPrimo() con el
			 * valor del contador del bucle como parámetro */
			esPrimo = Funcion07.esPrimo(i);

			/* Por cada uno de ellos que sea primo y divisor del parámetro, nuestro contador
			 * se incrementará */
			if (esPrimo == true && n % i == 0)
				contadorDivisoresPrimos++;
		}
		
		// Devolverá el valor de nuestro contador
		return contadorDivisoresPrimos;
	}
}
