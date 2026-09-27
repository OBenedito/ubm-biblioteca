package biblioteca;

public class Livro extends ItemAcervo {
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int ano) {
        super(titulo, ano);
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int ano, int paginas) {
        this(titulo, autor, ano);
        this.numeroPaginas = paginas;
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 14;
    }

    @Override
    public String getTipo() {
        return "Livro";
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Autor   : " + autor);
        System.out.println("Paginas : " + numeroPaginas);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + autor;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}