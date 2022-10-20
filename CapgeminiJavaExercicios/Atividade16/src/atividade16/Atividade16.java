package atividade16;
import java.util.Scanner;

public class Atividade16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double nota1, nota2, nota3, media;
        String nome;
        
        System.out.println("Atividade 16:");
        
        System.out.println("Insira o nome do aluno: ");
        nome = sc.nextLine();
        
        System.out.println("Insira a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Insira a terceira nota: ");
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media>=7) {
            System.out.println("O aluno " + nome + " foi aprovado com média " + media);
        } else{
            if(media<=5){
                System.out.println("O aluno " + nome + " foi reprovado com média " + media);
            } else{
                System.out.println("O aluno " + nome + " esta de recuperacao com média " + media);
            }
        }
        
        sc.close();
    }
    
}
