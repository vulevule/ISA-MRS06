<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="utf-8">
		<title>Theaterize</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
		<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet" >      
		<link href="<c:url value="/resourcse/bootstrap/css/bootstrap-responsive.min.css"/>" rel="stylesheet">
		
		<link href="<c:url value="/resources/themes/css/bootstrappage.css"/>" rel="stylesheet">
		
		<!-- global styles -->
		<link href="<c:url value="/resources/themes/css/flexslider.css"/>" rel="stylesheet"/>
		<link href="<c:url value="/resources/themes/css/main.css"/>" rel="stylesheet" />

		<!-- scripts -->
		<script src="<c:url value="/resources/themes/js/jquery-1.7.2.min.js"/>"> </script>
		<script src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>				
		<script src="<c:url value="/resources/themes/js/superfish.js"/>"> </script>	
		<script src="<c:url value="/resources/themes/js/jquery.scrolltotop.js"/>"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
</head>
<body>
<div id="top-bar" class="container">
			<div class="row">
				<div class="span4">
					<form method="POST" class="search_form">
						<input type="text" class="input-block-level search-query" Placeholder="eg. T-sirt">
					</form>
				</div>
				<div class="span8">
					<div class="account pull-right">
						<ul class="user-menu">				
							<li><a href="#">My Account</a></li>
							<li><a href="cart.html">Your Cart</a></li>
							<li><a href="checkout.html">Checkout</a></li>					
							<li><a href="register.html">Login</a></li>		
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div id="wrapper" class="container">
			<section class="navbar main-menu">
				<div class="navbar-inner main-menu">				
					<a href="index.html" class="logo pull-left"><img src="<c:url value="resources/themes/images/logo.png"/>" class="site_logo" alt=""></a>
					<nav id="menu" class="pull-right">
						<ul>
							<li><a href="./products.html">Thematic Props</a>					
								<ul>
									<li><a href="./products.html">Add</a></li>									
									<li><a href="./products.html">Change</a></li>
									<li><a href="./products.html">Remove</a></li>									
								</ul>
							</li>															
							<li><a href="./products.html">Reservation</a></li>			
							<li><a href="./products.html">Ad</a>
								<ul>									
									<li><a href="./products.html">List</a></li>
									<li><a href="./products.html">Bids</a></li>
								</ul>
							</li>							
						</ul>
					</nav>
				</div>
			</section>
			
			
			<section class="main-content">
				<div class="row">
					<div class="span12">													
						<div class="row">
							<div class="span12">
								<h4 class="title">
									<span class="pull-left"><span class="text"><span class="line">Cinema and theater list</span></span></span>
									<span class="pull-right">
										<a class="left button" href="#myCarousel" data-slide="prev"></a><a class="right button" href="#myCarousel" data-slide="next"></a>
									</span>
								</h4>
								<div id="myCarousel" class="myCarousel carousel slide">
									<div class="carousel-inner">
										<div class="active item">
											<ul class="thumbnails">												
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="product_detail.html"><img src="resources/themes/images/cinemas/croped.jpg" alt="" /></a></p>
														<a href="product_detail.html" class="title">Cinema1</a><br/>
														<a href="products.html" class="category">Novi Sad</a>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<span class="sale_tag"></span>
														<p><a href="product_detail.html"><img src="resources/themes/images/cinemas/croped1.jpg" alt="" /></a></p>
														<a href="product_detail.html" class="title">Cinema2</a><br/>
														<a href="products.html" class="category">Subotica</a>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<p><a href="product_detail.html"><img src="resources/themes/images/cinemas/croped2.jpg" alt="" /></a></p>
														<a href="product_detail.html" class="title">Cinema3</a><br/>
														<a href="products.html" class="category">Beograd</a>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<p><a href="product_detail.html"><img src="resources/themes/images/cinemas/croped3.jpg" alt="" /></a></p>
														<a href="product_detail.html" class="title">Cinema4</a><br/>
														<a href="products.html" class="category">Las Vegas</a>
													</div>
												</li>
											</ul>
										</div>
										<div class="item">
											<ul class="thumbnails">
												<li class="span3">
													<div class="product-box">
														<p><a href="product_detail.html"><img src="resources/themes/images/cinemas/croped4.jpg" alt="" /></a></p>
														<a href="product_detail.html" class="title">Cinema5</a><br/>
														<a href="products.html" class="category">London</a>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<p><a href="product_detail.html"><img src="resources/themes/images/cinemas/croped5.jpg" alt="" /></a></p>
														<a href="product_detail.html" class="title">Cinema6</a><br/>
														<a href="products.html" class="category">New York</a>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<p><a href="product_detail.html"><img src="resources/themes/images/cinemas/croped.jpg" alt="" /></a></p>
														<a href="product_detail.html" class="title">Cinema7</a><br/>
														<a href="products.html" class="category">Paris</a>
													</div>
												</li>
												<li class="span3">
													<div class="product-box">
														<p><a href="product_detail.html"><img src="resources/themes/images/cinemas/croped2.jpg" alt="" /></a></p>
														<a href="product_detail.html" class="title">Cinema8</a><br/>
														<a href="products.html" class="category">Dubai</a>
													</div>
												</li>																																	
											</ul>
										</div>
									</div>							
								</div>
							</div>						
						</div>
						<br/>
						
						
						<div class="row feature_box">						
							<div class="span4">
								<div class="service">
									<div class="responsive">	
										<img src="resources/themes/images/feature_img_2.png" alt="" />
										<h4>MODERN <strong>DESIGN</strong></h4>
										<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>									
									</div>
								</div>
							</div>
							<div class="span4">	
								<div class="service">
									<div class="customize">			
										<img src="resources/themes/images/feature_img_1.png" alt="" />
										<h4>FREE <strong>SHIPPING</strong></h4>
										<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>
									</div>
								</div>
							</div>
							<div class="span4">
								<div class="service">
									<div class="support">	
										<img src="resources/themes/images/feature_img_3.png" alt="" />
										<h4>24/7 LIVE <strong>SUPPORT</strong></h4>
										<p>Lorem Ipsum is simply dummy text of the printing and printing industry unknown printer.</p>
									</div>
								</div>
							</div>	
						</div>		
					</div>				
				</div>
			</section>
			
			<section id="footer-bar">
				<div class="row">
					<div class="span3">
						<h4>Navigation</h4>
						<ul class="nav">
							<li><a href="./index.html">Homepage</a></li>  
							<li><a href="./about.html">About Us</a></li>
							<li><a href="./contact.html">Contac Us</a></li>
							<li><a href="./cart.html">Your Cart</a></li>
							<li><a href="./register.html">Login</a></li>							
						</ul>					
					</div>
					<div class="span4">
						<h4>My Account</h4>
						<ul class="nav">
							<li><a href="#">My Account</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="#">Wish List</a></li>
							<li><a href="#">Newsletter</a></li>
						</ul>
					</div>
					<div class="span5">
						<p class="logo"><img src="resources/themes/images/logo.png" class="site_logo" alt=""></p>
						<p>Theateriza is a site for viewing and reserving tickets in cinemas and theaters.</p>
						<br/>
						<span class="social_icons">
							<a class="facebook" href="#">Facebook</a>
							<a class="twitter" href="#">Twitter</a>
							<a class="skype" href="#">Skype</a>
							<a class="vimeo" href="#">Vimeo</a>
						</span>
					</div>					
				</div>	
			</section>
			<section id="copyright">
				<span>Copyright 2018 All right reserved.</span>
			</section>
		</div>
		<script src="resources/themes/js/common.js"></script>
		<script src="resources/themes/js/jquery.flexslider-min.js"></script>
		<script type="text/javascript">
			$(function() {
				$(document).ready(function() {
					$('.flexslider').flexslider({
						animation: "fade",
						slideshowSpeed: 4000,
						animationSpeed: 600,
						controlNav: false,
						directionNav: true,
						controlsContainer: ".flex-container" // the container that holds the flexslider
					});
				});
			});
		</script>
</body>
</html>