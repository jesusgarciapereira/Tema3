package ejercicio10;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		int dia, mes, annio;
		boolean fechaCorrecta;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fecha correcta");
		System.out.println("--------------");

		dia = sc.nextInt();
		mes = sc.nextInt();
		annio = sc.nextInt();

		fechaCorrecta = Funcion10.fechaCorrecta(dia, mes, annio);

		System.out.println(
				"La fecha " + dia + "/" + mes + "/" + annio + (fechaCorrecta ? " es correcta" : " no es correcta"));
		sc.close();
	}

}
