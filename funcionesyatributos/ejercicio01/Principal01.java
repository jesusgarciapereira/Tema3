package ejercicio01;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = -1;
		double numA;
		double numB;
		double resultado;

		opcion = Principal01.menu();
		while (opcion != 0) {
			
			
				numA = Principal01.pideNumero();
				numB = Principal01.pideNumero();

				Operaciones01 operacion = new Operaciones01(numA, numB);

				resultado = switch (opcion) {
				case 1 -> operacion.suma();
				case 2 -> operacion.resta();
				case 3 -> operacion.multiplicacion();
				case 4 -> operacion.division();
				case 5 -> operacion.max();
				case 6 -> operacion.min();
				default -> Math.sqrt(-1);
				};

				System.out.println(resultado);
		
			opcion = Principal01.menu();
		}
		System.out.println("Saliendo del programa");
		sc.close();
	}

	public static int menu() {
		int opcion;

		System.out.println("Operaciones aritméticas");
		System.out.println("-----------------------");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");
		System.out.println();

		opcion = Principal01.pideOpcionCorrecta();

		return opcion;

	}

	public static double pideNumero() {
		double numDouble = 0;
		boolean numDoubleCorrecto = false;

		sc.useLocale(Locale.US);

		do {
			try {
				System.out.println("Elija un número para la operacion (si tiene decimales use punto)");
				numDouble = sc.nextDouble();
				numDoubleCorrecto = true;
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto, vuelva a intentarlo");
			} finally {
				sc.nextLine();
			}
		} while (!numDoubleCorrecto);

		return numDouble;
	}

	// FUNCION PROPIA
	public static int pideOpcionCorrecta() {
		int opcionCorrecta = -1;

		do {
			try {
				System.out.println("Elija una de estas opciones");
				opcionCorrecta = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto, vuelva a intentarlo");
			} finally {
				sc.nextLine();
			}
		} while (opcionCorrecta < 0 || opcionCorrecta > 6);

		return opcionCorrecta;
	}
}
