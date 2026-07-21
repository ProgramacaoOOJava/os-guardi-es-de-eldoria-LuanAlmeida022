package trabalho03;

// CLASSE FILHA (Herança): Mago herda (extends) todos os atributos e métodos de Personagem.
public class Mago extends Personagem {
    // ATRIBUTO ESPECÍFICO: Característica exclusiva que apenas a classe Mago possui.
    double inteligencia;

    // CONSTRUTOR: Função para criar o objeto Mago na memória.
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double inteligencia){
        // Super: Envia os dados comuns para o construtor da classe pai (Personagem).
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
    }

    // @Override: Indica que estamos sobrescrevendo (redefinindo) um método que veio da classe pai.
    @Override
    // MÉTODO: Função que executa a ação da habilidade especial do Mago.
    public void usarHabilidadeEspecial(){
        System.out.println("Mago " + this.nome + " lança Bola de Fogo!");
    }
}