package trabalho03;

// CLASSE: Classe principal que inicia e roda o programa.
public class Main {
    // MÉTODO: Ponto de entrada (start) onde o Java começa a executar o código.
    public static void main(String[] args) {
        // OBJETOS: Criando os personagens.
        Guerreiro arthus = new Guerreiro("Arthus", 4, 150, 13.5, 9.0);
        Arqueira arthemis = new Arqueira("Arthemis", 4, 90, 15.0, 10.0);
        Mago gandalf = new Mago("Gandalf", 5, 90, 15.5, 13.5);
        Guerreiro bjorn = new Guerreiro("Bjorn", 6, 180, 14.5, 12.0);
    
        // Criando grupos   
        Grupo grupoA = new Grupo("Os Vingadores");
        grupoA.adicionarMembro(bjorn);
        grupoA.adicionarMembro(arthemis);

        Grupo grupoB = new Grupo("Liga da Justiça");
        grupoB.adicionarMembro(arthus);
        grupoB.adicionarMembro(gandalf);

        // Listando membros dos grupos com status completos.
        System.out.println("\n--- LISTAGEM INICIAL DOS GRUPOS ---");
        grupoA.listarMembros();
        grupoB.listarMembros();

        // Testando habilidades especiais.
        System.out.println("\n--- HABILIDADES ESPECIAIS ---");
        arthus.usarHabilidadeEspecial();
        arthemis.usarHabilidadeEspecial();
        gandalf.usarHabilidadeEspecial();

        // Testando batalhas X1 entre personagens.
        System.out.println("\n--- SIMULAÇÃO DE BATALHAS 1 vs 1 ---");
        grupoA.batalhar(bjorn, gandalf);
        grupoB.batalhar(arthus, arthemis);

        // Testando a ordenação dos membros por nível.
        System.out.println("\n--- ORDENAÇÃO POR NÍVEL ---");
        System.out.println("Antes da ordenação:");
        grupoA.listarMembros();

        grupoA.ordenarMembrosPorNivel();

        System.out.println("\nApós a ordenação:");
        grupoA.listarMembros();

        // Testando a batalha entre grupos
       Arena.batalharGrupos(grupoA, grupoB);
    }
}