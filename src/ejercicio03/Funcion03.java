package ejercicio03;

public class Funcion03 {

	// Función numeroMaximo()
	static int numeroMaximo(int a, int b) {
		
		// Si el primer parámetro es mayor o igual que el segundo
		if (a >= b)
			// Nos devolverá el valor del primero
			return a;
		
		// Si el primer parámetro es menor que el segundo
		else
			// Nos devolverá el valor del segundo
			return b;
	}
}
