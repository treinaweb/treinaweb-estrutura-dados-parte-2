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

	public NoArvore<T> buscar(NoArvore<T> noBusca) {
		return this.buscar(this.raiz, noBusca);
	}

	private NoArvore<T> buscar(NoArvore<T> ref, NoArvore<T> noBusca) {
		if (ref.getValor().equals(noBusca.getValor())) {
			return ref;
		} else {
			if (ref.peso() < noBusca.peso()) {
				// Tem que ir para a direita
				if (ref.getNoDireito() == null) {
					throw new IllegalArgumentException("Elemento não encontrado na árvore");
				} else {
					System.out.println(" >>> Navegando à direita do nó " + ref.getValor().toString());
					return buscar(ref.getNoDireito(), noBusca);
				}
			} else {
				// Tem que ir para a esquerda
				if (ref.getNoEsquerdo() != null) {
					throw new IllegalArgumentException("Elemento não encontrado na árvore");
				} else {
					System.out.println(" >>> Navegando à esquerda do nó " + ref.getValor().toString());
					return buscar(ref.getNoEsquerdo(), noBusca);
				}
			}
		}
	}

	public void emOrdem() {
		// ERD
		this.emOrdem(this.raiz);
	}

	private void emOrdem(NoArvore<T> ref) {
		if (ref.getNoEsquerdo() != null) {
			emOrdem(ref.getNoEsquerdo());
			System.out.println(ref.getValor().toString());
			if (ref.getNoDireito() != null) {
				emOrdem(ref.getNoDireito());
			}
		} else {
			System.out.println(ref.getValor().toString());
			if (ref.getNoDireito() != null) {
				emOrdem(ref.getNoDireito());
			}
		}
	}

	@Override
	public String toString() {
		return this.raiz == null ? "[(X)]" : this.raiz.toString();
	}

}
