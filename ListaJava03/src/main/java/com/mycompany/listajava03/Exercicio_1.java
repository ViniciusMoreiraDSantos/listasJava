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
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        Utilitaria utils = new Utilitaria();
        System.out.println("Digite a primeira nota do aluno");
        Double primeiraNota = leitor.nextDouble();
        System.out.println("Digite a segunda nota do aluno");
        Double segundaNota = leitor2.nextDouble();
        System.out.println(String.format("Sua média é %.2f", utils.calcularMedia
        (primeiraNota, segundaNota)));
    }
    
}
