/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencapsulamento;

import java.lang.reflect.Constructor;

/**
 *
 * @author t-gamer
 */
public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca;
    private Double doces;
    

    @Override
    public String toString() {
        return "Pokemon{" + "nome=" + nome + ", "
            + "forca=" + forca + ", doces=" + doces + ", tipo=" + tipo + '}';
    }

    
    public Pokemon(String nome,String tipo, Double forca, Double doces ) {
        this.nome = nome; 
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces;
       
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Double getDoces() {
        return doces;
    }

    public void setDoces(Double doces) {
        this.doces = doces;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}