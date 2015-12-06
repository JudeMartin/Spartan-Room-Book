package sjsu.edu.cmpe275.dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.dao.GuestDAO;
import sjsu.edu.cmpe275.model.Guest;

@Repository("guestDao")
public class GuestDAOImpl implements GuestDAO {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	private Session getSession() {
		Session session = getSessionFactory().getCurrentSession();
		if (session == null) {
			session = getSessionFactory().openSession();
		}
		return session;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Guest> listGuest() {
		return getSession().createCriteria(Guest.class).list();
	}

	@Override
	public Guest createGuest(Guest guest) {
		Guest gs = (Guest) getSession().merge(guest);
		return gs;
	}

	@Override
	public Guest viewGuest(Long guestId) {
		Guest room = (Guest) getSession().get(Guest.class, guestId);
		return room;
	}

	@Override
	public void updateGuest(Guest room) {
		getSession().merge(room);
	}

	@Override
	public void deleteGuest(Long guestId) {
		Guest guest = (Guest) getSession().get(Guest.class, guestId);
		getSession().delete(guest);
	}
}