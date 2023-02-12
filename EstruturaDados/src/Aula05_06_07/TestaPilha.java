package Aula05_06_07;
import javax.swing.JOptionPane;

public class TestaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        int entrada;
        for (int i = 0; i < 5; i++) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
            pilha.empilhar(entrada);
        }
        pilha.mostrarPilha();
        int x = pilha.desempilhar();
        System.out.println("Desempilhado: "+x);
        pilha.elementoTopo();
    }    
}
