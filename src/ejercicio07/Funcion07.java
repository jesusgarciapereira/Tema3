package ejercicio07;

public class Funcion07 {

	// Función esPrimo()
	public static boolean esPrimo(int n) {

		// Declaramos la variable de tipo boolean que devolverá la función
		boolean esPrimo;

		// Si el parámetro es 1, le asigna falso
		if (n == 1)
			esPrimo = false;

		// Si el número es distinto de 1
		else {
			
			// Antes de hacer comprobaciones, suponemos que es primo y le asigna verdadero
			esPrimo = true;

			// Bucle for desde el 2 hasta la raíz cuadrada del parámetro
			for (int i = 2; i <= Math.sqrt(n); i++) {
				// Si, al menos, uno ellos es divisor del número, le asigna falso
				if (n % i == 0)
					esPrimo = false;
			}
		}

		// Devolverá el valor del boolean
		return esPrimo;
	}
}
