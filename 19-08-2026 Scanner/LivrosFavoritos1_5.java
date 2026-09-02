import java.util.Scanner;

public class LivrosFavoritos1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esse algoritmo vai perguntar e mostrar meus 5 livros favoritos.\n");

        String[] livros = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i + 1) + "° livro:");
            livros[i] = scanner.nextLine();
        }

        System.out.println("\nSeus livros favoritos:");
        for (int i = 0; i < livros.length; i++) {
            System.out.println((i + 1) + "-) " + livros[i]);
        }

        scanner.close();
    }
}
