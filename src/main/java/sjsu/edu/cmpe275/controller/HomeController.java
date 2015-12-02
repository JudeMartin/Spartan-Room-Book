package sjsu.edu.cmpe275.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.model.RoomStatus;
import sjsu.edu.cmpe275.service.RoomService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private RoomService roomService;
		
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
	
	@RequestMapping(value="/book-start")
	public ModelAndView loadBookStart(HttpServletResponse response) throws IOException{
		return new ModelAndView("book-start");
	}
	@RequestMapping(value="/book")
	public ModelAndView loadBook(HttpServletResponse response) throws IOException{
		return new ModelAndView("book");
	}
	@RequestMapping(value="/book-pay")
	public ModelAndView loadBookPay(HttpServletResponse response) throws IOException{
		return new ModelAndView("book-pay");
	}
}	
