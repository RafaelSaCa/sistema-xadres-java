package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);// define o tamanho do tabuleiro
		setupInicial();
	}
	
	public PecaXadrez[][] getPecas(){// retorna uma matriz de pe�as de xadrez 
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i, j);// DownCasting para interpretar que � uma pe�a de xadrez e nao uma pe�a comum
			}
		}
		return mat;
	}
	
	private void setupInicial() {
		tabuleiro.colocarPeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(2, 1));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.BLACK), new Posicao(0, 4));
		tabuleiro.colocarPeca(new Rei(tabuleiro, Cor.WHITE), new Posicao(7, 4));
		
	}
}
