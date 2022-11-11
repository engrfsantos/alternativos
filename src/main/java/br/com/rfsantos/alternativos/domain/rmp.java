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
	private long id;

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
	@Column(name="desc")
	private String descr;

	//status integer,
	@Column(name="status")
	private String status;
	
    //imagem numeric(19,0),
	@Column(name="imagem")
	private byte[]  imagem;

	public rmp() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(imagem);
		result = prime * result + Objects.hash(descbreve, descr, ean, grupo, id, obs, status);
		return result;
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
		return Objects.equals(descbreve, other.descbreve) && Objects.equals(descr, other.descr)
				&& Objects.equals(ean, other.ean) && Objects.equals(grupo, other.grupo) && id == other.id
				&& Arrays.equals(imagem, other.imagem) && Objects.equals(obs, other.obs)
				&& Objects.equals(status, other.status);
	}

	

	

	

}