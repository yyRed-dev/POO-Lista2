package Questao_12;

public class ContaPoupanca extends ContaBancaria {

	// construtor
	public ContaPoupanca(int numero, double saldo) {
		super(numero, saldo);
	}

	// render juros
	public void renderJuros(double taxa) {

		if (taxa <= 0) {
			throw new IllegalArgumentException("A taxa deve ser maior que zero.");
		}

		double rendimento = getSaldo() * (taxa / 100);

		setSaldo(getSaldo() + rendimento);
	}

	@Override
	public String toString() {
		return "Conta Poupança | Número: " + getNumero() + " | Saldo: R$ " + getSaldo();
	}
}