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

### 📚 Exercício 5: Calcular o valor de um pedido em uma lanchonete

### 🧐 Descrição

Neste exercício, criamos um programa que lê o código de um item do menu de uma lanchonete e a quantidade solicitada. O programa calcula o valor total a ser pago com base nos preços dos itens.

Tabela de preços:

- 1: Cachorro-Quente → R$ 4.00
- 2: X-Salada → R$ 4.50
- 3: X-Bacon → R$ 5.00
- 4: Torrada Simples → R$ 2.00
- 5: Refrigerante → R$ 1.50

### 📋 Exemplo de código

```java
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
```

### Exemplo de Saída:
- **Entrada:** 1 (Cachorro-Quente) e 2 (quantidade) → Saída: O valor a pagar é R$ 8.00
- **Entrada:** 3 (X-Bacon) e 1 (quantidade) → Saída: O valor a pagar é R$ 5.00

## 📚 Exercício 6: Verificar em qual intervalo um valor se encontra

### 🧐 Descrição

Neste exercício, criamos um programa que lê um valor e informa em qual dos seguintes **intervalos** o valor se encontra:
- `[0,25]`
- `(25,50]`
- `(50,75]`
- `(75,100]`

Se o valor não estiver em nenhum desses intervalos, o programa exibirá a mensagem "Fora de intervalo".

### 📋 Exemplo de código

```java
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25.00 && valor <= 50.00) {
            System.out.println("Intervalo [25,50]");
        } else if (valor > 50.00 && valor <= 75.00) {
            System.out.println("Intervalo [50,75]");
        } else if (valor > 75.00 && valor <= 100.00) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }

        sc.close();
    }
}


Aqui está a continuação do README.md com o exercício 6 adicionado:

md
Copiar código
# 📝 Exercícios de Estrutura Condicional em Java

Este repositório contém exercícios básicos que envolvem estruturas condicionais em Java. São pequenos programas para praticar os conceitos de lógica de programação usando `if`, `else if` e `else`. Cada exemplo é simples e direto, mas útil para iniciantes.

## 📚 Exercício 1: Verificar se um número é positivo, negativo ou neutro
...(continua com os exercícios anteriores)...

---

## 📚 Exercício 6: Verificar em qual intervalo um valor se encontra

### 🧐 Descrição

Neste exercício, criamos um programa que lê um valor e informa em qual dos seguintes **intervalos** o valor se encontra:
- `[0,25]`
- `(25,50]`
- `(50,75]`
- `(75,100]`

Se o valor não estiver em nenhum desses intervalos, o programa exibirá a mensagem "Fora de intervalo".

### 📋 Exemplo de código

```java
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor:");
        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25.00 && valor <= 50.00) {
            System.out.println("Intervalo [25,50]");
        } else if (valor > 50.00 && valor <= 75.00) {
            System.out.println("Intervalo [50,75]");
        } else if (valor > 75.00 && valor <= 100.00) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }

        sc.close();
    }
}
```

## Exemplo de Saída:
- **Entrada:** `23.5` → Saída: Intervalo `[0,25]`
- **Entrada:**  `76.3` → Saída: Intervalo `[75,100]`
- **Entrada:** `105.0` → Saída: `Fora do intervalo`
