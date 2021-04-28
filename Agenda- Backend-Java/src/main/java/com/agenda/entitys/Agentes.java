package com.agenda.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AGENTES")
public class Agentes {
	
	@Id
	@Column(name="ID_AGENTE")
	private Integer id_Agente;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="CIUDAD")
	private String ciudad;
	
	@Column(name="BARRIO")
	private String barrio;

	@Column(name="ID_EMPRESA")
	private Integer id_Empresa;

	public Integer getId_Agente() {
		return id_Agente;
	}

	public void setId_Agente(Integer id_Agente) {
		this.id_Agente = id_Agente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public Integer getId_Empresa() {
		return id_Empresa;
	}

	public void setId_Empresa(Integer id_Empresa) {
		this.id_Empresa = id_Empresa;
	}
	
	
}
