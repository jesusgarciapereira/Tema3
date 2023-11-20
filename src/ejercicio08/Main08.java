package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {

		// Declaramos la variable del número que le pediremos al usuario
		int n = 0;

		// Declaramos la variable del contador de divisores primos
		int contadorDivisoresPrimos = 0;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Número de divisores primos");
		System.out.println("--------------------------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				/*
				 * Solicitamos al usuario el número y lo leemos
				 */
				System.out.println("Introduzca un número (a partir de 1)");
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

		/*
		 * Establecemos la relación entre las variables llamando a la función
		 * contadorDivisoresPrimos() con el número introducido por el usuario como parámetro
		 */
		contadorDivisoresPrimos = Funcion08.contadorDivisoresPrimos(n);

		// Probamos el funcionamiento de la función
		System.out.println("El número " + n + " tiene " + contadorDivisoresPrimos + " divisor(es) primo(s)");
		
		// Cerramos el Scanner
		sc.close();

	}

}
