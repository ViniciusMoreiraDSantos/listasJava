/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarypi;

/**
 *
 * @author t-gamer
 */
public class Utilitaria {
    public void escolhas(){
        System.out.println("  ");
        System.out.println("ESCOLHA UMA OPÇÃO:");
        System.out.print("+-".repeat(12));
        
        System.out.println("-+".repeat(12));
        System.out.println("1 - Calcule quantos livros você lê por ano");
        System.out.println("2 - Veja o seu nível de leitor");
        System.out.println("3 - Acerte o livro");
       
        System.out.println("4 - Sair");
    }
    
    
    public Double mediaLivros(Double Livros){
     return Livros * 12;
 }
    
   public void nivelLeitor(Integer leitor){
        if (leitor <= 12) {
            System.out.println("Leitor Nível D");
        } else if(leitor > 12 && leitor < 24) {
            System.out.println("Leitor Nível C");
        } else if(leitor > 24 && leitor < 36){
            System.out.println("Leitor Nível B");
        } else if (leitor > 36 && leitor < 48) {
            System.out.println("Leitor Nível A");
        } else if(leitor >48){
            System.out.println("Leitor Nível SS");
        }
        
        
    }
    
    public void nomeLivro(String livro){
  
        
        
        if ("Harry Potter".equals(livro)) {
            
            
            System.out.println("Acertou!!!");
            
         
        }
        else{
            System.out.println("Parece que não foi dessa vez, tente na próxima ");
        }
        
    }
}
