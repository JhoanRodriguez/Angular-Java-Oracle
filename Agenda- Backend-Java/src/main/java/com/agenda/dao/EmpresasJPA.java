package com.agenda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agenda.entitys.Empresas;

public interface EmpresasJPA extends JpaRepository<Empresas, Long>{

		//JPQL
		@Query("SELECT p FROM Empresas p WHERE p.id_Empresa = ?1")
	    List<Empresas> findByEmpresaId(Integer EMPRESA_ID);
	
}
