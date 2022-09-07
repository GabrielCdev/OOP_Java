/**
 * Escreva a descrição da classe Q1_Ligacao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q1_Ligacao
{
    private String localOrig, localDest;
    private int numOrig, numDest;
    private Q1_Tempo tempIni, tempFim;
    
    public Q1_Ligacao(Q1_Tempo tempIni, Q1_Tempo tempFim, String localOrig, int numOrig, String localDest, int numDest)
    {
       this.tempIni = tempIni;
       this.tempFim = tempFim;
       this.localOrig = localOrig;
       this.numOrig = numOrig;
       this.localDest = localDest;
       this.numDest = numDest;
    }
    
    public void setLocalOrig(String localOrig)
    {
        this.localOrig = localOrig;
    }
    
    public String getLocalOrig()
    {
        return this.localOrig;
    }
    
    public void setTempIni(Q1_Tempo tempIni)
    {
        this.tempIni = tempIni;
    }
    
    public Q1_Tempo getTempIni()
    {
        return this.tempIni;
    }
    
    public void setNumOrig(int numOrig)
    {
        this.numOrig = numOrig;
    }
    
    public int getNumOrig()
    {
        return this.numOrig;
    }
    
    public void setLocalDest(String localDest)
    {
        this.localDest = localDest;
    }
    
    public String getLocalDest()
    {
        return this.localDest;
    }
    
    public void setTempFim(Q1_Tempo tempFim)
    {
        this.tempFim = tempFim;
    }
    
    public Q1_Tempo getTempFim()
    {
        return this.tempFim;
    } 
    
    public void setNumDest(int numDest)
    {
        this.numDest = numDest;
    }
    
    public int getNumDest()
    {
        return this.numDest;
    }
    
    public float valLig()
    {
        int valLig = 0;
        int x, y, z;
        
        x = tempIni.totalSeg();
        y = tempFim.totalSeg();
        
        z = y-x;
        valLig = z/60;
        
        if (z % 60 > 0)
            valLig++;
        return valLig;
    }
    
    public void local()
    {
        System.out.println("Local de destino: "+this.localDest);
    }
    
    public boolean procuraNumero(int numLig)
    {
        return ((numLig == numOrig) || (numLig == numDest));
    }
}