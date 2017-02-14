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
<title>BWatch Admin</title>
</head>
<body>
    
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
</body>
</html>
