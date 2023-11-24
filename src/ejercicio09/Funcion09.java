package ejercicio09;

public class Funcion09 {

	// Función calculadora()
	static double calculadora(double operandoA, double operandoB, int operacion) {

		// Declaramos la variable que devolverá la función
		double resultado;

		// Switch para asignar un valor al resultado, según cada caso del parámetro
		resultado = switch (operacion) {
		case 1 -> operandoA + operandoB;
		case 2 -> operandoA - operandoB;
		case 3 -> operandoA * operandoB;
		case 4 -> operandoA / operandoB;
		default -> 0;
		};

		// Devolverá el valor del resultado
		return resultado;

	}
}
