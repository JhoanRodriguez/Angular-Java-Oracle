package com.agenda.dao;

import java.io.Serializable;
import java.time.LocalDate;

public class AgendaDao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer ID_USER;
	private String TIPO_CLIENTE;
	private String DIRECCION;
	private Long CELULAR;
	private Long CEDULA;
	private Long MONTO_DEUDA;
	private LocalDate TIEMPO;
	private String CIUDAD;
	private String BARRIO;
	private String NOMBRE;
	
	
	public Integer getID_USER() {
		return ID_USER;
	}
	public void setID_USER(Integer iD_USER) {
		ID_USER = iD_USER;
	}
	public String getTIPO_CLIENTE() {
		return TIPO_CLIENTE;
	}
	public void setTIPO_CLIENTE(String tIPO_CLIENTE) {
		TIPO_CLIENTE = tIPO_CLIENTE;
	}
	public String getDIRECCION() {
		return DIRECCION;
	}
	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}
	public Long getCELULAR() {
		return CELULAR;
	}
	public void setCELULAR(Long cELULAR) {
		CELULAR = cELULAR;
	}
	public Long getCEDULA() {
		return CEDULA;
	}
	public void setCEDULA(Long cEDULA) {
		CEDULA = cEDULA;
	}
	public Long getMONTO_DEUDA() {
		return MONTO_DEUDA;
	}
	public void setMONTO_DEUDA(Long mONTO_DEUDA) {
		MONTO_DEUDA = mONTO_DEUDA;
	}
	public LocalDate getTIEMPO() {
		return TIEMPO;
	}
	public void setTIEMPO(LocalDate tIEMPO) {
		TIEMPO = tIEMPO;
	}
	public String getCIUDAD() {
		return CIUDAD;
	}
	public void setCIUDAD(String cIUDAD) {
		CIUDAD = cIUDAD;
	}
	public String getBARRIO() {
		return BARRIO;
	}
	public void setBARRIO(String bARRIO) {
		BARRIO = bARRIO;
	}
	public String getNOMBRE() {
		return NOMBRE;
	}
	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}
	
	
}
