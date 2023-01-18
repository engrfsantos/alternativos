package br.com.rfsantos.alternativos.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="td01_rmp")
public class rmp implements Serializable {
	private static final long serialVersionUID = 1L; 
		
	//id integer NOT NULL DEFAULT nextval('td01_rmp_id_seq'::regclass),
	@Id
	@Column(name="id")
	private Integer id;

	//ean character varying(13) COLLATE pg_catalog."default",
	@Column(name="ean")
	private String ean;

	//  grupo character varying(5) COLLATE pg_catalog."default",
	@Column(name="grupo")
	private String grupo;

	//descbreve character varying(30) COLLATE pg_catalog."default",
	@Column(name="descbreve")
	private String descbreve;

	//obs character varying(30) COLLATE pg_catalog."default",
	@Column(name="obs")
	private String obs;

	
	//descr character varying(1024) COLLATE pg_catalog."default",
	@Column(name="descr")
	private String descr;

	//status integer,
	@Column(name="status")
	private Integer status;
	
    //imagem numeric(19,0),
	@Column(name="imagem", columnDefinition = "NUMERIC(19,0)")
	private Long  imagem;

	public rmp() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getDescbreve() {
		return descbreve;
	}

	public void setDescbreve(String descbreve) {
		this.descbreve = descbreve;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getImagem() {
		return imagem;
	}

	public void setImagem(Long imagem) {
		this.imagem = imagem;
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
		rmp other = (rmp) obj;
		return Objects.equals(id, other.id);
	}

	
}