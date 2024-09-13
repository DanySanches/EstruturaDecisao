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
