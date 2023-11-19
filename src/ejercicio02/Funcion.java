package ejercicio02;

public class Funcion {

	// Función comprendidosEntreDos()
	static void comprendidosEntreDos(int a, int b) {

		// Mostramos la primera parte del mensaje
		System.out.print("Entre " + a + " y " + b + " tenemos: ");

		// Si los parámetros son iguales, mostrará este mensaje
		if (a == b)
			System.out.println("Nada, ambos son iguales");

		else if (a < b) { // Si el primer parámetro es menor que el segundo
			// Bucle for para mostrar los números comprendidos entre ambos
			for (int i = a + 1; i < b; i++) {
				System.out.print(i + " ");
			}
		} else {// Si el primer parámetro es mayor que el segundo
			// Bucle for para mostrar los números comprendidos entre ambos
			for (int i = a - 1; i > b; i--) {
				System.out.print(i + " ");
			}
		}
	}
}