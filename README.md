
![Plataforma de Streaming](https://github.com/IgorCavalcantiMoura/streaming/blob/main/midia/Live%20StreamTonight.png)

# API para Plataforma de Streaming de Filmes 📺🎬🎥
![Static Badge](https://img.shields.io/badge/EM%20DESENVOLVIMENTO%20-%20PROJETO%20EM%20ANDAMENTO)


Este projeto consiste na implementação do backend para uma plataforma de streaming de filmes, proporcionando a manipulação eficiente dos dados dos filmes disponíveis na plataforma. Os filmes são organizados por categorias, oferecendo aos usuários uma experiência de navegação intuitiva.

## Tecnologias Utilizadas

- Spring Framework: O projeto foi desenvolvido utilizando o Spring, seguindo as melhores práticas recomendadas para garantir uma arquitetura sólida e escalável.

- Banco de Dados: A aplicação utiliza MySQL para armazenar e gerenciar as informações dos filmes e categorias. A configuração do banco de dados pode ser encontrada no arquivo application.properties.

## Funcionalidades Implementadas
### CRUD de Filme

- Criar Filme: Endpoint para cadastrar um novo filme na plataforma.

- Buscar Filme por ID: Recurso para obter as informações de um filme específico com base no seu ID.

- Listar Todos os Filmes: Endpoint para listar todos os filmes disponíveis na plataforma.

- Atualizar Filme: Permite a atualização dos dados de um filme existente na plataforma.

- Remover Filme: Endpoint para excluir um filme do sistema.

- Listar Filmes por Categoria: Recurso que lista todos os filmes de uma categoria - específica.

### CRUD de Categoria

- Criar Categoria: Endpoint para cadastrar uma nova categoria na plataforma.

- Buscar Categoria por ID: Recurso para obter as informações de uma categoria específica com base no seu ID.

- Listar Todas as Categorias: Endpoint para listar todas as categorias disponíveis na plataforma.

- Atualizar Categoria: Permite a atualização dos dados de uma categoria existente na plataforma.

- Remover Categoria: Endpoint para excluir uma categoria do sistema.

- Listar Filmes por Categoria: Recurso que lista todos os filmes pertencentes a uma categoria específica.

## Relacionamento One to Many

As classes Categoria e Filme possuem um relacionamento do tipo One to Many, garantindo que uma categoria pode conter vários filmes.
## Boas Práticas

O projeto segue as boas práticas de desenvolvimento Spring, incluindo a organização em Model, Repository e Controller, proporcionando um código claro e modular.
## Testes

A API foi testada de forma abrangente utilizando o Insomnia, garantindo que todas as funcionalidades foram implementadas corretamente e que a aplicação responde de acordo com as especificações.


## Como Executar o Projeto

    Clone o repositório.
    Configure o banco de dados no arquivo application.properties.
    Execute a aplicação Spring Boot.
    Utilize o Insomnia para testar a API.






[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/igor-cavalcanti-moura/)


