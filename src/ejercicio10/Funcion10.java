package ejercicio10;

public class Funcion10 {

	// Función esFechaCorrecta()
	static boolean esFechaCorrecta(int dia, int mes, int annio) {

		// Declaramos la variable que devolverá la función
		boolean fechaCorrecta;

		// Asignamos el valor del boolean con un ternario
		fechaCorrecta = dia > 0 && dia < 31 && mes > 0 && mes < 13;

		// Devolverá el valor de nuestro boolean
		return fechaCorrecta;
	}
}
