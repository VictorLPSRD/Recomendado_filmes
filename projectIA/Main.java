package projectIA;

import java.util.*;



public class Main {

    // Base de dados de filmes
    private static final Map<String, List<String>> filmes = new HashMap<>() {{
        put("ação", Arrays.asList("Mad Max", "John Wick", "Vingadores"));
        put("comédia", Arrays.asList("Superbad", "Se Beber, Não Case", "Deadpool"));
        put("drama", Arrays.asList("Forrest Gump", "O Poderoso Chefão", "Clube da Luta"));
        put("romance", Arrays.asList("Titanic", "Diário de uma Paixão", "Amizade Colorida"));
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao recomendador de filmes!");

        while (true) {
            // Coletar preferências
            String preferencia = coletarPreferencias(scanner);

            // Recomendação de filmes
            recomendarFilmes(preferencia);

            // Perguntar se deseja continuar
            System.out.print("\nDeseja escolher outro gênero? (sim/não): ");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("não") || resposta.equals("nao")) {
                System.out.println("Obrigado por usar o recomendador de filmes! Até a próxima!");
                break;
            }
        }
    }

    // Função para coletar preferências do usuário
    private static String coletarPreferencias(Scanner scanner) {
    	Limpar.limparTerminal();
        while (true) {
        	Limpar.limparTerminal();
            System.out.println("\nPor favor, diga qual é o seu gênero favorito:");
            for (String genero : filmes.keySet()) {
                System.out.println("- " + genero);
            }

            System.out.print("Digite o gênero: ");
            String generoEscolhido = scanner.nextLine().toLowerCase();

            if (filmes.containsKey(generoEscolhido)) {
                return generoEscolhido;
            } else {
                System.out.println("Gênero inválido. Vamos tentar novamente...");
            }
        }
    }

    // Função para recomendar filmes com base no gosto do usuário
    private static void recomendarFilmes(String preferencia) {
    	Limpar.limparTerminal();
        System.out.println("\nCom base no seu gosto por " + preferencia + ", recomendamos:");
        for (String filme : filmes.get(preferencia)) {
            System.out.println("- " + filme);
        }
    }
}

