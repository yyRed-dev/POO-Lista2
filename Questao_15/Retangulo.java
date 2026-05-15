package Questao_15;

public class Retangulo implements Forma {

	private double largura;
	private double altura;

	// construtor
	public Retangulo(double largura, double altura) {

		if (largura <= 0 || altura <= 0) {
			throw new IllegalArgumentException("Os valores devem ser maiores que zero.");
		}

		this.largura = largura;
		this.altura = altura;
	}

	// get & set
	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {

		if (largura <= 0) {
			throw new IllegalArgumentException("A largura deve ser maior que zero.");
		}

		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {

		if (altura <= 0) {
			throw new IllegalArgumentException("A altura deve ser maior que zero.");
		}

		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return largura * altura;
	}

	@Override
	public double calcularPerimetro() {
		return (largura * 2) + (altura * 2);
	}

	@Override
	public String toString() {
		return "Retângulo | Largura: " + largura + " | Altura: " + altura;
	}
}