package Biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SecaoBiblioteca implements Iterable<Livro> {

    private List<Livro> livros = new ArrayList<Livro>();

    public SecaoBiblioteca(Livro... livros) {
        this.livros = Arrays.asList(livros);
    }

    @Override
    public Iterator<Livro> iterator() {
        return livros.iterator();
    }

}
