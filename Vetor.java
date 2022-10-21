package Trabalho;

import java.util.Arrays;

public class Vetor {
	public static final char[] insere = null;
	private int tamanho;
	private int vetor;
	private Object[] vetores;
	private int posicao;


	public int Vetor(int tamanho) {
		//construtor da classe. Deverá receber o tamanho do vetor como parâmetro
		this.tamanho = tamanho;
		return tamanho;
	}

	public int insere(int valor, int i) {
		//Esse método deverá inserir elementos no vetor desde que haja espaço para o mesmo.
		// A inserção será feita de forma sequencial
		tamanho = 10;
		while (tamanho > vetor) {
			if (tamanho >= vetor) {
				System.out.println(vetor++);
			} else {
				System.out.println("Vetor ainda possui espaco!");
			}
			return valor;
		}
		return tamanho;
	}

	public void remove(int posicao, int valor) {
		//Esse método deverá remover o elemento na posição especificada e rearranjar os elementos, caso necessário
		if (posicao >= 0 && posicao < valor) {
			for (int i = posicao; i < tamanho;) {
				this.vetor = tamanho;
				System.out.println(Arrays.deepToString(vetores));
				return;
			}
		}
	}

	public int buscaElemento() {
		//Esse método deverá retornar o valor do elemento na posição especificada.
		int valorInformado = 3;
		for (int i = 1; i < 10; i++) {
			if (valorInformado > this.posicao) {
				posicao = posicao + valorInformado - 1;
			}
		}
		return valorInformado;
	}

}
