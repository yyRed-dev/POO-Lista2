package Questao_12;

public class ContaCorrente extends ContaBancaria {

	private double taxa = 5;

	// construtor
	public ContaCorrente(int numero, double saldo) {
		super(numero, saldo);
	}

	@Override
	public void sacar(double valor) {

		double valorFinal = valor + taxa;

		if (valorFinal > getSaldo()) {
			throw new IllegalArgumentException("Saldo insuficiente.");
		}

		setSaldo(getSaldo() - valorFinal);
	}

	@Override
	public String toString() {
		return "Conta Corrente | Número: " + getNumero() + " | Saldo: R$ " + getSaldo();
	}
}