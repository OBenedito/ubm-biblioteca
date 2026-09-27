package biblioteca;

public class Jornal extends ItemAcervo {
    private String dataEdicao;
    private String editoria;

    public Jornal(String titulo, int ano, String dataEdicao, String editoria) {
        super(titulo, ano);
        this.dataEdicao = dataEdicao;
        this.editoria = editoria;
    }

    @Override
    public int calcularPrazoDevolucao() {
        return 1;
    }

    @Override
    public void exibirFicha() {
        System.out.println("--- Jornal ---");
        super.exibirFicha();
        System.out.println("Data    : " + dataEdicao);
        System.out.println("Editoria: " + editoria);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + dataEdicao + ", " + editoria;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public String getEditoria() {
        return editoria;
    }
}