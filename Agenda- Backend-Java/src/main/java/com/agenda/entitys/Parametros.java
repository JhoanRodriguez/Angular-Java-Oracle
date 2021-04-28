package com.agenda.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARAMETROS")
public class Parametros {

	@Id
	@Column(name="ID_PARAMETRO")
	private Integer id_Parametro;
	
	@Column(name="ID_EMPRESA")
	private Integer id_Empresa;
	
	@Column(name="TIPO_CLIENTE")
	private String tipo_Cliente;
	
	@Column(name="CIUDAD")
	private String ciudad;
	
	@Column(name="DEUDA_MIN")
	private Integer deuda_Min;
	
	@Column(name="DEUDA_MAX")
	private Integer deuda_Max;
	
	@Column(name="ANTIGUEDAD_MIN")
	private Integer antiguedad_Min;
	
	@Column(name="ANTIGUEDAD_MAX")
	private Integer antiguedad_Max;
	
	@Column(name="PRODUCTOS_MIN")
	private Integer productos_Min;
	
	@Column(name="PRODUCTOS_MAX")
	private Integer productos_Max;

	public Integer getId_Parametro() {
		return id_Parametro;
	}

	public void setId_Parametro(Integer id_Parametro) {
		this.id_Parametro = id_Parametro;
	}

	public Integer getId_Empresa() {
		return id_Empresa;
	}

	public void setId_Empresa(Integer id_Empresa) {
		this.id_Empresa = id_Empresa;
	}

	public String getTipo_Cliente() {
		return tipo_Cliente;
	}

	public void setTipo_Cliente(String tipo_Cliente) {
		this.tipo_Cliente = tipo_Cliente;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getDeuda_Min() {
		return deuda_Min;
	}

	public void setDeuda_Min(Integer deuda_Min) {
		this.deuda_Min = deuda_Min;
	}

	public Integer getDeuda_Max() {
		return deuda_Max;
	}

	public void setDeuda_Max(Integer deuda_Max) {
		this.deuda_Max = deuda_Max;
	}

	public Integer getAntiguedad_Min() {
		return antiguedad_Min;
	}

	public void setAntiguedad_Min(Integer antiguedad_Min) {
		this.antiguedad_Min = antiguedad_Min;
	}

	public Integer getAntiguedad_Max() {
		return antiguedad_Max;
	}

	public void setAntiguedad_Max(Integer antiguedad_Max) {
		this.antiguedad_Max = antiguedad_Max;
	}

	public Integer getProductos_Min() {
		return productos_Min;
	}

	public void setProductos_Min(Integer productos_Min) {
		this.productos_Min = productos_Min;
	}

	public Integer getProductos_Max() {
		return productos_Max;
	}

	public void setProductos_Max(Integer productos_Max) {
		this.productos_Max = productos_Max;
	}
	
	
}
