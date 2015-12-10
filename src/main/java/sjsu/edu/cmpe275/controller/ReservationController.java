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

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String createReservation(@ModelAttribute("reservation") Reservation reservation, BindingResult result1) {

		 System.out.println("The value got fot reservation through post before post to DB");
		 System.out.println("res values Adults:"+ reservation.getAdults()
		 + "Children:" + reservation.getChildren() + "aminityId :" + reservation.getAmenityTypeId()
		 +"rooms:" + reservation.getRooms() + "guest" + reservation.getGuest() 
		 + "check in date" + reservation.getCheckInDate() + "check out date" + reservation.getCheckOutDate()
		 + "reservation date" + reservation.getReservationDate() );
		 
		 //reservationService.createReservation(reservation);
		 //System.out.println(reservation.toString());
		return null;
	}

	/*@RequestMapping(value = "{reservationId}", method = RequestMethod.PUT)
	public String updateReservation(@PathVariable Long reservationId, Reservation reservation, Model model) {
		reservationService.updateReservation(reservation);
		return null;
	}*/

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
		Reservation resObj = (Reservation) reservationService.findReservation(reservationId);
		System.out.println(resObj.toString());
		reservationService.cancelReservation(reservationId);
		return null;
	}

	/* Done */
	@RequestMapping(value = "{reservationId}", method = RequestMethod.GET)
	public String viewReservation(@PathVariable Long reservationId, Model model) {
		if (reservationId == null) {
			return "the Inpout is not valid";
		}
		System.out.println("In the view Reservation Method");
		Reservation reservationNew = (Reservation) reservationService.findReservation(reservationId);
		System.out.println(reservationNew.toString());
		return null;
	}

	/* Done */
	@RequestMapping(value = { "/", "reservation/" }, method = RequestMethod.GET)
	public String listReservations(Model model) {
		List<Reservation> resReservation = reservationService.findReservation();
		printDetails(resReservation);
		return null;
	}

	private void printDetails(List<Reservation> gsList) {
		for (Iterator iterator = gsList.iterator(); iterator.hasNext();) {
			Reservation reservation = (Reservation) iterator.next();
			System.out.println("reservation : " + reservation.toString());
		}
	}
}