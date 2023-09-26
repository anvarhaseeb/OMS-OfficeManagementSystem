<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>OMS</title>
</head>

<body class="bg-light">
    <jsp:include page="/pages/Header3.jsp" />
    <br>
    <jsp:include page="/pages/Sidebar2.jsp" />

    <div class="content">
        <div class="container mt-5" style="height: auto; background: #95959513; padding: 20px;">

            <div style="margin-bottom: 5px; border-bottom: 5px solid green;">
                <c:forEach var="profile" items="${profileList}">
                    <h2 class="mt-2">Welcome, ${profile.empName}</h2>
                </c:forEach>
            </div>

            <h1>Employee Profile</h1>
            <c:if test="${not empty profileList}">
            <c:forEach var="profile" items="${profileList}">
                <table class="table table-hover">
                    <tr>
                        <th>Employee ID</th>
                        <td>${profile.empId}</td>
                    </tr>
                    <tr>
                        <th>Employee Name</th>
                        <td>${profile.empName}</td>
                    </tr>
                    <tr>
                        <th>Date of Birth</th>
                        <td>${profile.dob}</td>
                    </tr>
                    <tr>
                        <th>Qualification</th>
                        <td>${profile.qualification}</td>
                    </tr>
                    <tr>
                        <th>Phone Number</th>
                        <td>${profile.phoneNumber}</td>
                    </tr>
                    <tr>
                        <th>Email</th>
                        <td>${profile.email}</td>
                    </tr>
                    <tr>
                        <th>Years of Experience</th>
                        <td>${profile.yearsOfExperience}</td>
                    </tr>
                    <tr>
                        <th>Previous Company Name</th>
                        <td>${profile.previousCompanyName}</td>
                    </tr>
                    <tr>
                        <th>Address</th>
                        <td>${profile.address}</td>
                    </tr>
                    <tr>
                        <th>Date of Joining</th>
                        <td>${profile.dateOfJoining}</td>
                    </tr>
                    <tr>
                        <th>Department</th>
                        <td>${profile.department}</td>
                    </tr>
                    <tr>
                        <th>Salary </th>
                        <td>${profile.salary}</td>
                    </tr>
                    <tr>
                        <th>Bonus</th>
                        <td>${profile.bonus}</td>
                    </tr>
                    <tr>
                        <th>Date of Salary</th>
                        <td>${profile.sDate}</td>
                    </tr>
                </table>
                </c:forEach>
            </c:if>

            <c:if test="${empty profileList}">
                <h3 style="color: red">No results found.</h3>
            </c:if>
        </div>

    </div>
</body>

</html>
