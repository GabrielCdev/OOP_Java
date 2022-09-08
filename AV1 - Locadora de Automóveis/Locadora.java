/**
 * Escreva a descrição da classe Locadora aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Locadora
{
    private String inicioContrato, fimContrato;
    private Automovel[] vetAutomovel;
    private Cliente[] vetCliente;
    
    public Locadora(String inicioContrato, String fimContrato)
    {
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }
    
    public void setInicioContrato(String inicioContrato)
    {
        this.inicioContrato = inicioContrato;
    }
    
    public String getInicioContrato()
    {
        return this.inicioContrato;
    }
    
    public void setFimContrato(String fimContrato)
    {
        this.fimContrato = fimContrato;
    }
    
    public String getFimContrato()
    {
        return this.fimContrato;
    }
    
    public boolean retirarAutomovel(Automovel novo)
    {
        for(int cont = 0; cont < vetAutomovel.length; cont++)
            if(vetAutomovel[cont].getCategoria() != null)
                if(vetAutomovel[cont].getAno() <= novo.getAno() && vetAutomovel[cont].getCategoria().equals(novo.getCategoria()))
                {
                    vetAutomovel[cont] = novo;
                    return true;
                }
                else
                    return false;
    }
    
    public float calculoLocacao(int diaria)
    {
        float valor = 0;
        
        if(vetAutomovel.getCategoria().equals("basico"))
            valor = diaria*120;
        else
            if(vetAutomovel.getCategoria().equals("luxo"))
                valor = diaria*160;
            else
                if(vetAutomovel.getCategoria().equals("superluxo"))
                    valor = diaria*210;
                    
        return valor;
    }
}