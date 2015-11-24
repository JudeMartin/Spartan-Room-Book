package sjsu.edu.cmpe275.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.service.GuestService;

@Controller
@RequestMapping("guestform.html")
public class GuestController {
	@Autowired
	private GuestService guestService;

	@RequestMapping(method = RequestMethod.GET)
	public String listGuests(ModelMap model) {
		System.out.println("In the method of LstGuest ");
		List<Guest> guests = guestService.listGuests();
		printBeans(guests);
		model.addAttribute("guests", guests);
		return "guestList";
	}

	private void printBeans(List<Guest> beans) {
		for (Iterator<Guest> iter = beans.iterator(); iter.hasNext();) {
			Guest guest = (Guest) iter.next();
			Integer guest_id = guest.getGuest_id();
			String first_name = guest.getFirst_name();
			String last_name = guest.getLast_name();
			String address = guest.getAddress();
			String email = guest.getEmail();
			String phone = guest.getPhone();
			String city = guest.getCity();
			String country = guest.getCountry();
			String driver_license = guest.getDriver_license();
			System.out.println("Id=>" + guest_id + " " + "First Name=>" + first_name + " " + "Last Name=>" + last_name
					+ " " + "Address=>" + address + " " + "email=> " + email + " " + "phone=>" + phone + " " + "City=> "
					+ city + " " + "Country=>" + country + " " + "DriverLic =>" + driver_license);
		}
	}
}
