/**
 * Escreva a descrição da classe Q1_AluguelDeImovel aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q1_AluguelDeImovel
{
    private int numContrato, qtdMesesTotal, qtdPrestPagas, qtdPrestAtraso, qtdMesesDespejo;
    private float valPrest, percentJuros;
    
    public Q1_AluguelDeImovel(int numContrato, float valPrest, int qtdMesesTotal, int qtdPrestPagas, int qtdPrestAtraso, float percentJuros, int qtdMesesDespejo)
    {
        this.numContrato = numContrato;
        this.valPrest = valPrest;
        this.qtdMesesTotal = qtdMesesTotal;
        this.qtdPrestPagas = qtdPrestPagas;
        this.qtdPrestAtraso = qtdPrestAtraso;
        this.percentJuros = percentJuros;
        this.qtdMesesDespejo = qtdMesesDespejo;
    }
    
    public Q1_AluguelDeImovel(int numContrato, float valPrest, int qtdMesesTotal, float percentJuros, int qtdMesesDespejo)
    {
        this(numContrato, valPrest, qtdMesesTotal, 0, 0, percentJuros, qtdMesesDespejo);
    }
    
    public void setNumContrato(int numContrato)
    {
        this.numContrato = numContrato;
    }
    
    public int getNumContrato()
    {
        return this.numContrato;
    }
    
    public void setValPrest(float valPrest)
    {
        this.valPrest = valPrest;
    }
    
    public float getValPrestSemJuros()
    {
        return this.valPrest;
    }
    
    public void setQtdMesesTotal(int qtdMesesTotal)
    {
        this.qtdMesesTotal = qtdMesesTotal;
    }
    
    public int getQtdMesesTotal()
    {
        return this.qtdMesesTotal;
    }
    
    public void setQtdPrestPagas(int qtdPrestPagas)
    {
        this.qtdPrestPagas = qtdPrestPagas;
    }
    
    public int getQtdPrestPagas()
    {
        return this.qtdPrestPagas;
    }
    
    public void setQtdPrestAtraso(int qtdPrestAtraso)
    {
        this.qtdPrestAtraso = qtdPrestAtraso;
    }
    
    public int getQtdPrestAtraso()
    {
        return this.qtdPrestAtraso;
    }
    
    public void setPercentJuros(float percentJuros)
    {
        this.percentJuros = percentJuros;
    }
    
    public float getPercentJuros()
    {
        return this.percentJuros;
    }
    
    public void setQtdMesesDespejo(int qtdMesesDespejo)
    {
        this.qtdMesesDespejo = qtdMesesDespejo;
    }
    
    public int getQtdMesesDespejo()
    {
        return this.qtdMesesDespejo;
    }
    
    public float valPrestComJuros()
    {
        float valorJuros;
        
        valorJuros = this.valPrest / (this.percentJuros/100);
        return valorJuros;
    }
    
    public boolean verificarDespejo()
    {
        if(this.qtdPrestAtraso > this.qtdMesesDespejo)
            return true;
        else
            return false;
    }
}