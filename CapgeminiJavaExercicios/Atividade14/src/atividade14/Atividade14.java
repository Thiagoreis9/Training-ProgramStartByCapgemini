package atividade14;

import java.util.Scanner;

public class Atividade14 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 14: ");
        
        System.out.println("Insira o primeiro numero: ");
        int n1 = sc.nextInt();
        
        System.out.println("Insira o segundo numero: ");
        int n2 = sc.nextInt();
        
        if(n1 > n2){
            System.out.println("O " + n1 + " é o maior valor! ");
        } else {
            System.out.println("O " + n2 + " é o maior valor! ");
        }
        
        sc.close();
        
    }
}
