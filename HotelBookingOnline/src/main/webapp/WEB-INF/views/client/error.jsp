<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ include file="/common/taglib.jsp"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url var="resources" value="/resources" />
<tg:breadcrumb title1="Error" title2="NoRoomAvailable" />
<section class="padding_75">
	<div class="container">
		<div class="row">
			<div class="col-lg-6 col-md-6 ">
				<h3>Access Denied to Admin Panel</h3>
				${msg} <br> <a href="room-detail/${roomtype }"> Back Room DeTails </a> ||
				<a href="/rooms"> Back Room Type </a>
			</div>

		</div>
	</div>
</section>