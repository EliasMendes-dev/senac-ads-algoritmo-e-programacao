import java.util.Scanner;

public class ExerciciosWhile {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
        exercicio9();

        scanner.close();
    }

    public static void exercicio1() {
        // Escreva um algoritmo que imprima a sequência do número 100 ao 200.

        int contador = 100;

        while (contador <= 200) {
            System.out.println(contador);
            contador++;
        }
    }

    public static void exercicio2() {
        // Faça um algoritmo que leia 10 números inteiros e diga quantos são pares e
        // quantos são ímpares.

        System.out.println("O algoritmo vai ler 10 números inteiros e dizer quantos são pares e quantos são ímpares.");

        int contador = 1;
        int contadorpar = 0;
        int contadorimpar = 0;

        while (contador <= 10) {
            System.out.println("Informe o " + contador + "° " + "número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contadorpar++;
            } else {
                contadorimpar++;
            }

            contador++;
        }

        System.out.println("Voce informou " + contadorpar + " números pares");
        System.out.println("Voce informou " + contadorimpar + " números impares");
    }

    public static void exercicio3() {
        // Construir um algoritmo que leia um número inteiro e imprime a sequência:
        // – 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024. . .
        // – enquanto o valor da sequência for menor ou igual ao número lido.

        int sequencia = 1;

        System.out.println(
                "Informe um número inteiro, enquanto o número for maior ou igual a sequência, a sequência continuará");
        int numero = scanner.nextInt();

        while (sequencia <= numero) {
            System.out.println(sequencia);
            sequencia *= 2;
        }

    }

    public static void exercicio4() {
        /* Faça um algoritmo que imprima a metade de cada número de 10 a 20. */

        int contador = 10;

        do {
            System.out.println("A metade de " + contador + " é " + contador / 2.0);
            contador++;
        } while (contador <= 20);
    }

    public static void exercicio5() {
        // Tabuada do cinco

        int contador = 1;

        do {
            System.out.println("5 X " + contador + " = " + contador * 5);
            contador++;

        } while (contador <= 10);
    }

    public static void exercicio6() {
        /*
         * Faça um algoritmo que leia dez números inteiros e positivos
         * – mostre o menor entre eles.
         */

        int contador = 1;
        int menor = 0;

        do {
            System.out.println("Informe o " + contador + "° número: ");
            int numero = scanner.nextInt();

            if (contador == 1) {
                menor = numero;
            } else if (numero < menor) {
                menor = numero;
            }

            contador++;

        } while (contador <= 10);

        System.out.println("O menor número é: " + menor);
    }

    public static void exercicio7() {
        /*
         * O IMC (índice de Massa Corporal) é uma medida do grau de obesidade de uma
         * pessoa.
         * Faça um algoritmo que leia a altura e o peso de 10 pessoas.
         * Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC
         * entre 18,5 e 24,9 que é considerado sem obesidade.
         * 
         * IMC = peso / altura**2
         */

        int contador = 1;
        int semobesidade = 0;

        do {
            System.out.println("Informe o peso da " + contador + "° pessoa: ");
            double peso = scanner.nextDouble();

            System.out.println("Informe a altura da " + contador + "° pessoa: ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                semobesidade++;
            }

            contador++;

        } while (contador <= 10);

        System.out.println("O número de pessoas sem obesidade é " + semobesidade);
    }

    public static void exercicio8() {
        /*
         * Faça um programa que:
         * leia duas notas de 5 alunos
         * Calcule e mostre a média aritmética de cada um deles;
         * Para cada nota lida:
         * A entrada de cada nota deve ser validada!
         * ou seja, o programa somente avança se a entrada da nota estiver entre 0 e 10.
         * caso contrário, solicite-a novamente.
         * Utilize o do..while para validar as notas.
         */

        int contador = 1;

        do {
            System.out.println(contador + "° Aluno");

            double nota1;

            do {
                System.out.println("Informe a 1° nota:");
                nota1 = scanner.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Informe uma nota entre 0 e 10.");
                }

            } while (nota1 < 0 || nota1 > 10);

            double nota2;

            do {
                System.out.println("Informe a 2° nota:");
                nota2 = scanner.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Informe uma nota entre 0 e 10.");
                }

            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;

            System.out.println("Média: " + media);

            contador++;

        } while (contador <= 5);
    }

    public static void exercicio9() {

        double valorTotal = 0;
        int continuar;

        // Cardápio formatado corretamente
        System.out.println("----- CARDÁPIO -----");
        System.out.println("100 - Cachorro Quente - R$ 1,20");
        System.out.println("101 - Bauru Simples   - R$ 1,30");
        System.out.println("102 - Bauru com Ovo   - R$ 1,50");
        System.out.println("103 - Hambúrguer      - R$ 1,20");
        System.out.println("104 - Cheeseburguer   - R$ 1,30");
        System.out.println("105 - Refrigerante    - R$ 1,00");
        System.out.println("--------------------\n");

        do {
            System.out.print("Informe o código do produto: ");
            int codigo = scanner.nextInt();

            double preco = 0;

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;
                case 101:
                    preco = 1.30;
                    break;
                case 102:
                    preco = 1.50;
                    break;
                case 103:
                    preco = 1.20;
                    break;
                case 104:
                    preco = 1.30;
                    break;
                case 105:
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.\n");
            }

            // Só processa a venda se um produto válido foi escolhido
            if (preco > 0) {
                System.out.print("Informe a quantidade: ");
                int quantidade = scanner.nextInt();

                double valorProduto = preco * quantidade;

                // Imprime com formatação de 2 casas decimais
                System.out.printf("Valor do produto: R$ %.2f\n", valorProduto);

                valorTotal += valorProduto;
            }

            System.out.println("\nDeseja continuar comprando?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.print("Opção: ");
            continuar = scanner.nextInt();

            System.out.println(); // Pula uma linha para deixar a tela limpa no próximo loop

        } while (continuar == 1);

        // Imprime o total com formatação de 2 casas decimais
        System.out.printf("Valor total da compra: R$ %.2f\n", valorTotal);

    }

}
