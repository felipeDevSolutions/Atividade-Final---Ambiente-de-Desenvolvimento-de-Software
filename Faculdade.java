import java.util.ArrayList;
import java.util.List;

//Classe feita por Vitor
public class Faculdade {
    private String nome;
    private List<Curso> listaCursos;
    private List<Professor> listaProfessores;
    private List<Aluno> listaAlunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.listaCursos = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
    }

    public void listarCursos() {
        System.out.println("Cursos na faculdade:\n");
        for (Curso curso : listaCursos) {
            System.out.println(curso.getNome() + "\n");
        }
        System.out.println("--------------------------");
    }

    public void listarProfessores() {
        System.out.println("Professores na faculdade:\n");
        for (Professor professor : listaProfessores) {
            System.out.println(professor.getNome() + "\n");
        }
        System.out.println("--------------------------");
    }

    // Insira seu método aqui abaixo

    // Insira seu método aqui acima

    public void adicionarCurso(Curso curso) {
        this.listaCursos.add(curso);
    }

    public void adicionarAluno(Aluno aluno) {
        this.listaAlunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        this.listaProfessores.add(professor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    @Override
    public String toString() {
        return "Faculdade [Nome: " + nome + ", Cursos: " + listaCursos + ", Professores: " + listaProfessores
                + ", Alunos: " + listaAlunos + "]";
    }

}
