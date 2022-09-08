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
public class Funcionario extends Pessoa{
    protected String dataAdmissao;

    public Funcionario(String dataAdmissao, String nome) {
        super(nome);
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
     public void enviarMalaDireta(){
        System.out.println("");
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Data de admissão: "+dataAdmissao);
    }
    
    public float calcSalario(){
        return 1000;
    }
}