package br.com.treinaweb.estruturadados.arvorebinaria;

public class NoArvore<T> {

	private T valor;
	private NoArvore<T> noEsquerdo;
	private NoArvore<T> noDireito;
	
	public NoArvore(T valor) {
		this.valor = valor;
		this.noEsquerdo = null;
		this.noDireito = null;
	}

	public NoArvore<T> getNoEsquerdo() {
		return noEsquerdo;
	}

	public void setNoEsquerdo(NoArvore<T> noEsquerdo) {
		this.noEsquerdo = noEsquerdo;
	}

	public NoArvore<T> getNoDireito() {
		return noDireito;
	}

	public void setNoDireito(NoArvore<T> noDireito) {
		this.noDireito = noDireito;
	}

	public T getValor() {
		return valor;
	}
	
	public int peso() {
		return this.valor.hashCode();
	}

}
