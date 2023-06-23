package Ex01_Conta;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){
        while (valor > limite || valor > getSaldo()){
            Scanner sc = new Scanner(System.in);
            if (valor > limite){
                System.out.println("ERRO: Valor de saque maior que o limite: R$" + getLimite() );
                System.out.print("Digite um novo valor:");
                valor = sc.nextDouble();
            }
            if (valor > getSaldo()){
                System.out.println("ERRO: Saldo insuficiente");
                System.out.print("Digite um novo valor:");
                valor = sc.nextDouble();
            }
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaBancaria [" +
                "NomeCliente: " + getNomeCliente() + '\'' +
                " | NumConta: " + getNumConta() +
                " | Limite: R$" + getLimite() +
                " | Saldo: R$" + getSaldo() +
                ']';
    }
}
