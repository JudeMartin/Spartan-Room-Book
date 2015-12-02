<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!--  c:url var="actionUrl" value="save" /-->

<form:form id="roomForm" commandName="room" method="post"
	action="${actionUrl }" class="pure-form pure-form-aligned">

		<div class="pure-control-group">
			<label for="room_status">Room Status</label>
			<form:select path="statusId">
				<option value="1" ${room.statusId == '1'? "selected":""}>Available</option>
				<option value="2" ${room.statusId == '2'? "selected":""}>Reserved</option>
				<option value="3" ${room.statusId == '3'? "selected":""}>In use</option>
			</form:select>
		</div>
		<div class="pure-control-group">
			<label for="room_type">Room Type</label>
			<form:select path="roomTypeId">
				<option value="1" ${room.roomTypeId == '1'? "selected":""}>2 Queen Beds</option>
				<option value="2" ${room.roomTypeId == '2'? "selected":""}>1 King Bed</option>
			</form:select>
			<!-- form:input path="roomTypeId" placeholder="Room Type" maxlength="10" /-->
		</div>
		<div class="pure-control-group">
			<label for="other_type">Other Type</label>
			<form:select path="otherTypeId">
				<option value="1" ${room.otherTypeId == '1'? "selected":""}>Smoking</option>
				<option value="2" ${room.otherTypeId == '2'? "selected":""}>Non-Smoking</option>
			</form:select>
			<!-- form:input path="otherTypeId" placeholder="Other Type" /-->
		</div>
		<form:input path="id" type="hidden" />

</form:form>