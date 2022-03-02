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
public class Exercicio_5 {
    public static void main(String[] args) {
        Utilitaria utils = new Utilitaria();
        Scanner leitor = new Scanner(System.in);
      
        System.out.println("Qual o seu sexo?");
        String sexo = leitor.nextLine();
        System.out.println("Qual a sua altura?");
        Double altura = leitor.nextDouble();
        utils.calculaPesoIdeal(sexo ,altura);
    }
}
