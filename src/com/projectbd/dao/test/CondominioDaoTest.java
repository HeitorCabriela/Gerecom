package com.projectbd.dao.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ufpb.banco1dao.RepositoryException;
import ufpb.banco1entity.Cidade;
import ufpb.banco1entity.Condominio;
import ufpb.banco1entity.Estado;
import ufpb.banco1entity.Morador;
import ufpb.bd1.Dao.java.CidadeDao;
import ufpb.bd1.Dao.java.CondominioDao;
import ufpb.bd1.Dao.java.EstadoDao;

public class CondominioDaoTest {
	private Condominio condominio;
	private CondominioDao daoCondominio;
	private Estado estado;
	private EstadoDao daoEstado;
	private Cidade cidade;
	private CidadeDao daoCidade;

	@Before
	public void setUp() throws Exception {
		cidade = new Cidade();
		daoCidade = new CidadeDao(Cidade.class);
	    estado = new Estado();
	    daoEstado = new EstadoDao(Estado.class);	
	    condominio = new Condominio();
		daoCondominio = new CondominioDao(Condominio.class);
	}

	@Ignore
	public void testSave() throws RepositoryException {
		estado.setUf("PB");
		daoEstado.save(estado);
		
		 cidade.setNome("joao pessoa");
		cidade.setIdEstado(estado);
		daoCidade.save(cidade);
		condominio.setNome("OURO BRANCO");
		condominio.setEndereco("Rua José Carlos");
		condominio.setQuantRes(40);
		condominio.setIdCidade(cidade);
		condominio.setCodigo(11);
		daoCondominio.save(condominio);
		
		 Condominio c= daoCondominio.findByName("OURO BRANCO");
			Assert.assertEquals(c.getNome(),"OURO BRANCO");
	}

	@Ignore
	public void testDelete() throws RepositoryException {
		
		estado.setUf("PB");
		daoEstado.save(estado);
		
		 cidade.setNome("joao pessoa");
		cidade.setIdEstado(estado);
		daoCidade.save(cidade);
		condominio.setNome("OURO BRANCO");
		condominio.setEndereco("Rua José Carlos");
		condominio.setQuantRes(40);
		condominio.setIdCidade(cidade);
		daoCondominio.save(condominio);
		
		daoCondominio.delete(condominio);
		 Assert.assertTrue(daoCondominio.findAll().size() == 0);
		
	}

	@Ignore
	public void testUpdate() throws RepositoryException {
		estado.setUf("PB");
		daoEstado.save(estado);
		
		 cidade.setNome("joao pessoa");
		cidade.setIdEstado(estado);
		daoCidade.save(cidade);
		condominio.setNome("OURO BRANCO");
		condominio.setEndereco("Rua José Carlos");
		condominio.setQuantRes(40);
		condominio.setIdCidade(cidade);
		daoCondominio.save(condominio);
		
		condominio.setEndereco("RUA DA TESOURA");
		
		daoCondominio.update(condominio);
		
		Assert.assertTrue(daoCondominio.findId(1).getCodigo().equals(1));
		
	}

	@Ignore
	public void testFindAll() throws RepositoryException {
		
		
		estado.setUf("PB");
		daoEstado.save(estado);
		
		 cidade.setNome("joao pessoa");
		cidade.setIdEstado(estado);
		daoCidade.save(cidade);
		condominio.setNome("OURO BRANCO");
		condominio.setEndereco("Rua José Carlos");
		condominio.setQuantRes(40);
		condominio.setIdCidade(cidade);
		daoCondominio.save(condominio);
		
		Assert.assertTrue(daoCondominio.findAll().size() == 1);
	}
	
	@Test
	public void testFindId()throws RepositoryException{
		
		estado.setUf("PB");
		daoEstado.save(estado);
		 cidade.setNome("joao pessoa");
		cidade.setIdEstado(estado);
		daoCidade.save(cidade);
		condominio.setNome("OURO BRANCO");
		condominio.setEndereco("Rua José Carlos");
		condominio.setQuantRes(40);
		condominio.setIdCidade(cidade);
		
		daoCondominio.save(condominio);
		
		
		Assert.assertTrue(daoCondominio.findId(1).getCodigo().equals(1));
	}
	

}
