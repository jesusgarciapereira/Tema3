package ejercicio06;

public class Funcion06 {

	// Función areaVolumen()
	static void areaVolumen(int opcion, double radio, double altura) {

		// Declaramos la constante del número pi
		final double PI = Math.PI;

		// Switch para evaluar cada caso del primer parámetro
		switch (opcion) {
		// Si es 1
		case 1 -> {
			// Calculamos el área del cilindro y lo mostramos
			double area = 2 * PI * radio * (altura + radio);
			System.out.println("El área del cilindro es " + area + " cm2");
		}
		// Si es distinto de 1
		default -> {
			// Calculamos el volumen del cilindro y lo mostramos
			double volumen = PI * Math.pow(radio, 2) * altura;
			System.out.println("El volumen del cilindro es " + volumen + " cm3");
		}
		}
	}
}
