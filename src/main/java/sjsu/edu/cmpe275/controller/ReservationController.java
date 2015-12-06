package sjsu.edu.cmpe275.controller;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.service.GuestService;
import sjsu.edu.cmpe275.service.ReservationService;

@Controller
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@Autowired
	private GuestService guestService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String createReservation(@ModelAttribute("reservation") Reservation reservation, BindingResult result1) {

		System.out.println("The value got fot reservation through post before post to DB" + reservation.toString());
		reservationService.addReservation(reservation);
		// System.out.println(reservation.toString());
		return null;
	}

	
	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public @ResponseBody String addNewWorker(@RequestBody String jsonString) throws ParseException, java.text.ParseException {
		// do business logic
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Json method" + jsonString.toString());
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(jsonString);
		JSONObject jsonObj = (JSONObject) obj;

		String address = (String) jsonObj.get("address");
		String city = (String) jsonObj.get("city");
		String country = (String) jsonObj.get("country");
		String driver_license = (String) jsonObj.get("driver_license");
		String email = (String) jsonObj.get("email");
		String first_name = (String) jsonObj.get("first_name");
		String last_name = (String) jsonObj.get("last_name");
		String phone = (String) jsonObj.get("phone");

		String adults = (String) jsonObj.get("adults");
		String amenityTypeId = (String) jsonObj.get("amenityTypeId");
		String room_id = (String) jsonObj.get("room_id");
		String reservation_date = (String) jsonObj.get("reservation_date");
		String rooms = (String) jsonObj.get("rooms");
		String children = (String) jsonObj.get("children");
		String check_out_date = (String) jsonObj.get("check_out_date");
		String check_in_date = (String) jsonObj.get("check_in_date");
		
		Guest guest = new Guest();  /* Guest */
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
		//reservation.setCheckOutDate(sdf.parse(check_out_date));
		//reservation.setCheckInDate(sdf.parse(check_in_date));
		//reservation.setReservationDate(sdf.parse(reservation_date));
		reservation.setRooms(Integer.parseInt(rooms));
		reservation.setAdults(Integer.parseInt(children));
		reservation.setGuest(guest); 		/* Add the created Guest */
		
		reservationService.addReservation(reservation);
		
		return null;
	}

	@RequestMapping(value = "{reservationId}", method = RequestMethod.PUT)
	public String updateReservation(@PathVariable Long reservationId, Reservation reservation, Model model) {
		reservationService.updateReservation(reservation);
		return null;
	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public String test(@RequestParam("name") String name) {

		System.out.println("Name:" + name);
		// reservationService.addReservation(reservation);
		// System.out.println(reservation.toString());
		return null;
	}

	/* Done */
	@RequestMapping(value = "{reservationId}", method = RequestMethod.DELETE)
	public String deleteRoom(@PathVariable Long reservationId) {

		Reservation resData = (Reservation) reservationService.getReservation(reservationId);
		System.out.println(resData.toString());
		reservationService.deleteReservation(reservationId);
		return null;
	}

	/* Done */
	@RequestMapping(value = "{reservationId}", method = RequestMethod.GET)
	public String viewReservation(@PathVariable Long reservationId, Model model) {
		if (reservationId == null) {
			return "the Inpout is not valid";
		}
		System.out.println("In the view Reservation Method");
		Reservation reservationNew = (Reservation) reservationService.getReservation(reservationId);
		System.out.println(reservationNew.toString());
		return null;
	}

	/* Done */
	@RequestMapping(value = { "/", "reservation/" }, method = RequestMethod.GET)
	public String listReservations(Model model) {
		List<Reservation> resReservation = reservationService.getReservation();
		printGuestDetails(resReservation);
		return null;
	}

	private void printGuestDetails(List<Reservation> gsList) {
		for (Iterator iterator = gsList.iterator(); iterator.hasNext();) {
			Reservation reservation = (Reservation) iterator.next();
			System.out.println("reservation : " + reservation.toString());
		}
	}
}
