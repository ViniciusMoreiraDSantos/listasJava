public class PetShop {
    private String nome;
    private Double faturamento;

    public PetShop(String nome) {
        this.nome = nome;
        this.faturamento = 0.0;
    }
    
    
    public void darBanho(Pet pet ,Double valor){
        faturamento = faturamento + valor;
        Double novoValorGasto = pet.getValorGasto() + valor;
        pet.setValorGasto(novoValorGasto);
        // pet.setQuantidadeVisitas(pet.getQuantidadeVisitas() + 3);
        pet.visitar();
    }
    
    public void darBanho(Pet pet, Double valor, Integer desconto){
       
        //Quanto vai ter de desconto
        Double valorDesconto = (desconto / 100.0) * valor;
        //Quanto vai pagar no final (valor - desconto)
        Double valorFinalAPagar = valor - valorDesconto;
        faturamento = faturamento + valorFinalAPagar;
        
        
        //Pegando o que o pet ja gastou antes + valor do banho
        Double novoValorGastoDoPet = 
                pet.getValorGasto() + valorFinalAPagar;
        //Alterando o que o pet já gastou no petshop
        pet.setValorGasto(novoValorGastoDoPet);
        pet.visitar();
        
    }
    // Quanto é 32 % de 150 batatas ?
    // 32/100 * 150
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public String toString() {
        return String.format("------------------"
                + "\nNome do PetShop: %s"
                + "\nFaturamento: %.2f", 
                nome,
                faturamento) ;
    }
    
    
        
}
