package com.projectbd.dao.test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ufpb.banco1dao.RepositoryException;
import ufpb.banco1entity.BalancoMensal;
import ufpb.banco1entity.Cidade;
import ufpb.banco1entity.Condominio;
import ufpb.banco1entity.Despesas;
import ufpb.banco1entity.Estado;
import ufpb.banco1entity.Morador;
import ufpb.bd1.Dao.java.BalancoMensalDao;
import ufpb.bd1.Dao.java.CidadeDao;
import ufpb.bd1.Dao.java.CondominioDao;
import ufpb.bd1.Dao.java.DespesasDao;
import ufpb.bd1.Dao.java.EstadoDao;
import ufpb.bd1.Dao.java.MoradorDao;

public class DespesasDaoTest {
	
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
	private Despesas despesas;
	private DespesasDao daoDespesas;

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
		despesas = new Despesas();
		daoDespesas = new DespesasDao(Despesas.class);
		
		
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
		
		despesas.setDespAgua(333.3);
		despesas.setDespLuz(3344.4);
		despesas.setFolhaPagamentoFunc(5555.55);
	    despesas.setIdBalanco(balanco);
	    despesas.setSaldoAnt(444.4);
	    despesas.setSaldoBanc(777.77);
	    despesas.setSinteg(55.55);
	    despesas.setTotalDespesas(999.99);
	    despesas.setTotalReceita(99988.66);
	  
	    daoDespesas.save(despesas);
	    
	    Assert.assertTrue(daoDespesas.findId(1).getId().equals(1));
	    
		
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
		
		despesas.setDespAgua(333.3);
		despesas.setDespLuz(3344.4);
		despesas.setFolhaPagamentoFunc(5555.55);
	    despesas.setIdBalanco(balanco);
	    despesas.setSaldoAnt(444.4);
	    despesas.setSaldoBanc(777.77);
	    despesas.setSinteg(55.55);
	    despesas.setTotalDespesas(999.99);
	    despesas.setTotalReceita(99988.66);
	  
	    daoDespesas.save(despesas);
	    
	    daoDespesas.delete(despesas);
	    
	    Assert.assertTrue(daoDespesas.findAll().size() == 0);
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
		
		despesas.setDespAgua(333.3);
		despesas.setDespLuz(3344.4);
		despesas.setFolhaPagamentoFunc(5555.55);
	    despesas.setIdBalanco(balanco);
	    despesas.setSaldoAnt(444.4);
	    despesas.setSaldoBanc(777.77);
	    despesas.setSinteg(55.55);
	    despesas.setTotalDespesas(999.99);
	    despesas.setTotalReceita(99988.66);
	  
	    daoDespesas.save(despesas); 
	    
	    despesas.setDespAgua(888.88);
	    
	    despesas.setDespLuz(444.44);
	    
	    daoDespesas.update(despesas);
	    
	    Assert.assertTrue(daoDespesas.findId(1).getId().equals(1));
	}

	@Ignore
	public void testFindId() throws RepositoryException {
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
		
		despesas.setDespAgua(333.3);
		despesas.setDespLuz(3344.4);
		despesas.setFolhaPagamentoFunc(5555.55);
	    despesas.setIdBalanco(balanco);
	    despesas.setSaldoAnt(444.4);
	    despesas.setSaldoBanc(777.77);
	    despesas.setSinteg(55.55);
	    despesas.setTotalDespesas(999.99);
	    despesas.setTotalReceita(99988.66);
	    
	    daoDespesas.save(despesas);
	    
	    Assert.assertTrue(daoMorador.findId(1).getId().equals(1));
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
		
		despesas.setDespAgua(333.3);
		despesas.setDespLuz(3344.4);
		despesas.setFolhaPagamentoFunc(5555.55);
	    despesas.setIdBalanco(balanco);
	    despesas.setSaldoAnt(444.4);
	    despesas.setSaldoBanc(777.77);
	    despesas.setSinteg(55.55);
	    despesas.setTotalDespesas(999.99);
	    despesas.setTotalReceita(99988.66);
	    
	    daoDespesas.save(despesas);
	    
	    Assert.assertTrue(daoDespesas.findAll().size() == 1);
		
	}

}
