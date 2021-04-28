package com.agenda.entitys;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO_DEUDA")
public class UsuarioDeuda {

	
	@Id
	@Column(name="ID_USER")
	private Integer id_User;
	
	@Column(name="TIPO_CLIENTE")
	private String tipo_Cliente;
	
	@Column(name="DIRECCION")
	private String direccion;
	
	@Column(name="CELULAR")
	private Long celular;
	
	@Column(name="CEDULA")
	private Long cedula;
	
	@Column(name="MONTO_DEUDA")
	private Long monto_Deuda;
	
	@Column(name="TIEMPO")
	private LocalDateTime tiempo;
	
	@Column(name="CIUDAD")
	private String ciudad;
	
	@Column(name="BARRIO")
	private String barrio;
	
	@Column(name="NOMBRE")
	private String nombre;

	public Integer getId_User() {
		return id_User;
	}

	public void setId_User(Integer id_User) {
		this.id_User = id_User;
	}

	public String getTipo_Cliente() {
		return tipo_Cliente;
	}

	public void setTipo_Cliente(String tipo_Cliente) {
		this.tipo_Cliente = tipo_Cliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public Long getCedula() {
		return cedula;
	}

	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}

	public Long getMonto_Deuda() {
		return monto_Deuda;
	}

	public void setMonto_Deuda(Long monto_Deuda) {
		this.monto_Deuda = monto_Deuda;
	}

	public LocalDateTime getTiempo() {
		return tiempo;
	}

	public void setTiempo(LocalDateTime tiempo) {
		this.tiempo = tiempo;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
