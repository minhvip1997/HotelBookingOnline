<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:url var="resources" value="/resources" />
<section class="user_account_content">
	<div class="user_profile_Bg"></div>
	<div class="container">
		<div class="row m-b30">
			<div class="col-lg-6">
				<div class="user_accout_pic d-flex align-items-center">
					<img src="${resources}/assets/images/client_pic.jpg" alt="">
					<h3>Adam Smith</h3>
				</div>
			</div>
			<div class="col-lg-6  text-right mt-mainus60">
				<button type="button" class="btn btn-success">
					<i class="fa fa-edit m-r-7"></i>
					Edit Cover Photo
				</button>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 account_info_widgets">
				<h4>Personal Information</h4>
				<div class="row">
					<div class="form-group col-lg-6 col-md-6 m-0">
						<input type="text" value="Adam" class="form-control gray_fild" />
					</div>
					<div class="form-group col-lg-6 col-md-6  m-0">
						<input type="text" value="Smith" class="form-control gray_fild" />
					</div>
					<div class="form-group col-lg-6 col-md-6 Gender_widgets">
						<p>Your Gender</p>
						<label class="custom-control custom-radio">
							<input name="radio" type="radio" class="custom-control-input">
							<span class="custom-control-indicator"></span>
							<span class="custom-control-description">Male</span>
						</label>
						<label class="custom-control custom-radio m-0">
							<input name="radio" type="radio" class="custom-control-input">
							<span class="custom-control-indicator"></span>
							<span class="custom-control-description">Female</span>
						</label>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 account_info_widgets">
				<div class="row">
					<div class="form-group col-lg-6 col-md-6 m-0">
						<h4>
							Email Address
							<a href="#" class="pass_link" data-toggle="modal" data-target="#change_pass">Change Password</a>
						</h4>
						<input type="text" value="info@example.com" class="form-control gray_fild" />
					</div>
					<div class="form-group col-lg-6 col-md-6  m-0">
						<h4>Phone No.</h4>
						<input type="text" value="+123 456 7890" class="form-control gray_fild" />
					</div>
					<!-- cahange Password Modal -->
					<div class="modal fade" id="change_pass">
						<div class="modal-dialog">
							<div class="modal-content">
								<!-- Modal Header -->
								<div class="modal-header">
									<h4 class="modal-title">Change Your Password</h4>
									<button type="button" class="close" data-dismiss="modal">
										<i class="fa fa-times"></i>
									</button>
								</div>
								<!-- Modal body -->
								<div class="modal-body">
									<form>
										<div class="form-group">
											<input type="password" placeholder="Old Password" class="form-control" />
										</div>
										<div class="form-group">
											<input type="password" placeholder="New Password" class="form-control" />
										</div>
										<div class="form-group">
											<input type="password" placeholder="Confirm Password" class="form-control" />
										</div>
										<div class="form-group text-right border-0 m-0">

											<input type="submit" value="Submit" class="btn btn-success" />
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
					<!-- cahange Password Modal End -->
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12 account_info_widgets">
				<h4>Address</h4>
				<div class="form-group">
					<textarea class="form-control gray_fild">489 Market St, Beaver, PA 15009, USA</textarea>
				</div>
				<div class="text-right">
					<button type="submit" class="btn btn-success btn-lg">Update</button>
				</div>
			</div>
		</div>
	</div>
</section>