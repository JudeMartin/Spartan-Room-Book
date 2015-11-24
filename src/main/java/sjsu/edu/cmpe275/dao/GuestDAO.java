package sjsu.edu.cmpe275.dao;

import java.util.List;

import sjsu.edu.cmpe275.model.Guest;

public interface GuestDAO {
	public void addGuest(Guest guest);

	public List<Guest> listGuests();
	
	public Guest getGuest(int guest_id);
	
	public void deleteGuest(Guest guest);
	
}