package org.example;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPlanoOperadora {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorPlanoBasico = 100.00;
        double valorMinutoExcedido = 2.00;
        int quantidaDeMinutos = sc.nextInt();
        double totalPagar;

        boolean minutosExcedePlano = quantidaDeMinutos > 100;

        if(minutosExcedePlano) {
            int minutosExcedidos = quantidaDeMinutos - 100;
            double totalMinutosExcedidos = minutosExcedidos * valorMinutoExcedido;
            totalPagar = totalMinutosExcedidos + valorPlanoBasico;
        } else {
            totalPagar = valorPlanoBasico;
        }

        System.out.printf("Valor a pagar: R$ %.2f", totalPagar);

        sc.close();
    }
}
