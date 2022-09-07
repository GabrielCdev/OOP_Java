/**
 * Escreva a descrição da classe Q1_ContaTelefonica aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q1_ContaTelefonica
{
    private int mes, ano, numContrato;
    private Q1_Ligacao[] listaLigacoes = new Q1_Ligacao[100];
    
    public Q1_ContaTelefonica(int mes, int ano, int numContrato)
    {
        this.mes = mes;
        this.ano = ano;
        this.numContrato = numContrato;
    }
    
    public void setMes(int mes)
    {
        this.mes = mes;
    }
    
    public int getMes()
    {
        return this.mes;
    }
    
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public int getAno()
    {
        return this.ano;
    }
    
    public void setNumContrato(int numContrato)
    {
        this.numContrato = numContrato;
    }
    
    public int getNumContrato()
    {
        return this.numContrato;
    }
    
    public void setListaLigacoes(Q1_Ligacao[] listaLigacoes)
    {
        this.listaLigacoes = listaLigacoes;
    }
    
    public Q1_Ligacao[] getListaLigacoes()
    {
        return this.listaLigacoes;
    }
    
    public void addLigacao(Q1_Ligacao novaLigacao)
    {
        for(int cont=0; cont<100; cont++)
        {
            if(listaLigacoes[cont] == null)
            {
                listaLigacoes[cont] = novaLigacao;
                break;
            }
        }
    }
    
    public int totalConta(int num)
    {
        int totalConta = 0;
        
        for(int cont=0; cont<100; cont++)
            if(listaLigacoes[cont] != null)
                if(listaLigacoes[cont].procuraNumero(num))
                    totalConta += listaLigacoes[cont].valLig();
        
        return totalConta;
    }
}