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
public class Acumulador {
    public static void main(String[] args) {
        Scanner leitorAcumulador = new Scanner(System.in);
        Integer numeroDigitado;
        Integer Soma = 0;
        
        do {            
            System.out.println("Digite um número");
            numeroDigitado = leitorAcumulador.nextInt();
           Soma += numeroDigitado;
            System.out.println("No momento a soma está em: " + Soma);
           
        } while (numeroDigitado != 0);
        
        System.out.println("A soma dos números é: " + Soma);
    }
}
