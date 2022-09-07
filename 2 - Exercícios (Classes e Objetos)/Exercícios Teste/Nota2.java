
public class Nota2

{
     
   String nomeAluno;
    
   int av1, av2, av3;
        
    
   void inicializa(String n, int a1, int a2, int a3)
    
{
        
   av1 = a1;
        
   av2 = a2;
       
   av3 = a3;
        
   nomeAluno = n;
    
}
    
    

    float calcularMedia(float p1, float p2, float p3)

    {
        
	float media;
        
	media = (av1*p1 + av2*p2 + av3*p3)/(p1+p2+p3);

        return media;

    }


    
    String concatena()

    {

        return nomeAluno + " " + calcularMedia (4, 5, 6);

    }

}
