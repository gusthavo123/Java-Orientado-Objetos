package Trabalho;

public class Executor {
	public static void main(String[] args) {
	 Vetor vetortamanho = new Vetor ();
        vetortamanho.insere(1, 0);
        vetortamanho.insere(2, 0);
        vetortamanho.insere(3, 0);
        vetortamanho.insere(4, 0);
        vetortamanho.insere(5, 0);
        vetortamanho.insere(6, 0);
        vetortamanho.insere(7, 0);
        vetortamanho.insere(8, 0);
        vetortamanho.insere(9, 0);
        vetortamanho.insere(10, 0);
		vetortamanho.buscaElemento ();
        System.out.println("O valor buscado foi: " + vetortamanho.buscaElemento());
	}
}
 