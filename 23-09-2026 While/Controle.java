import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int resp; // declara variavel de controle
        String nome;
        int idade;
        resp = 1; // inicializa a variavel de controle

        while (resp == 1) {
            System.out.println("Digite o seu nome:");
            nome = entrada.next();
            System.out.println("Digite sua idade:");
            idade = entrada.nextInt();

            if (idade >= 18) {
                System.out.println("Seu nome eh: " + nome);
            }

            System.out.println("Deseja continuar? (1/0):");
            resp = entrada.nextInt();
        }
        entrada.close();

    }
}