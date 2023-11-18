package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable que le pediremos al usuario
		int n = -1;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Eco... n veces");
		System.out.println("--------------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				/* Solicitamos al usuario el número de veces que mostrará el mensaje y leemos el
				 * número */
				System.out.println("Introduzca el número de veces que se producirá el eco (a partir de 0)");
				n = sc.nextInt();
		
				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer */ 
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el número sea menor que 0, repetiremos las instrucciones
		} while (n < 0);

		// Llamamos a la función eco() con el número introducido por el usuario como parámetro
		Funciones.eco(n);

		// Cerramos el Scanner
		sc.close();
	}
}
