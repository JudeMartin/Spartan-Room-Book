package sjsu.edu.cmpe275.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sjsu.edu.cmpe275.service.BillInfoService;

@Controller
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillInfoService billInfoService;
	
	
	@RequestMapping(value="/generate/{guest_id}", method=RequestMethod.GET)
	public void generateBill(@PathVariable Long guest_id, Model model)
	{
		billInfoService.generateBill(guest_id);
	}
	
	//generate bill
	
	//view bill

}
