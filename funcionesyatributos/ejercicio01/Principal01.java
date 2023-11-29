package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal01 {
	
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {

		Principal01.menu();
		sc.close();
	}

	public static int pideOpcionCorrecta() {
		int opcionCorrecta = -1;

		do {
			try {
				System.out.println("Elija una de estas opciones");
				opcionCorrecta = sc.nextInt();
				sc.nextLine();
				

			} catch (InputMismatchException e) {
				System.out.println("El dato no es del tipo correcto, vuelva a intentarlo");
				sc.nextLine();
			} 
		} while (opcionCorrecta < 0 || opcionCorrecta > 6);
		

		return opcionCorrecta;
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

}
