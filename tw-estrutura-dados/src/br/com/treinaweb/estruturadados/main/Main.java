package br.com.treinaweb.estruturadados.main;

import java.util.Scanner;

import br.com.treinaweb.estruturadados.filas.Fila;
import br.com.treinaweb.estruturadados.listasligadas.ListaDuplamenteLigada;
import br.com.treinaweb.estruturadados.listasligadas.ListaLigada;
import br.com.treinaweb.estruturadados.modelos.Pessoa;
import br.com.treinaweb.estruturadados.pilhas.Pilha;
import br.com.treinaweb.estruturadados.vetores.Vetor;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite a opção desejada: ");
		System.out.println("1. Gerenciamento de memória");
		System.out.println("2. Vetores");
		System.out.println("3. Lista ligada");
		System.out.println("4. Lista duplamente ligada");
		System.out.println("5. Pilha");
		System.out.println("6. Fila");
		Scanner scanner = new Scanner(System.in);
		int opcao = scanner.nextInt();
		switch (opcao) {
		case 1:
			fazerGerenciamentoMemoria();
			break;
		case 2:
			fazerVetor();
			break;
		case 3:
			fazerListaLigada();
			break;
		case 4:
			fazerListaDuplamenteLigada();
			break;
		case 5:
			fazerPilha();
			break;
		case 6:
			fazerFila();
			break;
		}
		scanner.close();
	}

	private static void fazerFila() {
		Fila<Pessoa> filaPessoas = new Fila<Pessoa>();
		System.out.println(filaPessoas.estaVazia());
		filaPessoas.enfileirar(new Pessoa(1, "TreinaWeb 1"));
		filaPessoas.enfileirar(new Pessoa(2, "TreinaWeb 2"));
		System.out.println(filaPessoas.toString());
		Pessoa p = filaPessoas.desenfileirar();
		System.out.println(p.toString());
		System.out.println(filaPessoas.toString());
	}

	private static void fazerPilha() {
		Pilha<Pessoa> pilhaPessoas = new Pilha<Pessoa>();
		System.out.println(pilhaPessoas.estaVazia());
		pilhaPessoas.empilhar(new Pessoa(1, "TreinaWeb 1"));
		pilhaPessoas.empilhar(new Pessoa(2, "TreinaWeb 2"));
		pilhaPessoas.empilhar(new Pessoa(3, "TreinaWeb 3"));
		Pessoa p1 = pilhaPessoas.desempilhar();
		System.out.println(p1.toString());
	}

	private static void fazerListaDuplamenteLigada() {
		ListaDuplamenteLigada<Pessoa> listaPessoas = new ListaDuplamenteLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "TreinaWeb 1"));
		listaPessoas.inserir(new Pessoa(2, "TreinaWeb 2"));
		listaPessoas.inserir(new Pessoa(3, "TreinaWeb 3"));
		listaPessoas.inserirEm(1, new Pessoa(4, "TreinaWeb 4"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "TreinaWeb 5"));
		listaPessoas.inserirUltimo(new Pessoa(6, "TreinaWeb 6"));
		System.out.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "TreinaWeb 100");
		System.out.println(listaPessoas.contem(p));
		System.out.println(listaPessoas.contem(pessoaErrada));
		System.out.println(listaPessoas.indice(p));
		System.out.println(listaPessoas.indice(pessoaErrada));
		listaPessoas.remover(p);
		System.out.println(listaPessoas.toString());
		listaPessoas.remover(0);
		System.out.println(listaPessoas.toString());
		System.out.println("Lista de pessoas");
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			System.out.println(listaPessoas.recuperar(i).toString());
		}
	}

	private static void fazerListaLigada() {
		ListaLigada<Pessoa> listaPessoas = new ListaLigada<Pessoa>();
		listaPessoas.inserir(new Pessoa(1, "TreinaWeb 1"));
		listaPessoas.inserir(new Pessoa(2, "TreinaWeb 2"));
		listaPessoas.inserir(new Pessoa(3, "TreinaWeb 3"));
		listaPessoas.inserirEm(1, new Pessoa(4, "TreinaWeb 4"));
		listaPessoas.inserirPrimeiro(new Pessoa(5, "TreinaWeb 5"));
		listaPessoas.inserirUltimo(new Pessoa(6, "TreinaWeb 6"));
		System.out.println(listaPessoas.toString());
		Pessoa p = listaPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "TreinaWeb 100");
		System.out.println(listaPessoas.contem(p));
		System.out.println(listaPessoas.contem(pessoaErrada));
		System.out.println(listaPessoas.indice(p));
		System.out.println(listaPessoas.indice(pessoaErrada));
		listaPessoas.remover(p);
		System.out.println(listaPessoas.toString());
		listaPessoas.remover(0);
		System.out.println(listaPessoas.toString());
		for (int i = 0; i < listaPessoas.tamanho(); i++) {
			System.out.println(listaPessoas.recuperar(i).toString());
		}
	}

	private static void fazerGerenciamentoMemoria() {
		int a = 3;
		System.out.println(a);
		int b = a;
		System.out.println(b);
		b = 2;
		System.out.println("---------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		System.out.println("*********************************");
		Pessoa p1 = new Pessoa(1, "TreinaWeb");
		System.out.println(p1.toString());
		Pessoa p2 = new Pessoa(1, "TreinaWeb");
		System.out.println(p2.toString());
		System.out.println("---------------------");
		// p2.setNome("TreinaWeb Modificado");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p1.equals(p2));
	}

	private static void fazerVetor() {
		// indice começa com 0
		Vetor<Pessoa> vetorPessoas = new Vetor<Pessoa>();
		vetorPessoas.inserir(new Pessoa(1, "TreinaWeb 1"));
		vetorPessoas.inserir(new Pessoa(2, "TreinaWeb 2"));
		vetorPessoas.inserir(new Pessoa(3, "TreinaWeb 3"));
		vetorPessoas.inserir(new Pessoa(4, "TreinaWeb 4"));
		vetorPessoas.inserirEm(1, new Pessoa(5, "TreinaWeb 5"));
		System.out.println(vetorPessoas);
		System.out.println("Lista de pessoas: ");
		for (int i = 0; i < vetorPessoas.tamanho(); i++) {
			System.out.println(vetorPessoas.recuperar(i).getNome());
		}
		Pessoa p = vetorPessoas.recuperar(1);
		Pessoa pessoaErrada = new Pessoa(100, "TreinaWeb 100");
		System.out.println(vetorPessoas.contem(p));
		System.out.println(vetorPessoas.contem(pessoaErrada));
		System.out.println(vetorPessoas.indice(p));
		System.out.println(vetorPessoas.indice(pessoaErrada));
		vetorPessoas.remover(2);
		System.out.println(vetorPessoas.toString());
		vetorPessoas.remover(p);
		System.out.println(vetorPessoas.toString());
	}

}
