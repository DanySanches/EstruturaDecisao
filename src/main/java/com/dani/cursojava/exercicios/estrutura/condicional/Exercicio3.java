package com.dani.cursojava.exercicios.estrutura.condicional;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int A = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int B = sc.nextInt();

        if(A % B == 0 || B % A == 0){
            System.out.printf("%d e %d são múltiplos", A, B);
        } else {
            System.out.printf("%d e %d não são múltiplos", A, B);
        }

        sc.close();
    }
}
