package Ex02_Banco;

public class ContaCorrente extends ContaBancaria implements Tributavel{
    public ContaCorrente(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public double calcularTributos() {
        return getSaldo() * 0.01;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }
}
