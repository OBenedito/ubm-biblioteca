package biblioteca;

public enum StatusItem {
    DISPONIVEL("Disponivel"),
    EMPRESTADO("Emprestado"),
    RESERVADO("Reservado"),
    EM_MANUTENCAO("Em manutencao"),
    EXTRAVIADO("Extraviado");

    private final String descricao;

    StatusItem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean permiteEmprestimo() {
        switch (this) {
            case DISPONIVEL:
                return true;
            default:
                return false;
        }
    }
}