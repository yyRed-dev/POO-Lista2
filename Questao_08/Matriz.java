package Questao_08;

public class Matriz {

	private int linhas;
	private int colunas;

	private double[][] matriz;

	// construtor
	public Matriz(int linhas, int colunas) {

		if (linhas <= 0 || colunas <= 0) {
			throw new IllegalArgumentException("As dimensões devem ser maiores que zero.");
		}

		this.linhas = linhas;
		this.colunas = colunas;

		matriz = new double[linhas][colunas];
	}

	// get
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	// set elemento
	public void setElemento(int linha, int coluna, double valor) {

		validarPosicao(linha, coluna);

		matriz[linha][coluna] = valor;
	}

	// get elemento
	public double getElemento(int linha, int coluna) {

		validarPosicao(linha, coluna);

		return matriz[linha][coluna];
	}

	// validar posição
	private void validarPosicao(int linha, int coluna) {

		if (linha < 0 || linha >= linhas || coluna < 0 || coluna >= colunas) {
			throw new IllegalArgumentException("Posição inválida.");
		}
	}

	// validar tamanho
	private void validarMesmoTamanho(Matriz outra) {

		if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
			throw new IllegalArgumentException("As matrizes devem possuir o mesmo tamanho.");
		}
	}

	// soma
	public Matriz somar(Matriz outra) {

		validarMesmoTamanho(outra);

		Matriz resultado = new Matriz(linhas, colunas);

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				resultado.setElemento(i, j, this.getElemento(i, j) + outra.getElemento(i, j) );
			}
		}

		return resultado;
	}

	// subtração
	public Matriz subtrair(Matriz outra) {

		validarMesmoTamanho(outra);

		Matriz resultado = new Matriz(linhas, colunas);

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				resultado.setElemento(
					i,
					j,
					this.getElemento(i, j) - outra.getElemento(i, j)
				);
			}
		}

		return resultado;
	}

	// oposta
	public Matriz oposta() {

		Matriz resultado = new Matriz(linhas, colunas);

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				resultado.setElemento(i, j, -this.getElemento(i, j));
			}
		}

		return resultado;
	}

	// transposta
	public Matriz transposta() {

		Matriz resultado = new Matriz(colunas, linhas);

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				resultado.setElemento(j, i, this.getElemento(i, j));
			}
		}

		return resultado;
	}

	// multiplicação
	public Matriz multiplicar(Matriz outra) {

		if (this.colunas != outra.linhas) {
			throw new IllegalArgumentException("Quantidade de colunas e linhas incompatíveis.");
		}

		Matriz resultado = new Matriz(this.linhas, outra.colunas);

		for (int i=0; i<this.linhas; i++) {

			for (int j=0; j<outra.colunas; j++) {

				double soma = 0;

				for (int k=0; k<this.colunas; k++) {

					soma += this.getElemento(i, k) * outra.getElemento(k, j);
				}

				resultado.setElemento(i, j, soma);
			}
		}

		return resultado;
	}

	// matriz nula
	public boolean isNula() {

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				if (this.getElemento(i, j) != 0) {
					return false;
				}
			}
		}

		return true;
	}

	// diagonal
	public boolean isDiagonal() {

		if (linhas != colunas) {
			return false;
		}

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				if (i != j && this.getElemento(i, j) != 0) {
					return false;
				}
			}
		}

		return true;
	}

	// identidade
	public boolean isIdentidade() {

		if (linhas != colunas) {
			return false;
		}

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				if (i == j && this.getElemento(i, j) != 1) {
					return false;
				}

				if (i != j && this.getElemento(i, j) != 0) {
					return false;
				}
			}
		}

		return true;
	}

	// simétrica
	public boolean isSimetrica() {

		if (linhas != colunas) {
			return false;
		}

		return this.equals(this.transposta());
	}

	// anti-simétrica
	public boolean isAntiSimetrica() {

		if (linhas != colunas) {
			return false;
		}

		return this.oposta().equals(this.transposta());
	}

	// singular
	public boolean isSingular() {

		if (linhas != colunas) {
			return false;
		}

		if (linhas == 2 && colunas == 2) {

			double determinante = (this.getElemento(0, 0) * this.getElemento(1, 1)) - (this.getElemento(0, 1) * this.getElemento(1, 0));

			return determinante == 0;
		}

		return false;
	}

	// cópia
	public Matriz copia() {

		Matriz nova = new Matriz(linhas, colunas);

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				nova.setElemento(i, j, this.getElemento(i, j));
			}
		}

		return nova;
	}

	// equals
	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj == null || !(obj instanceof Matriz)) {
			return false;
		}

		Matriz outra = (Matriz) obj;

		if (this.linhas != outra.linhas || this.colunas != outra.colunas) {
			return false;
		}

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				if (this.getElemento(i, j) != outra.getElemento(i, j)) {
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public String toString() {

		String texto = "";

		for (int i=0; i<linhas; i++) {

			for (int j=0; j<colunas; j++) {

				texto += this.getElemento(i, j) + "\t";
			}

			texto += "\n";
		}

		return texto;
	}
}