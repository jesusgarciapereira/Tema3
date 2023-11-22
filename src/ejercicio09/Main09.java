package ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;

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
				operandoA = sc.nextDouble();

				/* Marcamos 'tipoCorrectoA' como true si el valor de 'operandoA' es del tipo
				 * correcto */
				tipoCorrectoA = true;

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			/* Mientras la variable 'operandoA' no sea del tipo correcto, repetiremos las
			 * instrucciones */
		} while (!tipoCorrectoA);

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para el segundo operando y lo leemos
				System.out.println("Introduzca un valor para el segundo operando (sólo números enteros)");
				operandoB = sc.nextDouble();

				/* Marcamos 'tipoCorrectoB' como true si el valor de 'operandoB' es del tipo
				 * correcto */
				tipoCorrectoB = true;

				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			/* Mientras la variable 'operandoB' no sea del tipo correcto, repetiremos las
			 * instrucciones */
		} while (!tipoCorrectoB);

		// Mostramos las opciones a elegir para el valor de operacion
		System.out.println("Operaciones de la calculadora");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println();

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para la operacion y lo leemos
				System.out.println("Elija una opción");
				operacion = sc.nextInt();
				
				/* Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}
			
			/* Mientras la variable 'operacion' no esté entre 1 y 4, repetiremos las
			 * instrucciones */
		} while (operacion < 1 || operacion > 4);

		/*
		 * Asignamos un valor a nuestro resultado llamando a la función
		 * calculadora() con los números introducidos por el usuario como parámetro
		 */
		resultado = Funcion09.calculadora(operandoA, operandoB, operacion);

		// Mostramos la primera parte del resultado
		System.out.print("El resultado de ");
		
		// Switch para mostrar la segunda parte del resultado según cada caso
		switch (operacion) {
		case 1 -> System.out.println(operandoA + " + " + operandoB + " es: " + resultado);
		case 2 -> System.out.println(operandoA + " - " + operandoB + " es: " + resultado);
		case 3 -> System.out.println(operandoA + " * " + operandoB + " es: " + resultado);
		case 4 -> {System.out.print(operandoA + " / " + operandoB + " es: ");
			if (operandoB == 0)
				System.out.println("No se puede dividir entre 0");
			else
				System.out.println(resultado);
		}
		default -> System.out.println(" ");
		}

		// Cerramos el Scanner
		sc.close();

	}

}
