package sjsu.edu.cmpe275.dao;

import java.util.List;

import sjsu.edu.cmpe275.model.Room;

public interface RoomDAO {
	public List<Room> listRooms();
	public Room createRoom(Room room);
	public Room viewRoom(Long roomId);
	public void updateRoom(Room room);
	public void deleteRoom(Long roomId);
}
