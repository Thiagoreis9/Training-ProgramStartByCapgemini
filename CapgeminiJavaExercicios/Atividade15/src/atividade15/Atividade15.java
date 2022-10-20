package atividade15;

import java.util.Scanner;

public class Atividade15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um numero: ");
        int n1 = sc.nextInt();
        
        if(n1 >= 100 && n1 <= 200){
            System.out.println(n1 + " Está no intervalo de 100 a 200 !");
        } else {
            System.out.println(n1 + " Não está no intervalo de 100 a 200 !");
        }
        
        sc.close();
        
    }
}
