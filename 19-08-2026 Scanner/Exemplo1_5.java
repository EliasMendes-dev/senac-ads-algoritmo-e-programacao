public class Exemplo1_5 {
    public static void main(String[] args) {
        System.out.println("Esse algoritmo vai listar meus 5 livros favoritos.\n");
        String[] livros = { "O Horror de Dunwich", "Dagon", "O Chamado de Cthulhu", "A pirâmide Vermelha", "O Trono de Fogo" };

        for (int i = 0; i < livros.length; i++) {
            System.out.println((i + 1) + "-) " + livros[i]);
        }
    }
}
