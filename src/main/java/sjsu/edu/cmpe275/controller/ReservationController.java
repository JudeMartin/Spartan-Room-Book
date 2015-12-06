package sjsu.edu.cmpe275.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.service.ReservationService;

@Controller
@RequestMapping("/reservations")
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;

	@RequestMapping(value="/{reservation_id}", method = RequestMethod.GET)
	public String viewGuestReservation(@PathVariable String reservation_id, Model model) throws IOException
	{
		Reservation reservation = (Reservation) reservationService.findReservation(reservation_id);
		return "reservationView";
	}
	
	@RequestMapping(value="/guests/{guest_id}", method = RequestMethod.GET)
	public String viewGuestReservation(@PathVariable Long guest_id, Model model) throws IOException
	{
		Reservation reservation = (Reservation) reservationService.findReservationGuest(guest_id);
		System.out.println("controlled guestid: " + reservation.getGuestId());
		model.addAttribute("reservation", reservation);
		System.out.println("controlled guestid: " + reservation.getRoomId());
		return "stayInfoView";
		
	}
	
}
