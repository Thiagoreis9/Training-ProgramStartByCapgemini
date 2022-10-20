package atividade03;

import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Double distanciaPercorrida;
        Double combustivelGasto;
        Double consumoMedio;
        
        System.out.println("Atividade 03:");
        System.out.println("Insira a distancia percorrida: ");
        distanciaPercorrida = sc.nextDouble();
        
        System.out.println("Insira o total de combustivel gasto: ");
        combustivelGasto = sc.nextDouble();
        
        consumoMedio = distanciaPercorrida / combustivelGasto;
        System.out.println("Autonomia de " + consumoMedio + "km/Litro. ");
        
        sc.close();
        
    }
}
