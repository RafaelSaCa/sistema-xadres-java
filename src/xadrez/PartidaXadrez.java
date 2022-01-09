package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);// define o tamanho do tabuleiro
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
}
