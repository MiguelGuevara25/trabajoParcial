package pe.edu.upc.faveat_parcial.business.crud.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.faveat_parcial.business.crud.TablaService;
import pe.edu.upc.faveat_parcial.model.entity.Tabla;
import pe.edu.upc.faveat_parcial.model.repository.JpaRepository;
import pe.edu.upc.faveat_parcial.model.repository.TablaRepository;

@Named
@ApplicationScoped
public class TablaServiceImpl implements TablaService{

	@Inject
	private TablaRepository tablaRepository;
	
	@Override
	public JpaRepository<Tabla, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return this.tablaRepository;
	}

	@Override
	public List<Tabla> findbyCapacitysAndTypes(String capacity, String type) throws Exception {
		// TODO Auto-generated method stub
		return this.tablaRepository.findbyCapacitysAndTypes(capacity, type);
	}

}
