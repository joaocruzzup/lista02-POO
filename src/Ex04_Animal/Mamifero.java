package Ex04_Animal;

public class Mamifero extends Animal{
    private String alimento;
    public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimento) {
        super(nome, comprimento, cor, "terra", velocidade);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "[ nome= " + getNome() + '\'' +
                ", comprimento= " + getComprimento() +
                ", numPatas= " + getNumeroDePatas() +
                ", cor= " + getCor() + '\'' +
                ", ambiente= " + getAmbiente() + '\'' +
                ", alimento= " + getAlimento() +
                ", velocidade= " + getVelocidade() +
                "m/s ]";
    }
}
