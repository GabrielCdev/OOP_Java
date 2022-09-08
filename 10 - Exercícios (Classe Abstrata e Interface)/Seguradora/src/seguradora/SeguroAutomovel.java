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
public class SeguroAutomovel extends Seguro{
    String numChassi;
    int anoFabricacao;

    public SeguroAutomovel(String numChassi, int anoFabricacao, String nomeBeneficiario, float valorApolice) {
        super(nomeBeneficiario, valorApolice);
        this.numChassi = numChassi;
        this.anoFabricacao = anoFabricacao;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    public float premio(){
        float depreciacao = getValorApolice()*(0.02f*(2018 - getAnoFabricacao()));
        return (getValorApolice()*0.9f) - depreciacao;
        //Podia trocar o 2018 por int anoAtual... criar uma nova variável.
    }   
}