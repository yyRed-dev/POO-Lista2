package Questao_11;

public class Cachorro extends Animal {

	// construtor
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "Au Au!";
	}

	@Override
	public String toString() {
		return "Cachorro | Nome: " + getNome() + " | Idade: " + getIdade();
	}
}