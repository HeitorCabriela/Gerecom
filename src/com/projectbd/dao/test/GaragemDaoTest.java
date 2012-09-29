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
import ufpb.banco1entity.Fucionarios;
import ufpb.banco1entity.Garagem;
import ufpb.banco1entity.Morador;
import ufpb.bd1.Dao.java.CidadeDao;
import ufpb.bd1.Dao.java.CondominioDao;
import ufpb.bd1.Dao.java.EstadoDao;
import ufpb.bd1.Dao.java.GaragemDao;
import ufpb.bd1.Dao.java.MoradorDao;

public class GaragemDaoTest {
	  private Condominio condominio;
     	private CondominioDao daoCondominio;
     	private Estado estado;
     	private EstadoDao daoEstado;
     	private Cidade cidade;
     	private CidadeDao daoCidade;
     	private Morador morador;
     	private MoradorDao daoMorador;
     	
     private GaragemDao daoGaragem; 
     private Garagem garagem;

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
			garagem = new Garagem();
			daoGaragem = new GaragemDao(Garagem.class);
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
		daoCondominio.save(condominio);
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		daoMorador.save(morador);
		garagem.setCodCond(condominio);
		garagem.setIdMorador(morador);
		garagem.setNumero(123);
		daoGaragem.save(garagem);
		
		Assert.assertTrue(daoGaragem.findId(1).getClass().equals(1));
		
	    
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
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		
		daoMorador.save(morador);
		
		garagem.setCodCond(condominio);
		garagem.setIdMorador(morador);
		garagem.setNumero(123);
		daoGaragem.save(garagem);
		daoGaragem.delete(garagem);
		
		Assert.assertTrue(daoGaragem.findAll().size() == 0);
		
		
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
		
		garagem.setCodCond(condominio);
		garagem.setIdMorador(morador);
		garagem.setNumero(123);
		
		daoGaragem.save(garagem);
		
		garagem.setId(11);
		
		daoGaragem.update(garagem);
		
		Assert.assertTrue(daoGaragem.findId(1).getClass().equals(1));
		
	}

	@Test
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
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		
		daoMorador.save(morador);
		
		garagem.setCodCond(condominio);
		garagem.setIdMorador(morador);
		garagem.setNumero(123);
		
		daoGaragem.save(garagem);
		
		
		Assert.assertTrue(daoGaragem.findAll().size() == 1);
	}

}
