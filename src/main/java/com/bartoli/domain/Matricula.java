package com.bartoli.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Matricula implements Serializable{	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	private Aluno aluno;
	@ManyToOne
	private Curso curso;
	private Date datamatricula;
	private Boolean status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Date getDatamatricula() {
		return datamatricula;
	}
	public void setDatamatricula(Date datamatricula) {
		this.datamatricula = datamatricula;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Matricula(Integer id, Aluno aluno, Curso curso, Date datamatricula, Boolean status) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.curso = curso;
		this.datamatricula = datamatricula;
		this.status = status;
	}
	public Matricula() {
		super();
	}
	
	
}
