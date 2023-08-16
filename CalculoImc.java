import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso (em kg): ");
        float peso = scanner.nextFloat();

        System.out.print("Digite a sua altura (em metros): ");
        float altura = scanner.nextFloat();

        float imc = calcularIMC(peso, altura);

        System.out.println("O valor do seu IMC é: " + imc);

        scanner.close();
    }

    public static float calcularIMC(float peso, float altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }
}
