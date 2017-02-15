<%-- 
    Document   : AdminPanel
    Created on : Feb 14, 2017, 9:38:56 AM
    Author     : hansa
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/nivo-lightbox.css">
<link rel="stylesheet" href="css/nivo_themes/default/default.css">
<link rel="stylesheet" href="css/intense-style.css">
<link rel="stylesheet" href="css/style.css">
<title>Welcome to BlackWatch Admin Panel</title>
</head>
<body>
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon icon-bar"></span> <span class="icon icon-bar"></span> <span class="icon icon-bar"></span></button>
      <a><img src="images/logofinal.jpg" class="img-responsive"/></a></div>
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav navbar-right">
       <li><a href="index.html#home" class="smoothScroll">HOME</a></li>
        <li><a href="index.html#service" class="smoothScroll">JOBS</a></li>
        <li><a href="index.html#about" class="smoothScroll">ABOUT</a></li>
        <li><a href="index.html#portfolio" class="smoothScroll">CLIENTS</a></li>
        <li><a href="index.html#pricing" class="smoothScroll">VACANCIES</a></li>
        <li><a href="index.html#contact" class="smoothScroll">CONTACT</a></li>
        <a href="userHome.html"><img src="images/user.png"/></a>
      </ul>
    </div>
  </div>
</div>
    <jsp:forward page="/AdvertismentController?action=listStudent"></jsp:forward>
    
    <!-- copyright section -->
<div class="copyright">
  <div class="container">
    <div class="row">
      <div class="col-md-12 col-sm-12">
        <p>&copy; Intense 7 . All Rights Reserved | Design: <a target="_blank" rel="nofollow" href="http://www.intense7.com">intense7</a></p>
      </div>
    </div>
  </div>
</div>
</body>
</html>
