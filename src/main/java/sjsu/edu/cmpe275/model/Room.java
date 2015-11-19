package sjsu.edu.cmpe275.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="Room")
public class Room {
	
	/*
	Each room has a number, which consists of 3 to 4 digits.
	Room type: each room has either two queen beds or a king bed.
	Additional properties: a room can either be smoking or non-smoking.
	The base prices are $100 and $150 daily for non-smoking and smoking rooms respectively.
	*/
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@ManyToOne
    private RoomType roomType;

    private int roomNumber;
    private final int COST_NON_SMOKING = 100;
    private final int COST_SMOKING = 150;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public int getCOST_NON_SMOKING() {
		return COST_NON_SMOKING;
	}
	public int getCOST_SMOKING() {
		return COST_SMOKING;
	}
    public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
    
}
