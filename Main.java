
//Classe feita por Felipe
public class Main {
    public static void main(String[] args) {

        // Criar uma faculdade
        Faculdade faculdade = new Faculdade("Universidade de Fortaleza -  Unifor");

        // Criar professores
        Professor professor1 = new Professor("Ronaldo");
        faculdade.adicionarProfessor(professor1);

        // Criar cursos
        Curso curso1 = new Curso("Análise e Desenvolvimento de Sistemas", professor1);

        // Adicionar cursos à faculdade
        faculdade.adicionarCurso(curso1);

        // Criar alunos
        Aluno aluno1 = new Aluno("Felipe", 31, curso1);
        Aluno aluno2 = new Aluno("Ricardo", 41, curso1);
        Aluno aluno3 = new Aluno("Guilherme", 25, curso1);
        Aluno aluno4 = new Aluno("João Victor", 23, curso1);
        Aluno aluno5 = new Aluno("Ezequiel", 23, curso1);
        Aluno aluno6 = new Aluno("Eliabe", 23, curso1);
        Aluno aluno7 = new Aluno("Ana", 26, curso1);
        Aluno aluno8 = new Aluno("Abner", 20, curso1);
        Aluno aluno9 = new Aluno("Vitor", 20, curso1);

        // Adicionar alunos à faculdade
        faculdade.adicionarAluno(aluno1);
        faculdade.adicionarAluno(aluno2);
        faculdade.adicionarAluno(aluno3);
        faculdade.adicionarAluno(aluno4);
        faculdade.adicionarAluno(aluno5);
        faculdade.adicionarAluno(aluno6);
        faculdade.adicionarAluno(aluno7);
        faculdade.adicionarAluno(aluno8);
        faculdade.adicionarAluno(aluno9);

        // Mostrar nome da faculdade
        System.out.println(faculdade.getNome());
        System.out.println("---------------------------");

        // Mostrar cursos da facudade
        faculdade.listarCursos();

        // Mostrar professores da faculdade
        faculdade.listarProfessores();

        // Mostrar alunos da faculdade
        faculdade.listarAlunos();

        // Criar grupos
        Grupo grupo1 = new Grupo(41);

        // Adicionar grupos aos cursos
        curso1.addGrupo(grupo1);

        // Entrar no grupo
        System.out.println("\nCriação do grupo\n");
        aluno1.entrarNoGrupo(grupo1);
        aluno2.entrarNoGrupo(grupo1);
        aluno3.entrarNoGrupo(grupo1);
        aluno4.entrarNoGrupo(grupo1);
        aluno5.entrarNoGrupo(grupo1);
        aluno9.entrarNoGrupo(grupo1);

        // Adicione o método aqui abaixo
        // Mostrar integrantes do grupo
        System.out.println("-----------------------------\n");
        grupo1.listarAlunos();
        System.out.println("-----------------------------\n");
        // Adicione o método aqui acima

        // Professor dá a nota para a equipe
        professor1.darNota(0, grupo1);
    }
}
