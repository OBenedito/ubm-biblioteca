package biblioteca;

public class Midia extends ItemAcervo {
    private String formato;
    private int duracaoMinutos;

    public Midia(String titulo, int ano, String formato, int duracaoMinutos) {
        super(titulo, ano);
        this.formato = formato;
        this.duracaoMinutos = duracaoMinutos;
    }

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

    @Override
    public String toString() {
        return super.toString() + " - " + formato + ", " + duracaoMinutos + " min";
    }

    public String getFormato() {
        return formato;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }
}