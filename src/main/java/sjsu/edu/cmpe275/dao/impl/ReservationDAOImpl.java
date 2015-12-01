package sjsu.edu.cmpe275.dao.impl;

import java.util.List;

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
	public Reservation createReservation(Reservation reservation, Guest guest) {
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
		return null;
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


}
