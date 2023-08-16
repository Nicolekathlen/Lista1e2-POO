import java.util.Random;

public class array_menor_maior {

    public static void main(String[] args) {
        int tamanhoArray = 100;
        int[] numeros = new int[tamanhoArray];

        preencherArrayAleatorio(numeros);

        System.out.println("Array de números:");
        imprimirArray(numeros);

        int maior = encontrarMaiorElemento(numeros);
        int menor = encontrarMenorElemento(numeros);

        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
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

    public static int encontrarMaiorElemento(int[] array) {
        int maior = array[0];
        for (int numero : array) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    public static int encontrarMenorElemento(int[] array) {
        int menor = array[0];
        for (int numero : array) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
}
