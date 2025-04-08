public class ContaCorrente {
    public double saldo;
    public Cliente titular;


        void depositar (double valor){

            saldo += valor;
        }

    void retirar (double valor){

        saldo -= valor;

    }

    double retornaSaldo(){
            return saldo;
    }
}
