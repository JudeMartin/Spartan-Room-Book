package sjsu.edu.cmpe275.dao;

import java.util.List;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;

public interface ReservationDAO {
	Reservation createReservation(Reservation reservation, Guest guest);
	Reservation cancelReservation(String reservationId);
	List<Reservation> findReservation();
	Reservation findReservation(String reservationId);
	boolean checkAvailability(SearchCriteria searchCriteria);
}
