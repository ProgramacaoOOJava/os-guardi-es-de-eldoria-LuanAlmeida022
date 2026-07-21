package trabalho03;

import java.util.List;

// CLASSE: Responsável por gerenciar confrontos em grande escala entre grupos.
public class Arena {

    // MÉTODO: Batalha entre dois grupos, combinando os membros em pares pelo índice.
    public static void batalharGrupos(Grupo g1, Grupo g2) {
        System.out.println("\n =======================================================================");
        System.out.println("   CONFRONTO DE GRUPOS: " + g1.getNomeDoGrupo() + " VS " + g2.getNomeDoGrupo());
        System.out.println(" =======================================================================");

        List<Personagem> membrosG1 = g1.getMembros();
        List<Personagem> membrosG2 = g2.getMembros();

        // Descobre quantas batalhas individuais podem ser feitas (tamanho do menor grupo).
        int totalDeLutas = Math.min(membrosG1.size(), membrosG2.size());

        if (totalDeLutas == 0) {
            System.out.println("Um dos grupos não possui membros suficientes para batalhar!");
            return;
        }

        // Realiza o confronto par a par.
        for (int i = 0; i < totalDeLutas; i++) {
            Personagem p1 = membrosG1.get(i);
            Personagem p2 = membrosG2.get(i);

            System.out.println("\n--- Round " + (i + 1) + " ---");
            // Reutiliza o método batalhar individual da classe Grupo.
            g1.batalhar(p1, p2);
        }

        System.out.println("\n====================================");
        System.out.println("   FIM DO CONFRONTO ENTRE GRUPOS");
        System.out.println("====================================");
    }
}