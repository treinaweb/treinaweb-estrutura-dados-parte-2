package br.com.treinaweb.estruturadados.arvorebinaria;

public class Arvore<T> {

	private NoArvore<T> raiz;

	public Arvore() {
		this.raiz = null;
	}

	public NoArvore<T> getRaiz() {
		return this.raiz;
	}

	public void inserir(NoArvore<T> no) {
		no.setNoDireito(null);
		no.setNoEsquerdo(null);
		if (this.raiz == null) {
			this.raiz = no;
		} else {
			this.inserir(this.raiz, no);
		}
	}

	private void inserir(NoArvore<T> ref, NoArvore<T> novoNo) {
		if (ref.peso() < novoNo.peso()) {
			if (ref.getNoDireito() == null) {
				ref.setNoDireito(novoNo);
			} else {
				inserir(ref.getNoDireito(), novoNo);
			}
		} else {
			if (ref.getNoEsquerdo() == null) {
				ref.setNoEsquerdo(novoNo);
			} else {
				inserir(ref.getNoEsquerdo(), novoNo);
			}
		}
	}

	@Override
	public String toString() {
		return this.raiz == null ? "[(X)]" : this.raiz.toString();
	}

}
