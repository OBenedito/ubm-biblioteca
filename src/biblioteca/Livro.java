package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;

    }

    public Livro(String titulo, String autor, int ano) {
        this(titulo, autor);
        this.anoPublicacao = ano;
    }

    public Livro(String titulo, String autor, int ano, int paginas) {
        this(titulo, autor, ano);
        this.numeroPaginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirFicha() {
        System.out.println("--- Livro ---");
        System.out.println("Titulo : " + titulo);
        System.out.println("Autor : " + autor);
        System.out.println("Ano : " + anoPublicacao);
        System.out.println("Paginas : " + numeroPaginas);
    }
}
