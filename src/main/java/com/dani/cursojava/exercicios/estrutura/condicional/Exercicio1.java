package com.dani.cursojava.exercicios.estrutura.condicional;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro,
// e depois dizer se este número é negativo ou não
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();

        if(numero > 0){
            System.out.printf("%d é positivo", numero);
        } else if (numero == 0) {
            System.out.println("O é um número neutro.");
        } else {
            System.out.printf("%d é negativo", numero);
        }
    }
}
