package Questao_01;

public class Contador {

	private int pessoas;

	// construtor
	public Contador(int pessoas) {

		if (pessoas < 0) {
			throw new IllegalArgumentException("O contador não pode iniciar negativo.");
		}

		this.pessoas = pessoas;
	}

	// get & set
	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {

		if (pessoas < 0) {
			throw new IllegalArgumentException("O contador não pode receber valores negativos.");
		}

		this.pessoas = pessoas;
	}

	// aumentar contador
	public void aumentarContador() {
		this.pessoas++;
	}

	// reduzir contador
	public void reduzirContador() {

		if (this.pessoas > 0) {
			this.pessoas--;
		}
	}

	// zerar contador
	public void zerarContador() {
		this.pessoas = 0;
	}
}