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
public class AlunoPos extends Aluno{
    protected String orientador;
    protected float precoCurso;

    public AlunoPos(String orientador, float precoCurso, int quantidadeDisciplinas, String nome) {
        super(quantidadeDisciplinas, nome);
        this.orientador = orientador;
        this.precoCurso = precoCurso;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public float getPrecoCurso() {
        return precoCurso;
    }

    public void setPrecoCurso(float precoCurso) {
        this.precoCurso = precoCurso;
    }
    
    public float calcMensalidade(){
        mensalidade = precoCurso/18;
        return mensalidade;
    }
}