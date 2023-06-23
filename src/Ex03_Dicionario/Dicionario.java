package Ex03_Dicionario;

import java.util.*;

public class Dicionario {
    private Map<String, String[]> dicionario = new HashMap<>();

    public void adicionarInformacao(String obj, String[] cor){
        while (dicionario.containsKey(obj)){
            Scanner sc = new Scanner(System.in);
            System.out.println("Erro: O objeto já existe!");
            System.out.print("Digite um novo objeto: ");
            obj = sc.nextLine();
        }
        dicionario.put(obj, cor);
    }

    public void exibirDicionario(){
        for (String obj:dicionario.keySet()) {
            System.out.print("Objeto: " + obj + " | Cores: " + Arrays.toString(dicionario.get(obj)) + "\n");
        }
    }

}
