package sobrecarga03;

public class Funcion03 {
	static int sumaEnteros(int numero) {
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			suma += i;
		}
		return suma;
	}

	static int sumaEnteros(int num1, int num2) {
		int suma = 0;
		int numMin = num1 <= num2 ? num1 : num2;
		int numMaximo = num1 >= num2 ? num1 : num2;
		for (int i = numMin; i <= numMaximo; i++) {
			suma += i;
		}
		return suma;
	}
}
