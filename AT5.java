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
public class AT5 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Digite um número: ");
        int num = teclado.nextInt();
        
        
        boolean entre = num <=20 && num >= 10;

        System.out.println("O número está entre 10 e 20? " +entre);
        
    }
    
}
