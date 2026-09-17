// Nome: José Elias Hermínio Mendes

import java.util.Scanner;

class SwitchCase {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();

        scanner.close();
    }

    public static void exercicio1() {
        System.out.println(
                "Informe um número entre 1 e 7 e imprima o dia da semana correspondente (assuma que 1 corresponde a Domingo):");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda-feira!");
                break;
            case 3:
                System.out.println("Terça-feira!");
                break;
            case 4:
                System.out.println("Quarta-feira!");
                break;
            case 5:
                System.out.println("Quinta-feira!");
                break;
            case 6:
                System.out.println("Sexta-feira!");
                break;
            case 7:
                System.out.println("Sábado!");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }
    }

    public static void exercicio2() {
        System.out.println(
                "Informe um número entre 1 e 12 e imprima o mês correspondente (assuma que 1 corresponde a Janeiro):");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Janeiro!");
                break;
            case 2:
                System.out.println("Fevereiro!");
                break;
            case 3:
                System.out.println("Março!");
                break;
            case 4:
                System.out.println("Abril!");
                break;
            case 5:
                System.out.println("Maio!");
                break;
            case 6:
                System.out.println("Junho!");
                break;
            case 7:
                System.out.println("Julho!");
                break;
            case 8:
                System.out.println("Agosto!");
                break;
            case 9:
                System.out.println("Setembro!");
                break;
            case 10:
                System.out.println("Outubro!");
                break;
            case 11:
                System.out.println("Novembro!");
                break;
            case 12:
                System.out.println("Dezembro!");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }
    }

    public static void exercicio3() {
        System.out.println(
                "O algoritmo vai ler o período em que o aluno estuda (M, V ou N):");

        String escolha = scanner.next().toUpperCase();

        switch (escolha) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Período inválido!");
                break;
        }
    }

    public static void exercicio4() {
        System.out.println("O funcionário receberá aumento de acordo com seu plano de trabalho.");

        System.out.println("Informe o plano de trabalho do funcionário (A, B ou C):");
        
        String plano = scanner.next().toUpperCase();

        System.out.println("Informe o salário atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        double aumento = 0.0;

        switch (plano) {
            case "A":
                aumento = salarioAtual * 0.10;
                break;
            case "B":
                aumento = salarioAtual * 0.15;
                break;
            case "C":
                aumento = salarioAtual * 0.20;
                break;
            default:
                System.out.println("Plano inválido!");
                return;
        }
        System.out.println("O aumento salarial será de: R$ " + String.format("%.2f", aumento));
    }

    public static void exercicio5() {
        System.out.println("O algoritmo vai pedir dois números");
        System.out.println("Informe o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Informe o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Os números digitados foram: " + num1 + " e " + num2);
        System.out.println("Informe a operação desejada (M, S, P ou D):");
        
        String operacao = scanner.next().toUpperCase();

        switch (operacao) {
            case "M":
                System.out.println("Média entre os números digitados:");
                System.out.println("A média é: " + (num1 + num2) / 2);
                break;
            case "S":
                System.out.println("Diferença do maior pelo menor");
                System.out.println("A diferença é: " + Math.abs(num1 - num2));
                break;
            case "P":
                System.out.println("Produto entre os números digitados!");
                System.out.println("O produto é: " + num1 * num2);
                break;
            case "D":
                System.out.println("Divisão do primeiro pelo segundo!");
                if (num2 != 0) {
                    System.out.println("O resultado da divisão é: " + num1 / num2);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    public static void exercicio6() {

        System.out.println("Dado o cardápio de uma lanchonete: ");
        System.out.println(
                "Código - Produto - Preço\n" +
                "100 - Cachorro Quente - R$ 1,20\n" +
                "101 - Bauru Simples - R$ 1,30\n" +
                "102 - Bauru com Ovo - R$ 1,50\n" +
                "103 - Hambúrguer - R$ 1,20\n" +
                "104 - Cheeseburguer - R$ 1,30\n" +
                "105 - Refrigerante - R$ 1,00");

        System.out.println("Informe o código do produto desejado:");
        int codigo = scanner.nextInt();

        System.out.println("Informe a quantidade desse produto desejada:");
        int quantidade = scanner.nextInt();
        
        double total = 0.0;

        switch (codigo) {
            case 100:
                System.out.println("Cachorro Quente - R$ 1,20");
                total = 1.20 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 101:
                System.out.println("Bauru Simples - R$ 1,30");
                total = 1.30 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 102:
                System.out.println("Bauru com Ovo - R$ 1,50");
                total = 1.50 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 103:
                System.out.println("Hambúrguer - R$ 1,20");
                total = 1.20 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 104:
                System.out.println("Cheeseburguer - R$ 1,30");
                total = 1.30 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            case 105:
                System.out.println("Refrigerante - R$ 1,00");
                total = 1.00 * quantidade;
                System.out.printf("Total: R$ %.2f%n", total);
                break;
            default:
                System.out.println("Código do produto inválido!");
                break;
        }
    }
}
