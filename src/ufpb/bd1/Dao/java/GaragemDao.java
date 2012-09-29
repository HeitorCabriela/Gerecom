package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.Garagem;


public class GaragemDao<Aluno> extends GenericDaoImpl<Garagem>{

	public GaragemDao(Class<Garagem> entityClass) {
		super(entityClass);
		
	}
	@Override
	public List<Garagem> findAll() {
		return getEntityManager().createQuery("SELECT g FROM Garagem g").getResultList();
	}

	@Override
	public Garagem findByName(String name) {
		return (Garagem) getEntityManager().createQuery("SELECT g FROM Garagem g WHERE g.numero = ? ", Garagem.class)
				.setParameter(1, name).getResultList().get(0);
	}
	
	
	

}
