package Aula02;
/**
 * Exercício com matriz utilizando a digitação de dados pelo usuário e repetição for
 * @author Luciano
 */
import javax.swing.*;
public class Exemplo02 {
    public static void main(String args []) {
        int MatSoma[][], a, b, soma = 0;
        MatSoma = new int[3][4];
        
        for (a = 0; a <= 2; a++) {
            for (b = 0; b <= 3; b++) {
                MatSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog ("Digite um valor inteiro"));
                soma = soma + MatSoma[a][b];
            }
        }
        System.out.println("A soma dos 12 valores digitados eh: " + soma);
        System.exit(0);
    }
}
