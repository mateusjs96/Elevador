/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public class Elevador extends TesteElevador {
    
    Scanner entrada = new Scanner(System.in);
    int andarAtual = 0;
    int andarDesejado;
    int continua = 3;
    
    //Métodos
    public void mexerElevador() {
        
        System.out.println("Você está no andar: " + andarAtual);
        
        while(continua == 3){
            
            System.out.println("\t Digite o andar desejado...");
            andarDesejado = entrada.nextInt();
            
            while(andarDesejado > andarAtual){
            andarAtual++;
            System.out.println("Foi para " + andarAtual + "º andar...");
            }while(andarDesejado < andarAtual){
                andarAtual--;
                System.out.println("Foi para " + andarAtual + "º andar...");
            }
        
        System.out.println("\nDigite [3] para continuar ou outro número para encerrar...");
        continua = entrada.nextInt(); 
        
        }
        
        System.out.println("ENCERRADO!");
    }                 
}