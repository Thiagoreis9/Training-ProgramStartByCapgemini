package atividade13;

import java.util.Scanner;

public class Atividade13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 13: ");
        
        System.out.println("insira um numero: ");
        int numero = sc.nextInt();
        
        if(numero>10){
            System.out.println("o numero informado é maior que 10! ");
        }
        
        sc.close();
        
    }
}
