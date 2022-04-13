package com.mycompany.gustavo.caxile.c2;

public class Medico {
    
    private Integer id;
    private String nome;
    private String especialidade;
    private String ativo;
    private Double salario;

    public Medico(Integer id, String nome, String especialidade, String ativo, Double salario) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.ativo = ativo;
        this.salario = salario;
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

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
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
        
        return String.format("\nID: %d \nAtivo: %s \nNome: %s \nEspecialidade: %s \nValor a receber: R$ %.2f",
                this.id,
                this.ativo,
                this.nome,
                this.especialidade,
                this.salario
        );
    }
}
