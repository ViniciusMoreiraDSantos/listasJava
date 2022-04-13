/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vinicius.moreira.c2;

/**
 *
 * @author Morei
 */
public class Loja {
    private String nome;
    private Integer quantidadeJogoVendidos;
    private Integer quantidadeDescontosAplicados;
    private Double totalFaturado;
    
    
 
    public Loja(String nome) {
        this.nome = nome;
        this.quantidadeJogoVendidos = 0;
        this.quantidadeDescontosAplicados = 0;
        this.totalFaturado = 0.0;
    }
    
        
    public void realizarVenda(Jogo jogo, Double valorVenda){
        Integer retiradaEstoque = jogo.getEstoque()-1;
        if (jogo.getEstoque() >= 1) { 
            jogo.setPreco(valorVenda);
            jogo.setEstoque(retiradaEstoque);
            
        } else {
            System.out.println("Operação Inválida");
        }
    }
    
    public void realizarVenda(Jogo jogo,Double valorVenda,Integer desconto){
        
        Double valorDesconto = (desconto / 100) * valorVenda;
        Integer retiradaEstoque = jogo.getEstoque()-1;
        
        if (jogo.getEstoque() >= 1) { 
            jogo.setPreco(valorVenda - valorDesconto);
            jogo.setEstoque(retiradaEstoque);
            this.quantidadeJogoVendidos++;
            this.quantidadeDescontosAplicados++; 
            
        } else {
            System.out.println("Operação Inválida");
        }
        
    }
    
    public void cadastrarEstoque(Jogo jogo, Integer quantidadeEstoque){
            jogo.setEstoque(quantidadeEstoque);
            System.out.println(String.format("O estoque do jogo %s foi alterado", jogo.getNome()));
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeJogoVendidos() {
        return quantidadeJogoVendidos;
    }

    public void setQuantidadeJogoVendidos(Integer quantidadeJogoVendidos) {
        this.quantidadeJogoVendidos = quantidadeJogoVendidos;
    }

    public Integer getQuantidadeDescontosAplicados() {
        return quantidadeDescontosAplicados;
    }

    public void setQuantidadeDescontosAplicados(Integer quantidadeDescontosAplicados) {
        this.quantidadeDescontosAplicados = quantidadeDescontosAplicados;
    }

    public Double getTotalFaturado() {
        return totalFaturado;
    }

    public void setTotalFaturado(Double totalFaturado) {
        this.totalFaturado = totalFaturado;
    }

    @Override
    public String toString() {
      return "Loja{" + "nome=" + nome + ", quantidadeJogoVendidos=" + 
        quantidadeJogoVendidos + ", quantidadeDescontosAplicados=" + 
          quantidadeDescontosAplicados + ", totalFaturado=" + totalFaturado + '}';
    }
    
}


