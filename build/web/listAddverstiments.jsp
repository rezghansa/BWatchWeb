<%-- 
    Document   : listAddverstiments
    Created on : Feb 14, 2017, 9:37:57 AM
    Author     : hansa
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>BWatch Admin</title>
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
        <li><a href="AdminPanel.jsp" class="smoothScroll">Add Vacancies</a></li>
        <li><a href="appliedCandidatesList.jsp" class="smoothScroll">Applied Candidates</a></li>
        <a href="userHome.html"><img src="images/user.png"/></a>
      </ul>
    </div>
    
    <h1>Admin Panel For Advertisment Postings</h1>
    <table>
        <thead>
            <tr>
                <th>Advertisment ID</th>
                <th>Title Name</th>
                <th>Position Name</th>
                <th>Description</th>
                <th>Country</th>
                <th>Category</th>
                <th>Salary</th>
                <th>Job Offers/Features</th>
                <th>Job Status</th>
                <th>Job Active</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${jobs}" var="job">
                <tr>
                    <td><c:out value="${job.jobId}" /></td>
                    <td><c:out value="${job.jobtitle}" /></td>
                    <td><c:out value="${job.jobPosition}" /></td>
                    <td><c:out value="${job.jobDescription}" /></td>
                    <td><c:out value="${job.jobCountry}" /></td>
                    <td><c:out value="${job.jobCategory}" /></td>
                    <td><c:out value="${job.jobSalary}" /></td>
                    <td><c:out value="${job.jobFeatures}" /></td>
                    <td><c:out value="${job.jobStatus}" /></td>
                    <td><c:out value="${job.jobFlag}" /></td>
                    <td><a
                        href="AdvertismentController?action=edit&jobId=<c:out value="${job.jobId}"/>">Update</a></td>
                    <td><a
                        href="AdvertismentController?action=delete&jobId=<c:out value="${job.jobId}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="AdvertismentController?action=insert">Add Vacancy Add</a>
    </p>
    
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
