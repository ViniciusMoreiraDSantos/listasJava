/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarypi;

import java.util.Scanner;


/**
 *
 * @author t-gamer
 */
public class YearsOfLibrary {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         Scanner leitorUtilitario = new Scanner(System.in);
         Utilitaria utils = new Utilitaria();
       utils.escolhas();
        Integer opcao = leitor.nextInt();
        do {            
             switch (opcao) {
            case 1:
              System.out.println("Qual a média de livros lidos no mês?");
              Double Livros = leitorUtilitario.nextDouble();
              System.out.println(String.format("Sua media de livros é %.0f "
                      + "anualmente",  utils.mediaLivros(Livros)));
                utils.escolhas();
                opcao = leitor.nextInt();
                
                break;
                case 2:
                    System.out.println("Qual a sua média de livros lidos anualmente?");
                    Integer Nivel = leitorUtilitario.nextInt();
                    utils.nivelLeitor(Nivel);
                 System.out.println("Escolha outra opção");
              opcao = leitor.nextInt();
                    break;
                case 3:
                    System.out.println("Acerte o livro");
                    System.out.println("Um garoto recebe uma carta para ir "
                            + "estudar em uma escola de magia e bruxaria, e "
                            + "descobre que é famoso por ter sobrevivido. "
                            + "Durante os anos que passa lá, vive muitas "
                            + "aventuras\n" +
                    "Um Personagem: Fred\n" +
                    "Qual é o livro?");
                    String nomeLivro = leitorUtilitario.nextLine();
                    
                    utils.nomeLivro(nomeLivro);
                    opcao = 4;
                    break;
                    default:
                throw new AssertionError();
        }
        } while (opcao != 4);
       
    }
}
