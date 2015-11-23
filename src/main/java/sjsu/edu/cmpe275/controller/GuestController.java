package sjsu.edu.cmpe275.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.service.GuestService;

@Controller
@RequestMapping("guestform.html")
public class GuestController {
	@Autowired
	private GuestService guestService;
	private List<Guest> res;
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listGuests() {
		System.out.println("In the guest controller1");

		Map<String, Object> model = new HashMap<String, Object>();
		System.out.println("In the guest controller2");
		List<Guest> res = guestService.listGuests();
		System.out.println("Before Calling PrepareListOfBeans => is the guests list empty?"+res.isEmpty());
		model.put("guests",  prepareListofBean(res));
		System.out.println("In the guest controller3");
		return new ModelAndView("guestlist", model);
		//return  "home";
	}

	private List<Guest> prepareListofBean(List<Guest> guests){
		System.out.println("Bean - 1");
		List<Guest> beans = null;
		System.out.println("Is the guests null?"+guests.isEmpty());
		if(guests != null && !guests.isEmpty()){
			System.out.println("Inside the if method - Is the guests null?"+guests.isEmpty());
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
			printBeans(beans);
		}
		System.out.println("beans-Last"); 
		return beans;
	}

	private void printBeans(List<Guest> beans) {
		for ( 
				Iterator<Guest> iter = beans.iterator(); iter.hasNext();) {
					 
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
					
					System.out.println("Id=>"+guest_id+" "+"First Name=>"+first_name+" "+
									  "Last Name=>"+last_name+" "+"Address=>"+address+" "+"email=> "+email+" "+
									  "phone=>"+phone+" "+"City=> "+city+" "+
									  "Country=>"+country+" "+"DriverLic =>"+driver_license);
				}
	}

}
