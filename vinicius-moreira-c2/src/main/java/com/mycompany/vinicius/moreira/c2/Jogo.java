/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vinicius.moreira.c2;

/**
 *
 * @author Morei
 */
public class Jogo {
    private String nome;
    private String genero;
    private Integer estoque;
    private Double preco;

    public Jogo(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        this.estoque = 0;
        this.preco = 0.0;
        
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Jogo{" + "nome=" + nome + ", genero=" + genero + ","
                + " estoque=" + estoque + ", preco=" + preco + '}';
    } 
}
