<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Results</title>
    <link rel="stylesheet" href="styles.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-light">

    <jsp:include page="pages/Header2.jsp" />
    <br>
    <jsp:include page="pages/Sidebar2.jsp" />
    <div class="content ">

        <div class="mt-5">

            <div style="margin-bottom: 5px; border-bottom: 5px solid green;" class="mb-3">

   			 <h2 class="mt-2">Search Results</h2>

            </div>
			</div>
   <div class="row mb-3">
	<div class="col-3">
                <a class="btn btn-secondary" href="AdminHome.jsp">cancel</a>
               </div>
               </div>
            <c:if test="${not empty searchResults}">
                <div class="table-responsive">
          <table class="table  table-hover">
                    <thead class="table-primary text-white" >
                        <tr>
                            <tr>
                                <th style="width: 10%;">Employee ID</th>
                                <th style="width: 15%;">Employee Name</th>
                                <th style="width: 10%;">Date of Birth</th>
                                <th style="width: 10%;">Qualification</th>
                                <th style="width: 10%;">Phone Number</th>
                                <th style="width: 15%;">Email</th>
                                <th style="width: 10%;">Years of Experience</th>

                                <th style="width: 15%;">Address</th>
                                <th style="width: 10%;">Date of Joining</th>
                                <th style="width: 10%;">Department</th>
                                <th>Edit</th>
                                <th>Salary</th>
                                <th>Leave Data</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${searchResults}" var="employee">
                                <tr>
                                    <td>${employee.empid}</td>
                                    <td>${employee.empname}</td>
                                    <td>${employee.dob}</td>
                                    <td>${employee.qlf}</td>
                                    <td>${employee.phn}</td>
                                    <td>${employee.email}</td>
                                    <td>${employee.exp}</td>

                                    <td>${employee.add}</td>
                                    <td>${employee.doj}</td>
                                    <td>${employee.dept}</td>
                                    <td>
                                        <a href="SearchtoEdit?action=editform&empida=${employee.empid}" >
                                            <i class="fa fa-pen"></i>
                                        </a>
                                    </td>
                                    <td>
                                        <a href="salaryDisplayC?empida=${employee.empid}">
                                            <i class="fa fa-dollar"></i>
                                        </a>
                                    </td>
                                    <td>
                                    <a href="AdmLeaveEmp?empida=${employee.empid}">
                                           <i class="fa fa-book" aria-hidden="true"></i>
                                           </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </c:if>

            <c:if test="${empty searchResults}">
                 <h3 style="color:red">No results found.</h3>
            </c:if>

            
   
        </div>
    </div>
</body>
</html>
