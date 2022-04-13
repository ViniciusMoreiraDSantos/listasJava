package com.mycompany.sla;

public class TesteHospital {

    public static void main(String[] args) {

        Medico medico1 = new Medico(1, "Roberval", "Ortopedista");
        Medico medico2 = new Medico(2, "Zeca", "Psiquiatra");

        Hospital hospital1 = new Hospital("Santo Zeca");

        medico1.toString();
        medico2.toString();

        hospital1.realizarPagamento(medico1, 1000.00);
        hospital1.realizarPagamento(medico2, 2000.00, 30.00);

        hospital1.desligarMedico(medico1);
        hospital1.realizarPagamento(medico1, 1000.00);

        medico1.toString();
        medico2.toString();

        System.out.println(hospital1);

    }
}
