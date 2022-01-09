package tabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {// protected faz com que somente classes e subclasses do mesmo pacote vão poder acessar a peça de um tabuleiro.
		return tabuleiro;
	}

	
	
	
	
	
	
	
}
