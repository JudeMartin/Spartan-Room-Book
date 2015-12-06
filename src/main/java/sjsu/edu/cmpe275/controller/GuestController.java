package sjsu.edu.cmpe275.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.service.GuestService;

@Controller
@RequestMapping("/guests")
public class GuestController {
	
	@Autowired
	private GuestService guestService;
	
	@RequestMapping(value="")
	public String loadGuests(Model model) throws IOException
	{
		List<Guest> guestsList = guestService.listGuests();
		model.addAttribute("guestsList", guestsList);
		return "guestsManagement";
	}
	
	@RequestMapping(value="/{guest_id}", method=RequestMethod.GET)
	public String viewGuest(@PathVariable Long guest_id, Model model) throws IOException
	{
		Guest guest = guestService.viewGuest(guest_id);
		model.addAttribute("guest", guest);
		return "guestInfoView";
	}
	
	

}
