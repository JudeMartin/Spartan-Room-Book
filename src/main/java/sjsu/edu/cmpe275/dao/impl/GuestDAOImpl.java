package sjsu.edu.cmpe275.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.dao.GuestDAO;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Room;

@Repository
public class GuestDAOImpl implements GuestDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Guest> listGuests() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(Guest.class).list();
	}

	@Override
	public Guest viewGuest(Long guest_id) {
		// TODO Auto-generated method stub
		Guest guest = (Guest)getSession().get(Guest.class, guest_id);
		return guest;
	}

	@Override
	public void updateGuest(Guest guest) {
		// TODO Auto-generated method stub
		getSession().merge(guest);
		
	}
	
	private Session getSession(){
		Session session = getSessionFactory().getCurrentSession();
		if(session == null){
			session = getSessionFactory().openSession();
		}
		return session;
	}
	
	private SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
