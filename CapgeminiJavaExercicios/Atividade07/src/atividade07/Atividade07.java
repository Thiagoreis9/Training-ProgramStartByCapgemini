package atividade07;

import java.util.Scanner;

public class Atividade07 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 07: ");
        
        Double grausCelsius;
        Double grausFahrenheit;
        
        System.out.println("Insira a temperatura em graus Celsius: ");
        grausCelsius = sc.nextDouble();
        
        grausFahrenheit = (9 * grausCelsius + 160) / 5;
        
        System.out.println("DADOS: ");
        System.out.println("Graus Celsius: " + grausCelsius);
        System.out.println("Em Fahrenheit: " + grausFahrenheit);

        sc.close();
        
    }
}
