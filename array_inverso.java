import java.util.Random;
public class array_inverso {
    public static void main(String[] args) {
        int tamanhoArray = 100;
        int[] numeros = new int[tamanhoArray];

        preencherArrayAleatorio(numeros);
        
        System.out.println("Elementos do Array (ordem original):");
        imprimirArray(numeros);

        System.out.println("\nElementos do Array (ordem inversa):");
        imprimirArrayInversa(numeros);
    }

    public static void preencherArrayAleatorio(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); // Gera números inteiros aleatórios até 999
        }
    }

    public static void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static void imprimirArrayInversa(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
