package sjsu.edu.cmpe275.service;

import java.util.List;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;

public interface ReservationService {
	Reservation createReservation(Reservation reservation, Guest guest);
	Reservation cancelReservation(String reservationId);
	List<Reservation> findReservation();
	Reservation findReservation(String reservationId);
	boolean checkAvailability(SearchCriteria searchCriteria);

}
