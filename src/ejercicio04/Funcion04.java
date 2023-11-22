package ejercicio04;

public class Funcion04 {

	static boolean esVocal(String caracter) {

		// Declaramos la variable de tipo boolean que devolverá la función
		boolean esVocal;

		// Le asignamos un Switch (incluirá también mayúsculas)
		esVocal = switch (caracter.toLowerCase()) {
		// Si es parámetro es uno de estos casos, le asigna true
		case "a", "e", "i", "o", "u" -> true;
		// En cualquier otro caso, le asigna false
		default -> false;
		};
		
		// Devolverá el valor del boolean
		return esVocal;

	}
}
