package Questao_15;

public class Circulo implements Forma {

	private double raio;

	// construtor
	public Circulo(double raio) {

		if (raio <= 0) {
			throw new IllegalArgumentException("O raio deve ser maior que zero.");
		}

		this.raio = raio;
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

	@Override
	public double calcularArea() {
		return Math.PI * (raio * raio);
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public String toString() {
		return "Círculo | Raio: " + raio;
	}
}	