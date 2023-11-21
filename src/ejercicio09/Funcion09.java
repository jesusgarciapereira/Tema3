package ejercicio09;

public class Funcion09 {

	static double calculadora(double operandoA, double operandoB, int operacion) {
		double resultado = switch (operacion) {
		case 1 -> operandoA + operandoB;
		case 2 -> operandoA - operandoB;
		case 3 -> operandoA * operandoB;
		case 4 -> operandoA / operandoB;
		default -> {
			System.out.println("Tipo de operación inexistente");
			yield -1;
		}
		};
		return resultado;
	}
}
