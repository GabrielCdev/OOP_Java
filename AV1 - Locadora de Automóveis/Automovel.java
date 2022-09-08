/**
 * Escreva a descrição da classe automovel aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Automovel
{
    private String placa, modelo, cor, categoria;
    private int ano;
    
    public Automovel(String modelo, String categoria, String cor, int ano, String placa)
    {
        this.modelo = modelo;
        this.categoria = categoria;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
    }
    
    public Automovel(String modelo, String cor, int ano, String placa)
    {
        this(modelo, "Básico", cor, ano, placa);
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo()
    {
        return this.modelo;
    }
    
    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }
    
    public String getCategoria()
    {
        return this.categoria;
    }
    
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    
    public String getCor()
    {
        return this.cor;
    }
    
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    
    public int getAno()
    {
        return this.ano;
    }
    
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    public String getPlaca()
    {
        return this.placa;
    }
}