package com.agenda.entitys;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="ASIGNACION")
public  class Asignacion {
	

	@Id
	@Column(name="ID_ASIGNACION")
	private Integer id_Asignacion ;
	
	@Column(name="ID_USER")
	private Integer id_User;
	
	@Column(name="ID_AGENTE")
	private Integer id_Agente;
	
	@Column(name="FECHA")
	private LocalDateTime fecha;

	public Integer getId_Asingnacion() {
		return id_Asignacion;
	}

	public void setId_Asingnacion(Integer id_Asingnacion) {
		this.id_Asignacion = id_Asingnacion;
	}

	public Integer getId_User() {
		return id_User;
	}

	public void setId_User(Integer id_User) {
		this.id_User = id_User;
	}

	public Integer getId_Agente() {
		return id_Agente;
	}

	public void setId_Agente(Integer id_Agente) {
		this.id_Agente = id_Agente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	
}
