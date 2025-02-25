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
public class AT10 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um valor de 0 a 300: ");
        int valor = teclado.nextInt();
        
        
        boolean verif = (valor >= 100) && (valor <= 200);
        
        System.out.println("O valor está no intervalo entre 100 e 200? "+verif);
        
        
        
    }
    
}
