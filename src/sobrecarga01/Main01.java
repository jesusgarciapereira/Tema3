package sobrecarga01;

import java.util.Locale;
import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		// Declaración de variables que pedimos
		int EnteroA;
		int EnteroB;
		double DecimalA;
		double DecimalB;

		// Declaración de variable que mostramos
		int sumaEnteros;
		double sumaDecimales;

		// Activamos el Scanner
		Scanner sc = new Scanner(System.in);
		// Para escribir decimales con un punto
		sc.useLocale(Locale.US);

		// Pedimos al usuario dos números enteros y los leemos
		System.out.println("Escriba dos números enteros");
		EnteroA = sc.nextInt();
		EnteroB = sc.nextInt();

		// Le asignamos a esta variable la funcion suma()
		sumaEnteros = Funcion01.suma(EnteroA, EnteroB);

		// Pedimos al usuario dos números decimales y los leemos
		System.out.println("Escriba dos números decimales");
		DecimalA = sc.nextDouble();
		DecimalB = sc.nextDouble();

		// Le asignamos a esta variable la funcion suma()
		sumaDecimales = Funcion01.suma(DecimalA, DecimalB);
		
		// Mostramos el resultado
		System.out.println(EnteroA + " + " +  EnteroB + " = " + sumaEnteros);
		System.out.println(DecimalA + " + " +  DecimalB + " = " + sumaDecimales);

		// Cerramos el Scanner
		sc.close();
	}

}
