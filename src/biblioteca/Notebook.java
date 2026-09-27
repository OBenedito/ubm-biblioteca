package biblioteca;

public class Notebook implements Emprestavel {
    public static final int PRAZO_NOTEBOOK = 2;

    private final String patrimonio;
    private String modelo;
    private StatusItem status;

    public Notebook(String patrimonio, String modelo) {
        this.patrimonio = patrimonio;
        this.modelo = modelo;
        this.status = StatusItem.DISPONIVEL;
    }

    @Override
    public int calcularPrazoDevolucao() {
        return PRAZO_NOTEBOOK;
    }

    @Override
    public void emprestar(Usuario usuario) {
        if (status != StatusItem.DISPONIVEL) {
            System.out.println(patrimonio + ": indisponivel (" + status.getDescricao() + ")");
            return;
        }
        status = StatusItem.EMPRESTADO;
        System.out.println(patrimonio + " emprestado a " + usuario.getNome()
                + " por " + calcularPrazoDevolucao() + " dias");
    }

    @Override
    public void devolver() {
        status = StatusItem.DISPONIVEL;
        System.out.println(patrimonio + " devolvido");
    }

    @Override
    public boolean estaDisponivel() {
        return status == StatusItem.DISPONIVEL;
    }

    @Override
    public String toString() {
        return modelo + " (patrimonio " + patrimonio + ")";
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public String getModelo() {
        return modelo;
    }

    public StatusItem getStatus() {
        return status;
    }
}