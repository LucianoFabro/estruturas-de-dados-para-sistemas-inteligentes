
package Aula05_06_07;

/**
 *
 * @author Luciano
 */
public class Pilha {
    // atributos de pilha:
    int tamanho;
    int topo;
    int vetor[];
    // contrutor:
    public Pilha(int tam) {
        topo = -1;
        tamanho = tam;
        vetor = new int[tam];
    }
    // métodos:
    public boolean pilhaVazia() {
        // return topo==-1;
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean pilhaCheia() {
        return topo >=tamanho-1;
        /* if (topo>=tamanho-1)
                return true;
            else
                return false;
        */
    }
    public void empilhar(int elemento) {
        if (!pilhaCheia()) {
            topo++;
            vetor[topo]=elemento;
        } else {
            System.out.println("Pilha Cheia");
        }
    }
    public int desempilhar() {
        int desempilhado = 0;
        if(pilhaVazia()) {
            System.out.println("Pilha vazia");
        } else {
            desempilhado = vetor[topo];
            topo--;
        }
        return desempilhado;
    }
    public void elementoTopo() {
        if(!pilhaVazia()) {
            System.out.println("O elemento do topo e "+vetor[topo]);
        } else {
            System.out.println("Pilha vazia!");
        }
    }
    public void mostrarPilha() {
        for (int i = topo; i>=0; i--) {
            System.out.println("Elemento " + vetor[i] + " posicao "+i+" da pilha");
        }
    }
}
