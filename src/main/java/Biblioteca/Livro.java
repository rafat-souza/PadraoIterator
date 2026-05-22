package Biblioteca;

public class Livro {

    private String titulo;
    private boolean emprestado;

    public Livro(String titulo, boolean emprestado) {
        this.titulo = titulo;
        this.emprestado = emprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

}
