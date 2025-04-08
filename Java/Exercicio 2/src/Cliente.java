public class Cliente {
     String nome;
     String cpf;
    public Endereco endereco;

    public String retornaDados(){
        return " Nome: " + nome + " CPF: " + cpf + " Endereço: "  + endereco.retornaEndereco();
    }
}
