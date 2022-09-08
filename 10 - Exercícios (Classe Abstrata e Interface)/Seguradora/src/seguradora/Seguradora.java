/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguradora;
/**
 *
 * @author 029181066
 */
public class Seguradora {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Seguro[] vet = new Seguro[10];
        vet[0] = new SeguroDeVida(48, "João Silvério", 1000000);
        vet[1] = new SeguroAutomovel("BR45BA66", 2016, "José", 55528);
        vet[2] = new SeguroResidencia("Rua A, Casa 8, Salvador - BA", 1998, "Joana", 200000);
        
        for(int i=0; i<10; i++)
            if(vet[i] != null){
                System.out.println("Nome do Beneficiário: "+vet[i].getNomeBeneficiario());
                System.out.println("Prêmio: R$"+vet[i].premio());                
            }
    }  
}