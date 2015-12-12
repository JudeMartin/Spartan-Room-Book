package sjsu.edu.cmpe275.controller;

import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.service.GuestService;
import sjsu.edu.cmpe275.service.RoomService;

@Controller
@RequestMapping(value = "/reports")
public class ReportController {
	@Autowired
	GuestService guestService;

	@Autowired
	RoomService roomService;

	@RequestMapping(value = "/guests", method = RequestMethod.GET)
	public @ResponseBody String generateGuestReport(
			@RequestBody String jsonString) throws ParseException,
			java.text.ParseException {
		List<Guest> guestList = guestService.listGuest();
		for (Guest guest : guestList) {
			if (guest != null && guestList.size() != 0) {
				System.out.println(guest.toString());
			} else {
				System.out.println("The List is Empty");
			}
		}
		System.out.println("In the generateMethod() - ReportController");
		return null;
	}

	/* get the # of rooms avaliable => status_id = 1 */
	@RequestMapping(value = "/rooms/avaliable", method = RequestMethod.GET)
	public @ResponseBody String generateRoomAvaliable(
			@RequestBody String jsonString) {
		List<Room> roomList = roomService.listRooms();
		for (Room room : roomList) {
			if (room != null && roomList.size() != 0 && room.getStatusId() == 1) {
				System.out.println("Here are the avaliable rooms:"
						+ room.toString());
			} else {
				// Dont display them
			}
		}
		return null;
	}

	@RequestMapping(value = "/rooms/unavaliable", method = RequestMethod.GET)
	public @ResponseBody String generateRoomNonAvaliable(
			@RequestBody String jsonString) {
		List<Room> roomList = roomService.listRooms();
		for (Room room : roomList) {
			if (room != null && roomList.size() != 0 && room.getStatusId() == 2) {
				System.out.println("Here are the avaliable rooms:"
						+ room.toString());
			} else {
				// Dont display them
			}
		}
		return null;
	}
}
