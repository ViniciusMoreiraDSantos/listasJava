package com.mycompany.gustavo.caxile.c2;

public class TesteHospital {
    
    public static void main(String[] args) {
        
        Medico medico1 = new Medico(1, "Gustavo", "Dermatologista", "Sim", 0.0);
        Medico medico2 = new Medico(2, "Bruno", "Fisioterapia", "Sim", 0.0);
        
        Hospital hospital = new Hospital("Santa Helena", 0, 0);
        
        System.out.println(medico1);
        System.out.println(medico2);
        
        hospital.realizarPagamento(medico1, 10_000.0);
        hospital.realizarPagamento(medico2, 8000.0);
        
        hospital.desligarMedico(medico1, "Não");
        
        hospital.realizarPagamento(medico1, 10_000.0);
        hospital.realizarPagamento(medico2, 8000.0);
        
        System.out.println(medico1);
        System.out.println(medico2);
        System.out.println(hospital);
    }
}
