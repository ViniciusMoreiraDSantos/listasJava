package br.com.bandtec.bruno.zapateiro.c2;

/**
 *
 * @author Aluno
 */
public class Medico {
    private Integer id;
    private String nome;
    private String especialidade;
    private Boolean ativo;
    private Double salario;
    
    // Como salario e ativo são pré definidos, no construtor terá apenas id, nome e especialidade.
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

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    
    // Retorno getAtivo como String em vez de Boolean para melhor vizualização
    public Boolean getAtivo() {
        return ativo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
    
    @Override
    public String toString() {
        String ativoString;
        
        if(this.ativo){            
        ativoString = "Sim";
        } else {
        ativoString = "Não";
        }
        
        String retornoString = String.format(""
                + "ID: %d \n"
                + "Ativo: %s \n"
                + "Nome: %s \n"
                + "Especialidade: %s \n"
                + "Valor a receber: %.2f \n"
                + "--------------------------",
                getId(), ativoString, getNome(), getEspecialidade(), getSalario());
        
        return retornoString; 
    }
    
    
    
    
    
}
