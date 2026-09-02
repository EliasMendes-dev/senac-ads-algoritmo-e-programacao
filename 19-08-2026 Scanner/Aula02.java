/* 19-08-2026 */

import java.time.LocalTime;
import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        String nome = scanner.nextLine();

        LocalTime agora = LocalTime.now();
        int hora = agora.getHour();
        String data;

        if (hora < 12) {
            data = "Bom dia!";
        } else if (hora < 18) {
            data = "Boa tarde!";
        } else {
            data = "Boa noite!";
        }

        System.out.println("Olá " + nome + ", "+ data );

        System.out.println("Informe o primeiro numero:");
        int numero1 = scanner.nextInt();

        System.out.println("Informe o segundo numero:");
        int numero2 = scanner.nextInt();

        scanner.close();

        int resultado = soma(numero1, numero2);

        System.out.println("Resultado: " + resultado);
    }

    public static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}