package Aula03_04;
public class BubbleSort {
    public static void bolha (int numeros [])
    {
        final int n = numeros.length;
        int aux;
        
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-1-i; j++)
            {
                if (numeros[j] > numeros [j+1])
                {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        int numeros[] = {25,57,48,37,12,92,86,33};
        System.out.print("Vetor sem ordenacao: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]+" ");
            }
            bolha(numeros);
                System.out.print("\nVetor ordenado: ");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print(numeros[i] + " ");
                }
    }        
}
