package biblioteca;

import java.util.Objects;

public class Usuario {
    private String nome;
    private String matricula;
    private String curso;
    private String email;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Usuario(String nome, String matricula, String curso, String email) {
        this(nome, matricula);
        this.curso = curso;
        this.email = email;
    }

    public Usuario(String nome, String matricula, String curso) {
        this(nome, matricula);
        this.curso = curso;
    }

    public void exibirFicha() {
        System.out.println("--- Usuario ---");
        System.out.println("Nome     : " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso    : " + curso);
        System.out.println("Email    : " + email);
    }

    // Formato: Nome (matricula)
    @Override
    public String toString() {
        return nome + " (" + matricula + ")";
    }

    // ----- IDENTIDADE: a matricula e quem a pessoa E -----
    // Nome, curso e e-mail podem mudar; a matricula nao. Mesma receita de
    // quatro passos de ItemAcervo, agora com um atributo so.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // 1) mesmo objeto: igual
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // 2) nulo ou tipo diferente
        }
        Usuario outro = (Usuario) obj; // 3) agora o cast e seguro
        return matricula.equals(outro.matricula); // 4) compara a matricula
    }

    // Mesmo atributo do equals: objetos iguais tem o mesmo hash.
    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}