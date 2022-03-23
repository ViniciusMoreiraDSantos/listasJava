/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencapsulamento;;


/**
 *
 * @author t-gamer
 */
public class App_1 {
    public static void main(String[] args) {
        Colaborador colaborador1 = new Colaborador("Vinicius","Analista de sistemas Junior", 5500.0);
        Colaborador colaborador2 = new Colaborador("João","Analista de sistemas Pleno", 8500.0);
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println(colaborador1.toString());
        System.out.println(colaborador2.toString());
        
        rh.promoverColaborador(colaborador2, "Analista sênior", 8500.0);
        System.out.println(colaborador1.toString());
        rh.promoverColaborador(colaborador1, "Analista Junior", 5500.0);
        System.out.println(colaborador2.toString());
        
        rh.reajustarSalario(colaborador2, 10500.0);
        System.out.println(colaborador2.toString());
        
        System.out.println(rh.getTotalPromovidos());
        System.out.println(rh.getTotalReajustes());
    }
}
