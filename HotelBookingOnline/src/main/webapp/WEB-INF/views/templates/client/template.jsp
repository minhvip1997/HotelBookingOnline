<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:url var="resources" value="/resources" />
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="keywords" content="">
<meta name="description" content="">
<title>Gwesty - Hotel Booking HTML5 Responsive Template</title>
<!--FontAwesome Font Style -->
<link href="${resources}/assets/css/font-awesome4.0.min.css" rel="stylesheet">
<!-- Google-Font-->
<link href="https://fonts.googleapis.com/css?family=Lato:100,100i,300,300i,400,400i,700,700i,900,900i" rel="stylesheet">
<!--Bootstrap -->
<link rel="stylesheet" href="${resources}/assets/css/bootstrap.css" type="text/css">
<link rel="stylesheet" href="${resources}/assets/css/bootstrap-datepicker3.css" type="text/css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<!--Animate Style -->
<link rel="stylesheet" href="${resources}/assets/css/jquery.mCustomScrollbar.min.css" type="text/css">
<!--mCustomScrollbar Style -->
<link rel="stylesheet" href="${resources}/assets/css/animate.css" type="text/css">
<!--OWL Carousel slider-->
<link rel="stylesheet" href="${resources}/assets/css/owl.carousel.css" type="text/css">
<!--Flexslider-->
<link rel="stylesheet" href="${resources}/assets/css/flexslider.css" type="text/css">
<!--Image-Uploader-->
<link rel="stylesheet" href="${resources}/assets/css/imageuploadify.min.css" type="text/css">
<!--Custome Style -->
<link rel="stylesheet" href="${resources}/assets/css/style.css" type="text/css">
<!--Responsive Media Style -->
<link rel="stylesheet" href="${resources}/assets/css/media-responsive.css" type="text/css">
<script src="${resources}/assets/js/jquery-3.2.1.slim.min.js"></script>
<!-- Fav and touch icons -->
<link rel="shortcut icon" sizes="144x144"
	href="${resources}/assets/images/favicon-icon/apple-touch-icon-144-precomposed.png">
<link rel="shortcut icon" sizes="72x72" href="${resources}/assets/images/favicon-icon/apple-touch-icon-72-precomposed.png">
<link rel="shortcut icon" sizes="57x57" href="${resources}/assets/images/favicon-icon/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" sizes="24x24" href="${resources}/assets/images/favicon-icon/favicon.png">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<!-- Header Start Here -->
	<tiles:insertAttribute name="header"/>
	<!-- Header End Here -->
	<!-- Content -->
	<tiles:insertAttribute name="content"/>
	<!-- Content End -->
	<!-- Footer Start Here -->
	<tiles:insertAttribute name="footer"/>
	<!-- Footer End Here -->
	<div id="scrollToTop">
		<a href="#">
			<i class="fa fa-angle-up white-text" aria-hidden="true"></i>
		</a>
	</div>
	<!-- Scripts -->
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="${resources}/assets/js/popper.min.js"></script>
	<script src="${resources}/assets/js/bootstrap.min.js"></script>
	<%-- <script src="${resources}/assets/js/bootstrap-datepicker.min.js"></script> --%>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="${resources}/assets/js/bootstrap-slider.min.js"></script>
	<!--mCustomScrollbar-Js-->
	<script src="${resources}/assets/js/jquery.mCustomScrollbar.min.js"></script>
	<!--parallex-JS-->
	<script src="${resources}/assets/js/owl.carousel.min.js"></script>
	<!--parallax-JS-->
	<script src="${resources}/assets/js/parallax.min.js"></script>
	<!--flexslider-JS-->
	<script src="${resources}/assets/js/jquery.flexslider.js"></script>
	<!--Image-Uploader-->
	<script src="${resources}/assets/js/imageuploadify.min.js"></script>
	<!--Custom-JS-->
	<script src="${resources}/assets/js/interface.js"></script>
</body>
</html>