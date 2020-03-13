package com.puc.devops;

public static class Calculo {

    private static double subtrair() {
        System.out.println("Subtraindo: " + a + "-" + b);
        return (a - b);
    }

    private static double somar() {
        System.out.println("Somando: " + a + "+" + b);
        return (a + b);
    }

    public static double dividir(double a, double b) {
        System.out.println("Dividindo: " + a + "/" + b);
        return (a / b);
    }

    public static double multiplicar(double a, double b) {
        System.out.println("Multiplicando: " + a + "x" + b);
        return (a * b);
    }

    public static double raiz(double a) {
        System.out.println("Raiz quadrada de: " + a);
        return Math.sqrt(a);
    }

    public static double potencia(double a, double b) {
        System.out.println("Potência: " + a + "elevado a " + b);
        return Math.pow(a,b);
    }

    public static double percentual(double a, double b) {
        System.out.println("Porcentagem: " + a + "% de " + b);
        return (a * b / 100);
    }

    public static double media(double a, double b) {
        System.out.println("Media entre: " + a + " e " + b);
        return (a+b) / 2;
    }
}