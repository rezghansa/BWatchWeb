<%@page import="bwatch.JobClass"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Blackwatch Internationals Pvt Ltd</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords" content="">
<meta name="description" content="">
<!-- stylesheet css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/nivo-lightbox.css">
<link rel="stylesheet" href="css/nivo_themes/default/default.css">
<link rel="stylesheet" href="css/intense-style.css">
</head>
<body data-spy="scroll" data-target=".navbar-collapse" id="top">
<!-- navigation -->
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon icon-bar"></span> <span class="icon icon-bar"></span> <span class="icon icon-bar"></span></button>
       <a href="index.html"><img src="images/logofinal.jpg" class="img-responsive"/></a></div>
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
<!-- search results display -->
<div id="searchMID"> 
    <div class="container">
    <% ArrayList<JobClass> list = (ArrayList<JobClass>) request.getAttribute("joblist");  
        for(JobClass category : list) {
            if(category.getJobStatus().equalsIgnoreCase("A")){
     %>
        <div class="jumbotron jumbotron_available">
            <h1 class="display-3"><% out.println(category.getJobtitle()); %> --
                <% out.println(category.getJobPosition()); %> <% out.println(category.getJobSalary());%>
            </h1>
            <p>in <% out.println(category.getJobCountry()); %> </p>
            <p class="lead"><% out.println(category.getJobDescription()); %></p>
            <hr class="my-4">
            <p><% out.println(category.getJobFeatures());%></p>
           
            <form action="ApplyForPosition" method="post">
            <p class="lead">
                <input type="hidden" name="jobId" value="<%= category.getJobId() %>">
              <button class="btn btn-primary btn-lg" href="#" role="button">Apply for this Position</button>
            </p>
            </form>
            
        </div>
        <div class="container">
            <div class="row">
              <div class="col-md-1 col-sm-1"></div>
              <div class="col-md-10 col-sm-10">
                <hr>
              </div>
              <div class="col-md-1 col-sm-1"></div>
            </div>
        </div>
     <%  
            }else if(category.getJobStatus().equalsIgnoreCase("P")){
     %>
         <div class="jumbotron jumbotron_pending">
            <h1 class="display-3"><% out.println(category.getJobtitle()); %> --
                <% out.println(category.getJobPosition()); %> <% out.println(category.getJobSalary());%>
            </h1>
            <p>in <% out.println(category.getJobCountry()); %> </p>
            <p class="lead"><% out.println(category.getJobDescription()); %></p>
            <hr class="my-4">
            <p><% out.println(category.getJobFeatures());%></p>
            <p class="lead">
                Processing Vacancy not open to apply
            </p>
        </div>
        <div class="container">
            <div class="row">
              <div class="col-md-1 col-sm-1"></div>
              <div class="col-md-10 col-sm-10">
                <hr>
              </div>
              <div class="col-md-1 col-sm-1"></div>
            </div>
        </div>  
     <%
            }else if(category.getJobStatus().equalsIgnoreCase("F")){
     %>
         <div class="jumbotron jumbotron_complete">
            <h1 class="display-3"><% out.println(category.getJobtitle()); %> --
                <% out.println(category.getJobPosition()); %> <% out.println(category.getJobSalary());%>
            </h1>
            <p>in <% out.println(category.getJobCountry()); %> </p>
            <p class="lead"><% out.println(category.getJobDescription()); %></p>
            <hr class="my-4">
            <p><% out.println(category.getJobFeatures());%></p>
            <p class="jumbotron_complete_lead">
              *Closed and Successfully Complete Job. You can not apply for this
            </p>
        </div>
        <div class="container">
            <div class="row">
              <div class="col-md-1 col-sm-1"></div>
              <div class="col-md-10 col-sm-10">
                <hr>
              </div>
              <div class="col-md-1 col-sm-1"></div>
            </div>
        </div>   
     <%
            }
        }
    %>
    </div>
</div>
<!-- divider section -->
<div class="container">
  <div class="row">
    <div class="col-md-1 col-sm-1"></div>
    <div class="col-md-10 col-sm-10">
      <hr>
    </div>
    <div class="col-md-1 col-sm-1"></div>
  </div>
</div>
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
<!-- scrolltop section --> 
<a href="#top" class="go-top"><i class="fa fa-angle-up"></i></a> 
<!-- javascript js --> 
<script src="js/jquery.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/nivo-lightbox.min.js"></script> 
<script src="js/smoothscroll.js"></script> 
<script src="js/jquery.nav.js"></script> 
<script src="js/isotope.js"></script> 
<script src="js/imagesloaded.min.js"></script> 
<script src="js/custom.js"></script>    

</body>
</html>
