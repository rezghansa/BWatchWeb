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
<title>Show All Advertisments</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Student ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Course</th>
                <th>Year</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${jobs}" var="job">
                <tr>
                    <td><c:out value="${job.jobId}" /></td>
                    <td><c:out value="${job.jobtitle}" /></td>
                    <td><c:out value="${job.jobtitle}" /></td>
                    <td><c:out value="${job.jobtitle}" /></td>
                    <td><c:out value="${job.jobtitle}" /></td>
                    <td><a
                        href="AdvertismentController.do?action=edit&jobId=<c:out value="${student.jobId }"/>">Update</a></td>
                    <td><a
                        href="AdvertismentController.do?action=delete&jobId=<c:out value="${student.jobId }"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="AdvertismentController.do?action=insert">Add Student</a>
    </p>
</body>
</html>
