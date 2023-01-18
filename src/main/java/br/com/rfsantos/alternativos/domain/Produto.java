package br.com.rfsantos.alternativos.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ts01_produto")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ts01_codigo", columnDefinition = "bpchar", length=15)
	private String id;
	//ts01_codigo character varying(15) COLLATE pg_catalog."default" NOT NULL,
    
	@Column(name="ts01_descricao")
	private String descricao;
	//ts01_descricao character varying(30) COLLATE pg_catalog."default",
    
	@Column(name="ts01_narrativa")
	private String narrativa;
	//ts01_narrativa character varying(255) COLLATE pg_catalog."default",
    
	@Column(name="ts01_unidade")
	private String unidade;
	//ts01_unidade character varying(2) COLLATE pg_catalog."default",
    
    @Column(name="ts01_desc_esp")
	private String descEsp;
    //ts01_desc_esp character varying(80) COLLATE pg_catalog."default",
    
	@Column(name="ts01_grupo")
	private String grupoId;
	//ts01_grupo character varying(4) COLLATE pg_catalog."default",
    
    
    @Column(name="ts01_cod_barras")
	private String ean;
	//ts01_cod_barras character varying(15) COLLATE pg_catalog."default",
   
    @Column(name="td01_tipo")
    private String tipo;
	//td01_tipo character varying(4) COLLATE pg_catalog."default",

	public Produto() {
	}

	public Produto(String id, String descricao, String narrativa, String unidade, String descEsp, String grupoId,
			String ean, String tipo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.narrativa = narrativa;
		this.unidade = unidade;
		this.descEsp = descEsp;
		this.grupoId = grupoId;
		this.ean = ean;
		this.tipo = tipo;
	}

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getNarrativa() {
		return narrativa;
	}


	public void setNarrativa(String narrativa) {
		this.narrativa = narrativa;
	}


	public String getUnidade() {
		return unidade;
	}


	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}


	public String getDescEsp() {
		return descEsp;
	}


	public void setDescEsp(String descEsp) {
		this.descEsp = descEsp;
	}


	public String getGrupoId() {
		return grupoId;
	}


	public void setGrupoId(String grupoId) {
		this.grupoId = grupoId;
	}


	public String getEan() {
		return ean;
	}


	public void setEan(String ean) {
		this.ean = ean;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

	


}