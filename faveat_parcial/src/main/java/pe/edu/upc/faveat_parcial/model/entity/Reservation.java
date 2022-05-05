package pe.edu.upc.faveat_parcial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "reservations", indexes = {@Index(columnList = "txt_reservation", name = "reservation_index_txtReservation")})
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "txt_reservation", length = 10, nullable = false)
	private String txtReservation;
	
	@Column(name = "star_date", length = 10, nullable = false)
	private Date star;
	
	@Column(name = "end_date", length = 10, nullable = false)
	private Date end;
}
