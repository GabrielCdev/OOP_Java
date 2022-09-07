
/**
 * Escreva a descrição da classe Nota aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Nota
{
    String nomeAluno;
    int av1, av2, av3;
        
    void inicializa(String n, int a1, int a2, int a3)
    {
        av1 = a1;
        av2 = a2;
        av3 = a3;
        nomeAluno=n;
    }
    
    void calcularMedia()
    {
        float media;
        media = (av1+av2+av3)/3;
        System.out.println(media);
    }
}