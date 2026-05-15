package Questao_17;

public abstract class Funcionario {

	private String nome;
	private double salario;

	// construtor
	public Funcionario(String nome, double salario) {

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		if (salario < 0) {
			throw new IllegalArgumentException("O salário não pode ser negativo.");
		}

		this.nome = nome;
		this.salario = salario;
	}

	// get & set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {

		if (salario < 0) {
			throw new IllegalArgumentException("O salário não pode ser negativo.");
		}

		this.salario = salario;
	}

	// metodo abstrato
	public abstract double calcularBonus();
}