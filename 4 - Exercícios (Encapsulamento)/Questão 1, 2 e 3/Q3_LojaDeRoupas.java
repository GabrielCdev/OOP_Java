/**
 * Escreva a descrição da classe Q3_LojaDeRoupas aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q3_LojaDeRoupas
{
    private String nomeFantasia, razaoSocial;
    private int numCNPJ, digCNPJ;
    private float valFaturamento, area;
    
    public Q3_LojaDeRoupas(String nomeFantasia, String razaoSocial, int numCNPJ, int digCNPJ)
    {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.numCNPJ = numCNPJ;
        this.digCNPJ = digCNPJ;
    }
    
    public Q3_LojaDeRoupas(String nomeFantasia, int numCNPJ, int digCNPJ, float valFaturamento, String publicoAlvo)
    {
        this.nomeFantasia = nomeFantasia = razaoSocial;
        this.numCNPJ = numCNPJ;
        this.digCNPJ = digCNPJ;
        this.valFaturamento = valFaturamento;
    }
    
    public void setNomeFantasia(String nomeFantasia)
    {
        this.nomeFantasia = nomeFantasia;
    }
    
    public String getNomeFantasia()
    {
        return this.nomeFantasia;
    }
    
    public void setRazaoSocial(String razaoSocial)
    {
        this.razaoSocial = razaoSocial;
    }
    
    public String getRazaoSocial()
    {
        return this.razaoSocial;
    }
    
    public void setNumCNPJ(int numCNPJ)
    {
        this.numCNPJ = numCNPJ;
    }
    
    public String getNumCNPJ()
    {
        return this.numCNPJ+"-"+this.digCNPJ;
    }
    
    public void setdigCNPJ(int digCNPJ)
    {
        this.digCNPJ = digCNPJ;
    }
    
    public int getDigCNPJ()
    {
        return this.digCNPJ;
    }
    
    public void setValFaturamento(float valFaturamento)
    {
        this.valFaturamento = valFaturamento;
    }
    
    public float getValFaturamento()
    {
        return this.valFaturamento;
    }
    
    public void setArea(float area)
    {
        this.area = area;
    }
    
    public float getArea()
    {
        return this.area;
    }
    
    public float nivelFaturamento(float precVendaL1, int totProdutVendL1, float precVendaL2, int totProdutVendL2)
    {
        float fatL1, fatL2;
        float nivelFaturamento;
        
        fatL1 = precVendaL1 * totProdutVendL1;
        fatL2 = precVendaL2 * totProdutVendL2;
        
        nivelFaturamento = (fatL1 - fatL2)/100;
        return nivelFaturamento;
    }
    
    public float valorAluguel()
    {
        float valor;
        
        valor = this.area*50;
        return valor;
    }
}