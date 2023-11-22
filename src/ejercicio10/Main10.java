package ejercicio10;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		int dia, mes, annio;
		boolean fechaCorrecta;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fecha correcta");
		System.out.println("--------------");

		System.out.println("Introduzca el número correspondiente al día");
		dia = sc.nextInt();
		System.out.println("Introduzca el número correspondiente al mes");
		mes = sc.nextInt();
		System.out.println("Introduzca el número correspondiente al año");
		annio = sc.nextInt();

		fechaCorrecta = Funcion10.esFechaCorrecta(dia, mes, annio);

		System.out.println(
				"La fecha " + dia + "/" + mes + "/" + annio + (fechaCorrecta ? " es correcta" : " no es correcta"));
		sc.close();
	}

}
