/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listajava03;

/**
 *
 * @author t-gamer
 */
public class Utilitaria {
    public Double calcularMedia(Double nota1, Double nota2){
    return (nota1 *0.4) + (nota2 * 0.6); 
    
    }
      
    public Double ClassesSociais( Double renda){
       return renda / 1100;
       
        
        
    }
    
    public void DescontoProgressivo(Double valor, Integer quantidade){
        Double valorBruto = valor * quantidade;
        Double valorLiquido = null;
        Double valorTotal = null;
        if (quantidade == 1) {
           valorLiquido = valorBruto * 0.1;
           valorTotal = valorBruto - valorLiquido;
        }else if(quantidade == 2){
           valorLiquido = valorBruto * 0.2;
           valorTotal = valorBruto - valorLiquido;

        }else if(quantidade == 3){
            valorLiquido = valorBruto * 0.3;
            valorTotal = valorBruto - valorLiquido;

        }
         System.out.println(String.format("Valor com desconto: %.2f", valorTotal));
    }
    
    public void calculaPesoIdeal(String sexo, Double altura){
        Double pesoIdeal = null;
        
         if ("M".equals(sexo)) {
            pesoIdeal = (72.7 * altura) - 58;
             System.out.println(String.format("O seu peso ideal é %.2f", pesoIdeal));
        } else if ("F".equals(sexo)) {
            pesoIdeal = (62.1 * altura) - 44.7;
             System.out.println(String.format("O seu peso ideal é %.2f", pesoIdeal));
        }
{
        }
    }
         
    
}
