package sjsu.edu.cmpe275.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.ReservationDAO;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;
import sjsu.edu.cmpe275.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationDAO reservationDAO;
	
	@Transactional
	public Reservation createReservation(Reservation reservation, Guest guest) {
		Reservation reserv = reservationDAO.createReservation(reservation, guest);
		return reserv;
	}

	@Override
	public Reservation cancelReservation(String reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation findReservation(String reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean checkAvailability(SearchCriteria searchCriteria) {
		// TODO Auto-generated method stub
		return false;
	}

}
