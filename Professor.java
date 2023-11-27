import java.util.List;
import java.util.Scanner;

//Classe feita por João Victor
public class Professor {
    private String nome;

    Scanner scanner = new Scanner(System.in);

    public Professor(String nome) {
        this.nome = nome;
    }

    public void darNota(int nota, Grupo grupo) {
        System.out.println("Aguardando o professor dar a nota do grupo " + grupo.getNumeroDoGrupo());
        System.out.print("Digite a nota do grupo " + grupo.getNumeroDoGrupo() + ": ");
        nota = scanner.nextInt();
        System.out.println("Professor " + nome + " deu nota " + nota + " para todos do grupo");

        if (nota >= 8) {
            System.out.println("Valeu professor! Obrigado.");
        } else if (nota > 6 && nota < 8) {
            System.out.println("Poxa professor, só isso? Melhora essa nota aí.");
        } else {
            System.out.println("Tá brincando né professor. Só pode. Rsrs");
        }
    }

    // Insira seu método aqui abaixo

    // Insira seu método aqui acima

    public void listarGrupos(List<Grupo> grupos) {
        System.out.println("Grupos do Professor " + nome + ":");
        for (Grupo grupo : grupos) {
            System.out.println("Grupo " + grupo.getNumeroDoGrupo());
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Professor [Nome: " + nome + "]";
    }

}
