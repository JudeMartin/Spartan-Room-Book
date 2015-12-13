package sjsu.edu.cmpe275.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.dao.BillInfoDAO;
import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;

@Repository
public class BillInfoDAOImpl implements BillInfoDAO {

	@Autowired
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

	@Override
	public BillInfo viewBill(Long payment_Id) {
		// TODO Auto-generated method stub
		BillInfo billInfo = (BillInfo) getSession().get(BillInfo.class,
				payment_Id);
		return billInfo;
	}

	@Override
	public BillInfo generateBill(BillInfo billInfo) {
		BillInfo bI = (BillInfo) getSession().merge(billInfo);
		return bI;
	}

	@Override
	public void updateBill(BillInfo billInfo) {
		getSession().merge(billInfo);

	}

	@Override
	public void deleteBill(Long payment_Id) {

		/*
		 * BillInfo billInfo = (BillInfo) getSession().get(BillInfo.class,
		 * payment_Id); Reservation res = (Reservation)
		 * billInfo.getReservation(); Guest guest = (Guest) billInfo.getGuest();
		 * 
		 * 
		 * 
		 * System.out.println("Days:" + billInfo.getDays() + "" +
		 * billInfo.getDiscount() + billInfo.getFirst_name() +
		 * billInfo.getLast_name() +billInfo.getRooms() + billInfo.getBase() +
		 * billInfo.getTotal_payment() + billInfo.getGuest());
		 * 
		 * System.out.println(guest.toString());
		 * System.out.println(res.toString());
		 */
		BillInfo billInfo = (BillInfo) getSession().get(BillInfo.class,
				payment_Id);
		getSession().delete(billInfo);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<BillInfo> listGuest() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(BillInfo.class).list();
	}
}