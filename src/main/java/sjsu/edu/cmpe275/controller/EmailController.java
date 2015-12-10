package sjsu.edu.cmpe275.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sjsu.edu.cmpe275.model.Email;
import sjsu.edu.cmpe275.service.impl.MailServiceImpl;

@Controller
@RequestMapping("/email")
public class EmailController {

	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public String mailSender(@RequestBody Email payload)// , Model model)
	{
		System.out.println("In the Email controller");
		System.out.println(payload.getEmail_id());
		System.out.println("Adults" + payload.getAdults() + "base pay" + payload.getBase_pay() + "Cancel Url"
				+ payload.getCancel_url() + "Children" + payload.getChildren() + "days:" + payload.getDays()
				+ "Dicsount" + payload.getDiscount() + "Email" + payload.getEmail_id() + "Extra Pay"
				+ payload.getExtra_pay() + "other type" + payload.getOther_type() + "Room type" + payload.getRoom_type()
				+ "Rooms qty" + payload.getRoomsQty() + "Tax" + payload.getTax() + "Total Payment"
				+ payload.getTotal_payment() + "Type" + payload.getType() + "user name" + payload.getUserName()
				+ "Reservation Id" + payload.getReservation_id() + "Room Id" + payload.getRoom_id() + "Booking Date"
				+ payload.getBooking_date() + "Check in date" + payload.getCheck_in_date() + "chek out date"
				+ payload.getCheck_out_date()
		);
		System.out.println("dede" + payload.getEmail_id());
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		MailServiceImpl mm = (MailServiceImpl) context.getBean("mailMail");
		System.out.println(payload.toString());
		StringBuilder message = new StringBuilder();
		message.append("<h2>Dear " + payload.getUserName()
				+ "</h2><h4>Here is your booking confirmation with Hotel Sparta</h4><table style='border: 0'><th>Booking Details</th><tr><td>Booking # </td><td>: "
				+ payload.getReservation_id() + "</td></tr><tr><td>Booking Date </td><td>: " + payload.getBooking_date()
				+ "</td></tr><tr><td>Check In Date </td><td>: " + payload.getCheck_in_date()
				+ "</td></tr><tr><td>Check Out Date </td><td>: " + payload.getCheck_out_date()
				+ "</td></tr><tr><td>Days </td><td>: " + payload.getDays() + "</td></tr><tr><td>To cancel </td><td>: "
				+ payload.getCancel_url() + "</td></tr></table><hr><br>");
		message.append("<table style='border: 0'><th>Room Details</th><tr><td>Room # </td><td>: " + payload.getRoom_id()
				+ "</td></tr><tr><td>Bed Type </td><td>: " + payload.getRoom_type()
				+ "</td></tr><tr><td>Room Type</td><td>: " + payload.getOther_type()
				+ "</td></tr><tr><td>Adults </td><td>: " + payload.getAdults()
				+ "</td></tr><tr><td>Children </td><td>: " + payload.getChildren() + "</td></tr></table><hr><br>");
		message.append("<table style='border: 0'><th>Billing Details</th><tr><td>Base Payment </td><td>: $ "
				+ payload.getBase_pay() + ".00</td></tr><tr><td>Extra Charges </td><td>: $ " + payload.getExtra_pay()
				+ ".00</td></tr><tr><td>Tax </td><td>: $ " + payload.getTax()
				+ ".00</td></tr><tr><td>Discount </td><td>: " + payload.getDiscount()
				+ "%</td></tr><tr><td>Total </td><td>: $ " + payload.getTotal_payment() + "</td></tr></table><br><br>");
		message.append(
				"<p>Thanks you for selecting <b>Hotel Sparta</b>,<br><font size='2'>Spartans</font><br><font size='1'>+1(234) 567-8910</font></p>");

		String finalMsg = message.toString();

		String title = "<h1>Hi !" + payload.getUserName() + "</h1>";
		mm.sendMail(payload.getEmail_id(), payload.getUserName(), finalMsg);

		//model.addAttribute("email_id", "sharma.surbhi114@gmail.com");
		return "emailConfirmation";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public void simple() {
		System.out.println("in simple");
	}

}
