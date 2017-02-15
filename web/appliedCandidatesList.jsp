<%-- 
    Document   : advertisment
    Created on : Feb 14, 2017, 9:36:17 AM
    Author     : hansa
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="bwatch.DbUtil"%>
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
        <li><a href="AdminPanel.jsp" class="smoothScroll">Add Vacancies</a></li>
        <li><a href="appliedCandidatesList.jsp" class="smoothScroll">Applied Candidates</a></li>
        <a href="userHome.html"><img src="images/user.png"/></a>
      </ul>
    </div>
    
       <h1>Applied Candidates Report</h1>
       <table>
        <thead>
            <td><center><b>Candidate Name</b></td>
            <td><center><b>Telephone</b></center></td>
            <td><center><b>Position</b></center></td>
            <td><center><b>Country</b></center></td>
            <td><center><b>Title</b></center></td>
            <td><center><b>Job Id</b></center></td>
        </thead>
        <tbody>
        <%
            try
            {
                    DbUtil dbconn=new DbUtil();
                  
                    String sqlString = "select u.FullName as full,u.telephone as tel,j.jobPosition as posi,j.jobCountry as con,j.jobtitle as til,j.jobId as jobId from jobsbyuser ju,jobs as j, userlogin as u where (ju.jobId = j.jobId and u.uId = ju.userId) and j.jobFlag != 1 and j.jobStatus != 'F'";
                    
                    ResultSet rs=DbUtil.readData(sqlString);

                    if(!rs.isBeforeFirst())
                    {
                        %>
                            <tr>
                            <td colspan="3"><center><%out.print("No Candidates Applied"); %></center></td>
                            </tr>
                        <%
                    }    

                    while(rs.next())
                    {   
                %>
                        <tr>
                            <td><center><%out.print(rs.getString("full")); %></center></td>
                            <td><center><%out.print(rs.getString("tel")); %></center></td>
                            <td><center><%out.print(rs.getString("posi")); %></center></td>
                            <td><center><%out.print(rs.getString("con")); %></center></td>
                            <td><center><%out.print(rs.getString("til")); %></center></td>
                            <td><center><%out.print(rs.getString("jobId")); %></center></td>
                        </tr>
                <%
                    }
                %>
                <%
                                rs.close();
                        }catch(Exception e){e.printStackTrace();}    
                        
                    %>
      </tbody>
       </table>
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