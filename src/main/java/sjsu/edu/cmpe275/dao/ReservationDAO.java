package sjsu.edu.cmpe275.dao;

import java.util.List;

import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;

public interface ReservationDAO {
	Reservation createReservation(Reservation reservation);
	Reservation cancelReservation(String reservationId);
	List<Reservation> findReservation();
	Reservation findReservation(String reservationId);
	Reservation findReservationGuest(Long guest_id);
	boolean checkAvailability(SearchCriteria searchCriteria);
}
