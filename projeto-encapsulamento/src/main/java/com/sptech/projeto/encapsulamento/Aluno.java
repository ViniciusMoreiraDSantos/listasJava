package com.sptech.projeto.encapsulamento;

public class Aluno {

    private String nome;
    private String ra;
    private String curso;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome, String ra, String curso) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.nota1=0.0;
        this.nota2=0.0;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", ra=" + ra + ", "
           + "curso=" + curso + ", nota1=" + nota1 + ", nota2=" + nota2 + '}';
    }
    
  
    
     public Double getMedia(){
    return (this.nota1 + this.nota2)/2;
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    public Boolean isAprovado(){
   // return getMedia() >6;
   Double media=getMedia();
        return media>6;
    }
        

}

//    String pegarRa(){
//    return  ra;
//    }
//       configurarRa (String novoRa){
//   ra=novoRa ;
//    }
//}

