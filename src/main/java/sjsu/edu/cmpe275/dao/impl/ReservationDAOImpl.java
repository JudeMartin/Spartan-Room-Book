package sjsu.edu.cmpe275.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.ReservationDAO;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;

@Repository
public class ReservationDAOImpl implements ReservationDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public Reservation createReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		Reservation reserv = (Reservation) getSession().merge(reservation);
		return reserv;
	}

	@Transactional
	@Override
	public Reservation cancelReservation(Long reservationId) {
		System.out.println("In theReservatrionDAO.deleteReservation()");
		Reservation reservation = (Reservation) getSession().get(Reservation.class, reservationId);
		getSession().delete(reservation);
		return null;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<Reservation> findReservation() {
		return (List<Reservation>) getSession().createCriteria(Reservation.class).list();
	}

	@Transactional
	@Override
	public Reservation findReservation(Long reservationId) {
		// TODO Auto-generated method stub
		Reservation reservation = (Reservation) getSession().get(Reservation.class, reservationId);
		return reservation;
	}

	@Transactional
	@Override
	public Integer checkAvailability(SearchCriteria searchCriteria) {
		System.out.println(searchCriteria.getCheckInDate().toString());
		String queryString = "from Reservation r " + "right outer join r.room where r.room.roomTypeId=:roomTypeId1 "
				+ "and r.room.id not in " + "(select res.room.id from Reservation as res where "
				+ "(res.checkInDate<=:checkInDate1 and res.checkOutDate>=:checkInDate1) "
				+ " or (res.checkInDate<=:checkOutDate1 and res.checkOutDate>=:checkOutDate1)"
				+ " or (res.checkInDate>=:checkInDate1 and res.checkInDate<=:checkOutDate1))";
		// String queryString2 = "from Reservation r right outer join
		// r.room";//where check_in_date > :code
		// String queryString2 = "select Room.id from Room inner join
		// Reservation r on r.room";
		// Query query = session.createQuery("from Person where org_id = :code
		// ");
		// query.setParameter("code", id);
		Query q = getSession().createQuery(queryString);
		// q.setParameter("code",
		// searchCriteria.getCheckInDate());//'2015-05-17')
		q.setParameter("checkInDate1", searchCriteria.getCheckInDate());
		q.setParameter("checkOutDate1", searchCriteria.getCheckOutDate());
		q.setParameter("roomTypeId1", searchCriteria.getRoomType());
		// System.out.println(q.list().toString());
		List<Object[]> list = q.list();
		System.out.println(q.list().size());
		for (Object[] objects : list) {
			if (objects[0] instanceof Reservation)
				return ((Reservation) objects[0]).getRoom().getId().intValue();
		}

		/*
		 * if (list.size() > 0){ //return any one room id to the user
		 * Reservation reservationObj = (Reservation)list.get(0); int roomId =
		 * reservationObj.getRoom().getId().intValue(); return roomId; } else
		 */
		return 0;
	}

	@Transactional
	@Override
	public Reservation findReservationGuest(Long guest_id) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Reservation where guest_id= :id");
		query.setParameter("id", guest_id);
		List<Reservation> list = query.list();
		System.out.println("query: " + query);
		// System.out.println(list.get(0).getGuestId());
		Reservation reservation = list.get(0);
		return reservation;

	}

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

	@Transactional
	@Override
	public void updateReservation(Reservation reservation) {
		// TODO Auto-generated method stub
		getSession().merge(reservation);
	}

}
