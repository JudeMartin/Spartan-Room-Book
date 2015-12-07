package sjsu.edu.cmpe275.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.dao.BillInfoDAO;
import sjsu.edu.cmpe275.model.BillInfo;

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
		BillInfo billInfo = (BillInfo) getSession().get(BillInfo.class, payment_Id);
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
		BillInfo billInfo = (BillInfo) getSession().get(BillInfo.class, payment_Id);
		getSession().delete(billInfo);
	}

}
