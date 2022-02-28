package ex07.aula07;
public class UEC {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;    
    
    //Método Construtor
    public UEC(String nome, String nacionalidade, int idade, float altura, float peso, String categoria, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Métodos Especiais
    public void apresentar(){
        System.out.println("Lutador: " + this.nome);
        System.out.println("Origem: " + this.nacionalidade);
        System.out.println(this.idade + " anos");
        System.out.println(this.altura + "m de altura");
        System.out.println("Pesando " + this.peso + "Kg");
        System.out.println("Ganhou: " + this.vitorias);
        System.out.println("Perdeu: " + this.derrotas);
        System.out.println("Empatou: " + this.empates);
    }
    public void status(){
        System.out.println(this.nome);
        System.out.println("é um peso " + this.peso);
        System.out.println(this.vitorias + " vitórias");
        System.out.println(this.derrotas + " derrotas");
        System.out.println(this.empates + " empates");
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
        //setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        if (this.peso<52.2) {
            this.categoria = "Inválido";
        } else if(this.peso<=70.3) {
            this.categoria = "Leve";
        } else if(this.peso<=83.9) {
            this.categoria = "Médio";
        } else if(this.peso<=120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
