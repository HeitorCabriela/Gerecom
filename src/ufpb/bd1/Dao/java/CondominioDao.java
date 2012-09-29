package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.Condominio;


public class CondominioDao  extends GenericDaoImpl<Condominio>{

	public CondominioDao(Class<Condominio> entityClass) {
		
	    super(entityClass);
	}

	@Override
	public List<Condominio> findAll() {
		  
		return getEntityManager().createQuery("SELECT c FROM Condominio c").getResultList();
	}

	@Override
	public Condominio findByName(String name) {
		return (Condominio) getEntityManager().createQuery("SELECT c FROM Condominio c WHERE c.nome = ? ", Condominio.class)
				.setParameter(1, name).getResultList().get(0);
		
	}

}
