package Aula02;
import javax.swing.JOptionPane;
/**
 *
 * @author Luciano
 */
public class Live02Ex02 {
    public static void main(String[] args) {
        int matriz[][] = new int [3][2];
        int mult=1;
        // entrada: 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posicao ["+i+"] ["+j+"]"));
                mult*=matriz[i][j];
            }
        }
        String mostra="Valores da Matriz:\n";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                mostra+=matriz[i][j]+" ";
            }
            mostra+="\n";
        }
        mostra+="Resultado da multiplicacao: "+mult;
        JOptionPane.showMessageDialog(null,mostra);
    }
}