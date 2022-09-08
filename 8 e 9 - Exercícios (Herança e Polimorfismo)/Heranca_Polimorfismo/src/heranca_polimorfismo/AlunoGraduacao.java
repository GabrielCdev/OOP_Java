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
public class AlunoGraduacao extends Aluno{
    protected String escolaOrigem;    

    public AlunoGraduacao(String escolaOrigem, int quantidadeDisciplinas, String nome) {
        super(quantidadeDisciplinas, nome);
        this.escolaOrigem = escolaOrigem;
    }

    public String getEscolaOrigem() {
        return escolaOrigem;
    }

    public void setEscolaOrigem(String escolaOrigem) {
        this.escolaOrigem = escolaOrigem;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Escola de origem: "+escolaOrigem);
    }
}