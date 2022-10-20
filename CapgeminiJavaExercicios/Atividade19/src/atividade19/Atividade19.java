package atividade19;
import java.util.Scanner;

public class Atividade19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 19: ");
        
        int q = 75;
        String vetorNome[] = new String[q];
        String vetorSexo[] = new String[q]; 
        
        for(int i=0;i<q;i++){
            System.out.println("Insira o nome: ");
            vetorNome[i] = sc.nextLine();
            
            System.out.println("Insira o sexo(F/M): ");
            vetorSexo[i] = sc.nextLine();
            
            if(vetorSexo[i].equals("F") || vetorSexo[i].equals("f")){
                System.out.println("A " + vetorNome[i] + " e mulher! ");
            } else {
                if(vetorSexo[i].equals("M") || vetorSexo[i].equals("m")){
                    System.out.println("O " + vetorNome[i] + " e Homem! ");
                } else {
                    System.out.println("Sexo informado incorreto");
                }
            }
        
        }
        
        sc.close();
        
    }
    
}
