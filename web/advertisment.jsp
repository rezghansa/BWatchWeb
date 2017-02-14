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
 
<title>Process Advertisment</title>
</head>
<body>
    <form action="AdvertismentController" method="post">
        <fieldset>
            <div>
                <label for="studentId">Job ID</label> <input type="text"
                    name="studentId" value="<c:out value="${job.jobId}" />"
                    readonly="readonly" placeholder="Advertisment ID" />
            </div>
            <div>
                <label for="firstName">Title Name</label> <input type="text"
                    name="firstName" value="<c:out value="${job.jobtitle}" />"
                    placeholder="First Name" />
            </div>
            <div>
                <label for="lastName">Position Name</label> <input type="text"
                    name="lastName" value="<c:out value="${job.jobPosition}" />"
                    placeholder="Last Name" />
            </div>
            <div>
                <label for="course">Description</label> <input type="text" name="course"
                    value="<c:out value="${job.jobDescription}" />" placeholder="Course" />
            </div>
            <div>
                <label for="year">Country</label> <input type="text" name="year"
                    value="<c:out value="${job.jobCountry}" />" placeholder="Year" />
            </div>
            <div>
                <label for="year">Category</label> <input type="text" name="year"
                    value="<c:out value="${job.jobCategory}" />" placeholder="Year" />
            </div>
            <div>
                <label for="year">Salary</label> <input type="text" name="year"
                    value="<c:out value="${job.jobSalary}" />" placeholder="Year" />
            </div>
            <div>
                <label for="year">Features or Job Options</label> <input type="text" name="year"
                    value="<c:out value="${job.jobFeatures}" />" placeholder="Year" />
            </div>
            <div>
                <label for="year">Job Status(A-Active/P-Pending/F-Finished)</label> <input type="text" name="year"
                    value="<c:out value="${job.jobStatus}" />" placeholder="Year" />
            </div>
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>
</body>
</html>