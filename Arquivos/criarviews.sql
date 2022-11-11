--	private String id;
--  private String ean;
--	private String descEsp;
--	private String descricao;
--	private String grupoId;
--	private String narrativa;
--	private String unidade;

create or replace view produto as 
	select 
	ts01_codigo as id,
    ts01_descricao as descricao,
    ts01_narrativa as narrativa,
    ts01_unidade as unidade,
    ts01_desc_esp descEsp,
    ts01_grupo grupoID,
    ts01_cod_barras ean from ts01_produto;