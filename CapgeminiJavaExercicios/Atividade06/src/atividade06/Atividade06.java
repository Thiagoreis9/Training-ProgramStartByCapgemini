package atividade06;

import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Atividade 06: ");
        
        System.out.println("Insira o primeiro valor: ");
        int valor1 = sc.nextInt();
        
        System.out.println("Insira o segundo valor: ");
        int valor2 = sc.nextInt();
        
        int valor3 = valor1;
        valor1 = valor2;
        valor2 = valor3;
        
        System.out.println("Valores trocados: ");
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
 
        sc.close();
        
    }
}
