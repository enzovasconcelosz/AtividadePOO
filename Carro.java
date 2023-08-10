package Atividade1;

public class Carro extends Veiculo {
    private int CapacidadePortaMalas;

    public Carro(String placa, double tabelaFipe, double capacidadeDoTaque, double velocidade, String combustivel, String modelo, String marca, int capacidadePortaMalas) {
        super(placa, tabelaFipe, capacidadeDoTaque, velocidade, combustivel, modelo, marca);
        CapacidadePortaMalas = capacidadePortaMalas;
    }

    public double getCapacidadePortaMalas() {
        return CapacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        CapacidadePortaMalas = capacidadePortaMalas;
    }
}
