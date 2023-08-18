package TrabalhoRicardo;

public class Caminhao extends Veiculo {
    private String TipoDeCarga;
    private int Eixos;


    public Caminhao(String tipoDeCarga) {
        TipoDeCarga = tipoDeCarga;
    }

    public Caminhao(String placa3, double tabelaFipe3, double capacidadeDoTaque2, double velocidade2, String combustivel3, String modelo3, String marca3, String tipoDeCarga, int eixos) {
        super(placa3, tabelaFipe3, capacidadeDoTaque2, velocidade2, combustivel3, modelo3, marca3);
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
