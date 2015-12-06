package sjsu.edu.cmpe275.service;

import java.util.List;

import sjsu.edu.cmpe275.model.Guest;

public interface GuestService {
	
	public List<Guest> listGuests();
	public Guest viewGuest(Long guest_id);
	public void updateGuest(Guest guest);
	
}
