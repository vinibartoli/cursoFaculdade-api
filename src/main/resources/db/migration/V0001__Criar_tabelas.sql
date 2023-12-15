
    create table aluno (
       id integer not null auto_increment,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        datanasc datetime(6),
        email varchar(255),
        logradouro varchar(255),
        nome varchar(255),
        numero varchar(255),
        status bit,
        telefone varchar(255),
        uf varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table curso (
       id integer not null auto_increment,
        descricao varchar(255),
        status bit,
        primary key (id)
    ) engine=InnoDB;

    create table curso_disciplina (
       curso_id integer not null,
        disciplina_id integer not null
    ) engine=InnoDB;

    create table disciplina (
       id integer not null auto_increment,
        descricao varchar(255),
        status bit,
        professor_id integer,
        primary key (id)
    ) engine=InnoDB;

    create table faculdade (
       id integer not null auto_increment,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        cnpj varchar(255),
        complemento varchar(255),
        email varchar(255),
        logradouro varchar(255),
        numero varchar(255),
        razaosocial varchar(255),
        telefone varchar(255),
        uf varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table faculdade_curso (
       faculdade_id integer not null,
        curso_id integer not null
    ) engine=InnoDB;

    create table matricula (
       id integer not null auto_increment,
        datamatricula datetime(6),
        status bit,
        aluno_id integer,
        curso_id integer,
        primary key (id)
    ) engine=InnoDB;

    create table professor (
       id integer not null auto_increment,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        datanasc datetime(6),
        email varchar(255),
        logradouro varchar(255),
        nome varchar(255),
        numero varchar(255),
        status bit,
        telefone varchar(255),
        uf varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table usuario (
       id integer not null auto_increment,
        email varchar(255),
        login varchar(255),
        nome varchar(255),
        status bit,
        primary key (id)
    ) engine=InnoDB;

    alter table curso_disciplina 
       add constraint UK_kaesmt428pmaht9er3c2w9sng unique (disciplina_id);

    alter table faculdade_curso 
       add constraint UK_mspyaes4q7etqkkr9j1m435n9 unique (curso_id);

    alter table curso_disciplina 
       add constraint FKr7reuo2yb00hp5wbmesioinld 
       foreign key (disciplina_id) 
       references disciplina (id);

    alter table curso_disciplina 
       add constraint FKc95rlu26gguho8xa8amq8jajq 
       foreign key (curso_id) 
       references curso (id);

    alter table disciplina 
       add constraint FKoqie7f1kx32b1atco9fpgxd7g 
       foreign key (professor_id) 
       references professor (id);

    alter table faculdade_curso 
       add constraint FKtcgmorjgrvrtpr7jhjao6n2b6 
       foreign key (curso_id) 
       references curso (id);

    alter table faculdade_curso 
       add constraint FKllslmgdcko0ek5bp28jxm25nr 
       foreign key (faculdade_id) 
       references faculdade (id);

    alter table matricula 
       add constraint FKsmkrefmwkwfyod36k45jf1rr5 
       foreign key (aluno_id) 
       references aluno (id);

    alter table matricula 
       add constraint FK133qjgbs681xntmnvxvg2g08w 
       foreign key (curso_id) 
       references curso (id);
