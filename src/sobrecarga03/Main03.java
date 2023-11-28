package sobrecarga03;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// Declaración de variables que pedimos
		int numero;
		int num1;
		int num2;

		// Declaración de variable que mostramos
		int sumaDesde1;
		int sumaDesdeMinimo;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario tres números enteros y los leemos
		System.out.println("Escriba tres números enteros");
		numero = sc.nextInt();
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// Le asignamos a estas variables la funcion sumaEnteros()
		sumaDesde1 = Funcion03.sumaEnteros(numero);
		sumaDesdeMinimo = Funcion03.sumaEnteros(num1, num2);

		// Mostramos el resultado
		System.out.println("Suma desde 1 hasta " + numero + " = " + sumaDesde1);
		System.out.println("Suma desde " + num1 + " hasta " + num2 + " = " + sumaDesdeMinimo);

		// Cerramos el Scanner
		sc.close();

	}

}
