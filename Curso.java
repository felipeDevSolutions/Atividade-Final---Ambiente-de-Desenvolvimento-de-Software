import java.util.ArrayList;
import java.util.List;

//Classe feita por Ezequiel
public class Curso {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;
    private List<Grupo> grupos;

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.grupos = new ArrayList<>();
    }

    public void listarAlunos() {
        System.out.println("Alunos no curso de " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

    public void addGrupo(Grupo grupo) {
        grupos.add(grupo);
    }

    // Insira seu método aqui abaixo
    public void listarGrupos() {
        System.out.println("Grupos no curso de " + nome + ":");
        for (Grupo grupo : grupos) {
            System.out.println("Grupo " + grupo.getNumeroDoGrupo());
        }
    }
    // Insira seu método aqui acima

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    @Override
    public String toString() {
        return "Curso [Nome: " + nome + ", Professor: " + professor + ", Alunos:" + alunos + "]";
    }
}
