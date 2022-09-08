/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradora;

/**
 *
 * @author 029181066
 */
public class SeguroDeVida extends Seguro implements Exemplo{
    private int idadeSegurado;

    public SeguroDeVida(int idadeSegurado, String nomeBeneficiario, float valorApolice) {
        super(nomeBeneficiario, valorApolice);
        this.idadeSegurado = idadeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }
    
    public float premio(){
        if(idadeSegurado < 50)
            return getValorApolice()*1.1f;
        else
            return getValorApolice();
    }
    
    public void imprimir(){
        
    }
    
    public void enviarEmail(){
        
    }
    
    public int calcular(){
        return 10;
    }
}