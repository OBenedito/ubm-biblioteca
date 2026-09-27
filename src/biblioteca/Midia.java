package biblioteca;

public class Midia extends ItemAcervo {
    private String formato; // "DVD", "Blu-ray", "CD"
    private int duracaoMinutos;

    public Midia(String titulo, int ano, String formato, int duracaoMinutos) {
        super(titulo, ano);
        this.formato = formato;
        this.duracaoMinutos = duracaoMinutos;
    }

    // Midia circula rapido: sobrescreve o prazo padrao.
    @Override
    public int calcularPrazoDevolucao() {
        return 3;
    }

    @Override
    public void exibirFicha() {
        System.out.println("--- Midia ---");
        super.exibirFicha();
        System.out.println("Formato : " + formato);
        System.out.println("Duracao : " + duracaoMinutos + " min");
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}