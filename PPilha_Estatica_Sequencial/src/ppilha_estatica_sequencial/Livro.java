package ppilha_estatica_sequencial;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Livro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    /*@Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + '}';
    }*/
}
