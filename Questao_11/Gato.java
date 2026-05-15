package Questao_11;

public class Gato extends Animal {

	// construtor
	public Gato(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "Miau!";
	}

	@Override
	public String toString() {
		return "Gato | Nome: " + getNome() + " | Idade: " + getIdade();
	}
}