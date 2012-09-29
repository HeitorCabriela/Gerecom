package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;

import ufpb.banco1entity.Fucionarios;

public class FucionariosDao  extends GenericDaoImpl<Fucionarios>{

	public FucionariosDao(Class<Fucionarios> entityClass) {
		super(entityClass);
	}

	@Override
	public List<Fucionarios> findAll() {
		return getEntityManager().createQuery("SELECT f FROM Fucionarios f").getResultList();
	}

	@Override
	public Fucionarios findByName(String name) {
		return (Fucionarios) getEntityManager().createQuery("SELECT f FROM Fucionarios f WHERE f.nome = ? ", Fucionarios.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
