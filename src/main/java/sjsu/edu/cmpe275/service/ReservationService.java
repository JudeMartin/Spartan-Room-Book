package sjsu.edu.cmpe275.service;

import java.util.List;

import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;

public interface ReservationService {
	Reservation createReservation(Reservation reservation);
	Reservation cancelReservation(String reservationId);
	List<Reservation> findReservation();
	Reservation findReservation(String reservationId);
	Reservation findReservationGuest(Long guest_id);
	Integer checkAvailability(SearchCriteria searchCriteria);

}
