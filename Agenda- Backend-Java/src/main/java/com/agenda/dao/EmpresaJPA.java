package com.agenda.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agenda.entitys.Parametros;


public interface EmpresaJPA extends JpaRepository<Parametros, Long> {
	
	//JPA
	@Query(value= "SELECT * FROM PARAMETROS WHERE ID_EMPRESA = ?1", nativeQuery = true)
    List<Parametros> findByEmpresaId(Integer EMPRESA_ID);
	
}
