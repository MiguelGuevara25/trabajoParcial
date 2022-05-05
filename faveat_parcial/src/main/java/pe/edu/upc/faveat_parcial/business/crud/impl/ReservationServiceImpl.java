package pe.edu.upc.faveat_parcial.business.crud.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.faveat_parcial.business.crud.ReservationService;
import pe.edu.upc.faveat_parcial.model.entity.Reservation;
import pe.edu.upc.faveat_parcial.model.repository.JpaRepository;
import pe.edu.upc.faveat_parcial.model.repository.ReservationRepository;

@Named
@ApplicationScoped
public class ReservationServiceImpl implements ReservationService{

	@Inject
	private ReservationRepository reservationRepository;
	
	@Override
	public JpaRepository<Reservation, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return this.reservationRepository;
	}

	@Override
	public List<Reservation> findByTxtReservation(String txtReservation) throws Exception {
		// TODO Auto-generated method stub
		return this.reservationRepository.findByTxtReservation(txtReservation);
	}

}
