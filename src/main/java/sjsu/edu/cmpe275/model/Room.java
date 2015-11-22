package sjsu.edu.cmpe275.model;

/*
@Author: Jude Martin
*/
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Room")
public class Room {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Embedded
    private RoomType roomType;
	@Embedded
	private RoomStatus roomStatus;
	@Embedded
	private RoomOtherType roomOtherType;
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
	
}
