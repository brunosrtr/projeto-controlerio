--DataBase Controle Rio

CREATE TABLE grupo (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(30) NOT NULL
);

CREATE TABLE permissao (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    acao VARCHAR(30)
);

CREATE TABLE cidade (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL
);

CREATE TABLE rio (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL
);

CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    email VARCHAR(80) NOT NULL UNIQUE,
    senha VARCHAR(80) NOT NULL,
    id_grupo INTEGER,
    FOREIGN KEY (id_grupo) REFERENCES grupo(id)
);

CREATE TABLE ponto_medicao (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    altura_estavel INTEGER,
    latitude TEXT,
    longitude TEXT,
    id_rio INT,
    FOREIGN KEY (id_rio) REFERENCES rio(id)
);

CREATE TABLE grupo_permissao (
    id SERIAL PRIMARY KEY,
    id_grupo INTEGER,
    id_permissao INTEGER,
    FOREIGN KEY (id_grupo) REFERENCES grupo(id),
    FOREIGN KEY (id_permissao) REFERENCES permissao(id),
    UNIQUE(id_grupo, id_permissao)
);

CREATE TABLE rio_cidade (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(80),
    id_rio INTEGER,
    id_cidade INTEGER,
    FOREIGN KEY (id_rio) REFERENCES rio(id),
    FOREIGN KEY (id_cidade) REFERENCES cidade(id),
    UNIQUE(id_rio, id_cidade)
);

CREATE TABLE medicao (
    id SERIAL PRIMARY KEY,
    altura DECIMAL,
    clima VARCHAR(40),
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    id_usuario INTEGER,
    id_ponto_medicao INTEGER,
    temperatura INTEGER,
    FOREIGN KEY (id_usuario) REFERENCES usuario(id),
    FOREIGN KEY (id_ponto_medicao) REFERENCES ponto_medicao(id)
);