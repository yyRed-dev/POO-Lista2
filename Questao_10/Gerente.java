package Questao_10;

public class Gerente extends Funcionario {

	// construtor
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.20;
	}

	@Override
	public String toString() {
		return "Gerente | Nome: " + getNome() + " | Salário: " + getSalario();
	}
}