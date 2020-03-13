package com.puc.devops;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        String opcao = "";
        while (!opcao.equals("z")) {
            System.out.println("");
            System.out.println("================================== Bem vindo a Calculadora Van Gogh ===================================");
            System.out.println("Escolha a opcao desejada:");

            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");

            System.out.println("5 - Percentual");
            System.out.println("6 - Raiz quadrada");
            System.out.println("7 - Potencia");
            System.out.println("8 - Media");

            System.out.println("Aperte 'z' para sair");

            try {
                InputStreamReader in = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(in);
                opcao = br.readLine();
                executarOpcao(opcao);
            } catch (Exception e) {
                System.err.println("Opcao invalida");
            }

        }
    }

    private static void executarOpcao(String opcao) {
        switch (opcao) {
            case "1":
                try {
                    InputStreamReader in = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(in);

                    System.out.println("Digite primeiro numero: ");
                    String a = br.readLine();

                    System.out.println("Digite segundo numero: ");
                    String b = br.readLine();
                    double resultado = Calculo.somar(Double.parseDouble(a), Double.parseDouble(b));

                    System.out.println(" ");
                    System.out.println("O Resultado e: " + resultado);
                    System.out.println(" ");

                } catch (Exception e) {
                    System.err.println("Opcao invalida");
                }

                break;
            case "2":
                try {
                    InputStreamReader in = new InputStreamReader(System.in);
                    BufferedReader br = new BufferedReader(in);

                    System.out.println("Digite primeiro numero: ");
                    String a = br.readLine();

                    System.out.println("Digite segundo numero: ");
                    String b = br.readLine();
                    double resultado = Calculo.subtrair(Double.parseDouble(a), Double.parseDouble(b));

                    System.out.println(" ");
                    System.out.println("O Resultado e: " + resultado);
                    System.out.println(" ");

                } catch (Exception e) {
                    System.err.println("Opcao invalida");
                }

                break;

            default:
                System.err.println("Ainda nao implementado");
        }
    }
}
