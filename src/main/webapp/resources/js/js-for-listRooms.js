function addBook() {
	$('#roomDialog').dialog("option", "title", 'Add Book');
	$('#roomDialog').dialog('open');
}

function editRoom(id) {
console.log("edit roon: " + id);
	$.get("" + id, function(result) {

		$("#roomDialog").html(result);

		$('#roomDialog').dialog("option", "title", 'Edit Book');

		$("#roomDialog").dialog('open');

		//initializeDatePicker();
	});
}

function deleteRoom(id){
	console.log("Delete room : " + id);
	//$.delete("", function(result){});
	//$.ajax();
	var myurl = "http://localhost:8082/SpartanRoomBook/room/" + id;
	
	var request = new XMLHttpRequest();
    request.open('DELETE', myurl, true);
    request.onreadystatechange = function () { window.location.reload(true); };
    request.send(null);
    
	/*$.ajax({
        url: myurl,
        type: 'POST',
        dataType: 'json',
        success: function (data, textStatus, xhr) {
           alert(data);
        	// alert("CustomerID: " + data.CustomerId + ", Status: " + data.Status);
        },
        error: function (xhr, textStatus, errorThrown) {
            alert("An error occurred!!");
        }
    });*/
	
}

function initializeDatePicker() {
	$(".datepicker").datepicker({
		dateFormat : "yy-mm-dd",
		changeMonth : true,
		changeYear : true,
		showButtonPanel : true
	});
}

function resetDialog(form) {

	form.find("input").val("");
}

$(document).ready(function() {

	$('#roomDialog').dialog({

		autoOpen : false,
		position : 'center',
		modal : true,
		resizable : false,
		width : 440,
		buttons : {
			"Save" : function() {
				$('#roomForm').submit();
			},
			"Cancel" : function() {
				$(this).dialog('close');
			}
		},
		close : function() {

			resetDialog($('#roomForm'));

			$(this).dialog('close');
		}
	});

	initializeDatePicker();
});