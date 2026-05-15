package Questao_05;

import java.util.ArrayList;

public class Pais {

	private String iso;
	private String nome;
	private long populacao;
	private double dimensao;

	private ArrayList<Pais> vizinhos =
		new ArrayList<Pais>();

	// construtor
	public Pais(
		String iso,
		String nome,
		long populacao,
		double dimensao
	) {

		if (iso == null || iso.isEmpty()) {
			throw new IllegalArgumentException("O código ISO não pode ser vazio.");
		}

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		if (populacao < 0) {
			throw new IllegalArgumentException("A população não pode ser negativa.");
		}

		if (dimensao <= 0) {
			throw new IllegalArgumentException("A dimensão deve ser maior que zero.");
		}

		this.iso = iso.toUpperCase();
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
	}

	// get & set
	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {

		if (iso == null || iso.isEmpty()) {
			throw new IllegalArgumentException("O código ISO não pode ser vazio.");
		}

		this.iso = iso.toUpperCase();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		this.nome = nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {

		if (populacao < 0) {
			throw new IllegalArgumentException("A população não pode ser negativa.");
		}

		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {

		if (dimensao <= 0) {
			throw new IllegalArgumentException("A dimensão deve ser maior que zero.");
		}

		this.dimensao = dimensao;
	}

	public ArrayList<Pais> getVizinhos() {
		return vizinhos;
	}

	// adicionar vizinho
	public void adicionarVizinho(Pais pais) {

		if (!(vizinhos.contains(pais))) {

			vizinhos.add(pais);
		}
	}

	// densidade populacional
	public double calcularDensidade() {

		return this.populacao / this.dimensao;
	}

	// equals
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof Pais)) {
			return false;
		}

		Pais outro = (Pais) obj;

		return this.iso.equals(outro.iso);
	}

	@Override
	public String toString() {

		return
			"ISO: " + iso +
			" | Nome: " + nome +
			" | População: " + populacao +
			" | Dimensão: " + dimensao + " km²";
	}
}