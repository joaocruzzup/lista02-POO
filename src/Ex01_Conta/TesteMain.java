package Ex01_Conta;

public class TesteMain {
    public static void main(String[] args) {
        ContaPoupanca cp1 = new ContaPoupanca("João", 123, 5000, 3);
        ContaEspecial ce1 = new ContaEspecial("Victor", 456, 4000, 1000);

        cp1.sacar(4000);
        cp1.sacar(3000); // Retornará erro de saldo insuficiente
        System.out.println(cp1.getSaldo());


        ce1.sacar(1000);
        ce1.sacar(2000); // Retornará erro de valor maior que o limiete
        ce1.sacar(5000); // Retornará erro de saldo insuficiente
        System.out.println(ce1.getSaldo());


        cp1.depositar(3000);
        System.out.println(cp1.getSaldo());
        ce1.depositar(3000);
        System.out.println(ce1.getSaldo());


        cp1.calcularNovoSaldo(0.1);
        System.out.println(cp1.getSaldo());




    }
}
