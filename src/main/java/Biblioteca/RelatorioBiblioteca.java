package Biblioteca;

import java.util.Iterator;

public class RelatorioBiblioteca {

    public static Integer contarLivrosEmprestados(SecaoBiblioteca secao) {
        int quantidade = 0;
        for (Livro livro : secao) {
            if (livro.isEmprestado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalLivrosSecao(SecaoBiblioteca secao) {
        int quantidade = 0;
        for (Iterator<Livro> l = secao.iterator(); l.hasNext(); ) {
            quantidade++;
            l.next();
        }
        return quantidade;
    }

}
