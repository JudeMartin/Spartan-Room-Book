package sjsu.edu.cmpe275.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import sjsu.edu.cmpe275.util.StringConstants;

//@Entity
public enum RoomType {
	
	QueenBed2(1, StringConstants.ROOM_TYPE_2QUEEN_BED),
	KingBed1(2, StringConstants.ROOM_TYPE_1KING_BED);
	
	private RoomType(int id, String typeName){
		this.roomTypeId = id;
		this.roomTypeName = typeName;
	}
	
	//@Column(name="room_type_id")
	private int roomTypeId;
	
	//@Column(name="room_type_name")
	private String roomTypeName;

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getRoomTypeName() {
		return roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}
}