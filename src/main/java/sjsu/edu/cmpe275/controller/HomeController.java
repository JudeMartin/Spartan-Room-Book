package sjsu.edu.cmpe275.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.SearchCriteria;
import sjsu.edu.cmpe275.service.ReservationService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	ReservationService reservationService;
		
	@RequestMapping(value="")
	public ModelAndView loadMain(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="home")
	public ModelAndView loadHome(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}

	@RequestMapping(value="/rooms")
	public ModelAndView loadRooms(HttpServletResponse response) throws IOException{
		return new ModelAndView("rooms");
	}
	
	@RequestMapping(value="facilities")
	public ModelAndView loadFacilities(HttpServletResponse response) throws IOException{
		return new ModelAndView("facilities");
	}
	
	@RequestMapping(value="/gallery")
	public ModelAndView loadGallery(HttpServletResponse response) throws IOException{
		return new ModelAndView("gallery");
	
	}
	
	@RequestMapping(value="/map")
	public ModelAndView loadMap(HttpServletResponse response) throws IOException{
		return new ModelAndView("map");
	}

	@RequestMapping(value="book-start", method = RequestMethod.POST)
	public ModelAndView loadBookStart(HttpServletResponse response) throws IOException {
		return new ModelAndView("book-start");
	}

	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public String loadBook(HttpServletResponse response, Model model, @Valid Reservation reservation, BindingResult result)
			throws IOException {
		// check availability
		// if available then redirect to the reservation page
		// else display a message and remain on the same page
		System.out.println("load book");
		model.addAttribute("key", "value");
		return "book";
	}
	
	@RequestMapping(value="/bookpay", method = RequestMethod.POST)
	public String loadBookPay(HttpServletResponse response, @ModelAttribute ("command") Guest guest, BindingResult result)
			throws IOException {
		// check availability
		// if available then redirect to the reservation page
		// else display a message and remain on the same page
		System.out.println("load book pay: " + guest.toString());
		//model.addAttribute("key", "value");
		return "book-pay";
	}
	
	

	@RequestMapping(value = "book/availability", method = RequestMethod.GET, headers = {"Accept=text/xml, application/json"}, produces = "application/json")
	public @ResponseBody Map<String, Integer> checkAvailability(Model model, @Valid @ModelAttribute("searchCriteria") SearchCriteria searchCriteria, BindingResult result) throws Exception {
		System.out.println("check availability home controller" + searchCriteria);
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateToStringCheckIn = dt.format(searchCriteria.getCheckInDate());
		System.out.println("Nstring date : " + dateToStringCheckIn);
		String dateToStringCheckOut = dt.format(searchCriteria.getCheckOutDate());
		try {
			Date stringToDateCheckIn = dt.parse(dateToStringCheckIn);
			Date stringToDateCheckOut = dt.parse(dateToStringCheckOut);
			searchCriteria.setCheckInDate(stringToDateCheckIn);
			searchCriteria.setCheckOutDate(stringToDateCheckOut);
		} catch (ParseException e) {
		}
		System.out.println("check availability home controller update: " + searchCriteria);

		int availableRoomId = reservationService.checkAvailability(searchCriteria);
		Map<String, Integer> map = new HashMap<String, Integer>(1) {
			{
				put("result", availableRoomId);
			}
		};
		return map;
	}
}	
