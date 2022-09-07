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
public class Paciente {
    private String numCPF, nome, endereco, telefone;
    private Consulta[] vetConsulta = new Consulta[100];

    public Paciente(String numCPF, String nome, String endereco, String telefone) {
        this.numCPF = numCPF;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
       
    public String getNumCPF() {
        return numCPF;
    }

    public void setNumCPF(String numCPF) {
        this.numCPF = numCPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void addConsulta(Consulta nova){
        for(int i = 0; i<100; i++)
            if(vetConsulta[i] == null)
            {
                vetConsulta[i] = nova;
                break;
            }
    }
    
    public float totalGasto(){
        float total = 0;
        
        for(int i = 0; i<100; i++)
            if(vetConsulta[i] != null)
                total += vetConsulta[i].getValCons();
        
        return total;
    }
    
    public void imprimir(){
        System.out.println("CPF: "+numCPF);
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
    }
}