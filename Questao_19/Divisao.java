package Questao_19;

public class Divisao implements Operacao {

	@Override
	public double calcular(double a, double b) {

		if (b == 0) {
			throw new IllegalArgumentException("Não é possível dividir por zero.");
		}

		return a / b;
	}

	@Override
	public String toString() {
		return "Divisão";
	}
}