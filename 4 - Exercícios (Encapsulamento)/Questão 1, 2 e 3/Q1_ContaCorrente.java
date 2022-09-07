/**
 * Escreva a descrição da classe Q1_ContaCorrente aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Q1_ContaCorrente
{
    private int num, digVerificador;
    private float saldo, limite;
    private String status;
    
    public Q1_ContaCorrente(int num, int digVerificador, float saldo, float limite, String status)
    {
        this.num = num;
        this.digVerificador = digVerificador;
        this.saldo = saldo;
        this.limite = limite;
        this.status = status;
    }
    
    private void setNum(int num)
    {
        this.num = num;
    }
    
    private int getNum()
    {
        return this.num;
    }
    
    private String getNumeracaoCompleta()
    {
        return this.num+"-"+this.digVerificador;
    }
    
    private void setDigVerificador(int digVerificador)
    {
        this.digVerificador = digVerificador;
    }
    
    private int getDigVerificador()
    {
        return this.digVerificador;
    }
    
    private void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }
    
    private float getSaldo()
    {
        return this.saldo;
    }
    
    private void setLimite(float limite)
    {
        if(limite >= 0)
            this.limite = limite;
    }
    
    private float getLimite()
    {
        return this.limite;
    }
    
    private void setStatus(String status)
    {
        this.status = status;
    }
    
    private String getStatus()
    {
        return this.status;
    }
    
    private String saque(int valorSaque)
    {
        if((valorSaque <= limite) && (valorSaque <= saldo))
        {
            saldo = saldo - valorSaque;
            return "Saque efetuado com sucesso!";
        }
        else
            return "Saque não autorizado! Saque ou limite insuficiente!";
    }
    
    private void deposito(float valorDeposito)
    {
        if(valorDeposito > 0)
        {
            saldo = saldo + valorDeposito;
        }
    }
}