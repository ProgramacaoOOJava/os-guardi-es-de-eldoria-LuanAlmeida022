package trabalho03;

import java.util.ArrayList;
import java.util.Collections; 
import java.util.List;

public class Grupo {
    private String nomeDoGrupo;
    private List<Personagem> membros;

    // Construtor corrigido para aceitar o parâmetro 'nomeDoGrupo' em minúsculo.
    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();
    }

    public String getNomeDoGrupo() {
        return nomeDoGrupo;
    }

    // MÉTODO: Adiciona um novo personagem à lista do grupo com validação de segurança.
    public void adicionarMembro(Personagem personagem) {
        // Validação: Verifica se o objeto passado não é nulo para evitar exceções.  
        if (personagem != null) {
            this.membros.add(personagem); // Adiciona o personagem na lista interna.
            System.out.println(personagem.nome + " foi adicionado ao grupo!");
        } else {
            System.out.println("Personagem inválido!"); // Alerta caso tentem passar um objeto vazio/nulo.
        }
    }

    // MÉTODO: Exibe no console o nome de todos os membros cadastrados no grupo.
    public void listarMembros() {
        System.out.println("\n --- Membros do grupo " + nomeDoGrupo + " ---");
        // Loop foreach: Percorre a lista 'membros' tratando cada item como um objeto 'Personagem'.
        for (Personagem p : membros) {
            p.exibirStatus(); // Imprime o status de cada personagem.
        }
        System.out.println("------------------------------------");
    }

    // MÉTODO: Batalha 1 contra 1.
    public void batalhar(Personagem p1, Personagem p2) {
        System.out.println("\n --- Início da batalha! ---");
        
        // Calcula o poder total de cada um chamando o método getPoderTotal().
        double poderTotalP1 = p1.getPoderTotal();
        double poderTotalP2 = p2.getPoderTotal();

        // Exibe os valores formatados e com espaçamento.
        System.out.println(p1.nome + " - Poder total: " + String.format("%.2f", poderTotalP1));
        System.out.println(p2.nome + " - Poder total: " + String.format("%.2f", poderTotalP2));

        // Compara quem venceu.
        if (poderTotalP1 > poderTotalP2) {
            System.out.println(p1.classe + " " + p1.nome + " Venceu! Poder total: " + String.format("%.2f", poderTotalP1));
        } else if (poderTotalP1 < poderTotalP2) {
            System.out.println(p2.classe + " " + p2.nome + " Venceu! Poder total: " + String.format("%.2f", poderTotalP2));
        } else {
            System.out.println("Empate!");
        }
        System.out.println("--- Fim da batalha! ---");
    }

    // MÉTODO: Ordena a lista de membros do grupo com base no nível (usando Comparable).
    public void ordenarMembrosPorNivel() {
        // Ordena a lista 'membros' usando o compareTo definido na classe Personagem.
        Collections.sort(membros);
        System.out.println("Membros do grupo " + nomeDoGrupo + " ordenados por nível.");
    }

    // MÉTODO: Retorna a lista de membros do grupo.
    public List<Personagem> getMembros() {
        return membros;
    }
}