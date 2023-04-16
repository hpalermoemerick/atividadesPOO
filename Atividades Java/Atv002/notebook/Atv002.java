import java.io.IOException;
import java.util.Scanner;

public class Atv002 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Informe um interiro: ");
        int b = ler.nextInt();
        System.out.print("Informe um interiro: ");
        int c = ler.nextInt();
        int a = b*c;
        System.out.printf("O produto entre %d e %d deu %d",b,c,a);
    }
}