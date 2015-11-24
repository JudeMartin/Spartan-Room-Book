package sjsu.edu.cmpe275.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value="/")
	public String listRooms(Map<String, Object> map){
		//map.put("room", new Room());
		System.out.println("test***************" + roomService.listRooms().size());
		map.put("roomList", roomService.listRooms());
		return "listrooms";
	}

}
