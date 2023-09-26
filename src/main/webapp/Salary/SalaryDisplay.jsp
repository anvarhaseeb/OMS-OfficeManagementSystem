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
   <h2 class="mt-2">Salary Results</h2>
   <h3 class="text-end">The Employee: ${requestScope.empida}</h3>
 </div >
			
            <c:if test="${not empty salList}">
                <div class="table-responsive">
          		<table class="table  table-hover">
                    <thead class="table-primary text-white" >
                        <tr>
                            <tr>
                                <th style="width: 10%;">Employee ID</th>
                                <th style="width: 10%;">Amount</th>
                                <th style="width: 15%;">Bonus</th>
                                <th style="width: 10%;">Date Of Salary</th>
                                <th>Edit</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${salList}" var="s">
                                <tr>
                  
                                    <td>${s.empid}</td>
                                    <td>${s.amount}</td>
                                    <td>${s.bonus}</td>
									<td>${s.SDate}</td>
                                    <td>
                                        <a href="SalarytoUpdate?action=editform&empida=${requestScope.empida}">
                                            <i class="fa fa-pen"></i>
                                        </a>
                                    </td>

                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </c:if>

            <c:if test="${empty salList}">
            
                <h3 style="color:red">No results found.</h3>
 				<a class ="btn btn-warning "href="SalarytoUpdate?action=addform&empida=${requestScope.empida}">Add Salary</a>		
            </c:if>

            <a class="btn btn-secondary" href="AdminHome.jsp">cancel</a>
   
        </div>
    </div>
</body>
</html>
