package Aula02;
import javax.swing.JOptionPane;
/**
 * Exercício: Faça um programa em Java que leia N (no máximo 50) números inteiros positivos e armazene-os num vetor A. A partir dos dados do vetor A, gere dois outros vetores:
 * - Vetor B: só números pares;
 * - Vetor C: somente os números ímpares
 * @author Luciano
 */
public class Live02Ex01 {
    public static void main(String[] args) {
        int n;
        do {
          n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        } while (n < 0 || n > 50);
        int [] vetor = new int[n];
        int [] vetA = new int[n];
        int [] vetB = new int[n];
        int contA = 0, contB = 0;
        // entrada dos dados:
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição "+i));
            if (vetor [i]%2==0) {
                vetA[contA] = vetor[i];
                contA++;
            } else {
                vetB[contB] = vetor[i];
                contB++;
            }
        }
        // Mostrando:
        String mostra = "Vetor principal:\n";
        for (int i = 0; i < vetor.length; i++) {
            mostra+=vetor[i]+" ";
        }
        mostra+="\nVetor de pares:\n";
        for (int i = 0; i < contA; i++) {
            mostra+=vetA[i]+" ";
        }
        mostra+="\nVetor de impares:\n";
        for (int i = 0; i < contB; i++) {
            mostra+=vetB[i]+" ";
        }
        JOptionPane.showInputDialog(null, mostra);
    }
}
