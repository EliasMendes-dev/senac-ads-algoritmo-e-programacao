public class Somatorio {

    public static void main(String[] args) {
        int contador = 1;
        int acumulador = 0;

        while (contador < 100) {
            // adiciona o contador ao acumulador
            acumulador = acumulador + contador;
            contador++; // incrementa o contador
        }

        System.out.println("A soma eh " + acumulador);
    }
}