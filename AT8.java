/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividades2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AT8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        int valor = teclado.nextInt();
        
        /*
        int mul3 = valor % 3;
        
        int mul7 = valor % 7;
        
        int soma = mul3 + mul7;
        
        if (soma = 0) {
            
            System.out.println("O valor é múltiplo de 3 e de 7!");
            
        }else{
        
            System.out.println("O valor não é múltiplo de 3 e de 7!");
        }*/
        
        
        boolean mult = (valor % 3 == 0) && (valor % 7 == 0);
        
        
        System.out.println("O valor é multiplo de 3 e de 7? "+mult);
        
    }
    
}
