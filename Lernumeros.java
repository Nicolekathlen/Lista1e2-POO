import java.util.Scanner;

public class Lernumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        System.out.print("Digite um número long: ");
        long numeroLong = scanner.nextLong();

        System.out.print("Digite um número float: ");
        float numeroFloat = scanner.nextFloat();

        System.out.printf("O número inteiro digitado foi %d, o número long digitado foi %d e o número float foi %.2f.\n",
                numeroInteiro, numeroLong, numeroFloat);

        scanner.close();
    }
}
