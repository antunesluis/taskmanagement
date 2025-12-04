# Task Manager API

Sistema de Gerenciamento de Tarefas e Projetos desenvolvido em Java com Spring Boot e SQLite.

## Tecnologias

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- SQLite
- Lombok
- Maven

## Estrutura do Projeto

```
src/main/java/com/taskmanager/
├── builder/           # Padrão Builder
├── config/            # Configurações e Singleton
├── controller/        # Controllers REST
├── dto/               # Data Transfer Objects
├── exception/         # Tratamento de exceções
├── factory/           # Padrão Factory
├── model/             # Entidades JPA
│   └── enums/        # Enumerações
├── observer/          # Padrão Observer
├── repository/        # Repositórios JPA
├── service/           # Lógica de negócio
└── strategy/          # Padrão Strategy
```

## Como Executar

### Pré-requisitos

- JDK 17 ou superior
- Maven 3.6+
- IntelliJ IDEA (recomendado)

### Passos

1. **Clone ou crie o projeto no IntelliJ**:
   - File → New → Project
   - Nome: `task-manager-api`
   - Group: `com.taskmanager`

2. **Copie o arquivo `pom.xml`** para o diretório raiz do projeto

3. **Crie a estrutura de pacotes** conforme indicado acima

4. **Copie todos os arquivos Java** para seus respectivos pacotes

5. **Copie o `application.properties`** para `src/main/resources/`

6. **Execute o Maven para baixar dependências**:

   ```bash
   mvn clean install
   ```

7. **Execute a aplicação**:

   ```bash
   mvn spring-boot:run
   ```

   Ou execute a classe `TaskManagerApiApplication` diretamente no IntelliJ

8. **A API estará disponível em**: `http://localhost:8080`

## Endpoints da API

### Projetos

- `POST /api/projects` - Criar projeto
- `GET /api/projects` - Listar todos
- `GET /api/projects/{id}` - Buscar por ID
- `GET /api/projects/search?name=` - Buscar por nome
- `PUT /api/projects/{id}` - Atualizar
- `DELETE /api/projects/{id}` - Deletar

### Tarefas

- `POST /api/tasks` - Criar tarefa
- `GET /api/tasks` - Listar todas
- `GET /api/tasks/{id}` - Buscar por ID
- `GET /api/tasks/project/{projectId}` - Tarefas de um projeto
- `GET /api/tasks/status/{status}` - Filtrar por status
- `GET /api/tasks/sorted/priority` - Ordenar por prioridade (Strategy)
- `PUT /api/tasks/{id}` - Atualizar
- `DELETE /api/tasks/{id}` - Deletar

### Comentários

- `POST /api/tasks/{taskId}/comments` - Adicionar comentário
- `GET /api/tasks/{taskId}/comments` - Listar comentários
- `DELETE /api/tasks/{taskId}/comments/{commentId}` - Deletar comentário

🎯 Padrões de Projeto Implementados

1. Factory Method (Criacional)

Localização: com.taskmanager.factory.TaskFactory
Propósito: Cria diferentes tipos de tarefas (simples, urgentes, baixa prioridade)

2. Builder (Criacional)

Localização: com.taskmanager.builder.TaskBuilder
Propósito: Construção fluente e flexível de objetos Task complexos

3. Singleton (Criacional)

Localização: com.taskmanager.config.AppConfig
Propósito: Garante única instância de configuração da aplicação

4. Strategy (Comportamental)

Localização: com.taskmanager.strategy.\*
Propósito: Define diferentes estratégias de ordenação de tarefas (por prioridade, data, status)

5. Observer (Comportamental)

Localização: com.taskmanager.observer.\*
Propósito: Notifica sobre eventos de tarefas (criação, atualização, mudança de status)
