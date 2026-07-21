package trabalho03;

// CLASSE FILHA (Herança): Guerreiro herda (extends) todos os atributos e métodos de Personagem.
public class Guerreiro extends Personagem {
    // ATRIBUTO ESPECÍFICO: Característica exclusiva que apenas a classe Guerreiro possui.
    double forca;

    // CONSTRUTOR: Função para criar o objeto Guerreiro na memória.
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, double forca){
        // Super: Envia os dados comuns para o construtor da classe pai (Personagem).
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    // @Override: Indica que estamos sobrescrevendo (redefinindo) um método que veio da classe pai.
    @Override
    // MÉTODO: Função que executa a ação da habilidade especial do Guerreiro.
    public void usarHabilidadeEspecial(){
        System.out.println("Guerreiro " + this.nome + " ataca com Espada Flamejante!");
    }
}