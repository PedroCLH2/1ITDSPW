import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        Cliente cliente = new Cliente();
        ContaCorrente cc = new ContaCorrente();

        Scanner leior = new Scanner(System.in);

        System.out.println("Digitar seu nome: ");
        cliente.nome = leior.next() + leior.nextLine();
        cliente.endereco = endereco;
        System.out.println("Digite seu CPF: ");
        cliente.cpf = leior.next();

        System.out.println("Digite seu Endereço: ");
        endereco.logradouro = leior.next() + leior.nextLine();

        System.out.println("Digite seu número: ");
        endereco.numero = leior.nextShort();

        System.out.println("Digite o complemento: ");
        endereco.complemento = leior.next();

        System.out.println("Digite seu CEP: ");
        endereco.cep = leior.next();

        cc.titular = cliente;

        System.out.println("Digite o valor de depósito: ");
        cc.depositar(leior.nextDouble());

        System.out.println("Digite o valor que deseja retirar: ");
        cc.retirar(leior.nextDouble());


        System.out.println(cliente.retornaDados());
        System.out.println("Saldo: " + cc.saldo);


    }
}
