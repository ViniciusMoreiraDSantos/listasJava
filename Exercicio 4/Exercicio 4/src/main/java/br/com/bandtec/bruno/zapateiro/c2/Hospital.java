package br.com.bandtec.bruno.zapateiro.c2;

/**
 *
 * @author Aluno
 */
public class Hospital {
    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeBonus;

    // Como salario e ativo são pré definidos, no construtor terá apenas nome
    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeBonus = 0;
    }
    
    public void realizarPagamento(Medico medico, Double valorPagamento){
        if(medico.getAtivo()){
            
            // Atribundo os novos valores
            medico.setSalario(valorPagamento);
            this.quantidadeDePagamentos += 1;
            
            System.out.println("Realizando pagamento sem bônus");
            System.out.println("Valor a receber: R$" + valorPagamento + "\n");
            System.out.println(medico.toString());
        } else {
            System.out.println("Operação Inválida! Médico Inativo");
            System.out.println("-------------------------------------");
        }
        
    }
    // Método Sobrecarrecado
    public void realizarPagamento(Medico medico, Double valorPagamento, Integer valorBonus){
        if(medico.getAtivo()){
            
            Double valorAReceber = valorPagamento + (valorPagamento * valorBonus / 100);
            
            // Atribundo os novos valores
            medico.setSalario(valorAReceber);
            this.quantidadeDePagamentos += 1;
            this.quantidadeDeBonus += 1;
            
            System.out.println("Realizando pagamento com bônus");
            System.out.println("Valor a receber: R$" + valorPagamento);
            System.out.println("Bônus: " + valorBonus + "% -> R$" + valorAReceber + "\n");
            System.out.println(medico.toString());
        } else {
            System.out.println("Operação Inválida!");
            System.out.println("-------------------------------------");
        }
    }
    
    public void desligarMedico(Medico medico){
        medico.setAtivo(false);
        System.out.println("O médico " + medico.getNome() + " foi desligado");
        System.out.println("-------------------------------------");

    }

    @Override
    public String toString() {
        String retornoString = String.format("%s \n"
                + "quantidade de pagamentos: %d \n"
                + "quantidade de bônus: %d \n"
                + "----------------------------", this.nome, this.quantidadeDePagamentos, this.quantidadeDeBonus);
        
        return retornoString; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
