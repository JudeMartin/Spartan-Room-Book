package sjsu.edu.cmpe275.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.model.Guest;

@Repository("guestDao")
public class GuestDAOImpl implements GuestDAO {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
	}

	protected Session getSession(){
        return sessionFactory.openSession();
	}
	
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
		Session session = sessionFactory.openSession();

		/*Query query = session.createQuery(" from guest");
		List<Guest> listCategories1 = query.list();
		 for (Guest guest : listCategories1) {
			System.out.println(guest);
		}
		return listCategories1;
		*/
		
		
		try {
			System.out.println("Try Block => In the ListGuest - DAO");		
			List<Guest> res = (List<Guest>) session.createQuery("from Guest").list();
			System.out.println("Try Block => after hibernate Sessoion In the ListGuest - DAO is list empty?"+res.isEmpty());	
			return res;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.out.println("Caught the error in the ListGuests:");
			e.printStackTrace();
		}finally {
			session.close();
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