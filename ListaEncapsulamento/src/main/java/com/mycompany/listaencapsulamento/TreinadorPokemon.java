/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencapsulamento;

/**
 *
 * @author t-gamer
 */
public class TreinadorPokemon {
    private String nome;
    private Double nivel;

    public TreinadorPokemon(String nome, Double nivel) {
        this.nome = nome;
        this.nivel = nivel;

    }



  public void treinarPokemon(Pokemon pokemon){
      Double forca = pokemon.getForca();
      Double doces = pokemon.getDoces() + 10;
      forca += forca * 0.1;
      pokemon.setForca(forca);
      pokemon.setDoces(doces);
  }


    public void evoluirPokemon(Pokemon pokemon, String nome){
        String nomeAntigo = pokemon.getNome();
        Double diminuicaoDoce = pokemon.getDoces()-50;
        
        if (pokemon.getDoces() >= 50) {
            pokemon.setNome(nome);
            pokemon.setDoces(diminuicaoDoce);
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", 
                    nomeAntigo, nome));
            this.nivel += 2.0;
        } else {
            System.out.println("Não foi possível realizar operação");
        }
    
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }

   
     @Override
    public String toString() {
        return "TreinadorPokemon{" + "nome=" + nome + ", nivel=" + nivel + '}';
    }
    
    
    
}
