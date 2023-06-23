package Ex04_Animal;

public class Peixe extends Animal{
    private String caracteristicas;

    public Peixe(String nome, double comprimento, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, cor, ambiente, velocidade);
        this.caracteristicas = "barbatanas e caudas";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "[ nome= " + getNome() + '\'' +
                ", comprimento= " + getComprimento() +
                ", numPatas= " + getNumeroDePatas() +
                ", cor= " + getCor() + '\'' +
                ", ambiente= " + getAmbiente() + '\'' +
                ", caracteristicas= " + getCaracteristicas() +
                ", velocidade= " + getVelocidade() +
                "m/s ]";
    }

}
