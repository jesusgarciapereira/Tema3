package ejercicio01;

public class Funcion01 {

	// Función eco()
	static void eco(int n) {

		// Switch para evaluar cada caso
		switch (n) {
		// Si el parámetro es igual a 0, mostrará un mensaje personalizado
		case 0 -> System.out.println(n + " veces... silencio absoluto");
		// En cualquier otro caso, mostrará n veces el mensaje "Eco..."
		default -> {
			for (int i = 1; i <= n; i++) {
				System.out.print("Eco...");
			}
		}
		}

	}
}
