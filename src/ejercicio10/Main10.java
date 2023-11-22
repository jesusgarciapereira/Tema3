package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {

		// Declaramos la variables que le pediremos al usuario
		int dia = 0;
		int mes = 0;
		int annio = 0;

		
		/* Declaramos variables booleanas para verificar si los datos ingresados son del
		 * tipo correcto */
		boolean tipoCorrectoDia = false;
		boolean tipoCorrectoMes = false;
		boolean tipoCorrectoAnnio = false;

		// Declaramos la variable que mostraremos
		boolean fechaCorrecta;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Fecha correcta");
		System.out.println("--------------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para el día y lo leemos
				System.out.println("Introduzca el número correspondiente al día");
				dia = sc.nextInt();

				/* Marcamos 'tipoCorrectoDia' como true si el valor de 'dia' es del tipo
				 * correcto
				 */
				tipoCorrectoDia = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			/*
			 * Mientras la variable 'dia' no sea del tipo correcto, repetiremos las
			 * instrucciones
			 */
		} while (!tipoCorrectoDia);

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para el mes y lo leemos
				System.out.println("Introduzca el número correspondiente al mes");
				mes = sc.nextInt();

				/*
				 * Marcamos 'tipoCorrectoMes' como true si el valor de 'mes' es del tipo
				 * correcto
				 */
				tipoCorrectoMes = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			/*
			 * Mientras la variable 'mes' no sea del tipo correcto, repetiremos las
			 * instrucciones
			 */
		} while (!tipoCorrectoMes);
		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para el año y lo leemos
				System.out.println("Introduzca el número correspondiente al año");
				annio = sc.nextInt();

				/*
				 * Marcamos 'tipoCorrectoAnnio' como true si el valor de 'annio' es del tipo
				 * correcto
				 */
				tipoCorrectoAnnio = true;

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			/*
			 * Mientras la variable 'annio' no sea del tipo correcto, repetiremos las
			 * instrucciones
			 */
		} while (!tipoCorrectoAnnio);

		/*
		 * Asignamos un valor a nuestro resultado llamando a la función
		 * esFechaCorrecta() con los números introducidos por el usuario como parámetro
		 */
		fechaCorrecta = Funcion10.esFechaCorrecta(dia, mes, annio);

		// Probamos el funcionamiento de la función
		System.out.println(
				"La fecha " + dia + "/" + mes + "/" + annio + (fechaCorrecta ? " es correcta" : " no es correcta"));

		// Cerramos el Scanner
		sc.close();
	}

}
