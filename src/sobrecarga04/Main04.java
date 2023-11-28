package sobrecarga04;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		// Declaración de variables que pedimos
		int numero;
		String cadena;

		// Declaración de variable que mostramos
		boolean isOne;
		boolean isTrue;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		do {
			// Pedimos al usuario un número y lo leemos
			System.out.println("Escriba un número (0 ó 1)");
			numero = sc.nextInt();
		} // Se repiten las instrucciones si el numero no es 0 o 1
		while (numero < 0 || numero > 1);
		
		// Limpiamos el Buffer
		sc.nextLine();

		do {
			// Pedimos al usuario tres números enteros y lo leemos
			System.out.println("Escriba un texto ('true' o 'false')");
			cadena = sc.nextLine();
		} // Se repiten las instrucciones si la cadena no es "true" o "false"
		while (!cadena.equals("true") && !cadena.equals("false"));

		// Le asignamos a estas variables la funcion parseToBoolean()
		isOne = Funcion04.parseToBoolean(numero);
		isTrue = Funcion04.parseToBoolean(cadena);

		// Mostramos el resultado
		System.out.println("Número " + numero + " ¿es uno?: " + isOne);
		System.out.println("Cadena " + cadena + " ¿es true?: " + isTrue);

		// Cerramos el Scanner
		sc.close();

	}

}
