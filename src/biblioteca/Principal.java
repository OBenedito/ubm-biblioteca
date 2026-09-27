package biblioteca;

public class Principal {
    public static void main(String[] args) {

        // Itens do acervo
        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro l2 = new Livro("O Cortico", "Aluisio Azevedo");
        l2.setAnoPublicacao(1890);
        l2.setNumeroPaginas(304);
        Livro l3 = new Livro("Memorias Postumas de Bras Cubas",
                "Machado de Assis", 1881, 368);
        Revista r1 = new Revista("Revista UBM Ciencia", 2026, 12, "Semestral");
        Midia m1 = new Midia("Central do Brasil", 1998, "DVD", 113);
        Jornal j1 = new Jornal("Jornal de Barra Mansa", 2026, "28/08/2026", "Cidades");

        // Emprestaveis que NAO sao itens do acervo
        SalaEstudo s1 = new SalaEstudo("Sala 3 - Bloco B", 6);
        Notebook n1 = new Notebook("PAT-2026-07", "Dell Latitude");

        Usuario u1 = new Usuario("Ana Souza", "2026101",
                "Engenharia de Software", "ana.souza@aluno.ubm.br");
        Usuario u2 = new Usuario("Bruno Lima", "2026102", "Sistemas de Informacao");
        u2.setEmail("bruno.lima@aluno.ubm.br");

        // ItemAcervo continua servindo de TIPO de variavel, mesmo sendo abstrata.
        ItemAcervo[] acervo = { l1, l2, l3, r1, m1, j1 };

        System.out.println("=== UBM Biblioteca - acervo ===");
        for (int i = 0; i < acervo.length; i++) {
            acervo[i].exibirFicha();
            System.out.println("Prazo : "
                    + acervo[i].calcularPrazoDevolucao() + " dias");
        }

        System.out.println("=== Itens cadastrados: " + ItemAcervo.getTotalItens() + " ===");
        System.out.println("Prazo de livro dentro da politica de "
                + Emprestavel.PRAZO_MAXIMO_DIAS + " dias? " + l1.dentroDaPolitica());

        // POLIMORFISMO POR INTERFACE: inclui o Notebook aqui
        Emprestavel[] emprestaveis = { l1, r1, m1, j1, s1, n1 };

        System.out.println("=== Emprestimos ===");
        for (int i = 0; i < emprestaveis.length; i++) {
            emprestaveis[i].emprestar(u1);
        }
        l1.emprestar(u2);
        l1.devolver();

        System.out.println("=== Situacao ===");
        for (int i = 0; i < emprestaveis.length; i++) {
            Emprestavel e = emprestaveis[i];
            if (e instanceof ItemAcervo item) {
                System.out.println(item + " | " + item.getStatus().getDescricao());
            } else {
                System.out.println(e + " | espaco fisico ou equipamento");
            }
        }

        System.out.println("=== Status possiveis ===");
        for (StatusItem status : StatusItem.values()) {
            System.out.println(status.name() + " - " + status.getDescricao()
                    + " (permite emprestimo? " + status.permiteEmprestimo() + ")");
        }

        System.out.println("=== Usuarios ===");
        u1.exibirFicha();
        u2.exibirFicha();
    }
}