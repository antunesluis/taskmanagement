# Lista de User Stories - Task Manager API

## User Stories Principais

### US01 - Gerenciar Projetos

**Como** gerente de projetos  
**Quero** criar e organizar projetos  
**Para que** eu possa agrupar tarefas relacionadas

**Critérios de Aceite:**

- Posso criar um projeto com nome e descrição
- Posso listar todos os meus projetos
- Posso buscar projetos por nome
- Posso atualizar informações do projeto
- Posso excluir projetos (e suas tarefas associadas)

**Prioridade:** Alta  
**Estimativa:** 5 pontos

---

### US02 - Criar Tarefas com Diferentes Prioridades

**Como** membro da equipe  
**Quero** criar tarefas com diferentes níveis de prioridade  
**Para que** eu possa organizar melhor meu trabalho

**Critérios de Aceite:**

- Posso criar tarefa simples (Factory Method)
- Posso criar tarefa urgente com prazo
- Posso definir prioridade: Baixa, Média, Alta, Urgente
- Tarefa pode estar vinculada a um projeto
- Sistema usa Factory para criar tipos específicos de tarefas

**Prioridade:** Alta  
**Estimativa:** 8 pontos  
**Padrão Aplicado:** Factory Method

---

### US03 - Construir Tarefas Complexas

**Como** desenvolvedor  
**Quero** criar tarefas complexas com múltiplos atributos  
**Para que** eu possa especificar todos os detalhes necessários

**Critérios de Aceite:**

- Posso usar Builder para criar tarefas de forma fluente
- Posso definir: título, descrição, status, prioridade, prazo
- Validação impede criação de tarefa sem título
- Interface é legível e fácil de usar

**Prioridade:** Média  
**Estimativa:** 5 pontos  
**Padrão Aplicado:** Builder

---

### US04 - Ordenar Tarefas por Diferentes Critérios

**Como** usuário do sistema  
**Quero** ordenar minhas tarefas de diferentes formas  
**Para que** eu possa visualizar o que é mais importante

**Critérios de Aceite:**

- Posso ordenar por prioridade (Urgente → Baixa)
- Posso ordenar por data de vencimento
- Posso ordenar por data de criação
- Posso ordenar por status
- Sistema usa Strategy para diferentes ordenações

**Prioridade:** Média  
**Estimativa:** 5 pontos  
**Padrão Aplicado:** Strategy

---

### US05 - Receber Notificações de Eventos

**Como** usuário do sistema  
**Quero** ser notificado sobre mudanças nas tarefas  
**Para que** eu fique informado sobre o progresso

**Critérios de Aceite:**

- Recebo notificação quando tarefa é criada
- Recebo notificação quando tarefa é atualizada
- Recebo notificação quando status muda
- Sistema usa Observer para notificações
- Notificações aparecem no log do sistema

**Prioridade:** Média  
**Estimativa:** 8 pontos  
**Padrão Aplicado:** Observer

---

### US06 - Atualizar Status de Tarefas

**Como** membro da equipe  
**Quero** atualizar o status das minhas tarefas  
**Para que** outros saibam o progresso do trabalho

**Critérios de Aceite:**

- Posso mudar status: Pendente → Em Progresso → Concluída
- Posso cancelar uma tarefa
- Sistema notifica quando status muda (Observer)
- Data de atualização é registrada automaticamente

**Prioridade:** Alta  
**Estimativa:** 5 pontos

---

### US07 - Filtrar Tarefas

**Como** usuário  
**Quero** filtrar tarefas por status e prioridade  
**Para que** eu possa focar no que precisa ser feito

**Critérios de Aceite:**

- Posso filtrar por status (Pendente, Em Progresso, Concluída)
- Posso filtrar por prioridade
- Posso ver tarefas de um projeto específico
- Filtros retornam resultados rapidamente

**Prioridade:** Média  
**Estimativa:** 3 pontos

---

### US08 - Adicionar Comentários em Tarefas

**Como** membro da equipe  
**Quero** adicionar comentários nas tarefas  
**Para que** eu possa registrar informações importantes

**Critérios de Aceite:**

- Posso adicionar comentário com autor e conteúdo
- Posso listar todos os comentários de uma tarefa
- Comentários mostram data de criação
- Posso excluir meus comentários

**Prioridade:** Baixa  
**Estimativa:** 5 pontos

---

### US09 - Buscar Tarefas e Projetos

**Como** usuário  
**Quero** buscar tarefas e projetos por nome  
**Para que** eu possa encontrar rapidamente o que preciso

**Critérios de Aceite:**

- Posso buscar projetos por nome (case-insensitive)
- Posso buscar tarefas por título
- Resultados são retornados rapidamente
- Busca funciona com termos parciais

**Prioridade:** Baixa  
**Estimativa:** 3 pontos

---

### US10 - Acessar Configurações do Sistema

**Como** administrador  
**Quero** acessar configurações globais do sistema  
**Para que** eu possa ajustar parâmetros da aplicação

**Critérios de Aceite:**

- Configurações são únicas (Singleton)
- Posso acessar via `AppConfig.getInstance()`
- Configurações incluem: limites, versão, nome da app
- Alterações afetam toda aplicação

**Prioridade:** Baixa  
**Estimativa:** 2 pontos  
**Padrão Aplicado:** Singleton

---

## 📊 Resumo das User Stories

| ID   | User Story                    | Prioridade | Estimativa | Padrão    |
| ---- | ----------------------------- | ---------- | ---------- | --------- |
| US01 | Gerenciar Projetos            | Alta       | 5 pts      | -         |
| US02 | Criar Tarefas com Prioridades | Alta       | 8 pts      | Factory   |
| US03 | Construir Tarefas Complexas   | Média      | 5 pts      | Builder   |
| US04 | Ordenar Tarefas               | Média      | 5 pts      | Strategy  |
| US05 | Receber Notificações          | Média      | 8 pts      | Observer  |
| US06 | Atualizar Status              | Alta       | 5 pts      | -         |
| US07 | Filtrar Tarefas               | Média      | 3 pts      | -         |
| US08 | Adicionar Comentários         | Baixa      | 5 pts      | -         |
| US09 | Buscar Tarefas/Projetos       | Baixa      | 3 pts      | -         |
| US10 | Configurações do Sistema      | Baixa      | 2 pts      | Singleton |
