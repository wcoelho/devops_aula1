package com.puc.devops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        boolean exit = false;
        String opcao = "";
        while (!exit) {
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
                if(opcao.equals("z"))
                    exit = true;
                else
                    executarOpcao(opcao);
                    
            } catch (Exception e) {
                System.err.println("Opcao invalida");
            }

        }
    }

    private static void executarOpcao(String opcao) {

        String a = "0";
        String b = "0";
        double resultado = 0;

        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            System.out.println("Digite " + ((!opcao.equals("6"))? "o primeiro número " : "o número: "));
            a = br.readLine();

            if(!opcao.equals("6"))
            {
                System.out.println("Digite segundo numero: ");
                b = br.readLine();
            }            

        } catch (Exception e) {
            System.err.println("Opcao invalida");
        }
        switch (opcao) {
            case "1":
                resultado = Calculo.somar(Double.parseDouble(a), Double.parseDouble(b));
                break;
            case "2":
                resultado = Calculo.subtrair(Double.parseDouble(a), Double.parseDouble(b));
                break;
            case "3":
                resultado = Calculo.multiplicar(Double.parseDouble(a), Double.parseDouble(b));
                break;
            case "4":
                resultado = Calculo.dividir(Double.parseDouble(a), Double.parseDouble(b));
                break;
            case "5":
                resultado = Calculo.percentual(Double.parseDouble(a), Double.parseDouble(b));
                break;
            case "6":
                resultado = Calculo.raiz(Double.parseDouble(a));
                break;
            case "7":
                resultado = Calculo.potencia(Double.parseDouble(a), Double.parseDouble(b));
                break;
            case "8":
                resultado = Calculo.media(Double.parseDouble(a), Double.parseDouble(b));
                break;                   
            default:
                System.err.println("Ainda nao implementado");
        }
        
        System.out.println(" ");
        System.out.println("O Resultado e: " + resultado);
        System.out.println(" ");
    }
}
