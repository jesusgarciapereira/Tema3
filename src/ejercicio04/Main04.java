package ejercicio04;

import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		char x;

		Scanner sc = new Scanner(System.in);

		System.out.println("Un caracter ¿es una vocal?");
		System.out.println("--------------------------");

		System.out.println("Introduzca cualquier caracter (sólo leeré el primero)");
		// PREGUNTAR A ELENA
		x = sc.nextLine().charAt(0);

		System.out.println("El caracter '" + x + "'" + (Funcion04.esVocal(x) ? " es una vocal" : " no es una vocal"));
		sc.close();

	}

}
