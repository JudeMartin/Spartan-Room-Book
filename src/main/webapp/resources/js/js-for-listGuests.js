function getGuestDetails(guest_id){
	
	var xhrGuest = new XMLHttpRequest();
    xhrGuest.open("GET", "http://localhost:8080/SpartanRoomBook/guests/"+guest_id, true);
    xhrGuest.send();
    xhrGuest.onreadystatechange = function() {
        if (xhrGuest.readyState == 4 && xhrGuest.status == 200) {                
            document.getElementById("guestInfoView").innerHTML =    xhrGuest.responseText;
        }
    }
    
    var xhrStay = new XMLHttpRequest();
    xhrStay.open("GET", "http://localhost:8080/SpartanRoomBook/reservations/guests/"+guest_id, true);
    xhrStay.send();
    xhrStay.onreadystatechange = function() {
        if (xhrStay.readyState == 4 && xhrStay.status == 200) {                
            document.getElementById("stayInfoView").innerHTML =  xhrStay.responseText;
        }
    }
    alert("res: " +xhrStay.responseText);
  
}