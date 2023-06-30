package Java.Atv010;

import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // SETAR O NOME
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        pessoa.setNome(nome);

        // SETAR A IDADE
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        pessoa.setIdade(idade);

        // SETAR A ALTURA
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        pessoa.setAltura(altura);

        // RECUPERAR O NOME
        System.out.println("\nNome: "+pessoa.getNome());

        // RECUPERAR A IDADE
        System.out.println("Idade: "+pessoa.getIdade());

        // RECUPERAR A ALTURA
        System.out.println("Altura: "+pessoa.getAltura());
        
    }
}
