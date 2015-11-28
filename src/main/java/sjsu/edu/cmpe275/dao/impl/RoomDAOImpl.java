package sjsu.edu.cmpe275.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sjsu.edu.cmpe275.dao.RoomDAO;
import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.model.RoomStatus;
@Repository
public class RoomDAOImpl implements RoomDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Room> listRooms() {
		return getSession().createCriteria(Room.class).list();
	}

	@Override
	public Room createRoom(Room room) {
		Room rm = (Room)getSession().merge(room);
		return rm;
	}

	@Override
	public Room viewRoom(Long roomId) {
		Room room = (Room)getSession().get(Room.class, roomId);
		return room;
	}

	@Override
	public void updateRoom(Room room) {
		getSession().merge(room);
	}

	@Override
	public void deleteRoom(Long roomId) {
		Room room = (Room)getSession().get(Room.class, roomId);
		if(room != null){
			System.out.println(RoomStatus.AVAILABLE.getRoomStatusId());
			if(room.getStatusId() == RoomStatus.AVAILABLE.getRoomStatusId()){
				getSession().delete(room);
			}else{
				//do not delete the rooms since they are reserver or in use
				
			}
		}
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
