package trabalho03;

// CLASSE: Define como um Personagem deve ser estruturado.
public abstract class Personagem implements  Comparable<Personagem>{
    //Atributos: Características que cada objeto terá.
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    //Contrutor: Função especial usada para criar (instanciar) os OBJETOS na memória.
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }
    // MÉTODO: Calcula e retorna o poder total dinamicamente.
    public double getPoderTotal() {
        return this.nivel * this.poderBase;
    }

    // MÉTODO: Função para exibir os status dos personagens.
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("- Nome: " + this.nome);
        System.out.println("- Classe: " + this.classe);
        System.out.println("- Nível: " + this.nivel);
        System.out.println("- Pontos de vida: " + this.pontosDeVida);
        System.out.println("- Poder de Base: " + this.poderBase);
        System.out.println();

       
    }
    //Método: Função abstrata para exibir a habilidade especial.
    public abstract void usarHabilidadeEspecial();

    // MÉTODO: Compara dois personagens pelo nível para permitir ordenação (interface Comparable).
    @Override
    public int compareTo(Personagem outro){
        return Integer.compare(this.nivel, outro.nivel);
}
}