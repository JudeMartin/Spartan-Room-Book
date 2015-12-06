package sjsu.edu.cmpe275.service;

import java.util.List;

import sjsu.edu.cmpe275.model.Guest;

public interface GuestService {

	public List<Guest> listGuest();

	public Guest createGuest(Guest guest);

	public Guest viewGuest(Long guestId);

	public void updateGuest(Guest guest);

	public void deleteGuest(Long guestId);

}