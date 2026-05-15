package Questao_03;

public class Linha {

	/*	reta (y = ax + b)
		coef angular = a
		coef linear = b		*/

	private double cfAngular;
	private double cfLinear;

	// construtores
	public Linha(double cfAngular, double cfLinear) {

		this.cfAngular = cfAngular;
		this.cfLinear = cfLinear;
	}

	// a = (y2 - y1) / (x2 - x1)
	// b = y - ax
	public Linha(Ponto2D p1, Ponto2D p2) {

		if (p1.getX() == p2.getX()) {
			throw new IllegalArgumentException("Os pontos não podem possuir o mesmo X.");
		}

		double a =
			(p2.getY() - p1.getY()) /
			(p2.getX() - p1.getX());

		double b =
			p1.getY() - (a * p1.getX());

		this.cfAngular = a;
		this.cfLinear = b;
	}

	// get & set
	public double getCfAngular() {
		return cfAngular;
	}

	public void setCfAngular(double cfAngular) {
		this.cfAngular = cfAngular;
	}

	public double getCfLinear() {
		return cfLinear;
	}

	public void setCfLinear(double cfLinear) {
		this.cfLinear = cfLinear;
	}

	// verificar se ponto pertence
	public boolean pertence(Ponto2D ponto) {

		return ponto.getY() ==
			(this.cfAngular * ponto.getX() + this.cfLinear);
	}

	// ponto de interseção
	public Ponto2D intersecao(Linha outra) {

		if (this.cfAngular == outra.cfAngular) {
			return null;
		}

		double x =
			(outra.cfLinear - this.cfLinear) /
			(this.cfAngular - outra.cfAngular);

		double y =
			(this.cfAngular * x) + this.cfLinear;

		return new Ponto2D(x, y);
	}

	@Override
	public String toString() {

		return "y = " + cfAngular + "x + " + cfLinear;
	}
}