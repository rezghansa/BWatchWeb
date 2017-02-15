<%-- 
    Document   : advertisment
    Created on : Feb 14, 2017, 9:36:17 AM
    Author     : hansa
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/nivo-lightbox.css">
<link rel="stylesheet" href="css/nivo_themes/default/default.css">
<link rel="stylesheet" href="css/intense-style.css">
<link rel="stylesheet" href="css/style.css">
<title>Process Advertisment</title>
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
        <li><a href="index.html#portfolio" class="smoothScroll">CLIENTS</a></li>
        <li><a href="index.html#pricing" class="smoothScroll">VACANCIES</a></li>
        <li><a href="appliedCandidatesList.jsp" class="smoothScroll">Applied Candidates</a></li>
        <a href="userHome.html"><img src="images/user.png"/></a>
      </ul>
    </div>
    
       <h1>Admin Panel For Advertisment Processing (Add / Edit)</h1>
    <form action="AdvertismentController" method="post">
        <fieldset>
            <div>
                <label for="jobId">Job ID</label> <input type="text"
                    name="jobId" value="<c:out value="${job.jobId}" />"
                    readonly="readonly" placeholder="jobId" />
            </div>
            <div>
                <label for="title">Title Name</label> <input type="text"
                    name="title" value="<c:out value="${job.jobtitle}" />"
                    placeholder="title" />
            </div>
            <div>
                <label for="position">Position Name</label> <input type="text"
                    name="position" value="<c:out value="${job.jobPosition}" />"
                    placeholder="position" />
            </div>
            <div>
                <label for="description">Description</label> <input type="text" name="description"
                    value="<c:out value="${job.jobDescription}" />" placeholder="description" />
            </div>
            <div>
                <label for="country">Country</label> <input type="text" name="country"
                    value="<c:out value="${job.jobCountry}" />" placeholder="country" />
            </div>
            <div>
                <label for="category">Category</label> <input type="text" name="category"
                    value="<c:out value="${job.jobCategory}" />" placeholder="category" />
            </div>
            <div>
                <label for="salary">Salary</label> <input type="text" name="salary"
                    value="<c:out value="${job.jobSalary}" />" placeholder="salary" />
            </div>
            <div>
                <label for="features">Features or Job Options</label> <input type="text" name="features"
                    value="<c:out value="${job.jobFeatures}" />" placeholder="features" />
            </div>
            <div>
                <label for="status">Job Status(A-Active/P-Pending/F-Finished)</label> <input type="text" name="status"
                    value="<c:out value="${job.jobStatus}" />" placeholder="status" />
            </div>
            <div>
                <label for="flag">Job Flag(0-Active/1-Deactive)</label> <input type="text" name="flag"
                    value="<c:out value="${job.jobFlag}" />" placeholder="flag" />
            </div>
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>
            
            
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