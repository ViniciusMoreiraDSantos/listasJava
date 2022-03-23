/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencapsulamento;

/**
 *
 * @author t-gamer
 */
public class RecursosHumanos {
    private Integer totalPromovidos = 0;
    private Integer totalReajustes = 0;
    
    
    public void reajustarSalario(Colaborador colaborador, Double salario){
       this.totalReajustes += 1;
       colaborador.setSalario(salario);
       
    }
    
    public void promoverColaborador(Colaborador colaborador,
            String novoCargo, Double novoSalario){
        this.totalPromovidos += 1;
        if (colaborador.getSalario() < novoSalario) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
        } else{
            System.out.println("operação inválida");
        }
        
    }

    @Override
    public String toString() {
        return "RecursosHumanos{" + "totalPromovidos=" + totalPromovidos + ", totalReajustes=" + totalReajustes + '}';
    }
    
    
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getTotalReajustes() {
        return totalReajustes;
    }

    public void setTotalReajustes(Integer totalReajustes) {
        this.totalReajustes = totalReajustes;
    }
    
    
}
