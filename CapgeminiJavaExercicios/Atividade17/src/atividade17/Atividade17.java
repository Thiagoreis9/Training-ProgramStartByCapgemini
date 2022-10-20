package atividade17;
import java.util.Scanner;

public class Atividade17 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int q = 80;
        
        int vetor[] = new int[q];
        
        int c=0;
        
        System.out.println("Atividade 17:");
        
        for (int i=0;i<q;i++) {
            
            System.out.println("Insira um numero: ");
            vetor[i] = sc.nextInt();
            
        }
        
        for(int i=0;i<q;i++){
            if(vetor[i] >= 10 && vetor[i] <= 150){
                c++;
            }
        }
        
        System.out.println("Quantidade de numero que esta no intervalo de 10 a 150: " + c);
        
        sc.close();
        
    }
    
}
