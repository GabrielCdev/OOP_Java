/**
 * Escreva a descrição da classe Q2_RETANGULO aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q1_Retangulo
{
    private float comp, larg;
    
    public Q1_Retangulo(float comp, float larg)
    {
        if(comp > 0 && larg > 0)
        {
            this.comp = comp;
            this.larg = larg;
        }
    }
    
    public void setComp(float comp)
    {
        if(comp > 0)
            this.comp = comp;
    }
    
    public float getComp()
    {
        return this.comp;
    }
    
    public void setLarg(float larg)
    {
        if(larg > 0)
            this.larg = larg;
    }
    
    public float getLarg()
    {
        return this.larg;
    }
    
    public float calcPerimetro()
    {
        float per;
        return per = (this.comp*2) + (this.larg*2);
    }
    
    public float calcArea()
    {
        float a;
        return a = this.comp*this.larg;
    }
}