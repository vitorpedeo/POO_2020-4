package aula09.salaaula.exemploconta;

public class CadastraConta {
    public static void main(String[] args) {
        //Conta c = new Conta(); Classe abstrata não pode ser instaciada

        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();

        cc1.depositar(1000);
        cp1.depositar(500);

        cc1.transferir(cp1, 100);
        
    }
}