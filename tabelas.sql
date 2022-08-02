create table tb_aluno(
      aluno_id serial PRIMARY KEY,
      nome VARCHAR(100) NOT NULL,
      data_nascimento TIMESTAMP NOT NULL,
      data_batismo TIMESTAMP NOT NULL,
      telefone VARCHAR(15)
);

create table tb_relacionamento(
       relacionamento_id serial PRIMARY_KEY,
       nome VARCHAR(50)
);

create table tb_pessoa(
	pessoa_id serial PRIMARY KEY,
        nome VARCHAR(100),
        telefone VARCHAR(15),
        email VARCHAR(255),
        relacionamento_id INT NOT NULL,
        FOREIGN KEY (relacionamento_id)
        REFERENCES tb_relacionamento (relacionamento_id)
);

create table tb_alunopessoa(
       aluno_id INT NOT NULL,
       pessoa_id INT NOT NULL,
       FOREIGN KEY (aluno_id )
       REFERENCES tb_aluno(aluno_id ),
       FOREIGN KEY (pessoa_id )
       REFERENCES tb_pessoa(pessoa_id )
)

create table tb_catequista(
        catequista_id serial PRIMARY KEY,
        nome VARCHAR(100) NOT NULL,
        telefone VARCHAR(15),
        email VARCHAR(255)  	
);

create table tb_etapa(
       etapa_id serial PRIMARY KEY,
       nome VARCHAR(100) NOT NULL,
       idade VARCHAR(20) NOT NULL
);

create table tb_tranferencia(
      transferencia_id serial PRIMARY KEY,
       paroquia_enviado VARCHAR(255) NOT NULL,
       paroquia_recebida VARCHAR(255) NOT NULL,
       data_envio TIMESTAMP,
       data_recebimento TIMESTAMP,
       responsavel_tranferencia VARCHAR(100)
);

create table tb_historico(
       historico_id serial PRIMARY KEY,
       ano VARCHAR(10) NOT NULL,
       etapa_id INT NOT NULL,
       catequista_id INT NOT NULL,
       aluno_id INT NOT NULL,
       FOREIGN KEY (aluno_id)
       REFERENCES tb_aluno (aluno_id),
       FOREIGN KEY (catequista_id )
       REFERENCES tb_catequista(catequista_id),
       FOREIGN KEY (etapa_id )
       REFERENCES tb_etapa(etapa_id)
);

        



     
