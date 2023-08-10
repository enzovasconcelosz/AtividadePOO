package Atividade1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("AAA12A3", 19999.99, 80.0, 100.0, "Gasolina", "Lancer Evo", "Mitsubishi", 350);
        Caminhao caminhao = new Caminhao("BBB12B3", 229000.99, 350.0, 60.0, "Diesel", "1113", "Mercedes", "Madeira", 8);
        Moto moto = new Moto("CCC12C3", 14999.99, 9, 90, "Gasolina", "Fazer", "Mitsubishi", 250);

        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Preço Fipe: " + carro.getTabelaFipe());
        System.out.println("Capacidade do tanque de combustível em litros: " + carro.getCapacidadeDoTaque());
        System.out.println("Velocidade atual em km/h: " + carro.getVelocidade());
        System.out.println("Tipo de combustível: " + carro.getCombustivel());
        System.out.println("Capacidade do porta malas em litros: " + carro.getCapacidadePortaMalas());


    }
}
