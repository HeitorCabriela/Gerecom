package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.Cidade;


public class CidadeDao extends GenericDaoImpl<Cidade> {
	
	public CidadeDao (Class<Cidade> entityClass){
		super(entityClass);
	}

	@Override
	public List<Cidade> findAll() {
		return getEntityManager().createQuery("SELECT e FROM Cidade c").getResultList();
		
	}

	@Override
	public Cidade findByName(String name) {
		return (Cidade) getEntityManager().createQuery("SELECT c FROM Cidade c WHERE c.nome = ? ", Cidade.class)
				.setParameter(1, name).getResultList().get(0);
	}
	
	

}
