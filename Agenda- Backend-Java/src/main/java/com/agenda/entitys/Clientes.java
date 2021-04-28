package com.agenda.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTES")
public class Clientes {

	
	@Id
	@Column(name="ID_CLIENTES")
	private Integer id_Clientes;
	
	@Column(name="ID_USER")
	private Integer id_User;
	
	@Column(name="ID_PRODUCTO")
	private Integer id_Producto;

	public Integer getId_Clientes() {
		return id_Clientes;
	}

	public void setId_Clientes(Integer id_Clientes) {
		this.id_Clientes = id_Clientes;
	}

	public Integer getId_User() {
		return id_User;
	}

	public void setId_User(Integer id_User) {
		this.id_User = id_User;
	}

	public Integer getId_Producto() {
		return id_Producto;
	}

	public void setId_Producto(Integer id_Producto) {
		this.id_Producto = id_Producto;
	}
	
	
}
