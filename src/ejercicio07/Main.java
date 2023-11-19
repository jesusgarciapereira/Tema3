package ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable del número que le pediremos al usuario
		int n = 0;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Número n ¿es primo?");
		System.out.println("-------------------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				/*
				 * Solicitamos al usuario el número y lo leemos
				 */
				System.out.println("Introduzca un número y mostraré si es primo (a partir de 1)");
				n = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número sea menor que 1, repetiremos las instrucciones
		} while (n < 1);

		// Mostramos el resultado
		System.out.println("El número " + n + (Funcion.esPrimo(n) ? " es primo" : " no es primo"));

		// Cerramos el Scanner
		sc.close();
	}

}
