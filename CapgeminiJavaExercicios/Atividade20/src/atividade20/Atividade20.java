package atividade20;
import java.util.Scanner;

public class Atividade20 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Atividade 20: ");
        System.out.println("");
        
        Double valorVeiculo = 0.0;
        Double valorDesconto = 0.0;
        Boolean resposta = true;
        String continuar;
        int anoVeiculo;
        int quantidadeAntigos = 0;
        int quantidadeTotal = 0;
        
        System.out.println("CARANGO VELHO");
        
        do{
            
            System.out.println("Insira o valor do veiculo: ");
            valorVeiculo = sc.nextDouble();
            System.out.println("Insira o ano do veiculo: ");
            anoVeiculo = sc.nextInt();
            
            if(anoVeiculo<=2000){
                valorDesconto = 12.00 / 100;
                quantidadeAntigos++;
                
            } else {
                valorDesconto = 7.00 / 100;
            }

            quantidadeTotal++;
                        
            System.out.println("Valor do veiculo com desconto: " + (valorVeiculo - (valorVeiculo * valorDesconto)));
            System.out.println("Valor do desconto: " + valorVeiculo * valorDesconto);
            
            System.out.println("Deseja continuar(S/N) ? ");
            sc.nextLine(); 
            continuar = sc.nextLine(); 
            
            if(continuar.equals("N") || continuar.equals("n") ){
                resposta = false;
            }
            
        } while(resposta == true);
        
        System.out.println("Quantidade de veiculos com ano até 2000: " + quantidadeAntigos);
        System.out.println("Quantidade total: " + quantidadeTotal);
            
        sc.close();
        
    }
    
}
