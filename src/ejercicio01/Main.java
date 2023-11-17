package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Eco... n veces");
		System.out.println("--------------");
		System.out.println("Introduca el número de veces que se producirá el eco");
		n = sc.nextInt();
		
		Funciones.eco(n);
		sc.close();
	}

}
