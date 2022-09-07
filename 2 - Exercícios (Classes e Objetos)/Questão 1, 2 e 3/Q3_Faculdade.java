/**
 * Escreva a descrição da classe Q3_Faculdade aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q3_Faculdade
{
    private String nome, curso;
    private int anoIngresso, qtdDiscAprov;
    
    public Q3_Faculdade(String nome, String curso, int anoIngresso, int qtdDiscAprov)
    {
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.qtdDiscAprov = qtdDiscAprov;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    
    public String getCurso()
    {
        return this.curso;
    }
    
    public void setAnoIngresso(int anoIngresso)
    {
        this.anoIngresso = anoIngresso;
    }
    
    public int getAnoIngresso()
    {
        return this.anoIngresso;
    }
    
    public void setQtdDiscAprov(int qtdDiscAprov)
    {
        this.qtdDiscAprov = qtdDiscAprov;
    }
    
    public int getQtdDiscAprov()
    {
        return this.qtdDiscAprov;
    }
    
    public int calcularCreditos()
    {
        return this.qtdDiscAprov*4;
    }
    
    public int calcTempoFaculdade(int anoAtual)
    {
        return anoAtual - this.anoIngresso;
    }
}