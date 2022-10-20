package atividade09;

import java.util.Scanner;

public class Atividade09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 09: ");
        
        System.out.println("Insira o valor do deposito: ");
        Double deposito = sc.nextDouble();
        
        Double rendimentoMes = 0.07/100 ;
        
        Double valorRendimento = deposito * rendimentoMes;
        
        Double valorFinal = valorRendimento + deposito;
        
        System.out.println("DADOS: ");
        System.out.println("Valor total apos 1 mes: " + valorFinal);
        
        sc.close();
        
    }
}
