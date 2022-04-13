package br.com.bandtec.bruno.zapateiro.c2;

/**
 *
 * @author Aluno
 */
public class TesteHospital {
    public static void main(String[] args) {
        
        // Criando médicos
        // Como salario e ativo são pré definidos, ao instanciar um novo Médico, atribuir apenas id, nome e especialidade.
        Medico medico1 = new Medico(1, "Bruno", "Pediatra");
        Medico medico2 = new Medico(2, "Pedro", "Clínico Geral");
        
        // Exibindo Médicos
        System.out.println(medico1.toString());
        System.out.println(medico2.toString());
        
        // Criando Hospital      
        Hospital hospital = new Hospital("Hospital Legal");
        
        // Realizando os Pagamentos
        hospital.realizarPagamento(medico1, 2000.00);
        hospital.realizarPagamento(medico2, 1000.00, 30);
        
        // Desligando um Médico
        hospital.desligarMedico(medico1);
        
        // Pagando novamente
        hospital.realizarPagamento(medico1, 2000.00);
        
        //Exibindo tudo
        System.out.println(medico1.toString());
        System.out.println(medico2.toString());
        System.out.println(hospital.toString());
        
    }
}
