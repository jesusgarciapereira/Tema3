package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		// Declaramos la variables de los números que le pediremos al usuario
		int a = 0;
		int b = 0;

		// Declaramos la variable que mostraremos
		int max;

		/*
		 * Declaramos variables booleanas para verificar si los datos ingresados son del
		 * tipo correcto
		 */
		boolean tipoCorrectoA = false;
		boolean tipoCorrectoB = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Número máximo de a y b");
		System.out.println("--------------------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para el primer número y lo leemos
				System.out.println("Introduzca un valor para a (sólo números enteros)");
				a = sc.nextInt();

				// Marcamos 'tipoCorrectoA' como true si el valor de 'a' es del tipo correcto
				tipoCorrectoA = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			/*
			 * Mientras la variable 'a' no sea del tipo correcto, repetiremos las
			 * instrucciones
			 */
		} while (!tipoCorrectoA);

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para el segundo número y lo leemos
				System.out.println("Introduzca un valor para b (sólo números enteros)");
				b = sc.nextInt();

				// Marcamos 'tipoCorrectoB' como true si el valor de 'b' es del tipo correcto
				tipoCorrectoB = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			/*
			 * Mientras la variable 'b' no sea del tipo correcto, repetiremos las
			 * instrucciones
			 */
		} while (!tipoCorrectoB);

		/*
		 * Establecemos la relación entre las variables llamando a la función
		 * numeroMaximo() con los números introducidos por el usuario como parámetro
		 */
		max = Funcion03.numeroMaximo(a, b);

		// Probamos el funcionamiento de la función
		System.out.println("El número máximo de " + a + " y de " + b + " es: " + max);

		// Cerramos el Scanner
		sc.close();
	}
}
