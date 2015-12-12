package sjsu.edu.cmpe275.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sjsu.edu.cmpe275.model.BillInfo;
import sjsu.edu.cmpe275.model.Email;
import sjsu.edu.cmpe275.model.Guest;
import sjsu.edu.cmpe275.model.Reservation;
import sjsu.edu.cmpe275.model.Room;
import sjsu.edu.cmpe275.service.BillInfoService;
import sjsu.edu.cmpe275.service.GuestService;
import sjsu.edu.cmpe275.service.ReservationService;
import sjsu.edu.cmpe275.service.RoomService;

@Controller
@RequestMapping("/bill")
public class BillController {

	@Autowired
	private BillInfoService billInfoService;

	@Autowired
	private GuestService guestService;

	@Autowired
	private ReservationService reservationService;

	@Autowired
	private RoomService roomService;

	@Autowired
	private EmailController emailController;

	/* Done */
	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public @ResponseBody String generateBill(@RequestBody String jsonString)
			throws ParseException, java.text.ParseException {

		System.out.println("JSON payload recieved:" + jsonString.toString());
		// do business logic
		System.out.println("Json method" + jsonString.toString());
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(jsonString);
		JSONObject jsonObj = (JSONObject) obj;

		// Guest JSON Payload
		String address = (String) jsonObj.get("address");
		String city = (String) jsonObj.get("city");
		String country = (String) jsonObj.get("country");
		String driver_license = (String) jsonObj.get("driver_license");
		String email = (String) jsonObj.get("email");
		String first_name = (String) jsonObj.get("first_name");
		String last_name = (String) jsonObj.get("last_name");
		String phone = (String) jsonObj.get("phone");

		// Reservation JSON Payload
		String adults = (String) jsonObj.get("adults");
		String amenityTypeId = "5";
		String room_id = (String) jsonObj.get("roomId");
		String rooms = (String) jsonObj.get("rooms");
		String children = (String) jsonObj.get("children");
		java.sql.Date check_out_date = sqlDateGenerator((String) jsonObj
				.get("date_to"));
		java.sql.Date check_in_date = sqlDateGenerator((String) jsonObj
				.get("date_from"));
		java.sql.Date reservation_date = new java.sql.Date(Calendar
				.getInstance().getTime().getTime());

		System.out.println("adults" + adults + "room_id" + room_id + "rooms"
				+ rooms + "children" + children + "check_out_date"
				+ check_out_date + "check_in_date" + check_in_date
				+ "reservation_date" + reservation_date);

		// Payment JSON Payload

		String total_payment = (String) jsonObj.get("total_price");
		String tax = "2";
		String discount = "10";
		String base = (String) jsonObj.get("localBasePrice");
		int days = daysCalculator(check_in_date, check_out_date);
		System.out.println(days);
		String Extra_Charges = (String) jsonObj.get("extras_price");
		System.out.println("Extra charges:" + Extra_Charges);
		/* Guest object */
		Guest newGuest = GenerateJSONGuest(address, city, country,
				driver_license, email, first_name, last_name, phone);

		/* Reservation object */
		Reservation reservation = GenerateJSONReservation(adults, room_id,
				rooms, children, check_out_date, check_in_date,
				reservation_date, total_payment, discount, base, days,
				newGuest, amenityTypeId);
		System.out.println(reservation.getReservationId());
		/* Bill object */
		BillInfo bI = (BillInfo) generateJSONBILL(first_name, last_name, rooms,
				total_payment, discount, base, days, reservation, newGuest);
		System.out.println(bI.getPayment_id());

		/* Room object */
		Room roomObj = (Room) roomService.viewRoom(Long.valueOf(room_id));

		/* Other Obj */
		Double total_cal_value = calculateTotal(Double.parseDouble(base),
				Double.parseDouble(Extra_Charges), Double.parseDouble(tax),
				Double.parseDouble(discount));
		total_payment = total_cal_value.toString();

		String cancel_url_non_encoded = "http://localhost:8080/SpartanRoomBook/bill/delete/"
				+ bI.getPayment_id();

		String cancel_url = shorten(cancel_url_non_encoded);
		System.out.println("cancelURL:" + cancel_url);
		System.out.println("Before MEIL JSON() :" + Extra_Charges);
		GenerateEmailJSON(email, first_name, last_name, adults, room_id, rooms,
				children, check_out_date, check_in_date, reservation_date,
				total_payment, discount, base, days, cancel_url, roomObj,
				Extra_Charges);

		return null;
	}

	/* Done */
	@RequestMapping(value = "/{payment_Id}", method = RequestMethod.GET)
	public String viewPayment(@PathVariable Long payment_Id, Model model) {
		if (payment_Id == null) {
			return "the Input is not valid";
		}
		System.out.println("In the   viewPayment Method");
		BillInfo billInfomation = (BillInfo) billInfoService
				.viewBill(payment_Id);
		System.out.println(billInfomation.toString());
		return null;
	}

	/* Done */
	@RequestMapping(value = "/delete/{payment_Id}", method = RequestMethod.DELETE)
	public String deleteBill(@PathVariable Long payment_Id) {
		System.out.println("in the delete Bill ()");
		BillInfo billInfo = (BillInfo) billInfoService.viewBill(payment_Id);
		Reservation res = (Reservation) billInfo.getReservation();
		billInfo.setGuest(null);
		billInfo.setReservation(null);
		billInfoService.updateBill(billInfo);
		billInfoService.deleteBill(billInfo.getPayment_id());
		return null;
	}

	/* Done */
	@RequestMapping(value = "/delete/{payment_Id}", method = RequestMethod.GET)
	public String deleteByGetBill(@PathVariable Long payment_Id) {
		System.out.println("in the deleteByGetBill  ()");
		BillInfo billInfo = (BillInfo) billInfoService.viewBill(payment_Id);
		Reservation res = (Reservation) billInfo.getReservation();
		billInfo.setGuest(null);
		billInfo.setReservation(null);
		billInfoService.updateBill(billInfo);
		billInfoService.deleteBill(billInfo.getPayment_id());
		return null;
	}

	private BillInfo generateJSONBILL(String first_name, String last_name,
			String rooms, String total_payment, String discount, String base,
			int days, Reservation reservation, Guest guest) {
		BillInfo billInfo = new BillInfo();
		billInfo.setTotal_payment(Double.parseDouble(total_payment));
		billInfo.setDiscount(Integer.parseInt(discount));
		billInfo.setDays((days));
		billInfo.setBase(Double.parseDouble(base));
		billInfo.setRooms(Integer.parseInt(rooms));
		billInfo.setFirst_name(first_name);
		billInfo.setLast_name(last_name);
		billInfo.setReservation(reservation);
		billInfo.setGuest(guest);
		return (BillInfo) billInfoService.generateBill(billInfo);
	}

	private Reservation GenerateJSONReservation(String adults, String room_id,
			String rooms, String children, java.sql.Date check_out_date,
			java.sql.Date check_in_date, java.sql.Date reservation_date,
			String total_payment, String discount, String base, int days,
			Guest newGuest, String amenityTypeId) {
		Room roomObj = (Room) roomService.viewRoom(Long.valueOf(room_id));
		System.out.println(total_payment + "totalPayment" + discount
				+ "discont" + base + "base" + days + "days" + adults + "adults"
				+ check_in_date + "check in" + check_out_date + "check Out"
				+ reservation_date + "res date" + rooms + "rooms" + children
				+ "children" + newGuest.toString() + "guest" + "roomObj:"
				+ roomObj.toString());
		Reservation reservation = new Reservation();
		reservation.setAdults(Integer.parseInt(adults));
		reservation.setAmenityTypeId(Integer.parseInt(amenityTypeId));
		reservation.setRoom(roomObj);
		reservation.setCheckOutDate(check_out_date);
		reservation.setCheckInDate(check_in_date);
		reservation.setReservationDate((reservation_date));
		reservation.setRooms(Integer.parseInt(rooms));
		reservation.setAdults(Integer.parseInt(children));
		reservation.setGuest(newGuest);

		reservationService.createReservation(reservation);
		return reservation;
	}

	private Guest GenerateJSONGuest(String address, String city,
			String country, String driver_license, String email,
			String first_name, String last_name, String phone) {
		Guest guest = new Guest();
		guest.setAddress(address);
		guest.setCity(city);
		guest.setCountry(country);
		guest.setDriver_license(driver_license);
		guest.setEmail(email);
		guest.setFirst_name(first_name);
		guest.setLast_name(last_name);
		guest.setPhone(phone);
		Guest newGuest = (Guest) guestService.createGuest(guest);

		System.out.println(newGuest.toString());
		return newGuest;
	}

	private int daysCalculator(java.sql.Date check_out_date,
			java.sql.Date check_in_date) {
		long days_in_Long = -1;
		days_in_Long = Math.round((check_in_date.getTime() - check_out_date
				.getTime()) / (double) 86400000);
		int days = safeLongToInt(days_in_Long);
		return days;
	}

	private java.sql.Date sqlDateGenerator(String str) {
		// String u1Date = "14 Dec 2015";
		int resMonth = 0;
		String[] splited = str.split(" ");
		for (int i = 0; i < splited.length; i++) {
			System.out.print(splited[i] + " ");
		}
		System.out.print(splited[1] + " ");
		switch (splited[1]) {
		case "Dec":
			resMonth = 12;
			break;
		case "Nov":
			resMonth = 11;
			break;
		case "Oct":
			resMonth = 10;
			break;
		case "Sep":
			resMonth = 9;
			break;

		case "Aug":
			resMonth = 8;
			break;
		case "Jul":
			resMonth = 7;
			break;
		case "Jun":
			resMonth = 6;
			break;

		case "May":
			resMonth = 5;
			break;
		case "Apr":
			resMonth = 4;
			break;
		case "Mar":
			resMonth = 3;
			break;
		case "Feb":
			resMonth = 2;
			break;
		case "Jan":
			resMonth = 1;
			break;
		default:
			break;
		}
		String res = splited[2] + "-" + resMonth + "-" + splited[0];
		System.out.println(res);
		java.sql.Date date = java.sql.Date.valueOf(res);
		return date;
	}

	public static int safeLongToInt(long l) {
		if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
			throw new IllegalArgumentException(l
					+ " cannot be cast to int without changing its value.");
		}
		return (int) l;
	}

	private void GenerateEmailJSON(String email, String first_name,
			String last_name, String adults, String room_id, String rooms,
			String children, java.sql.Date check_out_date,
			java.sql.Date check_in_date, java.sql.Date reservation_date,
			String total_payment, String discount, String base, int days,
			String cancel_url, Room roomObj, String Extra_Charges) {
		System.out.println("Generate EMAIL JSON():" + Extra_Charges);
		Email emailJson = new Email();
		String other_type = "Non Smoking";
		if (roomObj.getOtherTypeId() == 1) {
			other_type = "Smoking";
		}
		String room_type_name = "2 King Bed";
		if (roomObj.getRoomTypeId() == 1) {
			room_type_name = "1 Queen Bed";
		}
		emailJson.setAdults(Integer.valueOf(adults));
		emailJson.setCheck_in_date(check_in_date);
		emailJson.setCheck_out_date(check_out_date);
		emailJson.setChildren(Integer.valueOf(children));
		emailJson.setDays(days);
		emailJson.setDiscount(Integer.valueOf(discount));
		emailJson.setEmail_id(email);
		emailJson.setUserName(first_name + " " + last_name);
		emailJson.setType("Test type");
		emailJson.setTotal_payment(Double.parseDouble(total_payment));
		emailJson.setTax(2);
		emailJson.setRoomsQty(Integer.parseInt(rooms));
		emailJson.setRoom_type(room_type_name);
		emailJson.setRoom_id(Long.parseLong(room_id));
		emailJson.setReservation_id((long) 2);
		emailJson.setOther_type(other_type);
		emailJson.setExtra_pay(Double.parseDouble(Extra_Charges));
		emailJson.setBase_pay(Double.parseDouble(base));
		emailJson.setBooking_date(reservation_date);
		emailJson.setCancel_url(cancel_url);

		emailController.mailSender(emailJson);
	}

	public static Double calculateTotal(Double Base_Payment,
			Double Extra_Charges, Double Tax, Double Discount) {
		System.out.println("Base_Payment" + Base_Payment + "Extra_charges"
				+ Extra_Charges + "Tax:" + Tax + "Discount:" + Discount);
		Double charges_BeforeTax = Base_Payment + Extra_Charges;
		System.out.println("Charges+BeforeTax" + charges_BeforeTax);
		Double Total = 0.0;

		Double cash_before_discount = (((charges_BeforeTax) * 10) / 100);
		System.out.println("cash_before_discount" + cash_before_discount);

		Double discounted_amt = (charges_BeforeTax - cash_before_discount);
		System.out.println("discounted_amt" + discounted_amt);
		Double taxable_amt = (((discounted_amt) * 2) / 100);
		System.out.println("taxable_amt" + taxable_amt);

		Total = discounted_amt + taxable_amt;
		System.out.println(Total);
		return Total;
	}

	public String shorten(String longUrl) {
		if (longUrl == null) {
			return longUrl;
		}

		StringBuilder sb = null;
		String line = null;
		String urlStr = longUrl;

		try {
			URL url = new URL("http://goo.gl/api/url");
			HttpURLConnection connection = (HttpURLConnection) url
					.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("User-Agent", "toolbar");

			OutputStreamWriter writer = new OutputStreamWriter(
					connection.getOutputStream());
			writer.write("url=" + URLEncoder.encode(urlStr, "UTF-8"));
			writer.close();

			BufferedReader rd = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			sb = new StringBuilder();
			while ((line = rd.readLine()) != null) {
				sb.append(line + '\n');
			}

			String json = sb.toString();
			// It extracts easily...
			return json.substring(json.indexOf("http"),
					json.indexOf("\"", json.indexOf("http")));
		} catch (MalformedURLException e) {
			return longUrl;
		} catch (IOException e) {
			System.out.println("LongURL:" + longUrl);
			return longUrl;
		}
	}

}