package sjsu.edu.cmpe275.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.service.GuestService;

@Controller
@RequestMapping("/guest")
public class GuestController {

	@Autowired
	private GuestService guestService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listGuests(Model model) {
		List<Guest> guests = guestService.listGuest();
		model.addAttribute("guests", guests);
		model.addAttribute("guestList", guestService.listGuest());
		System.out.println(guests.toString());
		printGuestDetails(guests);
		return "guestList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String createGuest(@ModelAttribute("command") Guest guest, Model model) {
		List<Guest> guests = guestService.listGuest();
		model.addAttribute("guests", guests);
		// guestService.createGuest(guest);
		return "addGuest";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveGuest(@ModelAttribute("command") Guest guest, Model model) {
		guestService.createGuest(guest);
		List<Guest> guests = guestService.listGuest();
		model.addAttribute("guests", guests);
		return "guestList";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteGuest(Model model, @ModelAttribute("command") Guest guest, BindingResult result) {
		if(result.hasErrors()){
			System.out.println("the form has errors ");
		}
		System.out.println(guest.toString());
		System.out.println("Deleting a single guest:" + guest.getGuest_id());
		guestService.deleteGuest(guest.getGuest_id());
		// model.addAttribute("guestData", null);
		List<Guest> guests = guestService.listGuest();
		model.addAttribute("guests", guests);
		model.addAttribute("guestList", guestService.listGuest());
		return "guestList";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public String updateGuest(Model model, @ModelAttribute("command") Guest guest, BindingResult result) {
		Guest guestData = (Guest) guestService.viewGuest(guest.getGuest_id());
		System.out.println("Guest Data=> edit method" + guestData.toString());
		model.addAttribute("guestData", guestData);
		List<Guest> guests = guestService.listGuest();
		model.addAttribute("guests", guests);
		guestService.updateGuest(guest);
		return "addGuest";
	}

	@RequestMapping(value = "/{guestId}", method = RequestMethod.GET)
	public String viewGuest(@PathVariable Long guestId, Model model) {
		System.out.println("Fetching a single room");
		Guest guest = (Guest) guestService.viewGuest(guestId);
		System.out.println(guest.toString());
		model.addAttribute("guests", guest);
		return "guestList";
	}

	private void printGuestDetails(List<Guest> gsList) {
		for (Iterator iterator = gsList.iterator(); iterator.hasNext();) {
			Guest guest = (Guest) iterator.next();
			System.out.println("Guest : " + guest.toString());
		}
	}
}