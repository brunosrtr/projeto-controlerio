## 🌊 ControleRio – Sistema de Monitoramento de Rios e Alertas de Enchentes

Projeto desenvolvido como Trabalho Final Integrador das disciplinas:

Banco de Dados

Engenharia de Software

Programação Orientada a Objetos

Utilizando Scrum, Azure DevOps e arquitetura moderna com Spring Boot.

## 📌 📍 Objetivo do Sistema

O ControleRio é uma aplicação criada para atender a Prefeitura de Serafina Corrêa, com o propósito de:

Monitorar o nível dos rios da cidade.

Gerenciar pontos de medição cadastrados.

Registrar medições e comportamentos hídricos.

Cadastrar usuários com níveis de permissão.

Gerenciar grupos e cidades atendidas.

Emitir alertas de possível enchente com base em dados.

A aplicação oferece uma API REST completa para manipulação de dados ambientais, permitindo integração com dashboards, sensores IoT ou aplicativos futuros.

📦 Estrutura do Projeto
```
src
├── docs
│   └── database
├── main
│   ├── java
│   │   └── com
│   │       └── cesurg
│   │           └── controlerio
│   │               ├── core
│   │               │   ├── domain
│   │               │   │   ├── model
│   │               │   │   └── usecase
│   │               │   └── interfaces
│   │               └── infra
│   │                   ├── config
│   │                   ├── controller
│   │                   └── repository
│   └── resources
└── test
    └── java
        └── com
            └── cesurg
                └── controlerio

```

## 🧱 Arquitetura Geral

O sistema segue uma arquitetura por camadas:

## ✔ Core (Domínio + Casos de Uso)

Contém:

Entidades

Interfaces de serviços (Use Cases)

Regras de negócio

## ✔ Infra (Controllers, Repositories, Configurações)

Responsável por:

Endpoints REST

Acesso ao banco de dados via Spring Data JPA

Configurações, segurança, persistência

## ✔ Banco de Dados

PostgreSQL (Supabase)

H2 Database para testes

Scripts versionados

## ☁ Tecnologias Utilizadas
Backend

Spring Boot 3.5.6

Spring Web

Spring Validation

Spring Security

Lombok

DevTools

Dotenv Support (spring-dotenv)

Banco de Dados

PostgreSQL (Supabase)

H2 (ambiente de teste)

## DevOps e Metodologia

Azure DevOps

Git + GitFlow

Scrum

Sprint Planning, Daily, Review e Retrospective

Product Backlog


## 🧩 **Principais Funcionalidades**
## 1️⃣ Usuários

Criar, listar, atualizar e deletar usuários

Controle de permissões baseado em grupos

Preparado para autenticação futura

## 2️⃣ Rios

Cadastro de rios monitorados

Edição e remoção

Listagem completa

## 3️⃣ Pontos de Medição

Cadastro de pontos em cada rio

Localização, sensores e referência

Atualização e pesquisa por ID

## 4️⃣ Medições

Registro periódico do nível do rio

Atualizações e consultas

Permite base futura de alertas automáticos

## 5️⃣ Permissões

Associar perfis de acesso aos usuários

CRUD completo

## 6️⃣ Grupos

Grupos de operação (Defesa Civil, Administração, etc.)

Relacionamento com permissões

## 7️⃣ Cidades

Cadastro de cidades monitoradas

Base para expansão regional

## 🔗 Endpoints Principais

A API segue o formato REST:

| Recurso    | Método | Endpoint     | Função            |
| ---------- | ------ | ------------ | ----------------- |
| Usuários   | GET    | `/usuarios`  | Listar            |
| Usuários   | POST   | `/usuarios`  | Criar             |
| Rios       | POST   | `/rios`      | Criar rio         |
| Pontos     | GET    | `/pontos`    | Listar pontos     |
| Medições   | POST   | `/medicoes`  | Registrar medição |
| Cidades    | GET    | `/cidade`    | Listar            |
| Grupos     | POST   | `/grupos`    | Criar grupo       |
| Permissões | GET    | `/permissao` | Listar            |

## 📚 Modelagem de Banco de Dados

Estrutura relacional

Relacionamentos:

Cidade → Rio

Rio → Pontos de Medição

Ponto de Medição → Medições

Usuário → Grupo → Permissão

A modelagem foi projetada para suportar escalabilidade e auditoria futura.

## 👨‍💻 Equipe e Organização Scrum

Este projeto utilizou:

Product Backlog

Sprint Backlog

User Stories

Quadro de tarefas no Azure DevOps

Sprints semanais

## O processo permitiu:

Entrega incremental

Feedback constante

Documentação e controle de issues

## 📦 Build e Dependências

Gerenciado pelo Gradle com:

Spring Boot Starter Web

Spring Boot Starter Data JPA

PostgreSQL Driver

Lombok

Dotenv

H2 para testes

## 📈 Possíveis Expansões Futuras

API de alerta automática por IA

Integração com sensores IoT

Dashboard web de monitoramento
