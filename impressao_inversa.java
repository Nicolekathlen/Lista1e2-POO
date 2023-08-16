import java.util.Scanner;

public class impressao_inversa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros em sequência:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Entrada inicial em ordem inversa:");

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
