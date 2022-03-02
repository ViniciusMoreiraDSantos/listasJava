/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajava03;

import java.util.Scanner;
import javax.management.monitor.MonitorNotification;

/**
 *
 * @author t-gamer
 */
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner qtdProduto = new Scanner(System.in);
        Scanner valorProduto = new Scanner(System.in);
        Utilitaria utils = new Utilitaria();
        System.out.println("Bem-vindo ao sistema de desconto progressivo!");
        System.out.println("Digite o valor unitário do produto:");
        Double precoProduto = valorProduto.nextDouble();
        System.out.println("Digite a quantidade");
        Integer quantidade = qtdProduto.nextInt();
        System.out.println("-".repeat(72));
        System.out.println(String.format("Valor do produto: %.2f", precoProduto));
        System.out.println(String.format("Quantidade: %d", quantidade));
        System.out.println("-".repeat(72));
        utils.DescontoProgressivo(precoProduto, quantidade);
       
        
    }
}
