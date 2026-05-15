package Questao_18;

public abstract class Usuario {

	private String nome;
	private int idade;

	// construtor
	public Usuario(String nome, int idade) {

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		if (idade < 0) {
			throw new IllegalArgumentException("A idade não pode ser negativa.");
		}

		this.nome = nome;
		this.idade = idade;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {

		if (idade < 0) {
			throw new IllegalArgumentException("A idade não pode ser negativa.");
		}

		this.idade = idade;
	}

	// metodo abstrato
	public abstract String exibirTipo();
}