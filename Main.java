package Atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Placa do Carro: ");
        String placa = scanner.next();
        System.out.print("FIPE: R$");
        double tabelaFipe = scanner.nextDouble();
        System.out.print("Capacidade do Tanque(l): ");
        double capacidadeTanque = scanner.nextDouble();
        System.out.print("Velocidade Atual: ");
        double velocidadeAtual = scanner.nextDouble();
        System.out.print("Combustível: ");
        String combustivel = scanner.next();
        System.out.print("Modelo: ");
        String modelo = scanner.next();
        System.out.print("Marca: ");
        String marca = scanner.next();
        System.out.print("Capacidade do Porta Malas (l): ");
        int capacidadePortaMalas = scanner.nextInt();

        Carro carro = new Carro(placa, tabelaFipe, capacidadeTanque,
                velocidadeAtual, combustivel, modelo, marca, capacidadePortaMalas);

        do {
            System.out.println("Menu de Seleção de funcionalidades");
            System.out.println("1. Acelerar o carro");
            System.out.println("0. Sair");
            System.out.print("Digite o valor referente a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Em km/h, digite o valor da aceleracao: ");
                    carro.Aceleracao = scanner.nextDouble();
                    carro.AcelerarCarro();
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }
}
