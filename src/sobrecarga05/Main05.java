package sobrecarga05;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		// Declaración de variables que pedimos
				int cantNumeros;
				int valorMaximo;
				int valorMinimo;

				// Activamos el Scanner
				Scanner sc = new Scanner(System.in);

				do {
					// Pedimos al usuario la cantidad de números y lo leemos
					System.out.println("Escriba la cantidad de números que desea generar");
					cantNumeros = sc.nextInt();
				} // Se repiten las instrucciones si el numero es menor que 1
				while (cantNumeros < 1);


				do {
					// Pedimos al usuario el valor máximo y lo leemos
					System.out.println("Escriba el valor máximo que tomará el número aleatorio");
					valorMaximo = sc.nextInt();
				} // Se repiten las instrucciones si el numero es menor o igual que 1
				while (valorMaximo <= 1);
				
				do {
					// Pedimos al usuario el valor mínimo y lo leemos
					System.out.println("Escriba el valor mínimo que tomará el número aleatorio");
					valorMinimo = sc.nextInt();
				} // Se repiten las instrucciones si el numero es menor o igual que 1
				while (valorMinimo < 1);

				// Llamamos a las funciones
				Funcion05.numerosAleatorios(cantNumeros);
				Funcion05.numerosAleatorios(cantNumeros, valorMaximo);
				Funcion05.numerosAleatorios(cantNumeros, valorMinimo, valorMaximo);

				// Cerramos el Scanner
				sc.close();

	}

}
