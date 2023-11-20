package ejercicio04;

public class Funcion04 {

	static boolean esVocal(char x) {

		return switch (x) {
		case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> true;
		default -> false;
		};

	}
}
