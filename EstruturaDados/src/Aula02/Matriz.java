package Aula02;
import javax.swing.JOptionPane;

/**
 * declarando uma matriz 3x2
 * @author Luciano
 */
public class Matriz {
    public static void main(String[] args) {
        // declarando uma matriz 3x2:
        int[][] matriz = new int[3][2];
        // preenchendo uma matriz 3x2:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = Integer.parseInt (JOptionPane.showInputDialog("Digite um numero para a posicao ["+i+"] ["+j+"]"));
            }
        }
        // Mostrando os valores da matriz:
        String mostra="Valores da matriz:\n";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                mostra+=matriz[i][j] + " ";
            }
            mostra += "\n";
            }
        JOptionPane.showMessageDialog(null, mostra);
        }
    }
