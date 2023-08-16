import java.util.Scanner;

public class media_aritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float soma = 0;
        int totalNotas = 5;
        
        for (int i = 1; i <= totalNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            float nota = scanner.nextFloat();
            soma += nota;
        }
        
        float media = soma / totalNotas;
        System.out.println("Média aritmética das notas: " + media);
        
        scanner.close();
    }
}
