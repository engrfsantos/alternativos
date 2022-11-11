package br.com.rfsantos.alternativos.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Alternativo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="codigo")
	private String codigo;

	@Column(name="descbreve")
	private String descbreve;

	@Column(name="obs")
	private String obs;

	@Column(name="alternativo")
	private String alternativo;

	@Column(name="status")
	private String status;
	
	@Column(name="nivel")
	private Integer  nivel;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public String getAlternativo() {
		return alternativo;
	}

	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alternativo, codigo, descbreve, nivel, obs, status);
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
		return Objects.equals(alternativo, other.alternativo) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(descbreve, other.descbreve) && Objects.equals(nivel, other.nivel)
				&& Objects.equals(obs, other.obs) && Objects.equals(status, other.status);
	}
 
}
