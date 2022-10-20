package atividade02;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, soma, sub, mult, div;
        
        System.out.println("Atividade 02 :");
        System.out.println("Insira o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Insira o segundo numero: ");
        n2 = sc.nextInt();
        
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + sub);
        System.out.println("Multiplicacao: " + mult);
        System.out.println("Divisao: " + div);
    
        sc.close();
        
    }
}