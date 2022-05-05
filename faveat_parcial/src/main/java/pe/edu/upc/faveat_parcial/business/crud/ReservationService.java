package pe.edu.upc.faveat_parcial.business.crud;

import java.util.List;

import pe.edu.upc.faveat_parcial.model.entity.Reservation;

public interface ReservationService extends CrudService<Reservation, Integer>{
	List<Reservation> findByTxtReservation(String txtReservation) throws Exception;
}
