package atividade10;

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 10: ");
        
        System.out.println("Insira o valor do produto: ");
        Double valorProduto = sc.nextDouble();
        
        Double valorParcelado = valorProduto / 5;
        
        System.out.println("DADOS: ");
        System.out.println("O valor do produto fica 5x de R$ " + valorParcelado);
        
        sc.close();
        
    }
}
