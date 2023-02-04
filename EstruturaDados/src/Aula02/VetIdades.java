package Aula02;
/**
 *
 * @author Luciano
 */
import javax.swing.*;
public class VetIdades {
    public static void main(String[] args) {
        int idades[] = new int[6];
        String respostas[] = {"SIM", "sim"};
        for (int i = 0; i < 6; i++){
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite as idades"));
            if (i!=5) {
                String pergunta = JOptionPane.showInputDialog("Deseja continuar?");
                if(!(pergunta.equals(respostas[0]) || pergunta.equals(respostas[1]))) {
                    break;
                }
            }
        }
        System.out.println("Exibindo os resultados: ");
        for (int i = 0; i < idades.length; i++) {
            int posicao = i + 1;
            System.out.println(posicao + ".a idade --> " + idades[i]);
        }
    }    
}
