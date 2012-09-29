package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.Estado;

public  class EstadoDao extends GenericDaoImpl<Estado>{

	public EstadoDao(Class<Estado> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Estado> findAll() {
		return getEntityManager().createQuery("SELECT e FROM Estado e").getResultList();

	}

	@Override
	public Estado findByName(String name) {
		return (Estado) getEntityManager().createQuery("SELECT e FROM Estado e WHERE e.uf = ? ", Estado.class)
				.setParameter(1, name).getResultList().get(0);
	}
	
}
		
	