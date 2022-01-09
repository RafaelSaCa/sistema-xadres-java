package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;// matriz de peças
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas <1 || colunas < 1) {
			throw new ExcecaoTabuleiro ("Erro ao criar Tabuleiro: É necessario que haja pelo menos 1 linha e 1 coluna. ");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	
	public int getColunas() {
		return colunas;
	}

		
	public Peca peca(int linha, int coluna) {
		if(!posicaoExiste(linha, coluna)) {
			throw new ExcecaoTabuleiro("Posicao não existe no tabuleiro.");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new ExcecaoTabuleiro("Posicao não existe no tabuleiro.");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if(temUmaPeca(posicao)) {
			throw new ExcecaoTabuleiro("Já existe uma peça nessa na posição" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
		
	}
	private boolean posicaoExiste(int linha, int coluna) {// metodo auxiliar para saber a posicao da peca, para ser retornado no proximo metodo 
		return linha >=0 && linha < linhas && coluna >=0 && coluna <colunas;
	}
	public boolean posicaoExiste (Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new ExcecaoTabuleiro("Posicao não existe no tabuleiro.");
		}
		return peca(posicao)!= null;
	}
	
}
