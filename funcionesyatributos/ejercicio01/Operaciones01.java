package ejercicio01;

public class Operaciones01 {
	double num1, num2;

	public Operaciones01() {
	}

	public Operaciones01(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double suma() {
		return num1 + num2;
	}

	public double resta() {
		return num1 - num2;
	}

	public double multiplicacion() {
		return num1 * num2;
	}

	public double division() {
		return num1 / num2;
	}

	public double max() {
		double numMax;
		numMax = num1 >= num2 ? num1 : num2;
		return numMax;
	}

	public double min() {
		double numMin;
		numMin = num1 <= num2 ? num1 : num2;
		return numMin;
	}
}
