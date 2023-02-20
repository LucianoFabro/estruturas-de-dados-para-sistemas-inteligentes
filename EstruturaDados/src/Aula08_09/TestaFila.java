package Aula08_09;

import javax.swing.JOptionPane;

 class TestaFila {
     public static void main(String[] args) {
         Fila fila = new Fila(5);
         int entrada;
         for (int i = 0; i <= 5; i++) {
             entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
             fila.enfileirar(entrada);
         }
         JOptionPane.showMessageDialog(null,"Desenfileirado: " + fila.desinfileirar());
         fila.enfileirar(500);
         fila.elementoInicio();
         fila.mostrarFila();
     }
    
}
