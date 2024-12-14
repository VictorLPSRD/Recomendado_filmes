# # Recomendador de Filmes

Este é um programa simples em Java que recomenda filmes com base no gênero favorito do usuário. O programa utiliza um loop para permitir que o usuário continue escolhendo gêneros até decidir sair.

## Como funciona

1. O programa possui uma base de dados com gêneros e filmes associados.
2. O usuário é solicitado a escolher um gênero dentre as opções exibidas.
3. Com base na escolha, o programa recomenda uma lista de filmes do gênero selecionado.
4. Após a recomendação, o usuário pode optar por escolher outro gênero ou encerrar o programa.

## Pré-requisitos

- Java JDK 8 ou superior

## Como executar

1. Clone ou baixe o repositório contendo o código.
2. Compile o arquivo `RecomendadorDeFilmes.java`:
   ```bash
   javac RecomendadorDeFilmes.java
   ```
3. Execute o programa:
   ```bash
   java RecomendadorDeFilmes
   ```

## Exemplo de saída

```plaintext
Bem-vindo ao recomendador de filmes!

Por favor, diga qual é o seu gênero favorito:
- ação
- comédia
- drama
- romance
Digite o gênero: ação

Com base no seu gosto por ação, recomendamos:
- Mad Max
- John Wick
- Vingadores

Deseja escolher outro gênero? (sim/não): sim

Por favor, diga qual é o seu gênero favorito:
- ação
- comédia
- drama
- romance
Digite o gênero: comédia

Com base no seu gosto por comédia, recomendamos:
- Superbad
- Se Beber, Não Case
- Deadpool

Deseja escolher outro gênero? (sim/não): não
Obrigado por usar o recomendador de filmes! Até a próxima!
```

## Estrutura do código

- **Base de dados:** Utiliza um `HashMap` para armazenar os gêneros e suas listas de filmes.
- **Coleta de preferências:** Uma função que exibe os gêneros disponíveis e valida a entrada do usuário.
- **Recomendação de filmes:** Exibe os filmes associados ao gênero escolhido.
- **Loop principal:** Permite que o usuário escolha novos gêneros ou encerre o programa.

## Customização

Você pode personalizar a base de dados de filmes editando o mapa `filmes` no código:

```java
private static final Map<String, List<String>> filmes = new HashMap<>() {{
    put("ação", Arrays.asList("Mad Max", "John Wick", "Vingadores"));
    put("comédia", Arrays.asList("Superbad", "Se Beber, Não Case", "Deadpool"));
    put("drama", Arrays.asList("Forrest Gump", "O Poderoso Chefão", "Clube da Luta"));
    put("romance", Arrays.asList("Titanic", "Diário de uma Paixão", "Amizade Colorida"));
}};
```

Adicione ou remova gêneros e filmes conforme necessário.

## Contribuições

Sinta-se à vontade para contribuir com melhorias, como:

- Adicionar novos gêneros e filmes.
- Implementar suporte a várias línguas.
- Criar uma interface gráfica.
