package trabalho03;

// CLASSE FILHA (Herança): Arqueira herda (extends) todos os atributos e métodos de Personagem.
public class Arqueira extends Personagem {
    // ATRIBUTO ESPECÍFICO: Característica exclusiva que apenas a classe Arqueira possui.
    double destreza;

    // CONSTRUTOR: Função para criar o objeto Arqueira na memória.
    public Arqueira(String nome, int nivel, int pontosDeVida, double poderBase, double destreza){
        // Super: Envia os dados comuns para o construtor da classe pai (Personagem).
        super(nome, "Arqueira", nivel, pontosDeVida, poderBase);
        this.destreza = destreza;
    }

    // @Override: Indica que estamos sobrescrevendo (redefinindo) um método que veio da classe pai.
    @Override
    // MÉTODO: Função que executa a ação da habilidade especial da Arqueira.
    public void usarHabilidadeEspecial(){
        System.out.println("Arqueira " + this.nome + " lança chuva de flechas!");
    }
}