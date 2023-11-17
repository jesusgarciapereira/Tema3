package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eco... n veces");
		System.out.println("--------------");
		System.out.println("Introduca el número de veces que se producirá el eco");
		Funciones.eco(sc.nextInt());
		sc.close();
	}

}
