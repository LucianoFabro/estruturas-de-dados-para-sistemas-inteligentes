package Aula05_06_07;
import javax.swing.JOptionPane;
/**
 *
 * @author Luciano
 */
public class Fatorial {
    public static void main(String[] args) {
        int numero, fat;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if (numero>=0) {
            fat = fatorial(numero);
            JOptionPane.showMessageDialog(null, "Fatorial de "+numero+" = "+fat);
        } else {
            JOptionPane.showMessageDialog(null, "Numero invalido para fatorial");
        }
    }
    
    static int fatorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        else
            return num * fatorial (num-1);
    }
}
