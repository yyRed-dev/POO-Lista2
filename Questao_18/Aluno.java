package Questao_18;

public class Aluno extends Usuario implements Autenticavel {

	// construtor
	public Aluno(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String exibirTipo() {
		return "Aluno";
	}

	@Override
	public boolean login(String senha) {
		return senha.equals("aluno123");
	}

	@Override
	public String toString() {
		return "Aluno | Nome: " + getNome() + " | Idade: " + getIdade();
	}
}