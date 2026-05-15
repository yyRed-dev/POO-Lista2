package Questao_17;

public class Estagiario extends Funcionario implements Pagamento {

	// construtor
	public Estagiario(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.05;
	}

	@Override
	public void realizarPagamento(double valor) {

		System.out.println(
			"Pagamento de R$ " + valor +
			" realizado para o estagiário " +
			getNome()
		);
	}

	@Override
	public String toString() {
		return "Estagiário | Nome: " + getNome() + " | Salário: " + getSalario();
	}
}