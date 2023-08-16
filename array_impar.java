import java.util.Random;

public class array_impar {

    public static void main(String[] args) {
        int tamanhoArray = 100;
        int[] numeros = new int[tamanhoArray];

        preencherArrayAleatorio(numeros);
        
        System.out.println("Números ímpares do Array:");
        imprimirNumerosImpares(numeros);
    }

    public static void preencherArrayAleatorio(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); 
        }
    }

    public static void imprimirNumerosImpares(int[] array) {
        for (int numero : array) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}
