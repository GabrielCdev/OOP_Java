/**
 * Escreva a descrição da classe Q3_ANIMAIS aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q2_Animais
{
    private String tipo, nome;
    private int idade;
    
    public Q2_Animais(String tipo, String nome, int idade)
    {
        this.tipo = tipo;
        this.nome = nome;
        this.idade = idade;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    
    public int getIdade()
    {
        return this.idade;
    }
    
    public int calculoAlimento()
    {
        int qtd = 0;
        
        if(tipo.equals("mamifero"))
            qtd = this.idade*2000;
        else
            if(tipo.equals("ave"))
                qtd = this.idade*100;
            else
                qtd = this.idade*20;
                    
        return qtd; 
    }
}