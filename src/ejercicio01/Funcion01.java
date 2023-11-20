package ejercicio01;

public class Funcion01 {

	// Función eco()
	static void eco(int n) {
		
		// Si el parámetro es igual a 0, mostrará un mensaje personalizado
		if (n == 0)
			System.out.println(n + " veces... silencio absoluto");
		
		// En caso contrario, mostrará n veces el mensaje "Eco..."
		else {
			for (int i = 1; i <= n; i++) {
				System.out.print("Eco...");
			}
		}
	}
}
