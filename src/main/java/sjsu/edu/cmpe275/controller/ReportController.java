package sjsu.edu.cmpe275.controller;

import java.util.List;

import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.service.BillInfoService;
import sjsu.edu.cmpe275.service.GuestService;
import sjsu.edu.cmpe275.service.RoomService;

@Controller
@RequestMapping(value = "/reports")
public class ReportController {
	@Autowired
	GuestService guestService;

	@Autowired
	RoomService roomService;

	@Autowired
	BillInfoService billInfoService;

	@RequestMapping(value = { "/", }, method = RequestMethod.GET)
	public String listReports(Model model) {
		return "Report";
	}

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

	/* get the # of rooms available => status_id = 1 */
	@RequestMapping(value = "/rooms/avaliable", method = RequestMethod.GET)
	public @ResponseBody String generateRoomAvaliable(
			@RequestBody String jsonString) {
		List<Room> roomList = roomService.listRooms();
		for (Room room : roomList) {
			if (room != null && roomList.size() != 0 && room.getStatusId() == 1) {
				System.out.println("Here are the avaliable rooms:"
						+ room.toString());
			} else {
				// Don't display them
			}
		}
		return null;
	}

	/* get the # of rooms available => status_id = 2 */
	@RequestMapping(value = "/rooms/unavaliable", method = RequestMethod.GET)
	public @ResponseBody String generateRoomNonAvaliable(
			@RequestBody String jsonString) {
		List<Room> roomList = roomService.listRooms();
		for (Room room : roomList) {
			if (room != null && roomList.size() != 0 && room.getStatusId() == 2) {
				System.out.println("Here are the unavaliable rooms:"
						+ room.toString());
			} else {
				// Don't display them
			}
		}
		return null;
	}

	@RequestMapping(value = "/rooms/payments", method = RequestMethod.GET)
	public String generatePayments() {
		List<BillInfo> paymentList = billInfoService.listBills();

		for (BillInfo billInfo : paymentList) {
			System.out.println(billInfo.toString());
		}
		return null;
	}
}
