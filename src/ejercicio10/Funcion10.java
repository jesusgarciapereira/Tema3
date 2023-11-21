package ejercicio10;

public class Funcion10 {

	static boolean fechaCorrecta(int dia, int mes, int annio) {
		if (dia < 1 || dia > 30 || mes < 1 || mes > 12 || annio < 0)
			return false;
		else
			return true;
	}
}
