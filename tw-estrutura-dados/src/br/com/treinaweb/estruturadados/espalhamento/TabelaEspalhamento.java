package br.com.treinaweb.estruturadados.espalhamento;

import br.com.treinaweb.estruturadados.listasligadas.ListaLigada;

public class TabelaEspalhamento<T> {
	
	// 0: p1, p2, p7
	// 1: p3, p5, p6
	// 2: p4
	
	private ListaLigada<ListaLigada<T>> elementos;
	private int numeroCategorias = 16;
	
	public TabelaEspalhamento() {
		this.elementos = new ListaLigada<ListaLigada<T>>();
		for (int i = 0; i < this.numeroCategorias; i++) {
			this.elementos.inserir(new ListaLigada<T>());
		}
	}
	
	

}
