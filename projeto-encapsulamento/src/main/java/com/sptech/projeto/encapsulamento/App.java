package com.sptech.projeto.encapsulamento;

import java.awt.Cursor;

public class App {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Manoel", "#123", "ADS");
//        aluno.ra = "#123";
//        aluno.nome = "Manoel";
//        aluno.curso = "Análise e desenvolvimento de sistemas";
//        aluno.nota1 = 10.0;
//        aluno.nota2 = 8.0;
//        System.out.println(String.format("Ra:%s", aluno.ra));
//        System.out.println(String.format("Nome:%s", aluno.nome));
//        System.out.println(String.format("Curso:%s", aluno.curso));
//        System.out.println(String.format("Nota1:%.1f", aluno.nota1));
//        System.out.println(String.format("Nota2:%.1f", aluno.nota2));
//        System.out.println(String.format("Média:%.1f", (aluno.nota1 + aluno.nota2) / 2));
//aluno.configurarRa("#123");
//        System.out.println(aluno.pegarRa());
//    }
//aluno.setRa("#123");
//aluno.setNome("Diego");
//aluno.setCurso("ADs");
//aluno.setNota2(10.0);
//aluno.setNota1(8.0);
//        System.out.println(String.format("RA:%s", aluno.getRa()));
//        System.out.println(String.format("Nome:%s", aluno.getNome()));
//        System.out.println(String.format("Curso:%s", aluno.getCurso()));
//        System.out.println(String.format("Nota1:%.1f", aluno.getNota1()));
//        System.out.println(String.format("Nota2:%.1f", aluno.getNota2()));
//        System.out.println(String.format("Média:%.1f", aluno.getMedia()));
        System.out.println(aluno);
    }
}

