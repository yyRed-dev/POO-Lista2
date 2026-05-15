package Questao_04;

public class Circulo {

	private double raio;
	private Ponto2D centro;

	// construtores
	public Circulo(double raio, Ponto2D centro) {

		if (raio <= 0) {
			throw new IllegalArgumentException("O raio deve ser maior que zero.");
		}

		this.raio = raio;
		this.centro = new Ponto2D(centro);
	}

	public Circulo(double raio) {

		if (raio <= 0) {
			throw new IllegalArgumentException("O raio deve ser maior que zero.");
		}

		this.raio = raio;
		this.centro = new Ponto2D();
	}

	// get & set
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {

		if (raio <= 0) {
			throw new IllegalArgumentException("O raio deve ser maior que zero.");
		}

		this.raio = raio;
	}

	public Ponto2D getCentro() {
		return centro;
	}

	// calcular area
	public double calcularArea() {

		return Math.PI * (this.raio * this.raio);
	}

	// inflar circulo
	public void inflar(double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser maior que zero.");
		}

		this.raio += valor;
	}

	// desinflar circulo
	public void desinflar(double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser maior que zero.");
		}

		if ((this.raio - valor) <= 0) {
			throw new IllegalArgumentException("O círculo não pode possuir raio menor ou igual a zero.");
		}

		this.raio -= valor;
	}

	@Override
	public String toString() {

		return "Raio: " + raio + " | Centro: " + centro;
	}
}