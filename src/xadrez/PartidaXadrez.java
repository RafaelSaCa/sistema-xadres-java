package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);// define o tamanho do tabuleiro
		setupInicial();
	}
	
	public PecaXadrez[][] getPecas(){// retorna uma matriz de peças de xadrez 
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i, j);// DownCasting para interpretar que é uma peça de xadrez e nao uma peça comum
			}
		}
		return mat;
	}
	private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) { //metodo para colocar peça no tabuleiro com as coordenadas de xadrez e nao de matriz.
		tabuleiro.colocarPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
		
	}
	
	private void setupInicial() {
		colocarNovaPeca('b',6, new Torre(tabuleiro, Cor.WHITE));
		colocarNovaPeca('e',8, new Rei(tabuleiro, Cor.BLACK));
		colocarNovaPeca('e',1, new Rei(tabuleiro, Cor.WHITE));
		
	}
}
