package pe.edu.upc.faveat_parcial.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.faveat_parcial.business.crud.CrudService;
import pe.edu.upc.faveat_parcial.business.crud.TablaService;
import pe.edu.upc.faveat_parcial.model.entity.Tabla;

@Named("tablasView")
@ViewScoped
public class TablasView implements Serializable, EntityView<Tabla, Integer> {

	private static final long serialVersionUID = 1L;
	
	private List<Tabla> entities;
	private Tabla entitySelected;
	private List<Tabla> entitiesSelected;
	private Tabla entitySearch;
	
	@Inject
	private TablaService entityService;
	
	@PostConstruct
	public void init() {
		this.entitiesSelected = new ArrayList<>();
		this.entitySearch = new Tabla();
		getAllEntities();
	}

	@Override
	public CrudService<Tabla, Integer> getCrudService() {
		// TODO Auto-generated method stub
		return entityService;
	}

	@Override
	public void createNew() {
		// TODO Auto-generated method stub
		this.entitySelected = new Tabla();
		
	}

	@Override
	public Integer getIdFromEntitySelected() {
		// TODO Auto-generated method stub
		return this.entitySelected.getId();
	}

	@Override
	public void searchEntity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tabla> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEntities(List<Tabla> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tabla> getEntitiesSelected() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tabla getEntitySelected() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEntitySelected(Tabla entitySelected) {
		// TODO Auto-generated method stub
		
	}

}
