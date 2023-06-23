package Ex04_Animal;

import java.util.ArrayList;
import java.util.List;

public class MainZoologico {
    public static void main(String[] args) {
        List<Animal> zoologico = new ArrayList<>();

        Mamifero camelo = new Mamifero("Camelo", 1.80, "marrom", 10, "grama");
        Peixe tubarao = new Peixe("Tubarão", 1.30, "azul", "oceano", 30);
        Urso ursoDoCanada = new Urso("Urso-do-Canadá", 2.05, 10);
        Animal iguana = new Animal("Iguana", 0.5, "verde", "floresta", 5);
        Mamifero leao = new Mamifero("Leão", 1.5, "beje", 50, "carne");
        Mamifero micoLeao = new Mamifero("MicoLeao", 0.6, "dourado", 3, "banana");

        zoologico.add(camelo);
        zoologico.add(tubarao);
        zoologico.add(ursoDoCanada);
        zoologico.add(iguana);
        zoologico.add(leao);
        zoologico.add(micoLeao);

        for (Animal animal: zoologico) {
            System.out.println(animal.toString());
        }
    }
}
