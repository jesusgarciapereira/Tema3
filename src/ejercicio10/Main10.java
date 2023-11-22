package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		int dia, mes, annio;

		/*
		 * Declaramos variables booleanas para verificar si los datos ingresados son del
		 * tipo correcto
		 */
		boolean tipoCorrectoDia = false;
		boolean tipoCorrectoMes;
		boolean tipoCorrectoAnnio;

		boolean fechaCorrecta;

		Scanner sc = new Scanner(System.in);

		System.out.println("Fecha correcta");
		System.out.println("--------------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {
				// Solicitamos al usuario un valor para la operacion y lo leemos
				System.out.println("Introduzca el número correspondiente al día");
				dia = sc.nextInt();

				// Marcamos 'tipoCorrectoDia' como true si el valor de 'dia' es del tipo
				// correcto
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

		System.out.println("Introduzca el número correspondiente al día");
		dia = sc.nextInt();

		System.out.println("Introduzca el número correspondiente al mes");
		mes = sc.nextInt();
		System.out.println("Introduzca el número correspondiente al año");
		annio = sc.nextInt();

		fechaCorrecta = Funcion10.esFechaCorrecta(dia, mes, annio);

		System.out.println(
				"La fecha " + dia + "/" + mes + "/" + annio + (fechaCorrecta ? " es correcta" : " no es correcta"));
		sc.close();
	}

}
