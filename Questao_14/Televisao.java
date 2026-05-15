package Questao_14;

public class Televisao extends Dispositivo implements Ligavel {

	// construtor
	public Televisao(String nome) {
		super(nome);
	}

	@Override
	public void ligar() {

		setLigado(true);

		System.out.println(getNome() + " foi ligada.");
	}

	@Override
	public void desligar() {

		setLigado(false);

		System.out.println(getNome() + " foi desligada.");
	}

	@Override
	public String toString() {

		return "Televisão | Nome: " + getNome() + " | Ligado: " + isLigado();
	}
}