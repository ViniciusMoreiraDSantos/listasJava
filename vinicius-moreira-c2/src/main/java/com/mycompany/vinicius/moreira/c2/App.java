/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vinicius.moreira.c2;

/**
 *
 * @author Morei
 */
public class App {
    public static void main(String[] args) {
        Jogo jogo1 = new Jogo("Counter Strike","Jogos de Tiro");
        Jogo jogo2 = new Jogo("Forza Horizon", "Automobilismo");
        Loja loja1 = new Loja("LojaDoVinin");
        
        System.out.println(jogo1);
        System.out.println(jogo2);
        
        loja1.realizarVenda(jogo1, 100.0);
        
        loja1.cadastrarEstoque(jogo1, 20);
        loja1.cadastrarEstoque(jogo2, 10);
            
        loja1.realizarVenda(jogo1, 100.0);
        
        loja1.realizarVenda(jogo2, 100.0, 20);
        
        System.out.println(jogo1);
        System.out.println(jogo2);
        
        System.out.println(loja1);
    }
}
