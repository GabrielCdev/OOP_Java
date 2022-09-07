/**
 * Escreva a descrição da classe Q1_Tempo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q1_Tempo
{
    private int h, min, seg;
    
    public Q1_Tempo(int h, int min, int seg)
    {
        this.h = h;
        this.min = min;
        this.seg = seg;
    }
    
    public void setH(int h)
    {
        this.h = h;
    }
    
    public int getH()
    {
        return this.h;
    }
    
    public void setMin(int min)
    {
        this.min = min;
    }
    
    public int getMin()
    {
        return this.min;
    }
    
    public void setSeg(int seg)
    {
        this.seg = seg;
    }
    
    public int getSeg()
    {
        return this.seg;
    }
    
    public int totalSeg()
    {
        return (h*3600)+(min*60)+seg;
    }
}