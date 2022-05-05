package pe.edu.upc.faveat_parcial.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.faveat_parcial.model.entity.Reservation;
import pe.edu.upc.faveat_parcial.model.repository.ReservationRepository;

@Named
@ApplicationScoped
public class ReservationRepositoryImpl implements ReservationRepository{

	@PersistenceContext(unitName = "faveat_parcialPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return this.entityManager;
	}

	@Override
	public Optional<Reservation> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.findById(id, Reservation.class);
	}

	@Override
	public List<Reservation> findAll() throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT reserva FROM Reservation reserva";
		return this.findByQuery(Reservation.class, jpql);
	}

	@Override
	public List<Reservation> findByData(String data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findByTxtReservation(String txtReservation) throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT reserva FROM Reservation reserva WHERE reserva.txtReservation = '" + txtReservation + "'";
		return this.findByQuery(Reservation.class, jpql);
	}

}
