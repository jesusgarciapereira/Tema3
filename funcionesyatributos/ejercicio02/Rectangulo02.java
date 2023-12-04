package ejercicio02;

public class Rectangulo02 {

	double alto, ancho;

	public Rectangulo02() {
	}

	public Rectangulo02(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	public double perimetro() {
		double perimetro;
		perimetro = 2 * alto + 2 * ancho;
		return perimetro;
	}
	
	public double area() {
		double area;
		area = alto * ancho;
		return area;
	}

}
