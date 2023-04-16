import java.io.IOException;

public class Atv005 {
    public static void main(String[] args) throws IOException {

        double gastosJaneiro = 30000;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;
        double gastosTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3;
        System.out.printf("O gasto trimestral deu R$%.2f\n",gastosTrimestral);
        System.out.printf("O media mensal deu R$%.2f",mediaMensal);
    }
}