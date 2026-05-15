package Questao_09;

public class Veiculo {

	private String marca;
	private String modelo;

	// construtor
	public Veiculo(String marca, String modelo) {

		if (marca == null || marca.isEmpty()) {
			throw new IllegalArgumentException("A marca não pode ser vazia.");
		}

		if (modelo == null || modelo.isEmpty()) {
			throw new IllegalArgumentException("O modelo não pode ser vazio.");
		}

		this.marca = marca;
		this.modelo = modelo;
	}

	// get & set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {

		if (marca == null || marca.isEmpty()) {
			throw new IllegalArgumentException("A marca não pode ser vazia.");
		}

		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {

		if (modelo == null || modelo.isEmpty()) {
			throw new IllegalArgumentException("O modelo não pode ser vazio.");
		}

		this.modelo = modelo;
	}
}