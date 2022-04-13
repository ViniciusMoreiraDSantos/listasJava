public class Pet {
    private String nome;
    private String raca;
    private Integer quantidadeVisitas;
    private Double valorGasto;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        this.quantidadeVisitas = 0;
        this.valorGasto = 0.0;
    }
    
    public void visitar(){
        quantidadeVisitas++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQuantidadeVisitas() {
        return quantidadeVisitas;
    }

    public void setQuantidadeVisitas(Integer quantidadeVisitas) {
        this.quantidadeVisitas = quantidadeVisitas;
    }

    public Double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(Double valorGasto) {
        this.valorGasto = valorGasto;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\n"
                            + "Raça: %s\n"
                            + "Quantidade de Visitas: %d\n"
                            + "Valor Gasto: %.2f\n"
                            + "--------------------------", 
                            nome,
                            raca,
                            quantidadeVisitas,
                            valorGasto
                            );
    }
       
}
