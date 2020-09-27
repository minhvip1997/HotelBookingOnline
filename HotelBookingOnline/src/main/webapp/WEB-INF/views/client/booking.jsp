<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:url var="resources" value="/resources" />
<!-- inner_window_banner Start bg -->
<tg:breadcrumb title1="Book Now" title2="Book Now"/>
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
								<img src="${resources}/assets/images/booking_hotel.jpg" class="img-fluid" alt="">
							</div>
							<div class="col-lg-8 col-md-8 col-sm-8 booking_hotel_dic">
								<h5>FabHotel All Season Calangute Beach</h5>
								<ul class="list-inline item-ratting">
									<li>
										<a href="#">
											<i class="fa fa-star fa-2x"></i>
										</a>
									</li>
									<li>
										<a href="#">
											<i class="fa fa-star fa-2x"></i>
										</a>
									</li>
									<li>
										<a href="#">
											<i class="fa fa-star fa-2x"></i>
										</a>
									</li>
									<li>
										<a href="#">
											<i class="fa fa-star-o fa-2x"></i>
										</a>
									</li>
									<li>
										<a href="#">
											<i class="fa fa-star-o fa-2x"></i>
										</a>
									</li>
								</ul>
								<p>
									<strong>Address:</strong>
									235 W 46th St, New York, NY 10036, USA
								</p>
								<h6>Deluxe Room</h6>
								<span class="green_text">Your stay includes:</span>
								<ul class="room_facilities">
									<li>
										<i class="fa fa-check"></i>
										Breakfast
									</li>
									<li>
										<i class="fa fa-check"></i>
										Wi-fi
									</li>
									<li>
										<i class="fa fa-check"></i>
										Taxes
									</li>
									<li>
										<i class="fa fa-check"></i>
										Mandatoty Gala Dinner X-Max & New Year Eve payable at Hotel.
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="col-lg-4 col-md-12 p-0 check_in_detail">
						<div class="check_in_time">
							<strong>Check-In</strong>
							<p>
								<i class="fa fa-calendar"></i>
								Wed 02 28 2019
							</p>
							<p>
								<i class="fa fa-clock-o"></i>
								12:00 PM
							</p>
						</div>
						<div class="check_in_time">
							<strong>Check-Out</strong>
							<p>
								<i class="fa fa-calendar"></i>
								Sun 03 04 2019
							</p>
							<p>
								<i class="fa fa-clock-o"></i>
								11:00 AM
							</p>
						</div>
						<p class="day_stuts clear">
							<span>
								<i class="fa fa-bed"></i>
								4 Night
							</span>
							<a href="">Booking & Cancellation Policy</a>
						</p>
						<div class="i_have_promo justify-content-between d-flex">
							<label class="custom-control custom-radio m-0">
								<input id="radio1" name="radio" type="radio" class="custom-control-input">
								<span class="custom-control-indicator"></span>
								<span class="custom-control-description">I have promocode.</span>
							</label>
							<input type="text" class="promo_fild">
							<button type="submit" class="btn btn-success">Apply</button>
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
			<div class="col-12">
				<h4 class="form_title4">Booking :-</h4>
				<table class="table m-0">
					<thead>
						<tr>
							<th scope="col">Room Type</th>
							<th scope="col">Capacity</th>
							<th scope="col">Children</th>
							<th scope="col">Quantity</th>
							<th scope="col">Check - in</th>
							<th scope="col">Check - out</th>
							<th scope="col">Night</th>
							<th scope="col">Gross Total</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Single Room</td>
							<td>1 adult</td>
							<td>2 Children</td>
							<td>3 Person</td>
							<td>February 28 - 2019</td>
							<td>March 04 - 2019</td>
							<td>4</td>
							<td>$5,700.00</td>
						</tr>
						<tr>
							<td colspan="7">Sub Total</td>
							<td>
								<strong>$5,700.0</strong>
							</td>
						</tr>
						<tr>
							<td colspan="7">Tax</td>
							<td>$370.0</td>
						</tr>
						<tr>
							<td colspan="7">Discount (You Save)</td>
							<td>$00.00</td>
						</tr>
						<tr>
							<td colspan="7">
								<strong>Advance Payment (50% of Grand Total)</strong>
							</td>
							<td>
								<strong>$6,070.0</strong>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</section>
<section class="padding_75">
	<div class="container">
		<div class="row">
			<div class="col-lg-9 col-md-9">
				<h4 class="form_title4">Add Your Informations :-</h4>
				<form class="form-row">
					<div class="form-group col-lg-6 col-md-6">
						<input type="text" class="form-control" placeholder="First Name*">
					</div>
					<div class="form-group col-lg-6 col-md-6">
						<input type="text" class="form-control" placeholder="Last Name*">
					</div>
					<div class="form-group col-lg-6 col-md-6">
						<input type="text" class="form-control" placeholder="Email*">
					</div>
					<div class="form-group col-lg-6 col-md-6">
						<input type="text" class="form-control" placeholder="Phone*">
					</div>
					<div class="form-group col-lg-12">
						<textarea placeholder="Address*" class="form-control textaria_height"></textarea>
					</div>
					<div class="col-lg-6 col-md-8 col-sm-6">
						<label class="custom-control custom-checkbox">
							<input type="checkbox" class="custom-control-input">
							<span class="custom-control-indicator"></span>
							<span class="custom-control-description">
								I agree with
								<strong>Terms and Conditions</strong>
							</span>
						</label>
					</div>
					<div class="col-lg-6 col-md-4 col-sm-6 text-right">
						<input type="submit" value="Submit" class="btn btn-success">
					</div>
				</form>
			</div>
			<div class="col-lg-3 col-md-3 more-google-Ads">
				<a href="#">
					<img src="${resources}/assets/images/add_img2.png" class="img-fluid" alt="">
				</a>
			</div>
		</div>
	</div>
</section>