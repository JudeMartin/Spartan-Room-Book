package sjsu.edu.cmpe275.service;

import java.util.List;

import sjsu.edu.cmpe275.model.Guest;

public interface GuestService {
 
	public void addGuest(Guest guest);

	public List<Guest> listGuests();
	
	public Guest getGuest(int guest_id);
	
	public void deleteGuest(Guest guest);
}