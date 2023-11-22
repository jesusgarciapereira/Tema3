package ejercicio04;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		// Declaramos la variable del caracter que le pediremos al usuario
		String caracter;

		// Declaramos la variable que mostraremos
		boolean esVocal;
		
		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Presentamos el programa
		System.out.println("Un caracter ¿es una vocal?");
		System.out.println("--------------------------");

		// Solicitamos al usuario un caracter y lo leemos
		System.out.println("Introduzca cualquier caracter");
		caracter = sc.nextLine();
		
		/* Establecemos la relación entre las variables llamando a la función
		 * esVocal() con el caracter introducido por el usuario como parámetro */
		esVocal = Funcion04.esVocal(caracter);
		
		// Probamos el funcionamiento de la función
		System.out.println(caracter + "'" + (esVocal ? " es una vocal" : " no es una vocal"));
		sc.close();

	}

}
