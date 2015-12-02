//package sjsu.edu.cmpe275.controller;
//
//import java.util.Date;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import sjsu.edu.cmpe275.model.Room;
//import sjsu.edu.cmpe275.model.RoomStatus;
//import sjsu.edu.cmpe275.service.RoomService;
//
//@Controller
//@RequestMapping("/")
//public class RoomController {
//
//	@Autowired
//	private RoomService roomService;
//	
//	@RequestMapping(value={"room", "room/"}, method=RequestMethod.GET)
//	public String listRooms(Model model){
//		List<Room> rmls = roomService.listRooms();
//		model.addAttribute("room", new Room());
//		model.addAttribute("roomList", roomService.listRooms());
//		//model.addAttribute("", attributeValue)
//		//Room Status List
//		/*Map<Integer, String> roomStatusList = new LinkedHashMap<>();
//		roomStatusList.put(RoomStatus.AVAILABLE.getRoomStatusId(), RoomStatus.AVAILABLE.getRoomStatusName());
//		roomStatusList.put(RoomStatus.INUSE.getRoomStatusId(), RoomStatus.INUSE.getRoomStatusName());
//		roomStatusList.put(RoomStatus.RESERVED.getRoomStatusId(), RoomStatus.RESERVED.getRoomStatusName());
//		model.addAttribute("roomStatusList", roomStatusList);*/
//		//Room Other Type List
//		
//		//Room Type List
//		
//		
//		printRoomsDetails(rmls);
//		return "listrooms";
//		//return "RoomManagement";
//	}
//	
//	@RequestMapping(value={"myroom", "myroom/"}, method=RequestMethod.GET)
//	public String listRoomss(Model model){
//		List<Room> rmls = roomService.listRooms();
//		model.addAttribute("room", new Room());
//		model.addAttribute("roomList", roomService.listRooms());
//		//model.addAttribute("", attributeValue)
//		//Room Status List
//		/*Map<Integer, String> roomStatusList = new LinkedHashMap<>();
//		roomStatusList.put(RoomStatus.AVAILABLE.getRoomStatusId(), RoomStatus.AVAILABLE.getRoomStatusName());
//		roomStatusList.put(RoomStatus.INUSE.getRoomStatusId(), RoomStatus.INUSE.getRoomStatusName());
//		roomStatusList.put(RoomStatus.RESERVED.getRoomStatusId(), RoomStatus.RESERVED.getRoomStatusName());
//		model.addAttribute("roomStatusList", roomStatusList);*/
//		//Room Other Type List
//		
//		//Room Type List
//		
//		
//		printRoomsDetails(rmls);
//		//return "listrooms";
//		return "RoomManagement";
//	}
//	
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public String createRoom(@Valid Room room, Model model){
//		roomService.createRoom(room);
//		return "redirect:/room";
//	}
//
//	@RequestMapping(value="/{roomId}",method = RequestMethod.GET )
//	public String viewRoom(@PathVariable Long roomId, Model model){
//		System.out.println("Fetching a single room");
//		Room room = (Room)roomService.viewRoom(roomId);
//		model.addAttribute("room", room);
//		return "roomForm";
//	}
//	
//	@RequestMapping(value="/{roomId}", method=RequestMethod.POST)
//	public String updateRoom(@PathVariable Long roomId, @Valid Room room, Model model){
//		roomService.updateRoom(room);
//		return "redirect:/room";
//	}
//	
//	@RequestMapping(value="/{roomId}", method=RequestMethod.DELETE)//, @RequestParam("_method") String method
//	public String deleteRoom(@PathVariable Long roomId, @RequestParam("_method") String method){
//		//delete a room only if the status of the room in 0 i.e available rooms
//		System.out.println("Deleting a single room:" + roomId);
//		roomService.deleteRoom(roomId);
//		return "redirect:/room";
//	}
//	
//	private void printRoomsDetails(List<Room> rmls) {
//		for (Iterator iterator = rmls.iterator(); iterator.hasNext();) {
//			Room room = (Room) iterator.next();
//			System.out.println("Room : " + room.toString());
//		}
//	}
//
//}






package sjsu.edu.cmpe275.controller;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.model.RoomStatus;
import sjsu.edu.cmpe275.service.RoomService;

@Controller
@RequestMapping("/")
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value={"room","room/"}, method=RequestMethod.GET)
	public String listRooms(Model model){
		List<Room> rmls = roomService.listRooms();
		model.addAttribute("room", new Room());
		model.addAttribute("roomList", roomService.listRooms());
		//model.addAttribute("", attributeValue)
		//Room Status List
		/*Map<Integer, String> roomStatusList = new LinkedHashMap<>();
		roomStatusList.put(RoomStatus.AVAILABLE.getRoomStatusId(), RoomStatus.AVAILABLE.getRoomStatusName());
		roomStatusList.put(RoomStatus.INUSE.getRoomStatusId(), RoomStatus.INUSE.getRoomStatusName());
		roomStatusList.put(RoomStatus.RESERVED.getRoomStatusId(), RoomStatus.RESERVED.getRoomStatusName());
		model.addAttribute("roomStatusList", roomStatusList);*/
		//Room Other Type List
		//Room Type List
		//printRoomsDetails(rmls);

		//return "listrooms";
		return "RoomManagement";

	}
	
	@RequestMapping(value={"room","room/"}, method=RequestMethod.POST)
	public String createRoom(@Valid Room room, Model model){
		roomService.createRoom(room);
		System.out.println("create room");
		return "redirect:/room";
	}

	@RequestMapping(value="{roomId}",method = RequestMethod.GET )
	public String viewRoom(@PathVariable Long roomId, Model model){
		System.out.println("Fetching a single room");
		Room room = (Room)roomService.viewRoom(roomId);
		model.addAttribute("room", room);
		return "roomForm";
	}
	
	@RequestMapping(value="{roomId}", method=RequestMethod.POST)
	public String updateRoom(@PathVariable Long roomId, @Valid Room room, Model model){
		roomService.updateRoom(room);
		return "redirect:/room";
	}
	
	@RequestMapping(value="{roomId}", method=RequestMethod.DELETE)//, @RequestParam("_method") String method
	public String deleteRoom(@PathVariable Long roomId, @RequestParam("_method") String method){
		//delete a room only if the status of the room in 0 i.e available rooms
		System.out.println("Deleting a single room:" + roomId);
		roomService.deleteRoom(roomId);
		return "redirect:/room";
	}
	
	private void printRoomsDetails(List<Room> rmls) {
		for (Iterator iterator = rmls.iterator(); iterator.hasNext();) {
			Room room = (Room) iterator.next();
			System.out.println("Room : " + room.toString());
		}
	}

}