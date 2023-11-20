package ejercicio07;

public class Funcion07 {

	// Función esPrimo()
	public static boolean esPrimo(int n) {
		
		// Si el número es 1, devolverá falso
		if (n == 1)
			return false;
		
		// Si el número es distinto de 1
		else {
			
			// Bucle for desde el 2 hasta la raíz cuadrada del parámetro
			for (int i = 2; i <= Math.sqrt(n); i++) {
				
				// Si, al menos, uno ellos es divisor del número, devolverá falso
				if (n % i == 0)
					return false;
			}
			
			// Si no encuentra ningún divisor, devolverá verdadero
			return true;
		}
	}
}