package Atividade1;

public class Veiculo {
    private String Placa;
    private double TabelaFipe;
    private double CapacidadeDoTaque;
    private double Velocidade;
    private String Combustivel;
    private String Modelo;
    private String Marca;

    public Veiculo() {
    }

    public Veiculo(String placa, double tabelaFipe, double capacidadeDoTaque, double velocidade, String combustivel, String modelo, String marca) {
        Placa = placa;
        TabelaFipe = tabelaFipe;
        CapacidadeDoTaque = capacidadeDoTaque;
        Velocidade = velocidade;
        Combustivel = combustivel;
        Modelo = modelo;
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public void setCombustivel(String combustivel) {
        Combustivel = combustivel;
    }

    public double getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(double velocidade) {
        Velocidade = velocidade;
    }

    public double getCapacidadeDoTaque() {
        return CapacidadeDoTaque;
    }

    public void setCapacidadeDoTaque(double capacidadeDoTaque) {
        CapacidadeDoTaque = capacidadeDoTaque;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public double getTabelaFipe() {
        return TabelaFipe;
    }

    public void setTabelaFipe(double tabelaFipe) {
        TabelaFipe = tabelaFipe;
    }

}
