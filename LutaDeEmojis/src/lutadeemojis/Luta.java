package lutadeemojis;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiante, desafiado;
    private int rounds;
    private boolean aprovacao;

    //Métodos
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
    }
    
    
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovacao = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }            
        else {
            this.aprovacao = false;
            this.desafiante = null;
            this.desafiado = null;
        }           
    }
    
    
    public void lutar() {
        if(this.aprovacao) {
            System.out.println("======= DESAFIADO =======");
            this.desafiante.apresentar();
            System.out.println("======= DESAFIANTE =======");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0, 1 ou 2.
            System.out.println("====== RESULTADO DA LUTA =====");
            
            switch(vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                
                case 1:
                    System.out.println("Vitória do "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2:
                    System.out.println("Vitória do "+this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }                       
            System.out.println("========================================");
        }
        else
            System.out.println("A luta não pode acontecer!");
    } 
}