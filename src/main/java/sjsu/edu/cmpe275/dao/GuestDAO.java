package sjsu.edu.cmpe275.dao;

import java.util.List;

import sjsu.edu.cmpe275.model.Guest;

public interface GuestDAO {
	
	public List<Guest> listGuests();
	public Guest viewGuest(Long guest_id);
	public void updateGuest(Guest guest);
	
	
}
