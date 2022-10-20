package atividade12;

import java.util.Scanner;

public class Atividade12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 12: ");
        
        System.out.println("Insira o preco do custo de fabrica do carro: ");
        Double custoFabrica = sc.nextDouble();
        
        Double percentualDistribuidor = 28.00 / 100;
        Double impostos = 45.00 / 100;
        
        Double valorFinal = custoFabrica + custoFabrica * impostos;
        
        valorFinal = valorFinal + valorFinal * percentualDistribuidor;
        
        System.out.println("Valor do carro ao consumidor: " + valorFinal);
        
        sc.close();
        
    }
}
