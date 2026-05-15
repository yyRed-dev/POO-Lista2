package Questao_06;

public class Pessoa {

	private String nome;
	private String nomeMae;
	private String nomePai;

	// construtores
	public Pessoa(
		String nome,
		String nomeMae,
		String nomePai
	) {

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		this.nome = nome;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
	}

	public Pessoa(String nome) {

		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("O nome não pode ser vazio.");
		}

		this.nome = nome;
		this.nomeMae = null;
		this.nomePai = null;
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

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	// equals
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof Pessoa)) {
			return false;
		}

		Pessoa outro = (Pessoa) obj;

		if (
			this.nome.equals(outro.nome) &&
			this.nomeMae != null &&
			outro.nomeMae != null &&
			this.nomeMae.equals(outro.nomeMae)
		) {

			return true;
		}

		return false;
	}

	@Override
	public String toString() {

		return
			"Nome: " + nome +
			" | Mãe: " + nomeMae +
			" | Pai: " + nomePai;
	}
}