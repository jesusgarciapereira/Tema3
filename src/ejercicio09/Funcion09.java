package ejercicio09;

public class Funcion09 {

	// Función calculadora()
	static double calculadora(double operandoA, double operandoB, int operacion) {
		double resultado;
		// Switch para devolver el resultado de la operación
		resultado = switch (operacion) {
		case 1 -> operandoA + operandoB;
		case 2 -> operandoA - operandoB;
		case 3 -> operandoA * operandoB;
		case 4 -> operandoA / operandoB;
		default -> 0;
		};
		return resultado;

	}
}
