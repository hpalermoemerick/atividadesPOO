import java.io.IOException;
import java.util.Scanner;

public class Atv006 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        System.out.print("Informe o capital: ");
        double capital = ler.nextDouble();
        System.out.print("Informe o montante: ");
        double montante = ler.nextDouble();
        double meses = (montante - capital)/(capital * 0.05);
        String numMeses = String.format("%.0f",meses);
        System.out.println("Precisa-se de "+numMeses+" mes(es) para atingir o juros de 0.5% ao mes.");

    }
}
/**
 * 
 */