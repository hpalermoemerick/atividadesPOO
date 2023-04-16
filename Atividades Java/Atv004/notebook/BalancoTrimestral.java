import java.io.IOException;

public class BalancoTrimestral {
    public static void main(String[] args) throws IOException {

        double gastosJaneiro = 30000;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        double gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.printf("O gasto trimestral deu R$%.2f",gastosTrimestral);
    }
}