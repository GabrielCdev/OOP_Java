/**
 * Escreva a descrição da classe Q2_Locadora aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q2_LocadoraDeAutomoveis
{
    private String marca, modelo, cor, placa, chassi;
    private float preco;
    private int qtdOpcionais;
    
    public Q2_LocadoraDeAutomoveis(String marca, String modelo, String cor, String placa, String chassi, float preco, int qtdOpcionais)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
        this.preco = preco;
        this.qtdOpcionais = qtdOpcionais;
    }
    
    private Q2_LocadoraDeAutomoveis(String marca, String modelo, String placa, String chassi, float preco)
    {
        this(marca, modelo, "Branco", placa, chassi, preco, 0);
    }
    
    private void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    private String getMarca()
    {
        return this.marca;
    }
    
    private void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    private String getModelo()
    {
        return this.modelo;
    }
    
    private void setCor(String cor)
    {
        this.cor = cor;
    }
    
    private String getCor()
    {
        return this.cor;
    }
    
    private void setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    private String getPlaca()
    {
        return this.placa;
    }
    
    private void setChassi(String chassi)
    {
        this.chassi = chassi;
    }
    
    private String getChassi()
    {
        return this.chassi;
    }
    
    private void setPreco(float preco)
    {
        this.preco = preco;
    }
    
    private float getPreco()
    {
        return this.preco;
    }
    
    private void setQtdOpcionais(int qtdOpcionais)
    {
        this.qtdOpcionais = qtdOpcionais;
    }
    
    private int getQtdOpcionais()
    {
        return this.qtdOpcionais;
    }
    
    public float precoAutomovel()
    {
        float precoAuto;
        
        precoAuto = this.preco + (this.qtdOpcionais*500);
        return precoAuto;
    }
    
    public float calculoPrestacao(int qtdPrest, int percJuros)
    {
        float calcPrest;
        
        calcPrest = (this.precoAutomovel() + (this.precoAutomovel()*percJuros/100)) / qtdPrest;
        
        return calcPrest;
    }
    
    public void impressaoDados()
    {
        System.out.println("Marca: "+this.marca +"\nModelo: "+this.modelo +"\nCor: "+this.cor +"\nPlaca: "+this.placa + "\nChassi: "+this.chassi);
        System.out.println("Quantidade de Opcionais: "+this.qtdOpcionais +"\nPreço final: R$"+precoAutomovel());
    }
}