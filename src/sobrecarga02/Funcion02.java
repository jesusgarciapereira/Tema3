package sobrecarga02;

public class Funcion02 {

	// Funcion que nos devuelve la media entre los dos números del parámetro
	static double media(int a, int b) {
		double media = (double) (a + b) / 2;
		return media;
	}

	// Lo mismo que la función anterior pero con tres números
	static double media(int a, int b, int c) {
		double media = (double) (a + b + c) / 3;
		return media;
	}
}
