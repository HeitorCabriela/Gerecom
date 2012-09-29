package com.projectbd.dao.test;
import ufpb.banco1.util.*;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ufpb.banco1dao.RepositoryException;
import ufpb.banco1entity.Cidade;
import ufpb.banco1entity.Estado;
import ufpb.bd1.Dao.java.CidadeDao;
import ufpb.bd1.Dao.java.EstadoDao;

public class CidadeDaoTest {

	private CidadeDao daoCidade;
	private Cidade cidade;
	private Estado estado;
	private EstadoDao daoEstado;
	
	@Before
	public void setUp() throws Exception {
		cidade = new Cidade();
		daoCidade = new CidadeDao(Cidade.class);
	    estado = new Estado();
	    daoEstado = new EstadoDao(Estado.class);
	}
	@Test
	public void testSave() throws RepositoryException {
		estado.setUf("PB");
		daoEstado.save(estado);
		 cidade.setNome("joao pessoa");
		cidade.setIdEstado(estado);
		 
		daoCidade.save(cidade);
		 
		 Cidade c= daoCidade.findByName("joao pessoa");
			Assert.assertEquals(c.getNome(),"joao pessoa");
	}
	
	@Ignore
	public void testUpdate()throws RepositoryException{
		estado.setUf("PB");
		daoEstado.save(estado);
		 cidade.setNome("joao pessoa");
		 cidade.setIdEstado(estado);
			 
			daoCidade.save(cidade);
			
			cidade.setNome("Itabaiana");
			
			daoCidade.update(cidade);
			
		
		Assert.assertTrue(daoCidade.findId(1).getId().equals(1));
	}
	
	@Ignore
	public void testDelete()throws RepositoryException{
		
	    estado.setUf("PB");
		daoEstado.save(estado);
		
		cidade.setNome("joao pessoa");
		
		
		 cidade.setIdEstado(estado);
		 daoCidade.save(cidade);
		 
		 daoCidade.delete(cidade);
		
		 Assert.assertTrue(daoCidade.findAll().size() == 0);
	}
	
	@Ignore
	public void testFindAll()throws RepositoryException {
		estado.setUf("PB");
		daoEstado.save(estado);
		 cidade.setNome("joao pessoa");
		 cidade.setIdEstado(estado);
			 
			daoCidade.save(cidade);
		
		Assert.assertTrue(daoCidade.findAll().size() == 1);
	}
	
	
	
	@Ignore
	public void testFindId()throws RepositoryException{
		estado.setUf("PB");
		daoEstado.save(estado);
		 cidade.setNome("joao pessoa");
		 cidade.setIdEstado(estado);
			 
			daoCidade.save(cidade);
			
		Assert.assertTrue(daoCidade.findId(1).getId().equals(1));
	}
}


	
	
	
	
	
	

