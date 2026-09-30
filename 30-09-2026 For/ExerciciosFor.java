import java.util.Scanner;

class ExerciciosFor {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercicio5();
        exercicio6();
        exercicio7();

        if (false) {
            exercicio1();
            exercicio2();
            exercicio3();
            exercicio4();
        }

        scanner.close();
    }

    public static void exercicio1() {
        // Exercício 1 - Faça um programa que imprima a seguinte sequência: 100, 99, 98,
        // . . . 1.
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void exercicio2() {
        // Exercício 2 - Faça um algoritmo que apresente na tela os quadrados dos
        // números inteiros de 15 a 100.
        // Exemplo: O quadrado de 15 é 225, O quadrado de 16 é 256, O quadrado de 100 é
        // 10000
        for (int i = 15; i <= 100; i++) {
            System.out.println("O quadrado de " + i + " é " + (i * i));
        }

    }

    public static void exercicio3() {
        // Exercício 3 - Ler um número inteiro e imprimir na tela a sequência de números
        // que vai do número 1 até o número lido.
        // – Exemplo: Digite um número: 8 ; Sequência: 1 2 3 4 5 6 7 8.
        System.out.println("Informe um numero inteiro e o sistema vai imprimir do 1 até o número informado");
        int numero = scanner.nextInt();

        System.out.println("Sequência: ");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }

    public static void exercicio4() {
        // Exercício 4
        // Faça um algoritmo que receba a idade e a altura de 10 pessoas:
        // – calcule e mostre a média das alturas daquelas com mais de 50 anos.
        int totalPessoas = 10;
        double somaAlturas = 0.0;
        int contadorPessoasMaisDe50 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ", informe sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Pessoa " + i + ", informe sua altura (em metros): ");
            double altura = scanner.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contadorPessoasMaisDe50++;
            }
        }

        if (contadorPessoasMaisDe50 > 0) {
            double mediaAlturas = somaAlturas / contadorPessoasMaisDe50;
            System.out.printf("A média das alturas das pessoas com mais de 50 anos é: %.2f metros.%n", mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada.");
        }
    }

    public static void exercicio5() {
        // Exercício 5
        // Faça um algoritmo que receba duas notas de 6 alunos, calcule e mostre:
        // a) A média aritmética das duas notas de cada aluno;
        // b) Forneça a seguinte mensagem de acordo com a nota:
        // ¨ REPROVADO se média é menor ou igual a 3.
        // ¨ EXAME se média é acima de 3 e menor que 7.
        // ¨ APROVADO maior ou igual a 7
        // c) O total de alunos aprovados.
        // d) O total de alunos de exame.
        // e) O total de alunos reprovados.
        // f) A média da classe.

        int totalAlunos = 6;
        int totalAprovados = 0;
        int totalExame = 0;
        int totalReprovados = 0;
        double somaMedias = 0;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Aluno " + i + ", informe a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.println("Aluno " + i + ", informe a segunda nota: ");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.printf("A média do aluno %d é: %.2f%n", i, media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                totalReprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                totalExame++;
            } else {
                System.out.println("APROVADO");
                totalAprovados++;
            }
        }

        double mediaClasse = somaMedias / totalAlunos;

        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Total de alunos de exame: " + totalExame);
        System.out.println("Total de alunos reprovados: " + totalReprovados);
        System.out.printf("Média da classe: %.2f%n", mediaClasse);
    }

    public static void exercicio6() {
        // Exercício 6
        // Em uma eleição presidencial, existem quatro candidatos.
        // Os votos são informados através de um código: 1, 2, 3 ou 4 - Voto para o
        // respectivo candidato
        // 5 - Voto nulo
        // 6 - Voto em branco
        // Faça um algoritmo que leia o voto de 10 eleitores.
        // Calcule e mostre:
        // ¨ a) O total de votos para cada candidato;
        // ¨ b) O total de votos nulos;
        // ¨ c) O total de votos em branco;
        // ¨ d) O percentual dos votos brancos e nulos.

        System.out.println("Vote 1 para Candidato 1");
        System.out.println("Vote 2 para Candidato 2");
        System.out.println("Vote 3 para Candidato 3");
        System.out.println("Vote 4 para Candidato 4");
        System.out.println("Vote 5 para Voto Nulo");
        System.out.println("Vote 6 para Voto em branco");

        int numeroEleitores = 10;
        int contagemCandidato1 = 0;
        int contagemCandidato2 = 0;
        int contagemCandidato3 = 0;
        int contagemCandidato4 = 0;
        int contagemNulo = 0;
        int contagemEmBranco = 0;

        for (int i = 1; i <= numeroEleitores; i++) {
            System.out.printf("Eleitor %d, digite seu voto: ", i);
            int voto = scanner.nextInt();

            switch (voto) {
                case 1 -> contagemCandidato1++;
                case 2 -> contagemCandidato2++;
                case 3 -> contagemCandidato3++;
                case 4 -> contagemCandidato4++;
                case 5 -> contagemNulo++;
                case 6 -> contagemEmBranco++;
                default -> System.out.println("Voto inválido!");
            }
        }

        int totalVotos = contagemCandidato1 + contagemCandidato2 + contagemCandidato3 + contagemCandidato4
                + contagemNulo + contagemEmBranco;
        double percentualBrancosENulos = ((double) (contagemNulo + contagemEmBranco) / totalVotos) * 100;

        System.out.println("Resultado da votação:");
        System.out.println("Candidato 1: " + contagemCandidato1 + " votos");
        System.out.println("Candidato 2: " + contagemCandidato2 + " votos");
        System.out.println("Candidato 3: " + contagemCandidato3 + " votos");
        System.out.println("Candidato 4: " + contagemCandidato4 + " votos");
        System.out.println("Votos nulos: " + contagemNulo);
        System.out.println("Votos em branco: " + contagemEmBranco);
        System.out.printf("Percentual de votos brancos e nulos: %.2f%%%n", percentualBrancosENulos);
    }

    public static void exercicio7() {
        // Exercício 7
        // Faça um algoritmo que receba a idade, a altura e o peso de 10 pessoas,
        // calcule e mostre:
        // a) A quantidade de pessoas maiores de 50 anos.
        // b) A média das alturas das pessoas com idade entre 10 e 20 anos.
        // c) A porcentagem de pessoas com peso inferior a 40 quilos.

        int totalPessoas = 10;
        int pessoasMaisDe50 = 0;
        double somaAlturasEntre10e20 = 0;
        int contadorEntre10e20 = 0;
        int pessoasPesoMenor40 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.printf("Pessoa %d, informe sua idade: ", i);
            int idade = scanner.nextInt();

            System.out.printf("Pessoa %d, informe sua altura (em metros): ", i);
            double altura = scanner.nextDouble();

            System.out.printf("Pessoa %d, informe seu peso (em quilos): ", i);
            double peso = scanner.nextDouble();

            if (idade > 50) {
                pessoasMaisDe50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturasEntre10e20 += altura;
                contadorEntre10e20++;
            }

            if (peso < 40) {
                pessoasPesoMenor40++;
            }
        }

        double mediaAlturasEntre10e20 = (contadorEntre10e20 > 0) ? somaAlturasEntre10e20 / contadorEntre10e20 : 0;
        double percentualPesoMenor40 = ((double) pessoasPesoMenor40 / totalPessoas) * 100;

        System.out.println("Resultados:");
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + pessoasMaisDe50);
        System.out.printf("Média das alturas das pessoas com idade entre 10 e 20 anos: %.2f metros%n",
                mediaAlturasEntre10e20);
        System.out.printf("Percentual de pessoas com peso inferior a 40 quilos: %.2f%%%n", percentualPesoMenor40);
    }
}