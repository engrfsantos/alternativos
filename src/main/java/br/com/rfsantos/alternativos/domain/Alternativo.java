package br.com.rfsantos.alternativos.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="td01_alternativo")
public class Alternativo implements Serializable {
	private static final long serialVersionUID = 1L;
		
	@Id
	@Column(name="td01_codigo")
	private String id;
	//td01_codigo character varying(15) COLLATE pg_catalog."default" NOT NULL,
	
	
	@Column(name="td01_alternativo")
	private String alternativo;
	//td01_alternativo character varying(15) COLLATE pg_catalog."default" NOT NULL,
	
	@Column(name="td01_descricao")
	private String descricao;
	//td01_descricao text COLLATE pg_catalog."default",
	
	@Column(name="td01_nivel")
	private String  nivel;
	//td01_nivel character varying(6) COLLATE pg_catalog."default" NOT NULL,
	
	
	public Alternativo() {

	}
	
	public Alternativo(String id, String alternativo, String descricao, String nivel) {
		super();
		this.id = id;
		this.alternativo = alternativo;
		this.descricao = descricao;
		this.nivel = nivel;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getAlternativo() {
		return alternativo;
	}

	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
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
		Alternativo other = (Alternativo) obj;
		return Objects.equals(id, other.id);
	}
	   
	
}
