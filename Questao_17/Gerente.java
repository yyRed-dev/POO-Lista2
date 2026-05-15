package Questao_17;

public class Gerente extends Funcionario implements Pagamento {

	// construtor
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.20;
	}

	@Override
	public void realizarPagamento(double valor) {

		System.out.println(
			"Pagamento de R$ " + valor +
			" realizado para o gerente " +
			getNome()
		);
	}

	@Override
	public String toString() {
		return "Gerente | Nome: " + getNome() + " | Salário: " + getSalario();
	}
}