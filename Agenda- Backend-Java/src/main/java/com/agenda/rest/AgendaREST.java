package com.agenda.rest;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.dao.AgendaDao;
import com.agenda.dao.AgenteDao;
import com.agenda.dao.AgentesDao;
import com.agenda.entitys.Empresas;
import com.agenda.entitys.Parametros;
import com.agenda.entitys.UsuarioDeuda;
import com.agenda.dao.EmpresaJPA;
import com.agenda.dao.EmpresasJPA;
import com.agenda.dao.UsuarioJPA;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1.0")
public class AgendaREST {
	
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Autowired
	private EmpresaJPA empresaJpa;
	
	@Autowired
	private EmpresasJPA empresasJpa;
	
	@Autowired
	private UsuarioJPA usuarioJPA;
	
	
	//Devuelve los usuarios que fueron asignados al agente
	@GetMapping
	@RequestMapping(value = "agenda")
	public ResponseEntity<List<AgendaDao>> getAgenda(@RequestParam("AGENTE_ID") Long ID_AGENTE){
		
		SqlParameterSource paramIn = new MapSqlParameterSource().addValue("AGENTE_ID", ID_AGENTE);
		
		SimpleJdbcCall refCursor = new SimpleJdbcCall(jdbc)
				.withCatalogName("COBRANZA")
				.withProcedureName("GET_AGENDA")
				.returningResultSet("RESPONSE",BeanPropertyRowMapper.newInstance(AgendaDao.class));
		try {
			Map<String, Object> getAgenda = refCursor.execute(paramIn);
			List<AgendaDao> agenda = (List<AgendaDao>) getAgenda.get("RESPONSE");
			return new ResponseEntity<List<AgendaDao>>(agenda,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	} 
	//Develve la lista de agentes que pertenecen a la empresa
	@GetMapping
	@RequestMapping(value = "agentes")
	public ResponseEntity<List<AgentesDao>> getAgente(@RequestParam("EMPRESA_ID") Long ID_EMPRESA){
		
		SqlParameterSource paramIn = new MapSqlParameterSource().addValue("EMPRESA_ID", ID_EMPRESA);
		
		SimpleJdbcCall refCursor = new SimpleJdbcCall(jdbc)
				.withCatalogName("COBRANZA")
				.withProcedureName("GET_AGENTES")
				.returningResultSet("RESPONSE",BeanPropertyRowMapper.newInstance(AgentesDao.class));
		try {
			Map<String, Object> getAgente = refCursor.execute(paramIn);
			List<AgentesDao> agentes = (List<AgentesDao>) getAgente.get("RESPONSE");
			return new ResponseEntity<List<AgentesDao>>(agentes,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Se obtiene la lista de parámetros de la empresa (los clientes que puede atender)
	@GetMapping
	@RequestMapping(value = "parametros/empresa")
	public ResponseEntity<List<Parametros>> getParametros(@RequestParam("EMPRESA_ID") Integer EMPRESA_ID){
		try {
			List<Parametros> param = empresaJpa.findByEmpresaId(EMPRESA_ID);
			return ResponseEntity.ok(param);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	//Obtener la informacion general de la empresa
	@GetMapping
	@RequestMapping(value = "empresa")
	public ResponseEntity<List<Empresas>> getEmpresas(@RequestParam("EMPRESA_ID") Integer EMPRESA_ID){
		try {
			List<Empresas> param = empresasJpa.findByEmpresaId(EMPRESA_ID);
			return ResponseEntity.ok(param);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	//Devuelve la lista de los agentes asginados en el día de hoy
	@GetMapping
	@RequestMapping(value = "asignados")
	public ResponseEntity<List<AgenteDao>> listaAgente(){
		
		
		SimpleJdbcCall refCursor = new SimpleJdbcCall(jdbc)
				.withCatalogName("COBRANZA")
				.withProcedureName("LISTA_ASIGNADOS")
				.returningResultSet("RESPONSE",BeanPropertyRowMapper.newInstance(AgenteDao.class));
		try {
			Map<String, Object> getAgente = refCursor.execute();
			List<AgenteDao> agentes = (List<AgenteDao>) getAgente.get("RESPONSE");
			return new ResponseEntity<List<AgenteDao>>(agentes,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	 //retorna toda la información del usuario(cliente)
	@GetMapping
	@RequestMapping(value = "usuario")
	public ResponseEntity<List<UsuarioDeuda>> getUsuario(@RequestParam("USER_ID") Integer USER_ID){
		try {
			List<UsuarioDeuda> param = usuarioJPA.getUsuario(USER_ID);
			return ResponseEntity.ok(param);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Ejecuta la asginación de clientes para creacion de la agenda
	@GetMapping
	@RequestMapping(value = "asignacion")
	public ResponseEntity<HttpStatus> generarAgenda(){
		
		
		SimpleJdbcCall refCursor = new SimpleJdbcCall(jdbc)
				.withCatalogName("COBRANZA")
				.withProcedureName("CREAR_AGENDA");
		try {
				refCursor.execute();
				return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
