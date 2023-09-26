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
                <h2>Leave Status</h2>
            </div>
            <br>
            <h2>Leave Records</h2>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Status</th>
                        <th>From Date</th>
                        <th>To Date</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${leaveRecords}" var="record">
                        <tr>
                            <td>${record.status}</td>
                            <td>${record.from}</td>
                            <td>${record.to}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
