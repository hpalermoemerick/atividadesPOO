import java.io.IOException;
import java.util.Scanner;

public class Atv001 {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        float soma = 0f;

        System.out.println("Quantos numeros deseja somar?");
        int num_argumentos = ler.nextInt();

        for(int i=1; i<=num_argumentos; i++){
            System.out.print("Numero "+i+": ");
            float num = ler.nextFloat();
            soma += num;
        }
        System.out.println("Soma = "+soma);
    }
    ler.close();
}