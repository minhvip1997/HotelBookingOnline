<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/common/taglib.jsp"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="resources" value="/resources" />
<!-- inner_window_banner Start bg -->
<tg:breadcrumb title1="Book Now" title2="Book Now" />
<!-- inner_window_banner End bg -->
<section class="padding_75">
	<div class="container">
		<div class="row">
			<div class="col-12 reserv_detail_contant">
				<h4 class="form_title4">Your Reservation :-</h4>
				<div class="row reservation_blog">

					<div class="col-lg-8 col-md-12 p-0">

						<div class="row yemm_res_left">
							<div class="col-lg-4 col-md-4 col-sm-4">
								<c:forEach var="img" items="${roomtype.roomstypeimages }">
									<img src="${resources}/assets/images/${img.image}"
										class="img-fluid" alt="">
								</c:forEach>
							</div>
							<div class="col-lg-8 col-md-8 col-sm-8 booking_hotel_dic">
								<h5>${roomtype.typename }</h5>
								<ul class="list-inline item-ratting">
									<li><a href="#"> <i class="fa fa-star fa-2x"></i>
									</a></li>
									<li><a href="#"> <i class="fa fa-star fa-2x"></i>
									</a></li>
									<li><a href="#"> <i class="fa fa-star fa-2x"></i>
									</a></li>
									<li><a href="#"> <i class="fa fa-star-o fa-2x"></i>
									</a></li>
									<li><a href="#"> <i class="fa fa-star-o fa-2x"></i>
									</a></li>
								</ul>
								<p>
									<strong>Address:</strong> 235 W 46th St, New York, NY 10036,
									USA
								</p>
								<h6>Deluxe Room</h6>
								<span class="green_text">Your stay includes:</span>
								<ul class="room_facilities">
									<li><i class="fa fa-check"></i> Breakfast</li>
									<li><i class="fa fa-check"></i> Wi-fi</li>
									<li><i class="fa fa-check"></i> Taxes</li>
									<li><i class="fa fa-check"></i> Mandatoty Gala Dinner
										X-Max & New Year Eve payable at Hotel.</li>
								</ul>
							</div>
						</div>

					</div>

					<div class="col-lg-4 col-md-12 p-0 check_in_detail">
						<div class="check_in_time">
							<strong>Check-In</strong>
							<p>
								<i class="fa fa-calendar"></i> ${booking.checkInDate }
							</p>
							<p>
								<i class="fa fa-clock-o"></i> 12:00 PM
							</p>
						</div>
						<div class="check_in_time">
							<strong>Check-Out</strong>
							<p>
								<i class="fa fa-calendar"></i> ${booking.checkOutDate }
							</p>
							<p>
								<i class="fa fa-clock-o"></i> 11:00 AM
							</p>
						</div>
						<p class="day_stuts clear">
							<span> <i class="fa fa-bed"></i>
								${(booking.getCheckOutDate().getTime()-booking.getCheckInDate().getTime())/(60*60*24*1000)}
								Night
							</span> <a href="">Booking & Cancellation Policy</a>
						</p>
						<div class="i_have_promo justify-content-between d-flex">
							<label class="custom-control custom-radio m-0"> <input
								id="radio1" name="radio" type="radio"
								class="custom-control-input"> <span
								class="custom-control-indicator"></span> <span
								class="custom-control-description">I have promocode.</span>
							</label> <input type="text" class="promo_fild">
							<!--  <button type="submit" class="btn btn-success">Apply</button>-->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<section class="light_grayBG padding_75">
	<div class="container">
		<div class="row bookin_detail_tabel">
			<div class="col-12 ">
				<s:form class="form-row" modelAttribute="bookingnew"
					action="/booking" method="post">
					<h4 class="form_title4">Booking :-</h4>

					<table class="table m-0">
						<thead>
							<tr>
								<th scope="col">Room Type</th>
								<th scope="col">Adult</th>
								<th scope="col">Children</th>
								<th scope="col">Quantity Room</th>
								<th scope="col">Check - in</th>
								<th scope="col">Check - out</th>
								<th scope="col">Night</th>
								<th scope="col">Gross Total</th>
							</tr>
						</thead>
						<tbody>

							<tr>
								<td><s:input path="roomtype.roomtypeid" size="10"
										value="${booking.roomtype.roomtypeid}" readonly="true"/></td>
								<td><s:input path="adult" size="10"
										value="${booking.adult }" readonly="true"/></td>
								<td><s:input path="children" size="10"
										value="${booking.children }" readonly="true"/></td>
								<td><s:input path="numberOfRooms" size="10"
										value="${booking.numberOfRooms }" readonly="true"/></td>
								<td><s:input path="checkInDate"
										value="${checkIn }" type="text" readonly="true"/></td>
								<td><s:input path="checkOutDate"
										value="${checkOut }"  type="text" readonly="true"/></td>
								<td>${(booking.getCheckOutDate().getTime()-booking.getCheckInDate().getTime())/(60*60*24*1000)}
								</td>
								<td>${roomtype.price*(booking.getCheckOutDate().getTime()-booking.getCheckInDate().getTime())/(60*60*24*1000)*booking.numberOfRooms }</td>
							</tr>

							<tr>
								<td colspan="7">Sub Total</td>
								<td><strong>${roomtype.price*(booking.getCheckOutDate().getTime()-booking.getCheckInDate().getTime())/(60*60*24*1000)*booking.numberOfRooms }</strong>
								</td>
							</tr>
							<tr>
								<td colspan="7">Tax</td>
								<td></td>
							</tr>
							<tr>
								<td colspan="7">Discount (You Save)</td>
								<td>$00.00</td>
							</tr>
							<tr>
								<td colspan="7"><strong>Advance Payment (50% of
										Grand Total)</strong></td>
								<td><strong>${(roomtype.price*booking.numberOfRooms*(booking.getCheckOutDate().getTime()-booking.getCheckInDate().getTime())/(60*60*24*1000))/2 }</strong>
								</td>
							</tr>
						</tbody>
					</table>
					<br>
					<hr>
					<h4 class="form_title4">Add Your Informations :-</h4>
					<hr>
					<div class="container">
						<div class="form-group col-lg-6 col-md-6">

							<s:input type="text" path="user.name" class="form-control"
								placeholder="Full Name*" required="true" />
						</div>

						<div class="form-group col-lg-6 col-md-6">

							<s:input type="text" path="user.email" class="form-control"
								placeholder="Email*" required="true" />
						</div>
						<div class="form-group col-lg-6 col-md-6">

							<s:input type="text" path="user.phone" class="form-control"
								placeholder="Phone*" required="true" />
						</div>
						<div class="form-group col-lg-12">

							<s:textarea placeholder="Address*" path="user.address"
								class="form-control textaria_height" required="true" />
						</div>
						<div class="i_have_promo justify-content-between d-flex">
							<label class="custom-control custom-radio m-0"> <span
								class="custom-control-description">I have promocode.</span>
							</label> <s:input  class="form-control"
								placeholder="Promocode*" required="true" path="promotion.promId"/>
							<!--  <button type="submit" class="btn btn-success">Apply</button>-->
						</div>
						<div class="col-lg-6 col-md-4 col-sm-6 text-right">
							<input type="submit" value="Submit" class="btn btn-success">
						</div>
					</div>
				</s:form>
			</div>
		</div>
	</div>
</section>
