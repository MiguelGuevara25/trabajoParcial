package pe.edu.upc.faveat_parcial.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "tablas", indexes = {@Index(columnList = "capacitys, types", name = "tablas_index_capacitys_types")})
public class Tabla {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "capacitys", nullable = false)
	private Integer capacity;
	
	@Column(name = "types", length = 10, nullable = false)
	private String type;
}
