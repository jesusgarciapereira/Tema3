package sobrecarga01;

public class Funcion01 {
	
	// Funcion que nos devuelve la suma de los parámetros
	static int suma(int a, int b) {
		int suma = a + b;
		return suma;
	}
	
	//Lo mismo que la función anterior pero con números decimales
	static double suma(double a, double b) {
		double suma = a + b;
		return suma;
	}
}
