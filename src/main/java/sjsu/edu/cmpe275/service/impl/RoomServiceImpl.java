package sjsu.edu.cmpe275.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sjsu.edu.cmpe275.dao.RoomDAO;
import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomDAO roomDAO;
	
	@Transactional(readOnly = true)
	public List<Room> listRooms() {
		return roomDAO.listRooms();
	}

}
