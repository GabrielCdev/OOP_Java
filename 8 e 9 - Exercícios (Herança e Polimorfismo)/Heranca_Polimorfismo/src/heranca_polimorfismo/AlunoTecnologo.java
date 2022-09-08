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
public class AlunoTecnologo extends Aluno{
    protected String estagio;

    public AlunoTecnologo(String estagio, int quantidadeDisciplinas, String nome) {
        super(quantidadeDisciplinas, nome);
        this.estagio = estagio;
    }

    public String getEstagio() {
        return estagio;
    }

    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }
}