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
public abstract class Seguro {
    private String nomeBeneficiario;
    private float valorApolice;

    public Seguro(String nomeBeneficiario, float valorApolice) {
        this.nomeBeneficiario = nomeBeneficiario;
        this.valorApolice = valorApolice;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public float getValorApolice() {
        return valorApolice;
    }

    public void setValorApolice(float valorApolice) {
        this.valorApolice = valorApolice;
    }
    
    public abstract float premio();
}