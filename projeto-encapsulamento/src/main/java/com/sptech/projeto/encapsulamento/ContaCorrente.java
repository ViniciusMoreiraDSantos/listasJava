/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.projeto.encapsulamento;

/**
 *
 * @author Aluno
 */
public class ContaCorrente {
    private String nomeTitular;
    private Double saldo;

    
    
    
    public ContaCorrente(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void depositar(Double valorDepositado){
      
    this.saldo += valorDepositado;
    
    
    }
    
    public void sacar(Double valorSacar){
            if (valorSacar <= this.saldo) {
           this.saldo -= valorSacar; 
            
        } else {
        }
        
    
    
    }
    
}
