import java.util.Scanner;

public class LivrosFavoritos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esse algoritmo vai perguntar e mostrar meus 5 livros favoritos.\n");

        System.out.println("Informe o 1° livro:");
        String livro1 = scanner.nextLine();

        System.out.println("Informe o 2° livro:");
        String livro2 = scanner.nextLine();

        System.out.println("Informe o 3° livro:");
        String livro3 = scanner.nextLine();

        System.out.println("Informe o 4° livro:");
        String livro4 = scanner.nextLine();

        System.out.println("Informe o 5° livro:");
        String livro5 = scanner.nextLine();

        System.out.println("\nSeus livros favoritos:");

        System.out.println("1-) " + livro1);
        System.out.println("2-) " + livro2);
        System.out.println("3-) " + livro3);
        System.out.println("4-) " + livro4);
        System.out.println("5-) " + livro5);

        scanner.close();
    }
}