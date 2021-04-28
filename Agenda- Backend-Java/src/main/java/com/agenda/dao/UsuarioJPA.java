package com.agenda.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agenda.entitys.UsuarioDeuda;

public interface UsuarioJPA extends JpaRepository<UsuarioDeuda, Integer>{

	//JPQL
	@Query("SELECT u FROM UsuarioDeuda u WHERE u.id_User = ?1")
    List<UsuarioDeuda> getUsuario(Integer USER_ID);

}
