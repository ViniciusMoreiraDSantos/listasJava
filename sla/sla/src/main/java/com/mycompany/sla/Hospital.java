/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sla;

/**
 *
 * @author LEONARDO
 */
public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeBonus;

    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeBonus = 0;
    }

    public void realizarPagamento(Medico medico, Double valorPagamento) {
        if (medico.getAtivo() == false) {
            System.out.println("Operação Inválida");
        } else {

            quantidadeDePagamentos = quantidadeDePagamentos + 1;

            medico.setSalario(valorPagamento);

            System.out.println(String.format("\n\nRealizando pagamento sem bônus\n"
                    + "Valor do pagamento: %.2f\n"
                    + "%s\n\n", valorPagamento, medico.toString()));
        }
    }

    public void realizarPagamento(Medico medico, Double valorPagamento, Double quantidadeBonus) {
        if (medico.getAtivo() == false) {
            System.out.println("Operação Inválida");
        } else {

            quantidadeDePagamentos = quantidadeDePagamentos + 1;
            quantidadeDeBonus = quantidadeDeBonus + 1;

            Double valorTotal = valorPagamento + ((quantidadeBonus / 100) * valorPagamento);
            Double valorBonus = (quantidadeBonus / 100) * valorPagamento;

            medico.setSalario(valorTotal);

            System.out.println(String.format("\n\nRealizando pagamento com bônus\n"
                    + "Valor do pagamento: %.2f\n"
                    + "Bônus: %.2f%% -> R$%.2f\n"
                    + "%s\n\n", valorPagamento, quantidadeBonus, valorBonus, medico.toString()));
        }
    }

    public void desligarMedico(Medico medico) {
        medico.setAtivo(false);
        System.out.println(String.format("O Médico %s foi desligado.", medico.getNome()));
    }

    @Override
    public String toString() {
        return "Hospital{" + "Hospital " + nome + "\n Quantidade de pagamentos: " + quantidadeDePagamentos + "\n Quantidade de bonus: " + quantidadeDeBonus + '}';
    }

}
