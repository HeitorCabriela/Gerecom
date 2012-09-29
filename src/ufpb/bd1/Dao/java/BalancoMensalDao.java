package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.BalancoMensal;


public class BalancoMensalDao  extends GenericDaoImpl<BalancoMensal>{

	public BalancoMensalDao(Class<BalancoMensal>entityClass) {
		super(entityClass);
	}

	@Override
	public List<BalancoMensal> findAll() {
		
		return getEntityManager().createQuery("SELECT b FROM BalancoMensal b").getResultList();
	}

	@Override
	public BalancoMensal findByName(String name) {
		return (BalancoMensal) getEntityManager().createQuery("SELECT b FROM BalancoMensal b WHERE b.data = ? ", BalancoMensal.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
