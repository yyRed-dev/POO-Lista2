package Questao_14;

public class Computador extends Dispositivo implements Ligavel {

	// construtor
	public Computador(String nome) {
		super(nome);
	}

	@Override
	public void ligar() {

		setLigado(true);

		System.out.println(getNome() + " foi ligado.");
	}

	@Override
	public void desligar() {

		setLigado(false);

		System.out.println(getNome() + " foi desligado.");
	}

	@Override
	public String toString() {

		return "Computador | Nome: " + getNome() + " | Ligado: " + isLigado();
	}
}