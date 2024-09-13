package com.dani.cursojava.exercicios.estrutura.condicional;

import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o início do jogo: ");
        int inicio = sc.nextInt();
        System.out.println("Digite o fim do jogo: ");
        int fim = sc.nextInt();

        int duracao;

        if(inicio < fim){
            duracao = fim - inicio;
            System.out.printf("O jogo durou %d hora(s)", duracao);
        } else {
           duracao = 24 - inicio + fim;
           System.out.printf("O jogo durou %d hora(s)", duracao);
        }
        sc.close();

    }
}
