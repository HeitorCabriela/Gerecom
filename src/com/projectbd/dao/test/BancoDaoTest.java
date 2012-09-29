package com.projectbd.dao.test;

import static org.junit.Assert.*;

import java.sql.Date;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ufpb.banco1dao.RepositoryException;
import ufpb.banco1entity.BalancoMensal;
import ufpb.banco1entity.Banco;
import ufpb.banco1entity.Boleto;
import ufpb.banco1entity.Estado;
import ufpb.banco1entity.Morador;
import ufpb.bd1.Dao.java.BalancoMensalDao;
import ufpb.bd1.Dao.java.BancoDao;
import ufpb.bd1.Dao.java.BoletoDao;
import ufpb.bd1.Dao.java.EstadoDao;

public class BancoDaoTest {
	private BancoDao daoBanco;
	private Banco banco;

	
	@Before
	public void setUp() throws Exception {

		banco = new Banco();
		daoBanco = new BancoDao(Banco.class);
		
	}

	
	@Ignore
	public void testSave() throws RepositoryException {
		
		banco.setCodigo("123");
		banco.setNome("Banco Brasil");
		
		daoBanco.save(banco);
		Banco b= daoBanco.findByName("Banco Brasil");
			Assert.assertEquals(b.getNome(),"Banco Brasil");
	}

	@Ignore
	public void testUpdate() throws RepositoryException {
		
		banco.setCodigo("123");
		banco.setNome("Banco Brasil");
		
		daoBanco.save(banco);
		
		banco.setNome("bradesco");
		
		daoBanco.update(banco);
		Assert.assertTrue(daoBanco.findAll().size() == 0);
		
	}

	@Ignore
	public void testDelete() throws RepositoryException {
	
		banco.setCodigo("123");
		banco.setNome("Banco Brasil");
		
		daoBanco.save(banco);
		
		daoBanco.delete(banco);
	
	 Assert.assertTrue(daoBanco.findAll().size() == 0);
	
	
	}
	@Ignore
	public void testFindId() throws RepositoryException {
		
		banco.setCodigo("123");
		banco.setNome("Banco Brasil");
		
		daoBanco.save(banco);
		
		Assert.assertTrue(daoBanco.findId(1).getId().equals(1));
	
		
	}
	
	@Test
		public void testFindAll() throws RepositoryException {
		
		banco.setCodigo("123");
		banco.setNome("Banco Brasil");
		
		daoBanco.save(banco);
		
		Assert.assertTrue(daoBanco.findAll().size() == 1);
	
	}
	
}
