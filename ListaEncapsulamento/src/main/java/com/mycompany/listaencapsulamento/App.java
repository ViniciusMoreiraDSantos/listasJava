/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencapsulamento;

/**
 *
 * @author t-gamer
 */
public class App {

    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Wartotle", "água", 30.0, 20.0);
        Pokemon pokemon2 = new Pokemon("Charmander", "Fogo", 15.0, 10.0);
        TreinadorPokemon treinador = new TreinadorPokemon("Vinicius", 0.0);
        
        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);
        treinador.treinarPokemon(pokemon1);

        System.out.println(pokemon1.toString());
        treinador.evoluirPokemon(pokemon1, "Lumbriga d'agua");
        System.out.println(pokemon1.toString());
        
        treinador.treinarPokemon(pokemon2);
        treinador.treinarPokemon(pokemon2);
        System.out.println(pokemon2.toString());
        treinador.evoluirPokemon(pokemon2, "Bola de foga");
        System.out.println(pokemon2.toString());
     
        System.out.println(treinador.toString());
    }
}
