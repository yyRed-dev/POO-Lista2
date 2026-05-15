package Questao_18;

public class Professor extends Usuario implements Autenticavel {

	// construtor
	public Professor(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String exibirTipo() {
		return "Professor";
	}

	@Override
	public boolean login(String senha) {
		return senha.equals("prof123");
	}

	@Override
	public String toString() {
		return "Professor | Nome: " + getNome() + " | Idade: " + getIdade();
	}
}