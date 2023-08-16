import java.util.Random;

public class array_par {

    public static void main(String[] args) {
        int tamanhoArray = 100;
        int[] numeros = new int[tamanhoArray];

        preencherArrayAleatorio(numeros);
        
        System.out.println("Números pares do Array:");
        imprimirNumerosPares(numeros);
    }

    public static void preencherArrayAleatorio(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); 
        }
    }

    public static void imprimirNumerosPares(int[] array) {
        int contador = 0;
        for (int numero : array) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                contador++;
                if (contador >= 100) {
                    break;
                }
            }
        }
        System.out.println();
    }
}
