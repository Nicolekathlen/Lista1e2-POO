import java.util.Random;

public class array_aritimetica {

    public static void main(String[] args) {
        int tamanhoArray = 100;
        int[] numeros = new int[tamanhoArray];

        preencherArrayAleatorio(numeros);

        System.out.println("Array de números:");
        imprimirArray(numeros);

        float media = calcularMediaAritmetica(numeros);
        System.out.println("Média aritmética: " + media);
    }

    public static void preencherArrayAleatorio(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    public static void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static float calcularMediaAritmetica(int[] array) {
        float soma = 0;
        for (int numero : array) {
            soma += numero;
        }
        return soma / array.length;
    }
}
