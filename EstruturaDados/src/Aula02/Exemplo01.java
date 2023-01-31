package Aula02;
/**
 * @author Luciano
 * Objetivo é exercitar a digitação de números em um vetor utilizando o for
 */
import javax.swing.*;
public class Exemplo01 {
    public static void main(String[] args) {
        int VetSoma[] , i , soma = 0;
        VetSoma = new int [10];
        
        for (i = 0; i <= 9; i++) {
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
            soma = soma + VetSoma[i];
        }
        System.out.println("A soma dos 10 valores digitados e: " + soma);
        System.exit(0);
    }
}