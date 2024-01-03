package model;

public abstract class Conta implements IConta{

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente.clone();
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor,Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta ===\n");
        System.out.printf("Títula: %s\n",this.cliente.getNome());
        System.out.printf("Agencia: %d\n",this.agencia);
        System.out.printf("Numero: %d\n",this.numero);
        System.out.printf("Saldo: %.2f\n",this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
