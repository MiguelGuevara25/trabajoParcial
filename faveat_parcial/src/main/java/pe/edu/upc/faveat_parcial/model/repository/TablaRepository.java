package pe.edu.upc.faveat_parcial.model.repository;

import java.util.List;

import pe.edu.upc.faveat_parcial.model.entity.Tabla;

public interface TablaRepository extends JpaRepository<Tabla, Integer>{
	List<Tabla> findbyCapacitysAndTypes(String capacity, String type) throws Exception;
}
