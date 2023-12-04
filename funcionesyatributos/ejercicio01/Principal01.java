package ejercicio01;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal01 {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		int numElegido;

		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Mutiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");

		System.out.println();

		numElegido = Principal01.pideOpcion();

		return numElegido;
	}

	public static double pideNumero() {
		
		sc.useLocale(Locale.US);

		double numero = 0;
		boolean numeroCorrecto = false;

		do {
			try {
				System.out.println("Elija un número");
				numero = sc.nextDouble();
				numeroCorrecto = true;
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto");
			} finally {
				sc.nextLine();
			}
		} while (!numeroCorrecto);

		return numero;
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
		} while (opcion < 0 || opcion > 6);

		return opcion;
	}

	public static void main(String[] args) {

		int opcionElegida;
		double numA, numB;
		double resultado;

		System.out.println("Calculadora");
		System.out.println("-----------");

		opcionElegida = Principal01.menu();
		while (opcionElegida != 0) {
			numA = Principal01.pideNumero();
			numB = Principal01.pideNumero();

			Operaciones01 operacion = new Operaciones01(numA, numB);

			resultado = switch (opcionElegida) {
			case 1 -> operacion.suma();
			case 2 -> operacion.resta();
			case 3 -> operacion.multiplicacion();
			case 4 -> operacion.division();
			case 5 -> operacion.max();
			case 6 -> operacion.min();
			default -> Math.sqrt(-1);
			};

			if (opcionElegida == 4 && numB == 0)
				System.out.println("No se puede dividir entre 0");
			else
				System.out.println(resultado);

			System.out.println();
			opcionElegida = Principal01.menu();
		}

		System.out.println("Saliendo del programa");
		sc.close();
	}

}
