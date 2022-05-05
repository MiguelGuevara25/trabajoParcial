package pe.edu.upc.faveat_parcial.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.faveat_parcial.model.entity.Tabla;
import pe.edu.upc.faveat_parcial.model.repository.TablaRepository;

@Named
@ApplicationScoped
public class TablaRepositoryImpl implements TablaRepository{

	@PersistenceContext(unitName = "faveat_parcialPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<Tabla> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.findById(id, Tabla.class);
	}

	@Override
	public List<Tabla> findAll() throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT tabla FROM Tabla tabla";
		return this.findByQuery(Tabla.class, jpql);
	}

	@Override
	public List<Tabla> findByData(String data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tabla> findbyCapacitysAndTypes(String capacity, String type) throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT tabla FROM Tabla tabla WHERE tabla.capacity = '" + capacity + "' and tabla.type = '" + type + "'";
		return this.findByQuery(Tabla.class, jpql);
	}
}
