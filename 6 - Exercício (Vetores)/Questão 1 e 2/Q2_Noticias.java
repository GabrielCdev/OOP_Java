/**
 * Escreva a descrição da classe Q2_Noticias aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q2_Noticias
{
    private String titulo, assunto;
    private int qtdLinhas;
    
    public Q2_Noticias(String titulo, String assunto, int qtdLinhas)
    {
        this.titulo = titulo;
        this.assunto = assunto;
        this.qtdLinhas = qtdLinhas;
    }
       
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    public void setAssunto(String assunto)
    {
        this.assunto = assunto;
    }
    
    public String getAssunto()
    {
        return this.assunto;
    }
    
    public void setQtdLinhas(int qtdLinhas)
    {
        this.qtdLinhas = qtdLinhas;
    }
    
    public int getQtdLinhas()
    {
        return this.qtdLinhas;
    }
    
    public float precoNoticias()
    {
        return this.qtdLinhas*50;
    }
}