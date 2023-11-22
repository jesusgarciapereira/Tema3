package ejercicio03;

public class Funcion03 {

	// Función numeroMaximo()
	static int numeroMaximo(int a, int b) {

		// Declaramos la variable del número máximo
		int max;

		// Le asignamos como valor uno de los parámetros, según el caso
		max = (a >= b) ? a : b;

		// Devolverá el valor del número máximo
		return max;
	}
}
