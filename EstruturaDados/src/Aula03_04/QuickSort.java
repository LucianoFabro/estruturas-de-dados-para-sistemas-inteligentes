package Aula03_04;
/**
 * Exercício de Quick Sort -> Troca de partição
 * @author Luciano
 */
public class QuickSort {
    public static void quicksort (int p, int q, int vetor[]) {
        int x;
        if (p < q) {
            x = particao (p, q, vetor);
            quicksort (p, x - 1, vetor);
            quicksort (x + 1, q, vetor);
        }
    }
public static int particao (int p, int q, int vetor[]){
    int j = p - 1;
    int temp, pivot = vetor[q];
    
    for (int i = p; i <= q; i++) {
        if (vetor[i] <= pivot) {
            j++;
            temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;            
        }
    }
    return j;
}
    public static void main(String[] args) {
        int numeros [] = {0, 8, -4, 16, -12, 17, 13, -9, 2, 11};
        System.out.println("Vetor sem ordenação:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]+" ");
        }
        quicksort (0,9, numeros); // chamada do método quicksort
            System.out.println("\nVetor ordenado:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print (numeros[i]+" ");
        }
    }
}
