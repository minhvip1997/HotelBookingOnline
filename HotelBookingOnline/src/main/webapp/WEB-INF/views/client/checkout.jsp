<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/common/taglib.jsp"%>
<c:url var="resources" value="/resources" />
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- inner_window_banner Start bg -->
<section>
	<div class="inner_window_banner" data-parallax="scroll" data-image-src="${resources}/assets/images/inner_banner1.jpg">
		<div class="inner_window_overlay">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="breadcrumb_parent text-center">
							<h2 class="page_title white-text">Checkout</h2>
							<ul class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="#">Home</a>
								</li>
								<li class="breadcrumb-item">
									<a href="#">Book Now</a>
								</li>
								<li class="breadcrumb-item active">Checkout</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- inner_window_banner End bg -->
<section class="padding_75">
	<div class="container">
		<div class="row checkout_yemm">
			<div class="col-12">
				<div class="pay_mathod_header">
					<strong class="total_pey">Total Amount: ${amount }</strong>
					<h4 class="float-left">Choose a Payment Method :-</h4>
					<div class="dic_msg clear">Hurry! Avail 10% cashback upto INR50 now, pay via Freecharge Wallet. TnC apply.</div>
				</div>
				<div class="row">
					<div class="col-12">
						<div class="pay_mathod_tab">
							<div class="col-lg-3 col-md-4 col-sm-4 p-0">
								<div class="nav_tab_items">
									<ul class="nav nav-pills " id="pills-tab" role="tablist">
										<li class="nav-item">
											<a class="nav-link active" id="pills-creadit-tab" data-toggle="pill" href="#pills-creadit" role="tab" aria-controls="pills-creadit"
												aria-selected="true">Credit Card</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" id="pills-dabit-tab" data-toggle="pill" href="#pills-dabit" role="tab" aria-controls="pills-dabit"
												aria-selected="false">Debit Card</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" id="pills-paypal-tab" data-toggle="pill" href="#pills-paypal" role="tab" aria-controls="pills-paypal"
												aria-selected="false">Paypal</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" id="pills-netbanking-tab" data-toggle="pill" href="#pills-netbanking" role="tab" aria-controls="pills-netbanking"
												aria-selected="false">Net Banking</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" id="pills-wallets-tab" data-toggle="pill" href="#pills-wallets" role="tab" aria-controls="pills-wallets"
												aria-selected="false">Wallets</a>
										</li>
									</ul>
								</div>
							</div>
							<div class="col-lg-9 col-md-8 col-sm-8">
								<div class="tab-content" id="pills-tabContent">
									<div class="tab-pane fade show active" id="pills-creadit" role="tabpanel" aria-labelledby="pills-creadit-tab">
										<s:form class="form-row" modelAttribute="invoice" action="/done" method="post">
											<div class="form-group col-sm-12">
												<label class="font-bold18 d-block">Card Type</label>
												<img src="${resources}/assets/images/payment_card.png" alt="">
											</div>
											<div class="form-group col-sm-6">
												<label class="font-bold18">Card Number</label>
												<s:input class="form-control"  path="creditcard.cardNumber"/>
											</div>
											<div class="form-group col-sm-6">
												<label class="font-bold18">Name on Card</label>
												<s:input class="form-control" path="creditcard.ownerName"/>
											</div>
											<div class="form-group col-sm-12">
												<label class="font-bold18">Expiry Date</label>
												<div class="form-row">
													<div class="col-6 select_cart_down">
														<s:select class="form-control" path="creditcard.expiryMonth">
															<s:option value="1" label="January"/>
															<s:option value="2" label="February"/>
															<s:option value="3" label="March"/>
															<s:option value="4" label="April"/>
															<s:option value="5" label="May"/>
															<s:option value="6" label="June"/>
															<s:option value="7" label="July"/>
															<s:option value="8" label="August"/>
															<s:option value="9" label="September"/>
															<s:option value="10" label="October"/>
															<s:option value="11" label="November"/>
															<s:option value="12" label="December"/>
														</s:select>
													</div>
													<div class="col-6 select_cart_down">
														<s:select class="form-control"  path="creditcard.expiryYear">
															<s:option value="2009" label="2009"/>
															<s:option value="2010" label="2010"/>
															<s:option value="2011" label="2011"/>
															<s:option value="2012" label="2012"/>
															<s:option value="2013" label="2013"/>
															<s:option value="2014" label="2014"/>
															<s:option value="2015" label="2015"/>
															<s:option value="2016" label="2016"/>
															<s:option value="2017" label="2017"/>
															<s:option value="2018" label="2018"/>
															<s:option value="2019" label="2019"/>
															<s:option value="2020" label="2020"/>
														</s:select>
													</div>
												</div>
											</div>
											<div class="form-group col-sm-12 ">
												<label class="font-bold18">CVV Number</label>
												<s:input class="form-control" path="creditcard.cvvcode"/>
											</div>
											<div class="form-group col-sm-12 ">
												<label class="font-bold18">Invoice date</label>
												<!--<s:input class="form-control" path="invoiceDate" value="${invoiceDate }" />-->
											</div>
											<s:hidden path="booking.bookingId" value="${books.bookingId }"/>
											<s:hidden path="creditcard.cardNumber" value="${card.cardNumber }"/>
											<s:hidden path="amount" value="${amount }"/>
											<!--<s:hidden path="invoiceDate" value="${invoiceDate }" />-->
											<div class="col-12 text-center">
												<p class="note_text">
													<strong>Note:</strong>
													In the next step you will be redirected to your bank's website to verify yourself.
												</p>
												<input type="submit" value="Pay Now">
											</div>
										</s:form>
									</div>
									<div class="tab-pane fade" id="pills-dabit" role="tabpanel" aria-labelledby="pills-dabit-tab">
										<s:form class="form-row" modelAttribute="invoice" action="checkout" method="post">
											<div class="form-group col-sm-12">
												<label class="font-bold18 d-block">Card Type</label>
												<img src="${resources}/assets/images/payment_card.png" alt="">
											</div>
											<div class="form-group col-sm-6">
												<label class="font-bold18">Card Number</label>
												<input class="form-control" path="creditcard.cardNumber">
											</div>
											<div class="form-group col-sm-6">
												<label class="font-bold18">Name on Card</label>
												<input class="form-control" path="creditcard.ownerName">
											</div>
											<div class="form-group col-sm-12">
												<label class="font-bold18">Expiry Date</label>
												<div class="form-row">
													<div class="col-6 select_cart_down">
														<s:select class="form-control" path="creditcard.expiryMonth">
															<s:option value="1" label="January"/>
															<s:option value="2" label="February"/>
															<s:option value="3" label="March"/>
															<s:option value="4" label="April"/>
															<s:option value="5" label="May"/>
															<s:option value="6" label="June"/>
															<s:option value="7" label="July"/>
															<s:option value="8" label="August"/>
															<s:option value="9" label="September"/>
															<s:option value="10" label="October"/>
															<s:option value="11" label="November"/>
															<s:option value="12" label="December"/>
														</s:select>
													</div>
													<div class="col-6 select_cart_down">
														<s:select class="form-control"  path="creditcard.expiryYear">
															<s:option value="2009" label="2009"/>
															<s:option value="2010" label="2010"/>
															<s:option value="2011" label="2011"/>
															<s:option value="2012" label="2012"/>
															<s:option value="2013" label="2013"/>
															<s:option value="2014" label="2014"/>
															<s:option value="2015" label="2015"/>
															<s:option value="2016" label="2016"/>
															<s:option value="2017" label="2017"/>
															<s:option value="2018" label="2018"/>
															<s:option value="2019" label="2019"/>
															<s:option value="2020" label="2020"/>
														</s:select>
													</div>
												</div>
											</div>
											<div class="form-group col-sm-12 ">
												<label class="font-bold18">CVV Number</label>
												<s:input class="form-control" path="creditcard.cvvcode"/>
											</div>
											<s:hidden path="booking.bookingId" value="${books.bookingId }"/>
											<s:hidden path="creditcard.cardNumber" value="${card.cardNumber }"/>
											<s:hidden path="amount" value="${amount }"/>
											<s:hidden path="invoiceDate" value="${invoiceDate }"/>
											<div class="col-12 text-center">
												<p class="note_text">
													<strong>Note:</strong>
													In the next step you will be redirected to your bank's website to verify yourself.
												</p>
												<input type="submit" value="Pay Now">
											</div>
										</s:form>
									</div>
									<div class="tab-pane fade" id="pills-netbanking" role="tabpanel" aria-labelledby="pills-netbanking-tab">Coming Soon</div>
									<div class="tab-pane fade" id="pills-paypal" role="tabpanel" aria-labelledby="pills-paypal-tab">
										<label class="custom-control custom-radio m-0 paypal_sec">
											<input id="radio1" name="radio" type="radio" class="custom-control-input">
											<span class="custom-control-indicator"></span>
											<span class="custom-control-description">Paypal</span>
										</label>
									</div>
									<div class="tab-pane fade" id="pills-wallets" role="tabpanel" aria-labelledby="pills-wallets-tab">Coming Soon</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>