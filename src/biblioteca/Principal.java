package biblioteca;

public class Principal {
    public static void main(String[] args) {
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro l2 = new Livro("O Cortico", "Aluisio Azevedo");
        l2.setAnoPublicacao(1890);
        l2.setNumeroPaginas(304);
        Livro l3 = new Livro("Memorias Postumas de Bras Cubas",
                "Machado de Assis", 1881, 368);

        Usuario u1 = new Usuario(
                "Jorge Benedio",
                "20242063",
                "Engenharia de Software",
                "jorge.benedito@aluno.ubm.br");

        Usuario u2 = new Usuario(
                "Gabriel Benedio",
                "20242064",
                "Engenharia de Software");

        System.out.println("=== UBM Biblioteca - catalogo inicial ===");
        l1.exibirFicha();
        l2.exibirFicha();
        l3.exibirFicha();
        u1.exibirFicha();
        u2.exibirFicha();
    }
}