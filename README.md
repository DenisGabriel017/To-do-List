# Projeto To-Do List

Este é um projeto de lista de tarefas simples criado para fins de aprendizado.

## Descrição

O projeto To-Do List é uma aplicação web que permite aos usuários criar, visualizar, atualizar e excluir tarefas.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Spring MVC
- H2 Database
- Springfox Swagger
- Spring Security

## Funcionalidades

- Listar todas as tarefas
- Criar uma nova tarefa
- Visualizar detalhes de uma tarefa
- Atualizar uma tarefa existente
- Excluir uma tarefa
- Autenticação básica

## Endpoints da API 

- GET /api/tasks: Retorna todas as tarefas disponíveis.
- GET /api/tasks/{id}: Retorna os detalhes de uma tarefa específica com o ID fornecido.
- POST /api/tasks/createTask: Cria uma nova tarefa com os detalhes fornecidos no corpo da solicitação.
- DELETE /api/tasks/{id}: Exclui a tarefa com o ID fornecido.
- PUT /api/tasks/{id}: Atualiza os detalhes da tarefa com o ID fornecido, com base nos dados fornecidos no corpo da solicitação.

## Configuração e Execução

Para configurar e executar o projeto localmente, siga estas etapas:

1. Clone o repositório do projeto: `git clone <https://github.com/DenisGabriel017/To-do-List.git>`
2. Navegue até o diretório do projeto: `cd todolist`
3. Execute o projeto usando Maven: `mvn spring-boot:run`

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

### Redes Sociais

- **LinkedIn:** [denisgabriel017](https://www.linkedin.com/in/denisgabriel017/)
- **Instagram:** [denisgabriel.dev](https://www.instagram.com/denisgabriel.dev/)

