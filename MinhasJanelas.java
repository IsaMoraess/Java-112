import javax.swing.JOptionPane;

public class MinhasJanelas {
    public void exemploGUI(){
    String aux1,aux2,saida;
    double consumo;

    aux1 = JOptionPane.showInputDialog("Quanto quilometros foram rodados?");
    aux2 = JOptionPane.showInputDialog("Quanto litros foram consumidos?");

    consumo = Double.parseDouble(aux1)/Double.parseDouble(aux2);
//Aqui, os valores inseridos pelo usuário (em aux1 e aux2) são convertidos de String para double usando Double.parseDouble(). Em seguida, o consumo é calculado dividindo os quilômetros rodados pelos litros consumidos.

    saida = String.format("Consumo = %.1f km/l",consumo);
//A variável saida recebe uma string formatada que mostra o consumo calculado com uma casa decimal, no formato "Consumo = X.X km/l".

    JOptionPane.showMessageDialog(null,saida);
    }
}