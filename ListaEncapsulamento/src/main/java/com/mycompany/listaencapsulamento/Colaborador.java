/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencapsulamento;

/**
 *
 * @author t-gamer
 */
public class Colaborador{
    private String nome;
    private String cargo;
    private Double Salario;

    public Colaborador(String nome, String cargo, Double Salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.Salario = Salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "nome=" + nome + ", cargo=" + cargo + ", Salario=" + Salario + '}';
    }


    
    
}
