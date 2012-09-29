package com.projectbd.dao.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ufpb.banco1dao.RepositoryException;
import ufpb.banco1entity.Estado;
import ufpb.bd1.Dao.java.EstadoDao;

public class EstadoDaoTest {
	  
	
		private EstadoDao dao;
		private Estado estado;
		
		@Before
		public void setUp() throws Exception {
			estado = new Estado();
			dao = new EstadoDao(Estado.class);
		}

		@Test
		public void testSave() throws RepositoryException{
			estado.setUf("PE");
			dao.save(estado);
			
			
			Estado e= dao.findByName("PE");
			Assert.assertEquals(e.getUf(),"PE");
		}
		@Ignore
		public void testUpdate()throws RepositoryException{
			estado.setUf("PB");
			dao.save(estado);
				
			estado.setUf("PE");
			
			dao.update(estado);
			
			Assert.assertTrue(dao.findId(1).getId().equals("1"));
		}
		
		@Ignore
		public void testDelete()throws RepositoryException{
			estado.setUf("PB");
			dao.save(estado);
				
			Estado e = dao.findByName("PB");
			dao.delete(e);
			
			Assert.assertTrue(dao.findAll().size() == 0);
		}
		
		@Ignore
		public void testFindAll()throws RepositoryException {
			estado.setUf("PB");
			dao.save(estado);
			
			Assert.assertTrue(dao.findAll().size() == 1);
		}
		
		@Ignore
		public void testFindByName()throws RepositoryException{
			estado.setUf("PB");
			dao.save(estado);
				
			Assert.assertTrue(dao.findByName("PB").equals(estado));
		}
		
		@Ignore
		public void testFindId()throws RepositoryException{
			estado.setUf("PB");
			dao.save(estado);
				
			Assert.assertTrue(dao.findId(1).getId().equals("1"));
		}
	}

	