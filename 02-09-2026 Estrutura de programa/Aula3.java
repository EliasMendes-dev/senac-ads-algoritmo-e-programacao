/* José Elias Hermínio Mendes */

import java.util.Scanner;

class Aula3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Comentário de uma linha
        System.out.println("Olá Mundo");
        System.out.println("Minha idade é " + 24 + " anos.");
        System.out.println("O resultado é " + (3 + 5 <= 22));

        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
        exercicio5();
        exercicio6();
        exercicio7();
        exercicio8();
        exercicio9();
        exercicio10();
        exercicio11();
        exercicio12();
        exercicio13();

        scanner.close();
    }

    private static void exercicio1() {
        System.out.println("\nExercicio 1:");

        String nome = "José Elias Hermínio Mendes";
        System.out.println("Meu nome é " + nome);

        String ra = "06276916";
        System.out.println("Meu RA é " + ra);

        String curso = "Análise e Desenvolvimento de Sistemas";
        System.out.println("Meu curso é " + curso);
    }

    public enum StatusSala {
        PRESENTE,
        AUSENTE
    }

    private static void exercicio2() {
        System.out.println("\nExercicio 2:");

        int idade = 24;
        System.out.println("Minha idade é " + idade);

        double altura = 1.8;
        System.out.println("Minha altura é " + altura);

        StatusSala status = StatusSala.PRESENTE;
        System.out.println("Meu status de presença é " + status);
    }

    private static void exercicio3() {
        /*
         * Principais especificadores:
         * %d → números inteiros (int, long)
         * %f → números reais (ponto flutuante: float, double)
         * %s → strings
         * %c → caractere
         * %.2f → número decimal com 2 casas
         * %n → quebra de linha (equivalente a \n, mas independente do SO)
         */

        System.out.println("\nExercicio 3:");

        int numero = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", numero, i, numero * i);
        }
    }

    private static void exercicio4() {
        System.out.println("\nExercicio 4:");

        System.out.println("informe o primeiro número");
        int numeroum = scanner.nextInt();

        System.out.println("informe o segundo número");
        int numerodois = scanner.nextInt();

        System.out.println("Primeiro número informado: " + numeroum);
        System.out.println("Segundo número informado: " + numerodois);
    }

    private static void exercicio5() {
        System.out.println("\nExercicio 5:");

        System.out.println("informe o primeiro número");
        int numeroum = scanner.nextInt();

        System.out.println("informe o segundo número");
        int numerodois = scanner.nextInt();

        System.out.println("informe o terceiro número");
        int numerotres = scanner.nextInt();

        System.out.println("informe o quarto número");
        int numeroquatro = scanner.nextInt();

        System.out.println(
                "Soma dos números informados: " + (numeroum + numerodois + numerotres + numeroquatro)
        );
    }

    private static void exercicio6() {
        System.out.println("\nExercicio 6:");

        System.out.println("informe a primeira nota");
        double notaum = scanner.nextDouble();

        System.out.println("informe a segunda nota");
        double notadois = scanner.nextDouble();

        System.out.println("informe a terceira nota");
        double notatres = scanner.nextDouble();

        double media = (notaum + notadois + notatres) / 3;

        System.out.println("A média das notas é " + media);
    }

    private static void exercicio7() {
        System.out.println("\nExercicio 7:");

        System.out.println("O Resultado de (20 - 15)/2 é = " + (20 - 15) / 2);

        System.out.println("O Resultado de 2 ^ (5/20) + 30 / (15 ^ 2) é = " + Math.pow(2, 5.0 / 20.0) + 30.0 / Math.pow(15, 2));

        System.out.println("O Resultado de 35 / (6 + 2) é = " + 35 / (6 + 2));

        System.out.println("O Resultado de23 módulo 4 é = " + 23 % 4);
    }

    @SuppressWarnings("unused")
    private static void exercicio8() {
        System.out.println("\nExercicio 8:");

        /*
         * ((120 - 30) = (3 ˆ 30))
         * (não ((20 módulo 4)= 1) ou (9 != 9))
         * ((5 módulo 2 ) > 3)
         * (a = A)
         */

        System.out.println((120 - 30) == Math.pow(3, 30));

        System.out.println(!((20 % 4) == 1) || (9 != 9));

        System.out.println((5 % 2) > 3);

        System.out.println('a' == 'A');
    }

    private static void exercicio9() {
        System.out.println("\nExercicio 9:");

        final double notaum = 8.0;
        final double notadois = 7.5;
        final double notatres = 4.5;
        final double notaquatro = 9.0;

        double media = (notaum + notadois + notatres + notaquatro) / 4;

        System.out.println("A média das quatro notas é " + media);
    }

    private static void exercicio10() {
        System.out.println("\nExercicio 10:");

        double lado = 350.0;

        System.out.println(
                "A área do quadrado é "
                        + (lado * lado)
                        + " metros quadrados"
        );
    }

    private static void exercicio11() {
        System.out.println("\nExercicio 11:");

        final double pi = 3.14159;
        double raio = 5;

        System.out.println(
                "A área do circulo com raio 5 é "
                        + raio * raio * pi
        );
    }

    private static void exercicio12() {
        System.out.println("\nExercicio 12:");

        System.out.println("Informe seu ano de nascimento");
        int anonasc = scanner.nextInt();

        System.out.println("Informe o ano atual");
        int anoatual = scanner.nextInt();

        System.out.println("Sua idade é " + (anoatual - anonasc));

        System.out.println(
                "Sua idade daqui a 30 anos: "
                        + ((anoatual - anonasc) + 30)
        );
    }

    private static void exercicio13() {
        System.out.println("\nExercicio 13:");

        System.out.println("Informe um número");
        double numero = scanner.nextDouble();

        System.out.println(
                "O número elevado ao quadrado: "
                        + Math.pow(numero, 2)
        );

        System.out.println(
                "O número elevado ao cubo: "
                        + Math.pow(numero, 3)
        );

        System.out.println(
                "A raiz quadrada do número digitado: "
                        + Math.sqrt(numero)
        );

        System.out.println(
                "O número elevado a potência 10: "
                        + Math.pow(numero, 10)
        );
    }
}