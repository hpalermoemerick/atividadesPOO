* Importar a biblioteca Scanner
* Perguntar ao cliente qual classe deseja
* Se uma classe não tiver mais vagas, sugerir a troca de classe
* Se não tiver mais vagas, encerrar o código



Codigo Java:
~~~~~
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.io.IOException;
 
public class Atv008 {
    //aqui declaro as variaveis como globais
    static int num_assento = 0;
    static boolean[] poltronas = new boolean[10];

    public static void main(String[] args) throws IOException {    
        //defie todos os elementos pra falso
        Arrays.fill(poltronas,false);
        //código para o sistema funcionar
        while(true){
            String entrada = JOptionPane.showInputDialog("Por favor\nDigite 1 para Primeira Classe\nDigite 2 para Classe Economica");
            String resposta = "Cartao de embarque:\n";
            if(entrada.equals("1")){
                //coloca o passageiro na primeira classe
                resposta += verificaPoltrona(1);
                poltronas[num_assento] = true;
                resposta += "Primeira Classe";
                JOptionPane.showMessageDialog(null,resposta);
            }else if(entrada.equals("2")){
                //coloca o passageiro na classe economica
                resposta += verificaPoltrona(2);
                poltronas[num_assento] = true;
                resposta += "Classe Economica";
                JOptionPane.showMessageDialog(null,resposta);
            }else{
                //caso ele não escreva nenhuma das opções
                JOptionPane.showMessageDialog(null,"Digite apenas '1' ou '2'!");
            }
        }
    }

    //método que verifica se a poltrona já foi usada
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

    //método que exibe a mensagem que ão há mais vagas e sugere a troca
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
                //caso o passageiro aceite trocar de lugar
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
                //caso o passageiro não aceite trocar de lugar
                JOptionPane.showMessageDialog(null,"O proximo voo parte em 3 horas");
            }else{
                //caso ele não escreva nenhuma das opções
                JOptionPane.showMessageDialog(null,"Digite apenas 'sim' ou 'nao'!");
            }
        }
    }

    //método que realiza a troca dos assentos
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

~~~~~~
