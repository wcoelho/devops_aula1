package com.puc.devops;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        String opcao = "";
        while (!opcao.equals("z")) {
            System.out.println("Bem vindo a Calculadora Van Gogh");
            System.out.println("Escolha a opcao desejada:");

            System.out.println("1 - Soma");
            System.out.println("2 - Adicao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");

            System.out.println("5 - Percentual");
            System.out.println("6 - Raiz quadrada");
            System.out.println("7 - Potencia");
            System.out.println("8 - Media");

            try {
                InputStreamReader in = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(in);
                opcao = br.readLine();
                System.out.println("Opcao escolhida foi: " + opcao);
            } catch (Exception e) {
                System.err.println("Opcao invalida");
            }

        }
    }

    private double Subtrai(double a, double b)
    {
        return calculo.somar(a, b);
    }

    private double Adiciona(double a, double b)
    {
        return calculo.somar(a, b);
    }
}
