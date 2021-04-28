package com.agenda.dao;

import java.io.Serializable;

public class AgenteDao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer ID_AGENTE;
	private String NOMBRE;
	private String CIUDAD;
	private String BARRIO;
	private Integer ID_EMPRESA;
	

	public Integer getID_AGENTE() {
		return ID_AGENTE;
	}

	public void setID_AGENTE(Integer iD_AGENTE) {
		ID_AGENTE = iD_AGENTE;
	}

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
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

	public Integer getID_EMPRESA() {
		return ID_EMPRESA;
	}

	public void setID_EMPRESA(Integer iD_EMPRESA) {
		ID_EMPRESA = iD_EMPRESA;
	}
	
	
	
}
