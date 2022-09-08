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
public class SeguroResidencia extends Seguro{
    private String enderecoImovel;
    private int anoConstrucao;

    public SeguroResidencia(String enderecoImovel, int anoConstrucao, String nomeBeneficiario, float valorApolice) {
        super(nomeBeneficiario, valorApolice);
        this.enderecoImovel = enderecoImovel;
        this.anoConstrucao = anoConstrucao;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }
    
    public float premio(){    
        return getValorApolice() - (0.02f*(2018-getAnoConstrucao()));
        //Podia trocar o 2018 por int anoAtual... criar uma nova variável.
    }
}
