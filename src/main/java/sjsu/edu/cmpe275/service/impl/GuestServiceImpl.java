package sjsu.edu.cmpe275.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.GuestDAO;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.service.GuestService;

@Service
public class GuestServiceImpl implements GuestService {
	
	@Autowired
	private GuestDAO guestDAO;

	@Transactional(readOnly = true)
	public List<Guest> listGuests() {
		// TODO Auto-generated method stub
		return guestDAO.listGuests();
	}

	@Transactional(readOnly = true)
	public Guest viewGuest(Long guest_id) {
		// TODO Auto-generated method stub
		return guestDAO.viewGuest(guest_id);
	}

	@Transactional
	public void updateGuest(Guest guest) {
		// TODO Auto-generated method stub
		guestDAO.updateGuest(guest);
		
	}
	
	

}
