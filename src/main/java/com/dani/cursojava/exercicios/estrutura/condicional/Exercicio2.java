package com.dani.cursojava.exercicios.estrutura.condicional;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");

        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.printf("%d é par", n);
        }else {
            System.out.printf("%d é ímpar", n);
        }

        sc.close();
    }
}
