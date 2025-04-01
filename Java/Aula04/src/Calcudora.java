import java.util.Scanner;

public class Calcudora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        System.out.println("Digite o nome do aluno:");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a turma:");
        String turma = leitor.next() + leitor.nextLine();


        System.out.println("Digite a nota da CP 1");
        aluno1.cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da CP 2");
       aluno1.cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da CP 3");
        aluno1.cp3 = leitor.nextDouble();

        System.out.println("Digite a nota do Challenge");
        aluno1.ch = leitor.nextDouble();

        System.out.println("Digite a nota da GS");
        aluno1.gs = leitor.nextDouble();


        double media = aluno1.calcularMedia();
        System.out.println(nome + " possui a média " + media);
    }
}
