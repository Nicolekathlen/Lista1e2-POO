import java.util.Scanner;

public class Calcular_area_trapezio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da base maior (em cm): ");
        float baseMaior = scanner.nextFloat();

        System.out.print("Digite o valor da base menor (em cm): ");
        float baseMenor = scanner.nextFloat();

        System.out.print("Digite o valor da altura (em cm): ");
        float altura = scanner.nextFloat();

        float area = calcularAreaTrapezio(baseMaior, baseMenor, altura);

        System.out.println("A área do trapézio em cm² é: " + area);

        scanner.close();
    }

    public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {
        if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0) {
            throw new IllegalArgumentException("As bases e a altura devem ser maiores que zero.");
        }
        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
