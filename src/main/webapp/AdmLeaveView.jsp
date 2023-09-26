<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<head>
    <meta charset="ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
    <title>OMS</title>
</head>

<body class="bg-light">
<jsp:include page="/pages/Header2.jsp" />
<br>
<jsp:include page="/pages/Sidebar2.jsp" />

<div class="content">
<div class="container mt-5" style="height: auto ;background:#95959513 ;padding: 20px;"> 

<div style="margin-bottom: 5px; border-bottom: 5px solid green;">
   <h2 class="mt-2">Leave records</h2>
   <h3 class="text-end">The Employee: ${requestScope.empid}</h3>
 </div >
			
            <c:if test="${not empty leaveRecords}">
                <div class="row mb-3">
	             <div class="col-3">
                <a class="btn btn-secondary" href="AdminHome.jsp">cancel</a>
               </div>
               </div>
                <div class="table-responsive">
          		   <h2>Leave Records</h2>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Status</th>
                        <th>Leave id</th>
                        <th>Leave Type</th>
                        <th>From Date</th>
                        <th>To Date</th>
                        <th>Reason</th>
                        <th>Approve/Deny</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${leaveRecords}" var="record">
                        <tr>
                            <td>${record.status}</td>
                            <td>${record.leaveid}</td>
                            <td>${record.type}</td>
                             <td>${record.from}</td>
							<td>${record.to}</td>
							<td>${record.reason}</td>
							<td>
							<a class="btn btn-success" href="AdmLeaveStatus?action=approve&empida=${requestScope.empid}" >
                              Approve
                                        </a>
							<a class="btn btn-danger" href="AdmLeaveStatus?action=deny&empida=${requestScope.empid}" >
                               Deny
                                        </a>
							</td>
							                             
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
                </div>
            </c:if>

            <c:if test="${empty leaveRecords}">
            
                <h3 style="color:red">No Leaves found.</h3>
                  <div class="row mb-3">
	             <div class="col-3">
                <a class="btn btn-secondary" href="AdminHome.jsp">cancel</a>
               </div>
               </div>
             </c:if>

        </div>
    </div>
</body>
</html>
