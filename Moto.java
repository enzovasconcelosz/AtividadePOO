package Atividade1;

public class Moto extends Veiculo {
    private int Cilindradas;

    public Moto(int cilindradas) {
        Cilindradas = cilindradas;
    }

    public Moto(String placa, double tabelaFipe, double capacidadeDoTaque, double velocidade, String combustivel, String modelo, String marca, int cilindradas) {
        super(placa, tabelaFipe, capacidadeDoTaque, velocidade, combustivel, modelo, marca);
        Cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return Cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        Cilindradas = cilindradas;
    }
}
