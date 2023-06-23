package Ex03_Dicionario;

import java.util.ArrayList;
import java.util.List;

public class MainDicionario {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        String[] cor1 = new String[]{"Azul"};
        String[] cor2 = new String[]{"Amarelo"};
        String[] cor3 = new String[]{"rosa"};
        String[] cor4 = new String[]{"Verde", "Branco"};

        dicionario.adicionarInformacao("Bola", cor1);
        dicionario.adicionarInformacao("Boneca", cor2);
        dicionario.adicionarInformacao("Dado", cor3);
        dicionario.adicionarInformacao("Camisa", cor4);

        dicionario.exibirDicionario();

    }
}
