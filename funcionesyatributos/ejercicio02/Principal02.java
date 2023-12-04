package ejercicio02;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal02 {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int opcion;

		System.out.println("1. Perímetro");
		System.out.println("2. Área");
		System.out.println("0. Salir");

		System.out.println();
		opcion = Principal02.pideOpcion();

		return opcion;

	}

	public static double pideAncho() {

		double numAncho = 0;

		do {
			try {
				System.out.println("Introduzca el ancho del rectángulo");
				numAncho = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
			} finally {
				sc.nextLine();
			}
		} while (numAncho <= 0);

		return numAncho;
	}

	public static double pideAlto() {

		double numAlto = 0;

		do {
			try {
				System.out.println("Introduzca el alto del rectángulo");
				numAlto = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
			} finally {
				sc.nextLine();
			}
		} while (numAlto <= 0);

		return numAlto;
	}

	public static int pideOpcion() {

		int opcion = -1;

		do {
			try {
				System.out.println("Elija una opción");
				opcion = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
			} finally {
				sc.nextLine();
			}
		} while (opcion < 0 || opcion > 2);

		return opcion;
	}

	public static void main(String[] args) {
		sc.useLocale(Locale.US);

		int opcionElegida;
		double numAncho, numAlto;
		double resultado;

		System.out.println("Rectángulo");
		System.out.println("----------");

		opcionElegida = Principal02.menu();
		while (opcionElegida != 0) {
			numAncho = Principal02.pideAncho();
			numAlto = Principal02.pideAlto();

			Rectangulo02 rectangulo = new Rectangulo02(numAlto, numAncho);

			resultado = switch (opcionElegida) {
			case 1 -> rectangulo.perimetro();
			case 2 -> rectangulo.area();
			default -> 0;
			};

			System.out.println(resultado);
			
			System.out.println();
			opcionElegida = Principal02.menu();
		}
		System.out.println("Saliendo del programa");
		sc.close();

	}

}
