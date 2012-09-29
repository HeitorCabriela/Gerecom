package ufpb.bd1.Dao.java;

import java.util.List;

import ufpb.banco1dao.GenericDaoImpl;
import ufpb.banco1entity.Cidade;
import ufpb.banco1entity.Despesas;

public class DespesasDao extends GenericDaoImpl<Despesas>{

	public DespesasDao(Class<Despesas> entityCLass) {
		super(entityCLass);
	}

	@Override
	public List<Despesas> findAll() {
		// TODO Auto-generated method stub
		return getEntityManager().createQuery("SELECT d FROM Despesas d").getResultList();
	}

	@Override
	public Despesas findByName(String name) {
		return (Despesas) getEntityManager().createQuery("SELECT d FROM Despesas d WHERE d.id = ? ", Despesas.class)
				.setParameter(1, name).getResultList().get(0);

}
}