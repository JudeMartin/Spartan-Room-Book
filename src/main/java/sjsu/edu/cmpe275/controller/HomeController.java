package sjsu.edu.cmpe275.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sjsu.edu.cmpe275.model.RoomStatus;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView loadMain(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/home")
	public ModelAndView loadHome(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/rooms")
	public ModelAndView loadRooms(HttpServletResponse response) throws IOException{
		return new ModelAndView("rooms");
	}
	
	@RequestMapping(value="/facilities")
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
}	
