package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.Boleto;


public class BoletoDao extends GenericDaoImpl<Boleto> {

	public BoletoDao(Class<Boleto> entityCLass) {
		super(entityCLass);
	}

	@Override
	public List<Boleto> findAll() {
		
		return getEntityManager().createQuery("SELECT b FROM Boleto b").getResultList();
	}

	@Override
	public Boleto findByName(String name) {
		
		return (Boleto) getEntityManager().createQuery("SELECT b FROM Boleto b WHERE b.data= ? ", Boleto.class)
				.setParameter(1, name).getResultList().get(0);
	}

}
