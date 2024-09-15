package com.dani.cursojava.exercicios.estrutura.condicional;
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
// Codigo Especificação     Preço
//    1   Cachorro-Quente   R$ 4.00
//    2   X-Salada          R$ 4.50
//    3   X-Bacon           R$ 5.00
//    4   Torrada Simples   R$ 2.00
//    5   Refrigerante      R$ 1.50

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite o código do produto(1-5): ");
        int produto = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        double valor = 0;

        switch (produto) {
            case 1:
                valor = 4.0;
                break;
            case 2:
                valor = 4.50;
                break;
            case 3:
                valor = 5.0;
                break;
            case 4:
                valor = 2.0;
                break;
            case 5:
                valor = 1.50;
                break;
            default:
                System.out.println("Digite uma opção válida");
        }

        if(valor > 0){
            double total = valor * quantidade;
            System.out.printf("O valor a pagar é R$ %.2f\n", total);
        }


        sc.close();
    }
}
