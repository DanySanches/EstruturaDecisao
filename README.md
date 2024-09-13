# 📝 Exercícios de Estrutura Condicional em Java

Este repositório contém exercícios básicos que envolvem estruturas condicionais em Java. São pequenos programas para praticar os conceitos de lógica de programação usando if, else if e else. Cada exemplo é simples e direto, mas útil para iniciantes.

### 📚 Exercício 1: Verificar se um número é positivo, negativo ou neutro

### 🧐 Descrição 

Neste exercício, vamos criar um programa que lê um número inteiro digitado pelo usuário e informa se o número é positivo, negativo ou neutro (igual a zero).

### 📋 Exemplo de código

```java
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
        if(numero > 0){
            System.out.printf("%d é positivo", numero);
        } else if (numero == 0) {
            System.out.println("O número é neutro.");
        } else 
            System.out.printf("%d é negativo", numero);
        }
    }
}
```

### Exemplo de Saída:
- **Entrada:** -5 → Saída: -5 é negativo
- **Entrada:** 0 → Saída: O número é neutro.
- **Entrada:** 10 → Saída: 10 é positivo

### 📚 Exercício 2: Verificar se um número é par ou ímpar

### 🧐 Descrição

Neste exercício, criamos um programa que lê um número inteiro e informa se ele é par ou ímpar.

### 📋 Exemplo de código

```java
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.printf("%d é par", n);
        } else {
            System.out.printf("%d é ímpar", n);
        }

        sc.close();
    }
}
```

### Exemplo de Saída:
- **Entrada:** 4 → Saída: 4 é par
- **Entrada:** 7 → Saída: 7 é ímpar


### 📚 Exercício 3: Verificar se dois números são múltiplos

### 🧐 Descrição

Neste exercício, criamos um programa que lê dois números inteiros e verifica se eles são múltiplos entre si. O programa aceita os números em qualquer ordem (crescente ou decrescente).

### 📋 Exemplo de código

```java
import java.util.Scanner;

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

```

### Exemplo de Saída:

- **Entrada:** 6 e 3 → Saída: 6 e 3 são múltiplos
- **Entrada:** 8 e 5 → Saída: 8 e 5 não são múltiplos

 ### 📚 Exercício 4: Calcular a duração de um jogo
 
### 🧐 Descrição

Neste exercício, criamos um programa que lê a hora de início e a hora de término de um jogo e calcula a sua duração. O jogo pode começar em um dia e terminar no outro, com uma duração mínima de 1 hora e máxima de 24 horas.

### 📋 Exemplo de código

```java
import java.util.Scanner;

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
```

### Exemplo de Saída:
- **Entrada:** 10 (início) e 14 (fim) → Saída: O jogo durou 4 hora(s)
- **Entrada:** 22 (início) e 4 (fim) → Saída: O jogo durou 6 hora(s)
