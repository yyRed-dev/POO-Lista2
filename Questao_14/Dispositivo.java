package Questao_14;

public abstract class Dispositivo {

	private String nome;
	private boolean ligado;

	// construtor
	public Dispositivo(String nome) {

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		this.nome = nome;
		this.ligado = false;
	}

	// get & set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		this.nome = nome;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}