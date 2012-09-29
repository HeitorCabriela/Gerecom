package com.projectbd.dao.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ufpb.banco1dao.RepositoryException;
import ufpb.banco1entity.BalancoMensal;
import ufpb.banco1entity.Boleto;
import ufpb.banco1entity.Cidade;
import ufpb.banco1entity.Condominio;
import ufpb.banco1entity.Estado;
import ufpb.banco1entity.Morador;
import ufpb.bd1.Dao.java.BalancoMensalDao;
import ufpb.bd1.Dao.java.CidadeDao;
import ufpb.bd1.Dao.java.CondominioDao;
import ufpb.bd1.Dao.java.EstadoDao;
import ufpb.bd1.Dao.java.MoradorDao;

public class BalancoMensalDaoTest {
	private BalancoMensal balanco;
	private BalancoMensalDao daoBalanco;
	private Condominio condominio;
	private CondominioDao daoCondominio;
	private Estado estado;
	private EstadoDao daoEstado;
	private Cidade cidade;
	private CidadeDao daoCidade;
	private Morador morador;
	private MoradorDao daoMorador;
	@Before
	public void setUp() throws Exception {
		balanco = new BalancoMensal();
		daoBalanco = new BalancoMensalDao(BalancoMensal.class);
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
		daoCondominio.save(condominio);
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		daoMorador.save(morador);
		balanco.setData("09/12/2012");
		balanco.setStatus("Atual");
		balanco.setTotal(300.00);
		balanco.setIdCond(condominio);
		daoBalanco.save(balanco);
		
		
		
		BalancoMensal b= daoBalanco.findByName("09/12/2012");
			Assert.assertEquals(b.getData(),"09/12/2012");
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
		balanco.setData("09/12/2012");
		balanco.setStatus("Atual");
		balanco.setTotal(300.00);
		balanco.setIdCond(condominio);
		daoBalanco.save(balanco);
		
		daoBalanco.delete(balanco);
		Assert.assertTrue(daoBalanco.findAll().size() == 0);
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
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		daoMorador.save(morador);
		balanco.setData("09/12/2012");
		balanco.setStatus("Atual");
		balanco.setTotal(300.00);
		balanco.setIdCond(condominio);
		daoBalanco.save(balanco);
		
		balanco.setStatus("Negativo");
		
		daoBalanco.update(balanco);
		
		Assert.assertTrue(daoBalanco.findId(1).getId().equals(1));
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
		balanco.setData("09/12/2012");
		balanco.setStatus("Atual");
		balanco.setTotal(300.00);
		balanco.setIdCond(condominio);
		daoBalanco.save(balanco);
		
		
		Assert.assertTrue(daoBalanco.findAll().size() == 1);
	}

	
	
	@Ignore
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
		morador.setNome("Carlos");
		morador.setCpf("05921841459");
		morador.setNResd("B103");
		morador.setTelefone("3235-6450");
		morador.setCodCond(condominio);
		daoMorador.save(morador);
		balanco.setData("09/12/2012");
		balanco.setStatus("Atual");
		balanco.setTotal(300.00);
		balanco.setIdCond(condominio);
		daoBalanco.save(balanco);
		
		
		Assert.assertTrue(daoBalanco.findId(1).getId().equals(1));
	}
	
	
	
	
}
