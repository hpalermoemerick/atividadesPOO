import javax.swing.JOptionPane;
import java.io.IOException;

public class Atv003 {
    public static void main(String[] args) throws IOException {

        String entrada = JOptionPane.showInputDialog("Nota 1: ");
        double nota1 = Double.parseDouble(entrada);
        entrada = JOptionPane.showInputDialog("Nota 2: ");
        double nota2 = Double.parseDouble(entrada);
        double media = (nota1 + nota2)/2;
        String mediaFormatada = String.format("%.2f",media);
        String resposta = "A media das nota e "+mediaFormatada;
        JOptionPane.showMessageDialog(null,resposta);
    }
}