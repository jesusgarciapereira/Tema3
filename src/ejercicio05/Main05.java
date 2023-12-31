package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {

		// Declaramos la variable del número que le pediremos al usuario
		int n = 0;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Tabla del n");
		System.out.println("-----------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				/* Solicitamos al usuario el número correspondiente a la tabla de multiplicar y
				 * lo leemos */
				System.out.println("Introduzca un valor para n (a partir de 1)");
				n = sc.nextInt();

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número sea menor que 1, repetiremos las instrucciones
		} while (n <= 1);

		/* Llamamos a la función tablaDel() con el número introducido por el usuario
		 como parámetro */
		Funcion05.tablaDel(n);

		// Cerramos el Scanner
		sc.close();
	}
}
