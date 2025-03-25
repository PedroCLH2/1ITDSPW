import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    //Criar o objeto responsável por ler os dados digitados no teclado

        Scanner leitor = new Scanner(System.in);
        Tenis tenis1 = new Tenis();

        //Criar um objeto tenis com os valores digitados eplo usuários
        System.out.println("Digite o modelo do produto");
        String modelo = leitor.next() + leitor.nextLine(); //Le a string com mais

        System.out.println("Digite a cor do seu tênis");
        String cor = leitor.next() + leitor.nextLine();



        System.out.println("Digite o tamanho desejado");
        int tamanho = leitor.nextInt();

        System.out.println("Digite o valor");
         double preco = leitor.nextDouble();

        boolean disponivel = leitor.nextBoolean();
      //Colocar os valores lidos dentro do objeto
        tenis1.modelo = modelo;
        tenis1.cor = cor;
        tenis1.disponivel = disponivel;
        tenis1.tamanho = tamanho;
        tenis1.preco = preco;

        //Exibir os valores que estão dentro do objeto




    }
}
