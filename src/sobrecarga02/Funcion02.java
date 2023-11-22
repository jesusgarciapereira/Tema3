package sobrecarga02;

public class Funcion02 {
	static double media(int a, int b) {
		double media = (a + b) / 2;
		return media;
	}
	
	static double media(int a, int b, int c) {
		double media = (a + b) / 3;
		return media;
	}
}
