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
import ufpb.bd1.Dao.java.MoradorDao;

public class MoradorDaoTest {
	private Morador morador;
	private MoradorDao daoMorador;
	private Condominio condominio;
	private CondominioDao daoCondominio;
	private Cidade cidade;
	private CidadeDao daoCidade;
	private Estado estado;
	private EstadoDao daoEstado;
	

	@Before
	public void setUp() throws Exception {
		cidade = new Cidade();
		daoCidade = new CidadeDao(Cidade.class);
	    estado = new Estado();
	    daoEstado = new EstadoDao(Estado.class);
		morador = new Morador();
		daoMorador = new MoradorDao(Morador.class);
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
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		daoMorador.save(morador);
		
		 Morador m= daoMorador.findByName("Carlos");
			Assert.assertEquals(m.getNome(),"Carlos");
		
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
	condominio.setCodigo(11);
	daoCondominio.save(condominio);
	morador.setNome("Carlos");
	morador.setCpf("05921841459");
	morador.setNResd("B103");
	morador.setTelefone("3235-6450");
	morador.setCodCond(condominio);
	daoMorador.save(morador);
	
	daoMorador.delete(morador);
	
	
	 Assert.assertTrue(daoMorador.findAll().size() == 0);
	
	
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
		condominio.setCodigo(11);
		daoCondominio.save(condominio);
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		daoMorador.save(morador);
		
		morador.setNome("Heitor");
		
		daoMorador.update(morador);
		Assert.assertTrue(daoMorador.findId(1).getId().equals(1));
		
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
		condominio.setCodigo(11);
		daoCondominio.save(condominio);
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		daoMorador.save(morador);
		Assert.assertTrue(daoMorador.findAll().size() == 1);
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
		condominio.setCodigo(11);
		daoCondominio.save(condominio);
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		daoMorador.save(morador);
		
		
		Assert.assertTrue(daoMorador.findId(1).getId().equals(1));
	}
	
	
	
	
	
	

}
