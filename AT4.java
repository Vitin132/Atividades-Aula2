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
public class AT4 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        double valor1 = teclado.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = teclado.nextDouble();
        
        double hip = Math.sqrt(Math.pow(valor1, 2)+ Math.pow(valor2, 2));
        
        System.out.println("O valor da hipotenusa é: "+hip);
        
         
        
        
        
        
        
        
        
        
        
        
    }
    
}
