package Aula08_09;

public class Fila {
    private int tamanho, inicio, fim, total;
    int vetor[];
    // contrutos:
    public Fila(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new int [tam];        
    }
    // métodos:
    public boolean filaVazia(){
        // return total==0;
        if (total==0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean filaCheia() {
        return total>=tamanho;
        /*
        if (total>=tamanho;
            return true;
        else
            return false;
        */
    }
    public void enfileirar(int elemento) {
        if (!filaCheia()) {
            vetor[fim] = elemento;
            fim++;
            total++;
            if (fim >= tamanho) {
                fim = 0;
            }                
        } else {
            System.out.print("Fila cheia!\n");
        }
    }
    public int desinfileirar() {
        int desinfileirado = 0;
        if (!filaVazia()) {
            desinfileirado = vetor[inicio];
            inicio++;
            total--;
            if (inicio>=tamanho) {
                inicio = 0;
            } 
        } else {
            System.out.println("Fila Vazia!");
        }
        return desinfileirado;
    }
    public void elementoInicio() {
        if(!filaVazia()) {
            System.out.println("O primeiro elemento eh "+vetor[inicio] +" que esta na posicao " + inicio);
        } else {
            System.out.println("Fila vazia!");
        }
    }
    public void mostrarFila() {
        int i, aux;
        aux = inicio;
        for (i = 1; i <= total; i++) {
            System.out.println("Elemento "+vetor[aux]+ " posicao "+aux);
            aux++;
            if (aux>=tamanho) {
                aux = 0;
            }
        }
    }
}
