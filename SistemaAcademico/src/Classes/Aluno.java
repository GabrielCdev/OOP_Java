/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author 029181066
 */
public class Aluno {
    private int matricula;
    private String nome;
    
    public Aluno(int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
