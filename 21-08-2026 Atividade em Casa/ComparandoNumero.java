import java.util.Scanner;

class ComparandoNumero {
    @SuppressWarnings("ConvertToTryWithResources") // Para não ficar aparecendo aviso
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numeroum = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int numerodois = scanner.nextInt();

        if (numeroum > numerodois) {
            System.out.println("O primeiro número (" + numeroum + ") é maior que o segundo número (" + numerodois + ").");
        } else if (numerodois > numeroum) {
            System.out.println("O segundo número (" + numerodois + ") é maior que o primeiro número (" + numeroum + ").");
        } else {
            System.out.println("Os dois números são iguais: " + numeroum + " e " + numerodois + ".");
        }

        scanner.close();
    }
}