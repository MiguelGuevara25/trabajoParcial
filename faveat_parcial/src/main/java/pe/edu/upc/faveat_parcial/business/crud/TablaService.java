package pe.edu.upc.faveat_parcial.business.crud;

import java.util.List;

import pe.edu.upc.faveat_parcial.model.entity.Tabla;

public interface TablaService extends CrudService<Tabla, Integer>{
	List<Tabla> findbyCapacitysAndTypes(String capacity, String type) throws Exception;
}
