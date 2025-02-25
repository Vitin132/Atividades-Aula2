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
public class AT9 {
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o nome do aluno?");
        String nome = teclado.nextLine();
        
        System.out.println("Qual a nota do aluno " +nome+ " de 0 a 100 ? ");
        double nota = teclado.nextDouble();
        
        System.out.println("Qual a frequência do aluno de 0 a 100? ");
        double freq = teclado.nextDouble();
        
        
        boolean x1 = (nota >= 60) && (freq >= 75); 
        
        System.out.println("O aluno está aprovado? "+x1);
        
        
    }
    
}
