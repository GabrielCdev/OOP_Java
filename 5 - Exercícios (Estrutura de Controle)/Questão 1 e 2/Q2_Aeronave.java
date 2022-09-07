/**
 * Escreva a descrição da classe Q2_Aviao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q2_Aeronave
{
    private String matricula, modelo, fabricante, dataFabricacao;
    private int qtdAssentos, qtdAssentosOcup;
    
    public Q2_Aeronave(String fabricante, String modelo, String matricula, String dataFabricacao, int qtdAssentos)
    {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.matricula = matricula;
        this.dataFabricacao = dataFabricacao;
        this.qtdAssentos = qtdAssentos;
        qtdAssentosOcup = 0;
    }
    
    public void setFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }
    
    public String getFabricante()
    {
        return this.fabricante;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    
    public void getMatricula()
    {
        System.out.println("Matrícula: "+this.matricula);
    }
    
    public void setDataFabricacao(String dataFabricacao)
    {
        this.dataFabricacao = dataFabricacao;
    }
    
    public String getDataFabricacao()
    {
        return this.dataFabricacao;
    }
    
    public void setQtdAssentos(int qtdAssentos)
    {
        this.qtdAssentos = qtdAssentos;
    }
    
    public int getQtdAssentos()
    {
        return this.qtdAssentos;
    }
    
    public void ocuparAssentos(int qtd)
    {
        if(qtdAssentos > qtd)
        {
            this.qtdAssentosOcup += qtd;
            qtdAssentos -= qtd;
        }
        else
            System.out.println("Quantidade de assentos disponíveis excedida!");    
    }
    
    public String disponibilidadeAssentos()
    {
        if(this.qtdAssentos > this.qtdAssentosOcup)
            return "Há assentos disponíveis!";
        else
            return "Não há assentos disponíveis!";
    }
}