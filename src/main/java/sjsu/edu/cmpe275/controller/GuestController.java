package sjsu.edu.cmpe275.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String listGuests() {
		System.out.println("In the guest controller1");

		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("In the guest controller2");
		System.out.println(guestService.listGuests().isEmpty());
		
		model.put("guests",  prepareListofBean(guestService.listGuests()));
		System.out.println("In the guest controller3");
		//return new ModelAndView("guestlist", model);
		return  "home";
	}

	private List<Guest> prepareListofBean(List<Guest> guests){
		System.out.println("Bean - 1");
		List<Guest> beans = null;
		if(guests != null && !guests.isEmpty()){
			System.out.println("Is the guests null?"+guests.isEmpty());
			beans = new ArrayList<Guest>();
			Guest bean = null;
			for(Guest guest : guests){
				bean = new Guest();
				bean.setGuest_id(guest.getGuest_id());
				bean.setAddress(guest.getAddress());
				bean.setCity(guest.getCity());
				bean.setCountry(guest.getAddress());
				bean.setDriver_license(guest.getDriver_license());
				bean.setEmail(guest.getEmail());
				bean.setPhone(guest.getPhone());
				bean.setFirst_name(guest.getFirst_name());
				bean.setLast_name(guest.getLast_name());
				beans.add(bean);
			}
		}
		System.out.println("beans-Last");
		System.out.println(Arrays.toString(beans.toArray()).isEmpty());
		return beans;
	}
}
