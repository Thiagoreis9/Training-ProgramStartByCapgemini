package atividade05;

import java.util.Scanner;

public class Atividade05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 05: ");
        
        String nomeAluno;
        Double notap1, notap2, notap3, media;
        
        System.out.println("Insira o nome do aluno: ");
        nomeAluno = sc.nextLine();
        
        System.out.println("Insira a nota da primeira nota: ");
        notap1 = sc.nextDouble();
        
        System.out.println("Insira a nota da segunda nota: ");
        notap2 = sc.nextDouble();
        
        System.out.println("Insira a nota da terceira nota: ");
        notap3 = sc.nextDouble();
        
        media = (notap1 + notap2 + notap3) / 3;
        
        System.out.println("DADOS: ");
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Media: " + media);

        sc.close();
        
    }
}
