package ejercicio06;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		
		// Declaramos las variables de los números que le pediremos al usuario
		int opcion = 0;
		double radio = 0;
		double altura = 0;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Configuración para permitir en la consola números decimales con punto
		sc.useLocale(Locale.US);

		// Presentamos el programa
		System.out.println("Cilindro");
		System.out.println("--------");

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {

				// Solicitamos al usuario la opción y leemos el número
				System.out.println("Introduzca la opción a elegir (1 ó 2)");
				System.out.println("1. Calcular área del cilindro");
				System.out.println("2. Calcular volumen del cilindro");
				opcion = sc.nextInt();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras la opción no sea 1 ó 2, repetiremos las instrucciones
		} while (opcion != 1 && opcion != 2);

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {

				// Solicitamos al usuario la longitud del radio y leemos el número
				System.out.println(
						"Introduzca la longitud del radio (en centímetros, mayor que 0 y, si tiene decimales, use un punto como en el ejemplo 2.5)");
				radio = sc.nextDouble();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras el radio sea menor que 0, repetiremos las instrucciones
		} while (radio <= 0);

		// Bucle do-while para solicitar la entrada del usuario hasta que sea válida
		do {
			try {

				// Solicitamos al usuario la longitud de la altura y leemos el número
				System.out.println(
						"Introduzca la longitud de la altura (en centímetros, mayor que 0 y, si tiene decimales, recuerde usar un punto)");
				altura = sc.nextDouble();

				/*
				 * Si el usuario ingresa un dato del tipo incorrecto, mostramos un mensaje de
				 * error y limpiamos el buffer
				 */
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
				sc.nextLine();
			}

			// Mientras la altura sea menor que 0, repetiremos las instrucciones
		} while (altura <= 0);
		
		/*
		 * Llamamos a la función areaVolumen() con los números introducido por el usuario
		 * como parámetro
		 */
		Funcion06.areaVolumen(opcion, radio, altura);
		// Cerramos el Scanner
		sc.close();
	}
}
