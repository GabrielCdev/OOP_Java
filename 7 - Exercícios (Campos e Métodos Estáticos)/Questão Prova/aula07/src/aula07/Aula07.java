/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author 029181066
 */
public class Aula07 {

    public static void main(String[] args) {
        //TODO code application logic here
        Paciente paciente1;
        paciente1 = new Paciente("01234567890", "João", "Rua X", "(71)1234-5678");
        
        paciente1.imprimir();
        
        Consulta consulta1;
        consulta1 = new Consulta("Cardiologia", "01/08/2018", "Dor no peito", "Infarto", 100);
        
        Consulta consulta2;
        consulta2 = new Consulta("Ortopedista", "03/10/2018", "Dor no tornozelo", "Fratura", 120);
        
        paciente1.addConsulta(consulta1);
        paciente1.addConsulta(consulta2);
        
        float total;
        total = paciente1.totalGasto();
        
        System.out.println("Gasto total: R$"+total);
    }    
}