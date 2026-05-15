package Questao_19;

public class Multiplicacao implements Operacao {

	@Override
	public double calcular(double a, double b) {
		return a * b;
	}

	@Override
	public String toString() {
		return "Multiplicação";
	}
}