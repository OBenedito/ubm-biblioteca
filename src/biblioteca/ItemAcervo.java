package biblioteca;

public class ItemAcervo {
    private String titulo;
    private int anoPublicacao;

    public ItemAcervo(String titulo) {
        this.titulo = titulo;
    }

    public ItemAcervo(String titulo, int anoPublicacao) {
        this(titulo);
        this.anoPublicacao = anoPublicacao;
    }

    public int calcularPrazoDevolucao() {
        return 7;
    }

    public void exibirFicha() {
        System.out.println("titulo: " + titulo);
        System.out.println("ano: " + anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
