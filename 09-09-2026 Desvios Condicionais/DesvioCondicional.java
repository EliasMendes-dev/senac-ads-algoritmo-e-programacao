import java.util.Scanner;

class DesvioCondicional {
    static Scanner scanner = new Scanner(System.in);

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        if (false) {
            exercicio1();
            exercicio2();
            exercicio3();
            exercicio4();
            exercicio5();
            exercicio7();
            exercicio8();
            exercicio9();
            exercicio10();
            exercicio11();
            exercicio12();
            exercicio13();
            desafio();
        }
        exercicio6();

        scanner.close();
    }

    public static void jogo() {

        System.out.print("Digite o número do Jogador 1 na fase 1. ");
        Double pontos = scanner.nextDouble();

        if (pontos >= 1000) {
            System.out.println("Parabéns! Você passou para a fase 2.");
        } else {
            System.out.println("Você não atingiu a pontuação necessária. Tente novamente.");
        }
        System.out.println("Siga para a próxima etapa. ");
    }

    private static void exercicio1() {
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 20) {
            System.out.println("O número " + numero + " é maior que 20!");
        } else if (numero < 20) {
            System.out.println("O número " + numero + " é menor que 20!");
        } else {
            System.out.println("O número informado é igual a 20!");
        }
    }

    private static void exercicio2() {
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }
    }

    private static void exercicio3() {
        System.out.print("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Informe o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("A diferença do maior número para o menor é " + (numero1 - numero2) + "!");
        } else if (numero2 > numero1) {
            System.out.println("A diferença do maior número para o menor é " + (numero2 - numero1) + "!");
        } else {
            System.out.println("Os números são iguais!");
        }
    }

    private static void exercicio4() {
        System.out.print("Informe o primeiro número flutuante (separado por vírgula): ");
        float numero1 = scanner.nextFloat();

        System.out.print("Informe o segundo número flutuante diferente do primeiro: ");
        float numero2 = scanner.nextFloat();

        if (numero1 > numero2) {
            System.out.println("Em ordem decrescente:\n" + numero1 + "\n" + numero2);
        } else if (numero2 > numero1) {
            System.out.println("Em ordem decrescente:\n" + numero2 + "\n" + numero1);
        } else {
            System.out.println("Os números precisam ser diferentes");
        }
    }

    private static void exercicio5() {
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }
    }

    private static void exercicio6() {

    }

    private static void exercicio7() {
        System.out.print("Informe seu salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Informe seus anos trabalhados na empresa: ");
        int anos_trabalhados = scanner.nextInt();

        if (anos_trabalhados >= 5) {
            double bonus = salario * 0.20;
            System.out.println("Bônus aplicado: 20%");
            System.out.println("Valor do bônus: R$ " + bonus);
            System.out.println("Salário anterior: R$ " + salario);
            System.out.println("Novo salário: R$ " + (salario + bonus));
        } else {
            double bonus = salario * 0.10;
            System.out.println("Bônus aplicado: 10%");
            System.out.println("Valor do bônus: R$ " + bonus);
            System.out.println("Salário anterior: R$ " + salario);
            System.out.println("Novo salário: R$ " + (salario + bonus));
        }
    }

    private static void exercicio8() {
        final String senha_conf = "R10p5";
        System.out.print("Informe sua senha: ");
        String senha = scanner.nextLine();

        if (senha.equals(senha_conf)) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");

        }
    }

    private static void exercicio9() {
        System.out.print("Informe seu salário bruto: ");
        double salario = scanner.nextDouble();

        System.out.print("Informe o valor da prestação: ");
        double prestacao = scanner.nextDouble();

        double salario_porcentagem30 = salario * 0.30;

        if (prestacao > salario_porcentagem30) {
            System.out.println("Empréstimo não pode ser concedido!");
        } else {
            System.out.println("Emprestimo de " + prestacao + " foi concedido!");
        }
    }

    private static void exercicio10() {
        System.out.print("Informe o 1° número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Informe o 2° número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Informe o 3° número: ");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("O maior número é: " + numero3);
        }
    }

    private static void exercicio11() {
        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 5) {
            System.out.println("Muito novo para nadar");
        } else if (idade >= 5 && idade <= 7) {
            System.out.println("infantilA");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("infantilB");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("juvenilA");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("juvenilB");
        } else {
            System.out.println("Sênior");
        }
    }

    private static void exercicio12() {
        System.out.print("Informe o seu salário para o calculo de desconto do INSS: ");
        int salario = scanner.nextInt();

        if (salario <= 600) {
            System.out.println("Isento");
        } else if (salario > 600 && salario <= 1200) {
            System.out.println("Desconto de 20%");
        } else if (salario > 1200 && salario <= 2000) {
            System.out.println("Desconto de 25%");
        } else {
            System.out.println("Desconto de 20%");
        }
    }

    private static void exercicio13() {
        System.out.println("Informe a operação básica desejada com o sinal correspondente a operação desejada: ");
        System.out.println("+ = Soma");
        System.out.println("- = Subtração");
        System.out.println("* = Multiplicação");
        System.out.println("/ = Divisão");

        char operacao = scanner.next().charAt(0);

        System.out.print("Informe o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (operacao == '+') {
            System.out.println("Resultado: " + (numero1 + numero2));

        } else if (operacao == '-') {
            System.out.println("Resultado: " + (numero1 - numero2));

        } else if (operacao == '*') {
            System.out.println("Resultado: " + (numero1 * numero2));

        } else if (operacao == '/') {
            if (numero2 <= 0) {
                System.out.println("Impossível dividir!");
            } else {
                System.out.println("Resultado: " + (numero1 / numero2));
            }

        } else {
            System.out.println("Sinal Inválido");
        }
    }

    private static void desafio() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe se possui um dos documentos oficiais para validação");
        System.out.println(
                "(e-Título com foto cadastrada, RG, Identidade Social, Passaporte, CNH, Certificado de Reservista, Carteira de Trabalho física, Carteira de categoria profissional reconhecida por lei)");
        System.out.println("1 - Possuo um dos documentos da lista");
        System.out.println("2 - Não possuo um dos documentos da lista");

        int opcao = scanner.nextInt();

        boolean possuiDocumento = (opcao == 1);

        System.out.println("\n--- RESULTADO DA AVALIAÇÃO ---");

        if (idade >= 16 && possuiDocumento) {
            if (idade >= 18 && idade <= 70) {
                System.out.println("Você está APTO a votar. Seu voto é OBRIGATÓRIO.");
            } else {
                System.out.println("Você está APTO a votar. Seu voto é FACULTATIVO.");
            }
        } else if (idade < 16) {
            System.out.println("Você NÃO ESTÁ APTO a votar. A idade mínima é 16 anos.");
        } else {
            System.out.println(
                    "Você NÃO ESTÁ APTO a votar nesta seção. É obrigatória a apresentação de um documento oficial válido com foto.");
        }

        scanner.close();
    }
}