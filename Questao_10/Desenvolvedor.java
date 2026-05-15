package Questao_10;

public class Desenvolvedor extends Funcionario {

	// construtor
	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.10;
	}

	@Override
	public String toString() {
		return "Desenvolvedor | Nome: " + getNome() + " | Salário: " + getSalario();
	}
}