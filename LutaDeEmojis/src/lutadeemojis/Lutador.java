package lutadeemojis;

public class Lutador {
    //Atributos:
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, empates, derrotas;
    private float altura, peso;

    //Construtor:
    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int empates, int derrotas, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.altura = altura;
        this.setPeso(peso);
    }

    //Métodos:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso >= 52.2 && this.peso <= 70.3)
            this.categoria = "Leve";
        else
            if(this.peso > 70.3 && this.peso <= 83.9)
                this.categoria = "Médio";
            else
                if(this.peso > 84 && this.peso <= 120.2)
                    this.categoria = "Pesado";
                else
                    this.categoria = "Inválido!";
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    
    public void apresentar() {
        System.out.println("Nome: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade()+" anos");
        System.out.println("Altura: "+this.getAltura()+"m");
        System.out.println("Peso: "+this.getPeso()+"Kg");
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("Derrotas: "+this.getDerrotas());
    }
    
    public void status() {
        System.out.println(this.getNome()+" é da categoria Peso-"+this.getCategoria());
        System.out.println("Ganhou "+this.getVitorias()+" vezes!");
        System.out.println("Perdeu: "+this.getDerrotas()+" vezes!");
        System.out.println("Empatou "+this.getEmpates()+" vezes!");
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);        
    }
}
