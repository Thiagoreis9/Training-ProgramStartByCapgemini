package atividade11;

import java.util.Scanner;

public class Atividade11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 11: ");
        
        System.out.println("Insira o preco de custo do produto: ");
        Double precoCusto = sc.nextDouble();
        
        System.out.println("Insira a porcentagem de lucro desejada no produto: ");
        Double percentLucro = sc.nextDouble() / 100;
        
        Double precoFinal = precoCusto + precoCusto * percentLucro;
        
        System.out.println("O valor de venda do produto é: " + precoFinal);
        
        sc.close();
        
    }
}
