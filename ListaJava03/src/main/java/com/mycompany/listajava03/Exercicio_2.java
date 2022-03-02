/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajava03;

import java.util.Scanner;

/**
 *
 * @author t-gamer
 */
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Utilitaria utils = new Utilitaria();
        System.out.println("Informe a sua renda salarial");
        Double rendaSalarial = leitor.nextDouble();
        Double classeSalarial = utils.ClassesSociais(rendaSalarial);
        System.out.println(String.format("Voce recebe aproximadamente %.1f", classeSalarial) );
        
        if (classeSalarial <= 2) {
            System.out.println("Classe E");
        }else if(classeSalarial > 2 && classeSalarial <= 4){
            System.out.println("Classe D");
        }else if(classeSalarial > 4 && classeSalarial <= 10){
            System.out.println("Classe C");
        }else if(classeSalarial > 10 && classeSalarial <= 20){
            System.out.println("Classe B");
        }else if(classeSalarial > 20){
            System.out.println("Classe A");
        }
        
        
    }
}
