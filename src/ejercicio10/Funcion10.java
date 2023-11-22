package ejercicio10;

public class Funcion10 {

	static boolean esFechaCorrecta(int dia, int mes, int annio) {

		boolean fechaCorrecta;

		fechaCorrecta = (dia > 0 && dia < 31 && mes > 0 && mes < 13) ? true : false;

		return fechaCorrecta;
	}
}
