package sjsu.edu.cmpe275.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.ReservationDAO;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;
import sjsu.edu.cmpe275.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDAO reservationDAO;

	@Transactional
	public Reservation createReservation(Reservation reservation) {
		Reservation reserv = reservationDAO.createReservation(reservation);
		return reserv;
	}

	@Transactional
	@Override
	public Reservation cancelReservation(Long reservationId) {
		// TODO Auto-generated method stub
		return reservationDAO.cancelReservation(reservationId);
	}
	
	@Transactional
	@Override
	public List<Reservation> findReservation() {
		// TODO Auto-generated method stub
		return reservationDAO.findReservation();
	}

	@Transactional(readOnly = true)
	public Reservation findReservation(Long reservationId) {
		// TODO Auto-generated method stub
		Reservation reservation = reservationDAO.findReservation(reservationId);
		return reservation;

	}

	@Transactional
	public Integer checkAvailability(SearchCriteria searchCriteria) {
		int checkAvailableRoom = reservationDAO.checkAvailability(searchCriteria);
		return checkAvailableRoom;
	}

	@Override
	public Reservation findReservationGuest(Long guest_id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
