package Questao_19;

public class Subtracao implements Operacao {

	@Override
	public double calcular(double a, double b) {
		return a - b;
	}

	@Override
	public String toString() {
		return "Subtração";
	}
}