package biblioteca;


public enum StatusItem {
   
    DISPONIVEL("Disponivel"),
    EMPRESTADO("Emprestado"),
    RESERVADO("Reservado"),
    EM_MANUTENCAO("Em manutencao");
   
    private final String descricao;

    StatusItem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}