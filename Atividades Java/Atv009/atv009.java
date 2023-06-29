public class ExercicioSemRetorno {
    

    public static void main(String[] args) {
        // cria os vetores
        Integer[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        Integer[] vetorB = {10,20,30,22,33,24,32,12,43,54}; 
        Integer[] vetorC = new Integer[10];
        imprimirNumeros(vetorA); 
        SomaNumeros(vetorA,vetorB,vetorC); SomaNumeros
        imprimirNumeros(vetorC);

    public static void imprimirNumeros(Integer[] vetor){
        for (int i = 0; i < vetor.length; i++) { 
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\n"); 
    }

    public static void SomaNumeros(Integer[] vetorA, Integer[] vetorB, Integer[] vetorC){
        // Cria a variavel soma
        int soma = 0; 
        // soma os valores e atribui-os em C
        for (int i = 0; i < vetorB.length; i++) { 
            soma = vetorB[i] + vetorA[i];
            vetorC[i] = soma;
            
        }
    }
}
