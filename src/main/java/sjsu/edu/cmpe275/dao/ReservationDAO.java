package sjsu.edu.cmpe275.dao;

import java.util.List;

import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;

public interface ReservationDAO {
	
	Reservation createReservation(Reservation reservation);

	Reservation cancelReservation(Long reservationId);

	List<Reservation> findReservation();

	Reservation findReservation(Long reservationId);

	Reservation findReservationGuest(Long guest_id);

	Integer checkAvailability(SearchCriteria searchCriteria);
	
	public void updateReservation(Reservation reservation);
}
