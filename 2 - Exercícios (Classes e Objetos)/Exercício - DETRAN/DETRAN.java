/**
 * Escreva a descrição da classe Q1_DETRAN aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class DETRAN
{
    private int numCNH, CPF, pts;
    private String tipo, dataVal, dataExp, situacao;
    
    public DETRAN(int numCNH, int CPF, String tipo, String dataVal, String dataExp)
    {
        this.numCNH = numCNH;
        this.CPF = CPF;
        pts = 0;
        this.tipo = tipo;
        this.dataVal = dataVal;
        this.dataExp = dataExp;
        situacao = "Válida";
    }
    
    public void setNumCNH(int numCNH)
    {
        this.numCNH = numCNH;
    }
    
    public int getNumCNH()
    {
        return this.numCNH;
    }
    
    public void setCPF(int CPF)
    {
        this.CPF = CPF;
    }
    
    public int getCPF()
    {
        return this.CPF;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public void setDataExp(String dataExp)
    {
        this.dataExp = dataExp;
    }
    
    public String getDataExp()
    {
        return this.dataExp;
    }
    
    public void setDataVal(String dataVal)
    {
        this.dataVal = dataVal;
    }
    
    public String getDataVal()
    {
        return this.dataVal;
    }
    
    public void adPontos(int qtd)
    {
        this.pts += qtd;
        
        if(this.pts >= 20)
            this.situacao = "Apreendida";
    }
    
    public void zerarPts()
    {
        this.pts = 0;
        this.situacao = "Válida";
    }
    
    public int consultarPts()
    {
        return this.pts;
    }
    
    public String consultarSitu()
    {
        return this.situacao;
    }
}