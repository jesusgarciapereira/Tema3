package ejercicio09;

public class Funcion09 {

	// Función calculadora()
	static double calculadora(double operandoA, double operandoB, int operacion) {
		
		// Declaramos la variable del resultado de la operación 
		double resultado;
		
		// Establecemos la relación entre la variable y los parámetros con un switch
		resultado = switch (operacion) {
		case 1 -> operandoA + operandoB;
		case 2 -> operandoA - operandoB;
		case 3 -> operandoA * operandoB;
		case 4 -> operandoA / operandoB;
		default -> {
			yield -1;
		}
		};
		// Devolverá el valor del resultado
		return resultado;
	}
}
