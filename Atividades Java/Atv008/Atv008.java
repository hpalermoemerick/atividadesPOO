import java.util.Arrays;
import javax.swing.JOptionPane;
import java.io.IOException;
 
public class Atv008 {
    static int num_assento = 0;
    static boolean[] poltronas = new boolean[10];

    public static void main(String[] args) throws IOException {    
        Arrays.fill(poltronas,false);
        while(true){
            String entrada = JOptionPane.showInputDialog("Por favor\nDigite 1 para Primeira Classe\nDigite 2 para Classe Economica");
            String resposta = "Cartao de embarque:\n";
            if(entrada.equals("1")){
                resposta += verificaPoltrona(1);
                poltronas[num_assento] = true;
                resposta += "Primeira Classe";
                JOptionPane.showMessageDialog(null,resposta);
            }else if(entrada.equals("2")){
                resposta += verificaPoltrona(2);
                poltronas[num_assento] = true;
                resposta += "Classe Economica";
                JOptionPane.showMessageDialog(null,resposta);
            }else{
                JOptionPane.showMessageDialog(null,"Digite apenas '1' ou '2'!");
            }
        }
    }

    public static String verificaPoltrona(int num){
        int assento = 0;
        int priCla = 0;
        int claEco = 0;
        if(num==1){
            for(int i=0; i<5; i++){
                if(!poltronas[i]){
                    num_assento = i;
                    assento = i+1;
                    break;
                }
                else
                priCla++;
            }

            if(priCla==5){
                exibirMensagem("primeira classe","classe economica");
            }
        }else{
            for(int i=5; i<10; i++){
                if(!poltronas[i]){
                    num_assento = i;
                    assento = i+1;
                    break;
                }
                else
                claEco++;
            }

            if(claEco==5)
            exibirMensagem("classe economica","primeira classe");
        }

        return "Num_Poltrona: "+assento+"\n";
    }

    public static void exibirMensagem(String atual, String troca) {
        int num_vagas = 10;
        for(int i=0; i<poltronas.length; i++){
            if(poltronas[i])
            num_vagas--;
        }
        if(num_vagas==0)
        JOptionPane.showMessageDialog(null,"Infelizmente, nao ha mais vagas sobrando!");
        else{
            JOptionPane.showMessageDialog(null,"A "+atual+" esta lotada!");
            String entrada = JOptionPane.showInputDialog("Aceita ficar na "+troca+"?\nEscreva 'sim' ou 'nao'");
            String resposta = "Cartao de embarque:\n";
            if(entrada.equals("sim")){
                if(atual.equals("primeira classe")){
                    resposta += mudarAssento(5,10);
                    resposta += "\nClasse Economica";
                    System.out.println(resposta);
                }
                else{
                    resposta += mudarAssento(0,5);
                    resposta += "\nPrimeira Classe";
                    System.out.println(resposta);
                }
                JOptionPane.showMessageDialog(null,resposta);
            }else if(entrada.equals("nao")){
                JOptionPane.showMessageDialog(null,"O proximo voo parte em 3 horas");
            }else{
                JOptionPane.showMessageDialog(null,"Digite apenas 'sim' ou 'nao'!");
            }
        }
    }

    public static String mudarAssento(int inicio, int fim) {
        int num = 0;
        for(int i=inicio; i<fim; i++){
            if(!poltronas[i]){
                num = i+1;
                poltronas[i] = true;
                break;
            }
        }
        System.out.println("Num_Poltrona: "+num+"\n");
        String resposta = "Num_Poltrona: "+num;
        return resposta;
    }

}