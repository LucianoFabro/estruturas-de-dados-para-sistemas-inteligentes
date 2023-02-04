package Aula02;
/**
 * exercício de par ou impar
 * @author Luciano
 */
import javax.swing.*;
public class ExemploVetor {
    public static void main(String[] args) {
        int veta[] = new int[10];
        for (int i = 0; i < veta.length; i++) {
            veta[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o numero inteiro"));
        }
        for (int i = 0; i < veta.length; i++) {
            if (veta[i] % 2 == 0) {
                System.out.println(veta[i] + " eh par");
            } else {
                System.out.println(veta[i] + " eh impar");            
            }
        }
    }    
}