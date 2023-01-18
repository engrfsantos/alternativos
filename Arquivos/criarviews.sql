CREATE TABLE public.ts01_produto
(
    ts01_codigo character varying(15) COLLATE pg_catalog."default" NOT NULL,
    ts01_descricao character varying(30) COLLATE pg_catalog."default",
    ts01_narrativa character varying(255) COLLATE pg_catalog."default",
    ts01_unidade character varying(2) COLLATE pg_catalog."default",
    ts01_desc_esp character varying(80) COLLATE pg_catalog."default",
    ts01_grupo character varying(4) COLLATE pg_catalog."default",
    ts01_cod_barras character varying(15) COLLATE pg_catalog."default",
    td01_tipo character varying(4) COLLATE pg_catalog."default",
    CONSTRAINT pk_ts01_produto PRIMARY KEY (ts01_codigo)
)

CREATE TABLE public.td01_alternativo
(
    td01_codigo character varying(15) COLLATE pg_catalog."default" NOT NULL,
    td01_alternativo character varying(15) COLLATE pg_catalog."default" NOT NULL,
    td01_descricao text COLLATE pg_catalog."default",
    td01_nivel character varying(6) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT pk_alternativo PRIMARY KEY (td01_codigo, td01_alternativo, td01_nivel)
)

 	CREATE TABLE public.td01_rmp
(
    id integer NOT NULL DEFAULT nextval('td01_rmp_id_seq'::regclass),
    ean character varying(13) COLLATE pg_catalog."default",
    grupo character varying(5) COLLATE pg_catalog."default",
    num integer,
    dt date,
    smpp character varying(15) COLLATE pg_catalog."default",
    descbreve character varying(30) COLLATE pg_catalog."default",
    obs character varying(30) COLLATE pg_catalog."default",
    descr character varying(1024) COLLATE pg_catalog."default",
    status integer,
    imagem numeric(19,0),
    CONSTRAINT pk_td01_rmp PRIMARY KEY (id)
)

CREATE TABLE public.ts01_usuario
(
    re character varying(6) COLLATE pg_catalog."default" NOT NULL,
    usuario character varying(15) COLLATE pg_catalog."default",
    senha character varying(15) COLLATE pg_catalog."default",
    nome character varying(60) COLLATE pg_catalog."default",
    status character(1) COLLATE pg_catalog."default",
    perfil character(1) COLLATE pg_catalog."default",
    local character varying(5) COLLATE pg_catalog."default",
    CONSTRAINT pk_td01_usuario_re PRIMARY KEY (re)
)

