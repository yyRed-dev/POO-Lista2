package Questao_09;

public class Carro extends Veiculo {

	private int portas;

	// construtor
	public Carro(String marca, String modelo, int portas) {

		super(marca, modelo);

		if (portas <= 0) {
			throw new IllegalArgumentException("A quantidade de portas deve ser maior que zero.");
		}

		this.portas = portas;
	}

	// get & set
	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {

		if (portas <= 0) {
			throw new IllegalArgumentException("A quantidade de portas deve ser maior que zero.");
		}

		this.portas = portas;
	}

	@Override
	public String toString() {

		return "Carro | Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Portas: " + portas;
	}
}