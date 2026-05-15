package Questao_04;

public class Ponto2D {

	private double x;
	private double y;

	// construtores
	public Ponto2D() {

		this.x = 0;
		this.y = 0;
	}

	public Ponto2D(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public Ponto2D(Ponto2D outroPonto) {

		this.x = outroPonto.x;
		this.y = outroPonto.y;
	}

	// get & set
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {

		return "(" + this.x + ", " + this.y + ")";
	}
}