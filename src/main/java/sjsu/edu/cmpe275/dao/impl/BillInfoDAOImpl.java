package sjsu.edu.cmpe275.dao.impl;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.dao.BillInfoDAO;
import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.model.RoomType;

import org.joda.time.DateTime;
import org.joda.time.Days;

@Repository
public class BillInfoDAOImpl implements BillInfoDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public BillInfo viewBill(Long guest_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateBill(Long guest_id) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Reservation where guest_id= :id");
		query.setParameter("id", guest_id);
		List<Reservation> list = query.list();
		int roomQty = list.size();
		Reservation reservation = list.get(0);
		long diff = Math.abs(reservation.getCheckInDate().getTime() - reservation.getCheckOutDate().getTime());
		long dayQty = diff / (24 * 60 * 60 * 1000);
		Double base = 0.0;
		int i=0;
		List<Room> listRoom;
		int room_type, other_type=1;
		while(i < roomQty)
		{
			query = getSession().createQuery("from Room where room_id= :id");
			query.setParameter("id", list.get(i).getRoomId());
			listRoom = query.list();
			room_type = listRoom.get(0).getRoomTypeId();
			other_type = listRoom.get(0).getOtherTypeId();
			if(room_type == 1)
				base += (100*dayQty);
			else if(room_type == 2)
				base += (200*dayQty);
			
			if(other_type == 1)
				base += 100;
			else if(other_type == 2)
				base += 150;
			i++;		
		}
		
		
		System.out.println("Base: $ " + base);
		
		int discount = 10;
		
		double total = ((100-discount) * base)/100;
		
		AtomicInteger id = new AtomicInteger();
		
		
		// creating this billInfo object
		BillInfo billInfo = new BillInfo();
		billInfo.setBase(base);
		billInfo.setDiscount(discount);
		billInfo.setGuest_id(guest_id);
		billInfo.setRooms(roomQty);
		billInfo.setTotal_payment(total);
		billInfo.setDays(dayQty);
		billInfo.setPayment_id(id.incrementAndGet());
		
		System.out.println("bill created....");
		System.out.println(billInfo.getTotal_payment());
		
		//save bill
		Session session = getSession();
		session.save(billInfo);
		 
		System.out.println("saving bill");
        //Commit the transaction
        session.getTransaction().commit();
        System.out.println("committing bill");
		
	}

	@Override
	public void updateBill(BillInfo billInfo) {
		// TODO Auto-generated method stub
		
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
