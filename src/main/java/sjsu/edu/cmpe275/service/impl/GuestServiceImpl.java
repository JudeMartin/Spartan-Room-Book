package sjsu.edu.cmpe275.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.GuestDAO;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.service.GuestService;

@Service("guestService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestDAO guestDao;

	@Transactional(readOnly = true)
	@Override
	public List<Guest> listGuest() {
		// TODO Auto-generated method stub
		return guestDao.listGuest();
	}

	@Transactional
	@Override
	public Guest createGuest(Guest guest) {
		// TODO Auto-generated method stub
		return guestDao.createGuest(guest);
	}

	@Transactional(readOnly = true)
	@Override
	public Guest viewGuest(Long guestId) {
		// TODO Auto-generated method stub
		return guestDao.viewGuest(guestId);
	}

	@Transactional
	public void updateGuest(Guest guest) {
		guestDao.updateGuest(guest);
	}

	@Transactional
	public void deleteGuest(Long guestId) {
		guestDao.deleteGuest(guestId);
	}
}