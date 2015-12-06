package sjsu.edu.cmpe275.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.ReservationDAO;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.service.ReservationService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDAO reservationDAO;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	@Override
	public void addReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationDAO.addReservation(reservation);
	}

	@Override
	public List<Reservation> getReservation() {
		// TODO Auto-generated method stub
		return reservationDAO.getReservations();
	}

	@Override
	public Reservation getReservation(Long reservationId) {
		// TODO Auto-generated method stub
		
		return reservationDAO.getReservation(reservationId);
	}

	@Override
	public void deleteReservation(Long reservationId) {
		// TODO Auto-generated method stub
		reservationDAO.deleteReservation(reservationId);
	}

	@Override
	public void updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		reservationDAO.updateReservation(reservation);
	}

	/*
	 * private GuestServiceImpl guestImpl;
	 * 
	 * @Transactional public Reservation createReservation(Reservation
	 * reservation, Guest guest) {
	 * 
	 * Guest createdGuest = (Guest) guestImpl.createGuest(guest);
	 * guestImpl.viewGuest(createdGuest.getGuestId()); Reservation reserv =
	 * reservationDAO.createReservation(reservation, createdGuest); return
	 * reserv; }
	 * 
	 * @Override public Reservation cancelReservation(String reservationId) { //
	 * TODO Auto-generated method stub Reservation reserv =
	 * reservationDAO.cancelReservation(reservationId); return reserv; }
	 * 
	 * @Override public List<Reservation> findReservation() { // TODO
	 * Auto-generated method stub
	 * 
	 * return null; }
	 * 
	 * @Override public Reservation findReservation(String reservationId) { //
	 * TODO Auto-generated method stub Reservation reserv =
	 * reservationDAO.findReservation(reservationId); return reserv; }
	 * 
	 * @Override public boolean checkAvailability(SearchCriteria searchCriteria)
	 * { // TODO Auto-generated method stub
	 * 
	 * return false; }
	 */

}
