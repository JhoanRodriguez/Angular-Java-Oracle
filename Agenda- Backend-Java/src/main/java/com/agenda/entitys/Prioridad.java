package com.agenda.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRIORIDAD")
public class Prioridad {

	
	@Id
	@Column(name="ID_PRIORIDAD")
	private Integer id_Prioridad;
	
	@Column(name="CIUDAD")
	private String ciudad;
	
	@Column(name="BARRIO")
	private String barrio;

	public Integer getId_Prioridad() {
		return id_Prioridad;
	}

	public void setId_Prioridad(Integer id_Prioridad) {
		this.id_Prioridad = id_Prioridad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	
	
}
