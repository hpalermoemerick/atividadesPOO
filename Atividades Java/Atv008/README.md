

Codigo Java:
~~~~~
import java.util.Scanner; // import do Scanner

public class Atv8 {
   public static void main(String[] args) {
    int j = 0;                                                  //}
    int i = 0;                                                  //}
    String mudar;                                               //}--> Criação das variaveis usadas no codigo
    boolean[] PriClass = {false, false, false, false, false};   //}
    boolean[] EcoClass = {false, false, false, false, false};   //}
    Scanner ler = new Scanner(System.in); // Criação do Scanner
    //==================Inicio do programa============================//

        while (true) { // estrutura de repetição infinita
            System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica ."); // print da pergunta da compra
            int classe = ler.nextInt(); // ler a resposta do cliente

    //==================Compra da poltrona============================//
            if (i == 5 && classe == 1){ // ver se não ha mais espaço no avião
                System.out.print("A Primeira Classe esta cheia gostaria de ir para a Classe Econômica(sim/nao)?\n"); // perguntar se quer mudar de lugar
                mudar = ler.next(); // resposta do cliente
                if (mudar.equals("sim")){ // se a resposta for sim
                    EcoClass[j] = true; //| colocar o cliente na poltrona x
                    j += 1;             //|
                    System.out.print("Vocẽ esta na poltrona "+ j + " da Classe economica \n"); // printar a poltrona
                }
                if (mudar.equals("nao")) { // se a resposta for nao
                    System.out.println("O próximo voo parte em 3 horas"); // mostrar o horario do proximo voo
                }
            }

            if (classe == 1 && i < 5) { // ver se há espaço no avião
                PriClass[i] = true; //|colocar o cliente na poltrona x
                i += 1;             //|
                System.out.print("Vocẽ esta na poltrona "+ i + " da Primeira Classe \n"); // printar a poltrona
            }

            if (j == 5 && classe == 2){ // ver se não há espaço no avião
                System.out.print("A Classe Economica esta cheia gostaria de ir para a Primeira Classe(sim/nao)?\n"); // perguntar se quer mudar de lugar
                mudar = ler.next();// resposta do cliente
                if (mudar.equals("sim")){// se a resposta for sim
                    PriClass[i] = true;
                    i += 1;
                    System.out.print("Vocẽ esta na poltrona "+ i + " da Primeira Classe \n");
                }
                if (mudar.equals("nao")) {// se a resposta for nao
                    System.out.println("O próximo voo parte em 3 horas"); // mostrar o horario do proximo voo
                }
            }

            if (classe == 2 && j < 5) { // ver se há espaço no avião
                EcoClass[j] = true;
                j += 1;
                System.out.print("Vocẽ esta na poltrona "+ j + " da Classe Econômica \n");
            }

            for (int x = 0; x < 5; x++){            //}
                System.out.print(PriClass[x]+"\t"); //}
            }                                       //}
            System.out.print("\n");                 //}---> grafico de assentos do avião
            for (int y = 0; y < 5; y++){            //}
                System.out.print(EcoClass[y]+"\t"); //]
            }                                       //}
            System.out.print("\n");
            if (i == 5 && j == 5){
                System.out.print("O avião está lotado"); // quando o avião estiver lotado
                break;
            }
        }
    }
}

~~~~~~