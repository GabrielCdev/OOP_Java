/**
 * Escreva a descrição da classe Q1_LigacaoTelefonica aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q1_LigacaoTelefonica
{
    private String numOrigem, localOrigem, numDest, localDest;
    private Q1_Tempo tempoInicio, tempoFim;
    
    public Q1_LigacaoTelefonica(Q1_Tempo tempoInicio, String localOrigem, String numOrigem, Q1_Tempo tempoFim, String localDest, String numDest)
    {
        this.tempoInicio = tempoInicio;
        this.localOrigem = localOrigem;
        this.numOrigem = numOrigem;
        this.tempoFim = tempoFim;
        this.localDest = localDest;
        this.numDest = numDest;
    }
    
    public void setNumOrigem(String numOrigem)
    {
        this.numOrigem = numOrigem;
    }
    
    public String getNumOrigem()
    {
        return this.numOrigem;
    }
    
    public void setLocalOrigem(String localOrigem)
    {
        this.localOrigem = localOrigem;
    }
    
    public String getLocalOrigem()
    {
        return this.localOrigem;
    }
    
    public void setNumDest(String numDest)
    {
        this.numDest = numDest;
    }
    
    public String getNumDest()
    {
        return this.numDest;
    }
    
    public void setLocalDest(String localDest)
    {
        this.localDest = localDest;
    }
    
    public String getLocalDest()
    {
        return this.localDest;
    }
    
    public float valLig()
    {
        float valLig = 0;
        int x, y;
        
        x = tempoInicio.totSeg();
        y = tempoFim.totSeg();
        
        valLig = (y-x)/60;
        
        if(valLig%60 > 0)
            valLig++;
        
        return valLig;
    }
    
    public void localDestino()
    {
        System.out.println("Local de destino: "+this.localDest);
    }
    
    public boolean verificarLig(String numTel)
    {
        if(numTel.equals(numOrigem) || numTel.equals(numDest))
            return true;
        else
            return false;
    }
}