package Questao_12;

public class ContaBancaria {

	private int numero;
	private double saldo;

	// construtor
	public ContaBancaria(int numero, double saldo) {

		if (numero <= 0) {
			throw new IllegalArgumentException("O número da conta deve ser maior que zero.");
		}

		if (saldo < 0) {
			throw new IllegalArgumentException("O saldo não pode ser negativo.");
		}

		this.numero = numero;
		this.saldo = saldo;
	}

	// get & set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {

		if (numero <= 0) {
			throw new IllegalArgumentException("O número da conta deve ser maior que zero.");
		}

		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {

		if (saldo < 0) {
			throw new IllegalArgumentException("O saldo não pode ser negativo.");
		}

		this.saldo = saldo;
	}

	// depositar
	public void depositar(double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser maior que zero.");
		}

		this.saldo += valor;
	}

	// sacar
	public void sacar(double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser maior que zero.");
		}

		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente.");
		}

		this.saldo -= valor;
	}

	@Override
	public String toString() {
		return "Conta | Número: " + numero + " | Saldo: R$ " + saldo;
	}
}