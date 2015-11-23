package sjsu.edu.cmpe275.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.model.Guest;

@Repository("guestDao")
public class GuestDAOImpl implements GuestDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addGuest(Guest guest) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(guest);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Guest> listGuests() {
		// TODO Auto-generated method stub
		System.out.println("In the ListGuest - DAO");
		
		try {
			return (List<Guest>) sessionFactory.getCurrentSession().createCriteria(Guest.class).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.out.println("Caught the error in the ListGuests:");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Guest getGuest(int guest_id) {
		// TODO Auto-generated method stub
		return (Guest) sessionFactory.getCurrentSession().get(Guest.class, guest_id);
	}

	@Override
	public void deleteGuest(Guest guest) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().createQuery("DELETE FROM guest WHERE guest_id = "+guest.getGuest_id()).executeUpdate();
	}

}