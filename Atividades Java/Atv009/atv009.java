public class ExercicioSemRetorno {
    

    public static void main(String[] args) {
        Integer[] vetorA = {1,2,3,4,5,6,7,8,9,10}; // Cria o vetor A
        Integer[] vetorB = {10,20,30,22,33,24,32,12,43,54}; // Cria o vetor B
        Integer[] vetorC = new Integer[10]; // Cria o vetor C
        imprimirNumeros(vetorA); // Executa funcao imprimirNumeros
        SomaNumeros(vetorA,vetorB,vetorC);// Executa funcao SomaNumeros
        imprimirNumeros(vetorC);// Executa funcao imprimirNumeros
    }

    public static void imprimirNumeros(Integer[] vetor){
        for (int i = 0; i < vetor.length; i++) { // Estrutura de repeticao para ler o vetor
            System.out.print(vetor[i] + " "); // Imprimir o valor de cada posicao do vetor
        }
        System.out.print("\n"); // Pular uma linha
    }

    public static void SomaNumeros(Integer[] vetorA, Integer[] vetorB, Integer[] vetorC){
        int soma = 0; // Cria variavel soma
        for (int i = 0; i < vetorB.length; i++) { // Estrutura de repeticao para ler o vetor
            soma = vetorB[i] + vetorA[i]; // Soma os elementos do vetorA com o do vetorB
            vetorC[i] = soma; // Adiciona o valor somando ao vetorC
            
        }
    }
}
