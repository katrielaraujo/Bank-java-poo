import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pedro");
        Cliente c2 = new Cliente("Gustavo");

        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c2);

        cc.depositar(100);
        cc.transferir(100,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}