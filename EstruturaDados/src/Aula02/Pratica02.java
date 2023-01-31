package Aula02;
/**
 * Desenvolver um algoritmo que recebe 50 números reais em um vetor, para calcular e mostrar a média aritmética destes 50 números
 * @author Luciano
 */
import javax.swing.*;
public class Pratica02 {
    public static void main(String args[]) {
        double Num[], soma = 0, media = 0;
        Num = new double[50];
        int i;
        
        for (i = 0; i <= 49; i++) {
            Num[i] = Double.parseDouble(JOptionPane.showInputDialog (null,"Digite um número"));
            soma = soma + Num[i];            
        }
        media = soma / i; 
        
        System.out.println ("A soma das 50 notas digitadas eh: "+ soma);
        System.out.println ("A média das 50 notas digitadas eh: "+ media);
        System.exit(0);    
    }    
}
