/**
 * Escreva a descrição da classe Q2_Jornal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q2_Jornal
{
    private String nome, data;
    private int edicao;
    private Q2_Noticias[] vetNoticias;
    private Q2_Comerciais[] vetComerciais;
        
    public Q2_Jornal(String nome, String data, int edicao, int qtdNoticias, int qtdComerciais)
    {
        this.nome = nome;
        this.data = data;
        this.edicao = edicao;
        vetNoticias = new Q2_Noticias[qtdNoticias];
        vetComerciais = new Q2_Comerciais[qtdComerciais];
    }
    
    public Q2_Jornal(String nome, String data, int edicao, int qtdNoticias)
    {
        this.nome = nome;
        this.data = data;
        this.edicao = edicao;
        vetNoticias = new Q2_Noticias[qtdNoticias];
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setData(String data)
    {
        this.data = data;
    }
    
    public String getData()
    {
        return this.data;
    }
    
    public void setEdicao(int edicao)
    {
        this.edicao = edicao;
    }
    
    public int getEdicao()
    {
        return this.edicao;
    }
    
    public void addNoticia(Q2_Noticias nova)
    {
        for(int cont = 0; cont < vetNoticias.length; cont++)
            if(vetNoticias[cont] == null)
            {
                vetNoticias[cont] = nova;
                break;
            }
    }
    
    public void addComercial(Q2_Comerciais novo)
    {
        for(int i = 0; i < vetComerciais.length; i++)
            if(vetComerciais[i] == null)
            {
                vetComerciais[i] = novo;
                break;
            }
    }
                
    public boolean substituirNoticia(Q2_Noticias substituta)
    {
        for(int cont = 0; cont < vetNoticias.length; cont++)
            if(vetNoticias[cont] != null)
                if(vetNoticias[cont].getQtdLinhas() == substituta.getQtdLinhas() && vetNoticias[cont].getAssunto().equals(substituta.getAssunto()))
            {
                vetNoticias[cont] = substituta;
                return true;
            }
        return false;
    }
    
    public boolean calcularLucro()
    {
        float custo = 0;
        float receita = 0;
        
        for(int cont = 0; cont < vetNoticias.length; cont++)
            if(vetNoticias[cont] != null)
                custo += vetNoticias[cont].precoNoticias();
                
        for(int cont = 0; cont < vetComerciais.length; cont++)
            if(vetComerciais[cont] != null)
                receita += vetComerciais[cont].getValor();
                
        if(custo<receita)
            return true;
        else
            return false;
    }
}