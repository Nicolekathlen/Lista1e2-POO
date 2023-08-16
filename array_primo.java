import java.util.Random;

public class array_primo {

    public static void main(String[] args) {
        int tamanhoArray = 100;
        int[] numeros = new int[tamanhoArray];

        preencherArrayAleatorio(numeros);
        
        System.out.println("Números primos do Array:");
        imprimirNumerosPrimos(numeros);
    }

    public static void preencherArrayAleatorio(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); // Gera números inteiros aleatórios até 999
        }
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirNumerosPrimos(int[] array) {
        for (int numero : array) {
            if (isPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}
