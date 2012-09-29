package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.Banco;


public class BancoDao extends GenericDaoImpl<Banco> {

	public BancoDao(Class<Banco> entityClass) {
		super(entityClass);
	}

	@Override
	public List<Banco> findAll() {
		return getEntityManager().createQuery("SELECT b FROM Banco b").getResultList();
		
	}

	@Override
	public Banco findByName(String name) {
		return (Banco) getEntityManager().createQuery("SELECT b FROM Banco b WHERE b.nome = ? ", Banco.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
