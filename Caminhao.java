package Atividade1;

public class Caminhao extends Veiculo {
    private String TipoDeCarga;
    private int Eixos;


    public Caminhao(String tipoDeCarga) {
        TipoDeCarga = tipoDeCarga;
    }

    public Caminhao(String placa, double tabelaFipe, double capacidadeDoTaque, double velocidade, String combustivel, String modelo, String marca, String tipoDeCarga, int eixos) {
        super(placa, tabelaFipe, capacidadeDoTaque, velocidade, combustivel, modelo, marca);
        Eixos = eixos;
        TipoDeCarga = tipoDeCarga;
    }

    public String getTipoDeCarga() {
        return TipoDeCarga;
    }

    public void setTipoDeCarga(String tipoDeCarga) {
        TipoDeCarga = tipoDeCarga;
    }
}
