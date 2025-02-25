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
public class AT6 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite um valor: ");
        double v1 = teclado.nextDouble();
        
        System.out.println("Digite um 2° valor: ");
        double v2 = teclado.nextDouble();
        
        /*
        if(v1 > v2){
        
            System.out.println("O primeiro valor é maior que o segundo!");
        
        }else{
            
            System.out.println("O segundo valor é maior que o primeiro!");
        
        } */
        
        
        boolean veri = (v1 > v2);
        
        System.out.println("O primeiro valor é maior? "+veri);
        
        
        
    }
    
}
