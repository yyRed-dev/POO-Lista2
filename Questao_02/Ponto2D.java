package Questao_02;

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

	// equals
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof Ponto2D)) {
			return false;
		}

		Ponto2D outro = (Ponto2D) obj;

		return this.x == outro.x && this.y == outro.y;
	}

	// calcular distancia
	public double calcularDistancia(Ponto2D outro) {

		return Math.sqrt(
			Math.pow((outro.x - this.x), 2) +
			Math.pow((outro.y - this.y), 2)
		);
	}

	// mostrar ponto
	@Override
	public String toString() {

		return "(" + this.x + ", " + this.y + ")";
	}
}