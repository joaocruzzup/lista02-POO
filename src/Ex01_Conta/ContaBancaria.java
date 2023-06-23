package Ex01_Conta;

import java.util.Scanner;

public abstract class ContaBancaria {
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(double valor){
        while (valor > this.saldo) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ERRO: Saldo insuficiente!");
            System.out.print("Digite um novo valor:");
            valor = sc.nextDouble();
        }
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
