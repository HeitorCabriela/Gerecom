package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.Estado;
import ufpb.banco1entity.Morador;

public class MoradorDao extends GenericDaoImpl<Morador> {

	public MoradorDao(Class<Morador> entityClass) {
		super(entityClass);
	}

	@Override
	public List<Morador> findAll() {
		
		return getEntityManager().createQuery("SELECT m FROM Morador m").getResultList();
	}

	@Override
	public Morador findByName(String name) {
		return (Morador) getEntityManager().createQuery("SELECT m FROM Morador m WHERE m.nome = ? ", Morador.class)
				.setParameter(1, name).getResultList().get(0);
	}
}
