package TrabalhoRicardo;

public class Veiculo {
    private String placa;
    private double tabelaFipe;
    private double capacidadeDoTaque;
    private double velocidadeAtual;
    private String combustivel;
    private String modelo;
    private String marca;
    public double aceleracao;

    public Veiculo() {
    }

    public Veiculo(String placa, double tabelaFipe,
                   double capacidadeDoTaque, double velocidadeAtual,
                   String combustivel, String modelo, String marca) {
        this.placa = placa;
        this.tabelaFipe = tabelaFipe;
        this.capacidadeDoTaque = capacidadeDoTaque;
        this.velocidadeAtual = velocidadeAtual;
        this.combustivel = combustivel;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void AcelerarCarro() {
        if(!(this.velocidadeAtual >= 300)) {
            this.velocidadeAtual += this.aceleracao;
            System.out.println("Chegamos a " + getVelocidadeAtual() + "km/h!");
        }
        else {
            System.out.println("Velocidade máxima atingida!");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getTabelaFipe() {
        return tabelaFipe;
    }

    public void setTabelaFipe(double tabelaFipe) {
        this.tabelaFipe = tabelaFipe;
    }

    public double getCapacidadeDoTaque() {
        return capacidadeDoTaque;
    }

    public void setCapacidadeDoTaque(double capacidadeDoTaque) {
        this.capacidadeDoTaque = capacidadeDoTaque;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
