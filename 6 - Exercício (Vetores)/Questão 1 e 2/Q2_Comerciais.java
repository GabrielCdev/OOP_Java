/**
 * Escreva a descrição da classe Q2_Comerciais aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q2_Comerciais
{
    private String produto;
    private float valor;
    
    public Q2_Comerciais(String produto, float valor)
    {
        this.produto = produto;
        this.valor = valor;
    }
    
    public void setProduto(String produto)
    {
        this.produto = produto;
    }
    
    public String getProduto()
    {
        return this.produto;
    }
    
    public void setValor(float valor)
    {
        this.valor = valor;
    }
    
    public float getValor()
    {
        return this.valor;
    }
}