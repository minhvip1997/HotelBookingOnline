<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:set var="url" value="${requestScope['javax.servlet.forward.request_uri']}" />
<header class="header ${fn:indexOf(url, 'user') > -1 ? ' header_style2':' header_style1'}">
	<div class="container top-bar">
		<div class="row pt-2 pb-2">
			<div class="col-6">
			</div>
			
			<!-- If has login session -->
			<!-- <div class="col-6 top_Right text-right admin_mini_menu">
				<ul>
					<li class="notifaction_drop nav-item dropdown">
						<a href="#" id="NavebarNotifactionDrop" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<i class="fa fa-bell-o"></i>
							<span>2</span>
						</a>
						<div class="dropdown-menu" aria-labelledby="NavebarNotifactionDrop">
							<h3>Notifications</h3>
							<ul>
								<li>
									<a class="dropdown-item clearfix" href="index.html">
										<div class="notifaction_photo">
											<img src="http://themes.webmasterdriver.net/Gwesty/assets/images/notifaction_drop1.jpg" alt="">
										</div>
										<div class="notifaction_content">
											<h4>The Witch's Hat</h4>
											<p>10% Discount</p>
											<span>
												<i class="fa fa-clock-o"></i>
												1 Min
											</span>
										</div>
									</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="index.html">
										<div class="notifaction_photo">
											<img src="http://themes.webmasterdriver.net/Gwesty/assets/images/notifaction_drop2.jpg" alt="">
										</div>
										<div class="notifaction_content">
											<h4>Park Hyatt Sydney</h4>
											<p>10% Discount</p>
											<span>
												<i class="fa fa-clock-o"></i>
												2 Hour
											</span>
										</div>
									</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="index.html">
										<div class="notifaction_photo">
											<img src="http://themes.webmasterdriver.net/Gwesty/assets/images/notifaction_drop3.jpg" alt="">
										</div>
										<div class="notifaction_content">
											<h4>Melbourne Marriott Hotel</h4>
											<p>10% Discount</p>
											<span>
												<i class="fa fa-clock-o"></i>
												1 Days
											</span>
										</div>
									</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="index.html">
										<div class="notifaction_photo">
											<img src="http://themes.webmasterdriver.net/Gwesty/assets/images/notifaction_drop4.jpg" alt="">
										</div>
										<div class="notifaction_content">
											<h4>Shangri-La Hotel</h4>
											<p>10% Discount</p>
											<span>
												<i class="fa fa-clock-o"></i>
												5 Days1
											</span>
										</div>
									</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="index.html">
										<div class="notifaction_photo">
											<img src="http://themes.webmasterdriver.net/Gwesty/assets/images/notifaction_drop5.jpg" alt="">
										</div>
										<div class="notifaction_content">
											<h4>Palazzo Versace Gold Coast</h4>
											<p>10% Discount</p>
											<span>
												<i class="fa fa-clock-o"></i>
												1 Month
											</span>
										</div>
									</a>
								</li>
							</ul>
						</div>
					</li>
					<li class="profile_drop nav-item dropdown">
						<a href="#" id="NavebarProfileDrop" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							<img src="http://themes.webmasterdriver.net/Gwesty/assets/images/user-photo.png" alt="">
							Adam Smith
							<i class="fa fa-angle-down"></i>
						</a>
						<div class="dropdown-menu" aria-labelledby="NavebarProfileDrop">
							<h3>Account & Settings</h3>
							<ul>
								<li>
									<a class="dropdown-item clearfix" href="user-dashboard.html">My Account</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="Order-History.html">My Orders</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="wishlist.html">Wishlist</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="cancel-booking.html">Cancel Bookings</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="review-ratings.html">Review & Ratings</a>
								</li>
								<li>
									<a class="dropdown-item clearfix" href="#">Log Out</a>
								</li>
							</ul>
						</div>
					</li>
				</ul>
			</div> -->
		<div class="col-6 top_Right text-right">
			<ul>
				<li class="hide">
					<a href="#">Account</a>
				</li>
				<li>
					<a href="login" class="btn btn-success float-right">Login</a>
				
				<a href="register" class="btn btn-success float-right">Register</a>
				</li>
			</ul>
		</div>
	</div>
	</div>
	<nav class="navbar navbar-expand-lg navbar-light bg-light top_divider" data-toggle="sticky-onscroll">
		<div class="container">
			<div class="logo">
				<a class="navbar-brand" href="<c:url value="/"/>">
					<img src="${pageContext.request.contextPath }/resources/assets/images/logo.png" alt="image">
				</a>
			</div>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav">
					<li class="nav-item ${homePage ? ' active':''}">
						<a class="nav-link" href="<c:url value="/"/>">Home</a>
					</li>
					<li class="nav-item ${fn:indexOf(url, 'rooms') > -1 ? ' active':''}">
						<a class="nav-link" href="<c:url value="rooms"/>">Rooms</a>
					</li>
					<li class="nav-item ${fn:indexOf(url, 'about') > -1 ? ' active':''}">
						<a class="nav-link" href="<c:url value="/about"/>">About</a>
					</li>
					<li class="nav-item ${fn:indexOf(url, 'blogs') > -1 ? ' active':''}">
						<a class="nav-link" href="<c:url value="/blogs"/>">Blogs</a>
					</li>
					<li class="nav-item ${fn:indexOf(url, 'contact') > -1 ? ' active':''}">
						<a class="nav-link" href="<c:url value="/contact"/>">Contact Us</a>
					</li>
					<li class="nav-item ${fn:indexOf(url, 'faq') > -1 ? ' active':''}">
						<a class="nav-link" href="<c:url value="/faqs"/>">FAQs</a>
					</li>
				</ul>
				<div class="navbar-nav float-right">
					<a class="btn btn-success" href="<c:url value="/rooms"/>">
						<i class="fa fa-plus-square m-r-7"></i>
						Book Now
					</a>
					<div class="modal fade" id="SubmitHotel">
						<div class="modal-dialog">
							<div class="modal-content">
								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">Submit Hotel</h4>
									<button type="button" class="close" data-dismiss="modal">
										<i class="fa fa-times"></i>
									</button>
								</div>
								<!-- Modal body -->
								<div class="modal-body">
									<form class="form-row">
										<div class="form-group col-lg-6">
											<input type="text" placeholder="Hotel Name*" class="form-control" />
										</div>
										<div class="form-group col-lg-6">
											<input type="text" placeholder="Hotel Website*" class="form-control" />
										</div>
										<div class="form-group col-lg-6">
											<input type="text" placeholder="Phone No.*" class="form-control" />
										</div>
										<div class="form-group col-lg-6">
											<div class="select_cart_down">
												<select class="form-control large_fild select_height48">
													<option>Type of lodging</option>
													<option>1</option>
													<option>2</option>
													<option>3</option>
												</select>
											</div>
										</div>
										<div class="form-group col-lg-6">
											<input type="text" placeholder="Hotel Website*" class="form-control" />
										</div>
										<div class="form-group col-lg-6">
											<input type="text" placeholder="Postcode*" class="form-control" />
										</div>
										<div class="form-group col-lg-6">
											<input type="text" placeholder="City*" class="form-control" />
										</div>
										<div class="form-group col-lg-6">
											<input type="text" placeholder="State*" class="form-control" />
										</div>
										<div class="form-group col-lg-12">
											<div class="select_cart_down">
												<select class="form-control large_fild select_height48">
													<option>Country</option>
													<option>UK</option>
													<option>Colombia</option>
													<option>China</option>
												</select>
											</div>
										</div>
										<div class="form-group col-lg-12 m-0">
											<textarea placeholder="Address*" class="form-control textaria_height"></textarea>
										</div>
										<div class="form-group col-lg-12 roomtype_images m-0">
											<input type="file" accept=".xlsx,.xls,image/*,.doc,audio/*,.docx,video/*,.ppt,.pptx,.txt,.pdf" multiple>
										</div>
									</form>
								</div>
								<!-- Modal footer -->
								<div class="modal-footer text-right border-0">
									<!--<button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>-->
									\
									<input type="submit" value="Submit" class="btn btn-success" />
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</nav>
</header>
<!-- Login Modal -->

<!-- Login Modal End -->