package pe.edu.upc.faveat_parcial.model.repository;

import java.util.List;

import pe.edu.upc.faveat_parcial.model.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	List<Reservation> findByTxtReservation(String txtReservation) throws Exception;
}
