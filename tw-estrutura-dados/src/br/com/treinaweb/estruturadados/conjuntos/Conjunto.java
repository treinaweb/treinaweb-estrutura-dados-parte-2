package br.com.treinaweb.estruturadados.conjuntos;

import br.com.treinaweb.estruturadados.listasligadas.ListaLigada;

public class Conjunto<T> {

	private ListaLigada<T> elementos;

	public Conjunto() {
		this.elementos = new ListaLigada<T>();
	}

	public void inserir(T elemento) {
		this.elementos.inserir(elemento);
	}

	public void inserirEm(int posicao, T elemento) {
		this.elementos.inserirEm(posicao, elemento);
	}

	public T recuperar(int posicao) {
		return this.elementos.recuperar(posicao);
	}

	public boolean estaVazio() {
		return this.elementos.estaVazia();
	}

	public int tamanho() {
		return this.elementos.tamanho();
	}

	public boolean contem(T elemento) {
		return this.elementos.contem(elemento);
	}

	public int indice(T elemento) {
		return this.elementos.indice(elemento);
	}

	public void remover(int posicao) {
		this.elementos.remover(posicao);
	}

	public void remover(T elemento) {
		this.elementos.remover(elemento);
	}

}
