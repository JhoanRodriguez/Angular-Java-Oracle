package com.agenda.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESAS")
public class Empresas {
	
	@Id
	@Column(name="ID_EMPRESA")
	private Integer id_Empresa;
	
	@Column(name="NOMBRE")
	private String nombre;

	@Column(name="CIUDAD")
	private String ciudad;
	
	@Column(name="BARRIO")
	private String barrio;
	
	@Column(name="TIEMPO_VISITA")
	private Integer tiempo_Visita;
	
	@Column(name="TIEMPO_DESPLAZAMIENTO")
	private Integer tiempo_Desplazamiento;

	public Integer getId_Empresa() {
		return id_Empresa;
	}

	public void setId_Empresa(Integer id_Empresa) {
		this.id_Empresa = id_Empresa;
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

	public Integer getTiempo_Visita() {
		return tiempo_Visita;
	}

	public void setTiempo_Visita(Integer tiempo_Visita) {
		this.tiempo_Visita = tiempo_Visita;
	}

	public Integer getTiempo_Desplazamiento() {
		return tiempo_Desplazamiento;
	}

	public void setTiempo_Desplazamiento(Integer tiempo_Desplazamiento) {
		this.tiempo_Desplazamiento = tiempo_Desplazamiento;
	}
	
	
}
