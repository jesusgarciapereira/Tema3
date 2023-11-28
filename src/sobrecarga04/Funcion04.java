package sobrecarga04;

public class Funcion04 {
	// Funcion que devolverá false si es parámetro es 0 y true si es 1
	static boolean parseToBoolean(int numero) {
		boolean isOne;

		isOne = switch (numero) {
		case 0 -> false;
		case 1 -> true;
		default -> false;
		};

		return isOne;
	}

	// Funcion que devolverá false si es parámetro es "false" y true si es "true"
	static boolean parseToBoolean(String cadena) {
		boolean isTrue;

		isTrue = switch (cadena) {
		case "false" -> false;
		case "true" -> true;
		default -> false;
		};

		return isTrue;
	}
}
