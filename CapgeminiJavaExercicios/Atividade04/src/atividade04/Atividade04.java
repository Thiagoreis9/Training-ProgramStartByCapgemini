package atividade04;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Atividade 04: ");
        
        String nomeVendedor;
        Double salarioFixo;
        Double totalVendas;
        Double comissao = 1.00/100.00;
        Double totalSalario;
        
        System.out.println("Insira o nome do vendedor: ");
        nomeVendedor = sc.nextLine();
        
        System.out.println("Insira o valor do salario fixo: ");
        salarioFixo = sc.nextDouble();
        
        System.out.println("insira o valor total vendido pelo " + nomeVendedor +":");
        totalVendas = sc.nextDouble();
        
        totalSalario = totalVendas * comissao + salarioFixo;
        
        System.out.println("");
        System.out.println("DADOS: ");
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salario Fixo: " + salarioFixo);
        System.out.println("Salario Final: " + totalSalario);

        sc.close();
        
    }
}
