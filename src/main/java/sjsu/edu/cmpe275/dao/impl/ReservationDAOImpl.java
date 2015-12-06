package sjsu.edu.cmpe275.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.dao.ReservationDAO;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;


@Repository
public class ReservationDAOImpl implements ReservationDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Reservation createReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		Reservation reserv = (Reservation) getSession().merge(reservation);
		return reserv;
	}

	@Override
	public Reservation cancelReservation(String reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation findReservation(String reservationId) {
		// TODO Auto-generated method stub
		Reservation reservation = (Reservation)getSession().get(Reservation.class, reservationId);
		return reservation;
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

	@Override
	public boolean checkAvailability(SearchCriteria searchCriteria) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reservation findReservationGuest(Long guest_id) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Reservation where guest_id= :id");
		query.setParameter("id", guest_id);
		List<Reservation> list = query.list();
		System.out.println("query: " + query);
		System.out.println(list.get(0).getGuestId());
		Reservation reservation = list.get(0);
		return reservation;
		
	}


}
