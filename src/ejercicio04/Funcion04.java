package ejercicio04;

public class Funcion04 {

	static boolean esVocal(String caracter) {

		boolean esVocal;

		switch (caracter.toLowerCase()) {
		case "a", "e", "i", "o", "u" -> esVocal = true;
		default -> esVocal = false;
		}
		return esVocal;

	}
}
