package Ex01_Conta;

public class ContaPoupanca extends ContaBancaria{

    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento){
        double rendimento = taxaRendimento * getSaldo();
        setSaldo(rendimento + getSaldo());
        System.out.println("Saldo Atualizado para: " + getSaldo());
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "ContaBancaria [" +
                "NomeCliente: " + getNomeCliente() + '\'' +
                " | NumConta: " + getNumConta() +
                " | Dia do rendimento: " + getDiaRendimento() +
                " | Saldo: R$" + getSaldo() +
                ']';
    }
}
