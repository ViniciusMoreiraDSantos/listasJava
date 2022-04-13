package com.mycompany.gustavo.caxile.c2;

public class Hospital {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeBonus;

    public Hospital(String nome, Integer quantidadeDePagamentos, Integer quantidadeDeBonus) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeBonus = 0;
    }

    public void realizarPagamento(Medico medico, Double salarioMedico) {

        if ("Sim".equals(medico.getAtivo())) {

            medico.setSalario(salarioMedico);

            System.out.println(String.format("\n Realizando pagamento sem bônus \nValor do pagamento: %.2f",
                    medico.getSalario()
            ));

            this.quantidadeDePagamentos++;
        } else {

            System.out.println("Operação inválida");
            this.quantidadeDePagamentos--;
        }
    }

    public void desligarMedico(Medico medico, String inativarMedico) {

        if ("Sim".equals(medico.getAtivo())) {

            medico.setAtivo(inativarMedico);
            
            System.out.println(String.format("\n\nO médico %s foi desligado",
                    medico.getNome()
            ));
        }
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeBonus() {
        return quantidadeDeBonus;
    }

    @Override
    public String toString() {
        return String.format("\nHospital %s \nQuantidade de pagamentos: %d \nQuantidade de bônus: %d",
                this.nome,
                this.quantidadeDePagamentos,
                this.quantidadeDeBonus
        );
    }
}
