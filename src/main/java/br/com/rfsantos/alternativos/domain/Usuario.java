package br.com.rfsantos.alternativos.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ts01_usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="re")
	private String id;
	//re character varying(6) COLLATE pg_catalog."default" NOT NULL,  
	
	@Column(name="usuario")
	private String nomeAcesso;
	//usuario character varying(15) COLLATE pg_catalog."default",
	
	private String senha;
	//senha character varying(15) COLLATE pg_catalog."default",
	
	@Column(name="nome")	
	private String nome;
	//nome character varying(60) COLLATE pg_catalog."default",
	
	@Column(name="status", columnDefinition = "bpchar", length=1)
	private String condicaoId;
	//status character(1) COLLATE pg_catalog."default",
	
	@Column(name="perfil", columnDefinition = "bpchar", length=1)
	private String perfil;
	//perfil character(1) COLLATE pg_catalog."default",

	
	@Column(name="local")	
	private String setor_id;
	//local character varying(5) COLLATE pg_catalog."default",
		 
	public String getId() {
		return id;
	}

	
	public Usuario(Usuario usuario) {
		super();
		this.id = usuario.id;
		this.nomeAcesso = usuario.nomeAcesso;
		this.senha = usuario.senha;
		this.nome = usuario.nome;
		this.condicaoId = usuario.condicaoId;
		this.perfil = usuario.perfil;
		this.setor_id = usuario.setor_id;
	}

	
	public Usuario(String id, String nomeAcesso, String senha, String nome, String condicaoId, String perfil,
			String setor_id) {
		super();
		this.id = id;
		this.nomeAcesso = nomeAcesso;
		this.senha = senha;
		this.nome = nome;
		this.condicaoId = condicaoId;
		this.perfil = perfil;
		this.setor_id = setor_id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSetor() {
		return setor_id;
	}


	public void setSetor(String setor) {
		this.setor_id = setor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getPerfil() {
		return perfil;
	}


	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getCondicao() {
		return condicaoId;
	}


	public void setCondicao(String condicao) {
		this.condicaoId = condicao;
	}


	public String getNomeAcesso() {
		return nomeAcesso;
	}


	public void setNomeAcesso(String nomeAcesso) {
		this.nomeAcesso = nomeAcesso;
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
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}


	


	

}