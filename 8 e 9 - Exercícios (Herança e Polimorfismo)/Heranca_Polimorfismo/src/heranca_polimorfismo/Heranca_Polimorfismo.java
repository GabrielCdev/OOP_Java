/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca_polimorfismo;

/**
 *
 * @author 029181066
 */
public class Heranca_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlunoGraduacao a1 = new AlunoGraduacao("Escola x", 5, "Maria");
        //a1.imprimir();
        
        AlunoPos a2 = new AlunoPos("João", 20000, 5, "Ana");
        //a2.imprimir();
        
        AlunoTecnologo a3 = new AlunoTecnologo("FERBASA", 3, "Antônio");
        
        Aluno[] vet = new Aluno[10];
        vet[0] = a1;
        vet[1] = a2;
        vet[2] = a3;
        
        /* for(int i = 0; i<10; i++)
            if(vet[i] != null)
                vet[i].imprimir(); */
        
        Funcionario f1 = new Funcionario("08/11/2018", "Jorge");
        
        Pessoa[] vetPessoa = new Pessoa[10];
        vetPessoa[0] = a1;
        vetPessoa[1] = f1;
        vetPessoa[2] = a2;
        vetPessoa[3] = a3;
        
         for(int i = 0; i<10; i++)
            if(vetPessoa[i] != null)
                vetPessoa[i].imprimir();
    }  
}