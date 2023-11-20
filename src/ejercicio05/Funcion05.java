package ejercicio05;

public class Funcion05 {

	// Función tablaDel()
	static void tablaDel(int n) {

		// Presentamos la función
		System.out.println("Tabla del " + n);
		System.out.println();

		/*
		 * Bucle for para mostrar la multiplicación de n por todos los números del 1 al
		 * 10
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}
