package Testes;

import Biblioteca.Livro;
import Biblioteca.RelatorioBiblioteca;
import Biblioteca.SecaoBiblioteca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatorioBibliotecaTest {

    @Test
    void deveContarLivrosEmprestados() {
        SecaoBiblioteca secao = new SecaoBiblioteca(
                new Livro("O Senhor dos Anéis", true),
                new Livro("1984", false),
                new Livro("Dom Quixote", true),
                new Livro("O Pequeno Príncipe", false)
        );

        assertEquals(2, RelatorioBiblioteca.contarLivrosEmprestados(secao));
    }

    @Test
    void deveContarTotalLivrosSecao() {
        SecaoBiblioteca secao = new SecaoBiblioteca(
                new Livro("O Senhor dos Anéis", true),
                new Livro("1984", false),
                new Livro("Dom Quixote", true),
                new Livro("O Pequeno Príncipe", false)
        );

        assertEquals(4, RelatorioBiblioteca.contarTotalLivrosSecao(secao));
    }

}
