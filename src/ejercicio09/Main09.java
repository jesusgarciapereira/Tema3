package ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;

import ejercicio03.Funcion03;

public class Main09 {

	public static void main(String[] args) {
		// Declaramos la variables de los operandos que le pediremos al usuario
		double operandoA = 0;
		double operandoB = 0;
		int operacion = 0;

		// Declaramos la variable que mostraremos
		double resultado;

		/*
		 * Declaramos variables booleanas para verificar si los datos ingresados son del
		 * tipo correcto
		 */
		boolean tipoCorrectoA = false;
		boolean tipoCorrectoB = false;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Calculadora");
		System.out.println("-----------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para el primer operando y lo leemos
				System.out.println("Introduzca un valor para el primer operando (sólo números enteros)");
				operandoA = sc.nextInt();

				// Marcamos 'tipoCorrectoA' como true si el valor de 'operandoA' es del tipo correcto
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
				System.out.println("Introduzca un valor para el segundo operando (sólo números enteros)");
				operandoB = sc.nextInt();

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
// FALTA CALCULADORA
		/*
		 * Establecemos la relación entre las variables llamando a la función
		 * numeroMaximo() con los números introducidos por el usuario como parámetro
		 */
		max = Funcion03.numeroMaximo(a, b);

		// Mostramos el resultado
		System.out.println("El número máximo de " + a + " y de " + b + " es: " + max);

		// Cerramos el Scanner
		sc.close();

	}

}