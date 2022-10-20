package atividade18;
import java.util.Scanner;

public class Atividade18 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 18: ");
        
        int q = 75;
        int vetor[] = new int[q];        
        
        for(int i=0;i<q;i++){
            System.out.println("Insira a idade da pessoa: ");
            vetor[i] = sc.nextInt();
            if(vetor[i]>=18){
                System.out.println("Maior de idade! ");
            } else{
                System.out.println("Menor de idade! ");
            }
        
        }
        
        sc.close();
        
    }
    
}
