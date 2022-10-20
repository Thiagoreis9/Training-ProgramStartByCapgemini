package atividade08;

import java.util.Scanner;

public class Atividade08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 08: ");
        
        Double dollar, real , cotacaoDollar;
        
        System.out.println("Insira a quantidade de Dollar que deseja converter: ");
        dollar = sc.nextDouble();
        
        System.out.println("Insira o valor atual do dollar: ");
        cotacaoDollar = sc.nextDouble();
        
        real = dollar * cotacaoDollar;
        
        System.out.println("DADOS: ");
        System.out.println("U$ " + dollar + " vale R$ " + real);
        
        sc.close();
        
    }
}
