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
public class AT2 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o ano: ");
        int ano = teclado.nextInt();
        
        boolean bissexto = ((ano % 4 == 0)&&(ano % 100 != 0) || (ano % 400 == 0));
        System.out.println("O ano é bissexto? "+bissexto);
        
        
    }
    
}
