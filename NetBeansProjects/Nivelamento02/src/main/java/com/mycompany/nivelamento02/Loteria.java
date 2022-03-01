/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nivelamento02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author t-gamer
 */
public class Loteria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer numeroDigitado;
        Integer numeroRandom;
        Integer contador = 0;
        
        do {            
           
        numeroRandom = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println("Digite um número");
        numeroDigitado = leitor.nextInt();
            System.out.println("O número sorteado foi: " + numeroRandom);
            contador++;
            
        } while (numeroDigitado != numeroRandom);
        if (contador <= 3) {
            System.out.println("Você é MUITO sortudo");
        }else if(contador >= 4 && contador <= 10){
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
        
    
    
    }
}
