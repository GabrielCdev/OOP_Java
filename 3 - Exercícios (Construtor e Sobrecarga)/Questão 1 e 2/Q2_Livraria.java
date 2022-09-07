/**
 * Escreva a descrição da classe Q2_Livraria aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q2_Livraria
{
    private int cod, ed, ano, qtdEstoque;
    private String titulo, autor;
    private float preco;
    
    public Q2_Livraria(int cod, String titulo, String autor, int ed, int ano, float preco, int qtdEstoque)
    {
        this.cod = cod;
        this.titulo = titulo;
        this.autor = autor;
        this.ed = ed;
        this.ano = ano;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    
    public Q2_Livraria(int cod, String titulo, String autor, int ed, int ano, int preco)
    {
        this(cod, titulo, autor, ed, ano, preco, 0);
    }
    
    public void setCod(int cod)
    {
        this.cod = cod;
    }
    
    public int getCod()
    {
        return this.cod;
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public String getAutor()
    {
        return this.autor;
    }
    
    public void setEdicao(int ed)
    {
        this.ed = ed;
    }
    
    public int getEdicao()
    {
        return this.ed;
    }
    
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public int getAno()
    {
        return this.ano;
    }
    
    public void setPreco(float preco)
    {
        this.preco = preco;
    }
    
    public float getPreco()
    {
        return this.preco;
    }
    
    public void getQtdEstoque(int qtdEstoque)
    {
        this.qtdEstoque = qtdEstoque;
    }
    
    public int getQtdEstoque()
    {
        return this.qtdEstoque;
    }
    
    public float calculoVenda(int qtdLivro, float percentLucro)
    {
        float v;
        
        v = qtdLivro * this.preco * percentLucro;
        this.qtdEstoque -= qtdLivro;
        
        return v;
    }
    
    public float calculoVenda2(int qtdLivro)
    {
        float v, perc;
        perc  = 40/100;
        
        v  = qtdLivro * this.preco * perc;
        this.qtdEstoque -= qtdLivro;
        
        return v;
    }
    
    public float calcEstoque(float precoLivros)
    {
        return this.qtdEstoque * precoLivros;
    }
}   