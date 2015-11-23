package sjsu.edu.cmpe275.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.GuestDAO;
import sjsu.edu.cmpe275.model.Guest;

@Service("guestService")
//@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class GuestServiceImpl implements GuestService {
	
	@Autowired
	private GuestDAO guestDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addGuest(Guest guest) {
		guestDao.addGuest(guest);
	}

	public List<Guest> listGuests() {
		return guestDao.listGuests();
	}

	public Guest getGuest(int guest_id) {
		return guestDao.getGuest(guest_id);
	}

	public void deleteGuest(Guest guest) {
		guestDao.deleteGuest(guest);
	}

}