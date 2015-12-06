<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>

<div id="guestInfoView">

							<div class="span3">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Guest ID</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${guest.guest_id }</label>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="span3">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Name</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${guest.first_name } ${guest.last_name }</label>
                                    </div>
                                </div>
                            </div>
                            
                            
                            <div class="span3 ">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Address</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${guest.address }</label>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="span3">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Email</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${guest.email }</label>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="span3">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Phone</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${guest.phone }</label>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="span3 ">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">City</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${guest.city }</label>
                                    </div>
                                </div>
                            </div>
                            
                           
                            
                            <div class="span3 ">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">Country</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${guest.country }</label>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="span3">
                                <div class="control-group">
                                    <label for="focusedInput" class="control-label">License #</label>
                                    <div class="controls">
                                        <label for="focusedInput" class="control-label">${guest.driver_license }</label>
                                    </div>
                                </div>
                            </div>
                      

</div>

</body>
</html>