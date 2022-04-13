/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sla;

public class Medico {

    private Integer id;
    private String nome;
    private String especialidade;
    private Boolean ativo;
    private Double salario;

    public Medico(Integer id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.ativo = true;
        this.salario = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n\nID:" + id + "\n Nome:" + nome + "\n Especialidade:" + especialidade + "\n ativo:" + ativo + "\n Valor a receber:" + salario;
    }

}
