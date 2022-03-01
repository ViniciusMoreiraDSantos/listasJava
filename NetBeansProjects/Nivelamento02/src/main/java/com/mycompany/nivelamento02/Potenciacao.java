/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento02;

import java.util.Scanner;

/**
 *
 * @author t-gamer
 */
public class Potenciacao {
    public static void main(String[] args) {
        Scanner leitorBase = new Scanner(System.in);
        Scanner leitorExpoente = new Scanner(System.in);
        Integer numeroBase;
        Integer numeroExpoente;
        Integer resultado = 0;
        
        System.out.println("Digite o número base: ");
        numeroBase = leitorBase.nextInt();
        System.out.println("Digite o expoente");
        numeroExpoente = leitorExpoente.nextInt();
        
        for (int i = 0; i < numeroExpoente; i++) {
            
            if (i == numeroBase) {
                resultado = numeroBase * numeroBase;
               
            }
            else{
             resultado += resultado * numeroBase;
            }
                 
        }
             
        System.out.println(resultado - (numeroBase * numeroBase));
        
    }
}
