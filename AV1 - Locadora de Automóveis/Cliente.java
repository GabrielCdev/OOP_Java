/**
 * Escreva a descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cliente
{
    private int numCPF, telefone;
    private String nome, email;
    
    public Cliente(String nome, int numCPF, int telefone, String email)
    {
        this.nome = nome;
        this.numCPF = numCPF;
        this.telefone = telefone;
        this.email = email;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNumCPF(int numCPF)
    {
        this.numCPF = numCPF;
    }
    
    public int getNumCPF()
    {
        return this.numCPF;
    }
    
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
    
    public int getTelefone()
    {
        return this.telefone;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getEmail()
    {
        return this.email;
    }
}