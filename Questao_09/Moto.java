package Questao_09;

public class Moto extends Veiculo {

	private int cilindradas;

	// construtor
	public Moto(String marca, String modelo, int cilindradas) {

		super(marca, modelo);

		if (cilindradas <= 0) {
			throw new IllegalArgumentException("As cilindradas devem ser maiores que zero.");
		}

		this.cilindradas = cilindradas;
	}

	// get & set
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {

		if (cilindradas <= 0) {
			throw new IllegalArgumentException("As cilindradas devem ser maiores que zero.");
		}

		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {

		return "Moto | Marca: " + getMarca() + " | Modelo: " + getModelo() + " | Cilindradas: " + cilindradas;
	}
}