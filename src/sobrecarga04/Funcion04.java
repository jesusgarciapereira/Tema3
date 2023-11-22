package sobrecarga04;

public class Funcion04 {
	static boolean parseToBoolean(int numero) {
		boolean isOne;

		isOne = switch (numero) {
		case 0 -> false;
		case 1 -> true;
		default -> false;
		};

		return isOne;
	}

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
