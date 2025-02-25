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
public class AT3 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        System.out.println("Qual a sua idade?");
        int idade = teclado.nextInt();
        
        System.out.println("Você têm CNH?");
        String resp = teclado2.nextLine();
        
        if (idade >= 18 && resp == "sim") {
            
            System.out.println("Você pode dirigir!");
        } else {
                
            System.out.println("Você não pode dirigir!");
        }
        
    }
}
