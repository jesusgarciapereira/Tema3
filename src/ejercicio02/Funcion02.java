package ejercicio02;

public class Funcion02 {

	// Función comprendidosEntreDos()
	static void comprendidosEntreDos(int a, int b) {

		// Mostramos la primera parte del mensaje
		System.out.print("Entre " + a + " y " + b + " tenemos: ");

		// Si los parámetros son iguales, mostrará este mensaje
		if (a == b)
			System.out.println("Nada, ambos son iguales");
		// Si el primer parámetro es menor que el segundo
		else if (a < b) { 
			// Bucle for para mostrar los números comprendidos entre ambos
			for (int i = a + 1; i < b; i++) {
				System.out.print(i + " ");
			}
			// Si el primer parámetro es mayor que el segundo
		} else {
			// Bucle for para mostrar los números comprendidos entre ambos
			for (int i = a - 1; i > b; i--) {
				System.out.print(i + " ");
			}
		}
	}
}