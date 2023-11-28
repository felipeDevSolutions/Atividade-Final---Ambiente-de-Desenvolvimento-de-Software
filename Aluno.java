//Classe feita por Guilherme
public class Aluno {
    // Atributos
    private String nome;
    private int idade;
    private Curso curso;

    // Construtor
    public Aluno(String nome, int idade, Curso curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    // Métodos
    @Override
    public String toString() {
        return "Aluno [Nome: " + nome + ", Idade: " + idade + ", Curso: " + curso + "]";
    }

    public void entrarNoGrupo(Grupo grupo) {
        grupo.addAluno(this);
    }

    // Insira seu método aqui abaixo
    public void sairDoGrupo(Grupo grupo) {
        grupo.alunoSaiDoGrupo(this);
    }
    // Insira seu método aqui acima

}
