package ejercicio04;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		String caracter;

		boolean esVocal;
		Scanner sc = new Scanner(System.in);

		System.out.println("Un caracter ¿es una vocal?");
		System.out.println("--------------------------");

		System.out.println("Introduzca cualquier caracter");
		
		caracter = sc.nextLine();
		
		esVocal = Funcion04.esVocal(caracter);
		
		// Probamos el funcionamiento de la función
		System.out.println("El caracter '" + caracter + "'" + (esVocal ? " es una vocal" : " no es una vocal"));
		sc.close();

	}

}
