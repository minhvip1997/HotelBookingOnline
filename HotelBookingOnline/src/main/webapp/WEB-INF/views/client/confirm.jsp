<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:url var="resources" value="/resources" />
<!-- inner_window_banner Start bg -->
<section>
	<div class="inner_window_banner" data-parallax="scroll" data-image-src="${resources}/assets/images/inner_banner1.jpg">
		<div class="inner_window_overlay">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="breadcrumb_parent text-center">
							<h2 class="page_title white-text">Confirm</h2>
							<ul class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="#">Home</a>
								</li>
								<li class="breadcrumb-item">
									<a href="#">Book Now</a>
								</li>
								<li class="breadcrumb-item">
									<a href="#">Checkout</a>
								</li>
								<li class="breadcrumb-item active">Confirm</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- inner_window_banner End bg -->
<section class="padding_75 conform-warpper">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="alert alert-success">
					<i class="fa fa-info-circle m-r-7"></i>
					Thank you! Your booking has been placed. We will contact you to confirm about the booking soon.
				</div>
			</div>
		</div>
		<div class="row conform-yemm_content">
			<div class="col-12">
				<h4 class="form_title4">Booking :-</h4>
			</div>
			<div class="col-lg-12">
				<div class="row">
					<div class="col-lg-9 col-md-12 conform-yemm-detail">
						<div class="row">
							<div class="conform-hotel_pic col-lg-4 col-md-4 ">
								<img src="${resources}/assets/images/conform_hotelpic.jpg" class="img-fluid" alt="">
							</div>
							<div class="col-lg-8 col-md-8 confortion_dic">
								<h5>Citrus Cunningham Road, Bangalore</h5>
								<p class="clearfix">
									<span class="float-left">1 Room for 4 Nights</span>
									<span class="green_text1 float-right">Id: Q1405326f6521</span>
								</p>
								<div class="conform_date clear">
									<ul class="d-flex justify-content-between align-items-center">
										<li>
											<strong>Check-In</strong>
											<p>March 01</p>
											<span>Fri, 12 pm</span>
										</li>
										<li class="text-center">
											<span>
												<i class="fa fa-clock-o d-block"></i>
												2 nights
											</span>
										</li>
										<li>
											<strong>Check-In</strong>
											<p>March 04</p>
											<span>Mon, 12 pm</span>
										</li>
									</ul>
								</div>
								<p class="getsts_cont">
									<strong>Guests</strong>
									<span>1 Adult</span>
									<span> 2 Children</span>
								</p>
							</div>
						</div>
						<div class="conform_more_dic">
							<h5>Primary Traveller In This Trip :-</h5>
							<ul class="d-inline-block m-b15">
								<li>
									<strong>First Name:</strong>
									Charlie
								</li>
								<li>
									<strong>Phone:</strong>
									+123 546 7890
								</li>
								<li>
									<strong>Country:</strong>
									London SW1V 1AU, UK
								</li>
								<li>
									<strong>Last Name:</strong>
									Lindbergh
								</li>
								<li>
									<strong>Address:</strong>
									246 Vauxhall Bridge Rd
								</li>
								<li>
									<strong>Zip:</strong>
									11325
								</li>
								<li>
									<strong>Email:</strong>
									info@example.com
								</li>
								<li>
									<strong>City:</strong>
									Westminster
								</li>
								<li>
									<strong>Arrival:</strong>
									I do not know
								</li>
							</ul>
							<p>
								<strong class="d-block">Request:</strong>
								Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since
								the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
							</p>
						</div>

					</div>
					<div class="col-lg-3 col-md-12">
						<div class="payment_receipt">
							<div class="receipt_widgets">
								<h6>Payment Receipt</h6>
								<img src="${resources}/assets/images/payment_card.png" alt="">
							</div>
							<div class="receipt_widgets">
								<h6>Credit Card</h6>
								<strong>5213 xxxx xxxx 2346</strong>
							</div>
							<div class="receipt_widgets">
								<h6>Total Charge</h6>
								<strong>$45, 152</strong>
							</div>
							<div class="receipt_widgets rate_breakup">
								<h6>Rate Breakup</h6>
								<ul>
									<li>
										Room rate:
										<strong>$45, 152</strong>
									</li>
									<li>
										Tax:
										<strong>$1500</strong>
									</li>
									<li>
										Discount:
										<strong>$-15</strong>
									</li>
									<li>
										Paid earlier:
										<strong>$100</strong>
									</li>
									<li>
										Total:
										<strong>$45, 152</strong>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>