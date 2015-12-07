package sjsu.edu.cmpe275.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.service.BillInfoService;
import sjsu.edu.cmpe275.service.GuestService;
import sjsu.edu.cmpe275.service.ReservationService;

@Controller
@RequestMapping("/bill")
public class BillController {

	@Autowired
	private BillInfoService billInfoService;

	@Autowired
	private GuestService guestService;

	@Autowired
	private ReservationService reservationService;
	
	/* Done */
	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public @ResponseBody String generateBill(@RequestBody String jsonString)
			throws ParseException, java.text.ParseException {
		// do business logic
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Json method" + jsonString.toString());
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(jsonString);
		JSONObject jsonObj = (JSONObject) obj;

		/* Guest JSON Payload */
		String address = (String) jsonObj.get("address");
		String city = (String) jsonObj.get("city");
		String country = (String) jsonObj.get("country");
		String driver_license = (String) jsonObj.get("driver_license");
		String email = (String) jsonObj.get("email");
		String first_name = (String) jsonObj.get("first_name");
		String last_name = (String) jsonObj.get("last_name");
		String phone = (String) jsonObj.get("phone");

		/* Reservation JSON Payload */
		String adults = (String) jsonObj.get("adults");
		String amenityTypeId = (String) jsonObj.get("amenityTypeId");
		String room_id = (String) jsonObj.get("room_id");
		String reservation_date = (String) jsonObj.get("reservation_date");
		String rooms = (String) jsonObj.get("rooms");
		String children = (String) jsonObj.get("children");
		String check_out_date = (String) jsonObj.get("check_out_date");
		String check_in_date = (String) jsonObj.get("check_in_date");

		/* Payment JSON Payload */

		String total_payment = (String) jsonObj.get("total_payment");
		String discount = (String) jsonObj.get("discount");
		String days = (String) jsonObj.get("days");
		String base = (String) jsonObj.get("base");

		Guest guest = new Guest(); /* Guest */
		guest.setAddress(address);
		guest.setCity(city);
		guest.setCountry(country);
		guest.setDriver_license(driver_license);
		guest.setEmail(email);
		guest.setFirst_name(first_name);
		guest.setLast_name(last_name);
		guest.setPhone(phone);
		guestService.createGuest(guest);
		System.out.println(guest.getGuestId());

		Reservation reservation = new Reservation();
		reservation.setAdults(Integer.parseInt(adults));
		reservation.setAmenityTypeId(Integer.parseInt(amenityTypeId));
		reservation.setRoomId(Long.parseLong(room_id));
		// reservation.setCheckOutDate(sdf.parse(check_out_date));
		// reservation.setCheckInDate(sdf.parse(check_in_date));
		// reservation.setReservationDate(sdf.parse(reservation_date));
		reservation.setRooms(Integer.parseInt(rooms));
		reservation.setAdults(Integer.parseInt(children));
		reservation.setGuest(guest); /* Add the created Guest */

		reservationService.addReservation(reservation);

		BillInfo billInfo = new BillInfo();
		// billInfo.setGuest(guest);
		billInfo.setReservation(reservation);
		billInfo.setBase(Double.parseDouble(base));
		billInfo.setDiscount(Integer.parseInt(discount));
		billInfo.setRooms(Integer.parseInt(rooms));
		billInfo.setTotal_payment(Double.parseDouble(total_payment));
		billInfo.setDays(Long.parseLong(days));
		billInfo.setFirst_name(first_name);
		billInfo.setLast_name(last_name);

		billInfoService.generateBill(billInfo);

		return null;
	}

	/* Done */
	@RequestMapping(value = "{payment_Id}", method = RequestMethod.GET)
	public String viewPayment(@PathVariable Long payment_Id, Model model) {
		if (payment_Id == null) {
			return "the Input is not valid";
		}
		System.out.println("In the   viewPayment Method");
		BillInfo billInfomation = (BillInfo) billInfoService.viewBill(payment_Id);
		System.out.println(billInfomation.toString());
		return null;
	}
	/* Done */
	@RequestMapping(value = "{payment_Id}", method = RequestMethod.DELETE)
	public String deleteBill(@PathVariable Long payment_Id) {
		billInfoService.deleteBill(payment_Id);
		return null;
	}

}
