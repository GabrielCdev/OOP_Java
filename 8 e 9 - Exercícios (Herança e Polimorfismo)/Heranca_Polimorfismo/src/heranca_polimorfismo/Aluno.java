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
public class Aluno extends Pessoa {
    protected float mensalidade;
    protected int quantidadeDisciplinas;

    public Aluno(int quantidadeDisciplinas, String nome) {
        super(nome);
        this.quantidadeDisciplinas = quantidadeDisciplinas;
    }

    public int getQuantidadeDisciplinas() {
        return quantidadeDisciplinas;
    }

    public void setQuantidadeDisciplinas(int quantidadeDisciplinas) {
        this.quantidadeDisciplinas = quantidadeDisciplinas;
    }
    
    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }
    
    public float calcMensalidade(){
        mensalidade = quantidadeDisciplinas*100;
        return mensalidade;
    }
    
    @Override
    public void enviarMalaDireta(){
        System.out.println("");
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Mensalidade: "+calcMensalidade());
    }   
}