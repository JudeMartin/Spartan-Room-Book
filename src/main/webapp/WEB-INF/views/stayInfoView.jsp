<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>

<div id="stayInfoView">

	 						<div class="span3">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Room ID</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${reservation.roomId }</label>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="span3">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Arrive</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${reservation.checkInDate }</label>
                                        
                                    </div>
                                </div>
                            </div>
                            
                            <div class="span3 ">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Depart</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${reservation.checkOutDate }</label>
                                    </div>
                                </div>    
                            </div>    
                            
                            <div class="span3 ">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Adults</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${reservation.adults }</label>                            </div>
                                </div>
                            </div>
                            
                            <div class="span3">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Children</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${reservation.children}</label>
                                    </div>
                                </div>
                            </div>
                

</div>

</body>
</html>