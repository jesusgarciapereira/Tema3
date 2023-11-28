package sobrecarga02;

import java.util.Scanner;


public class Main02 {

	public static void main(String[] args) {
		// Declaración de variables que pedimos
		int num1;
		int num2;
		int num3;

		// Declaración de variable que mostramos
		double media2;
		double media3;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario tres números enteros y los leemos
		System.out.println("Escriba tres números enteros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		// Le asignamos a estas variables la funcion media()
		media2 = Funcion02.media(num1, num2);
		media3 = Funcion02.media(num1, num2, num3);

		// Mostramos el resultado
		System.out.println("Media de " + num1 + " y " + num2 + " = " + media2);
		System.out.println("Media de " + num1 + ", " + num2 + " y " + num3 + " = " + media3);

		// Cerramos el Scanner
		sc.close();

	}

}
