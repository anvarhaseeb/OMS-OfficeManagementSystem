<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>

<title>OMS</title>
</head>

<body class="bg-light" >

<jsp:include page="pages/Header2.jsp" />
<jsp:include page="pages/Sidebar2.jsp" />
    <div class="content ">
<div class="container bg-light p-3 mt-3" > 

</div>

<br>
<div class="container mt-3" style="height: auto ;background:#95959513 ;padding: 20px;"> 

<div style="margin-bottom: 5px; border-bottom: 5px solid green;">
   <h2 class="mt-2"> ${requestScope.action} Employee</h2>
 </div >
 <br>
<form method="post" action="EmpAddServ">


        <div class="mb-3 mt-3">	
        <input type="submit" class="btn btn-primary" value="Submit" >
        <input type="hidden" name="action" value="${requestScope.action}">
        <input type="hidden" name="empida" value="${requestScope.empida}">
        </div>
        

   						<div class="row mb-3">
                                <label for="empid" class="col-2 col-form-label">Employee ID :</label>
                                <div class="col-3">
                                    <input type="text"  class=" form-control"  name="empid" id="emp" readonly/>
                                </div>
                           
                                <div class="col-1"></div>
                                <label for="empname"  class="col-2  col-form-label">Employee Name : </label>
                                
                                <div class="col-3">
                                          <input type="text"   class=" form-control" name="empname" id="empName"
                                          value="${datalist[0].empname}"    />      
                                </div>
                            </div>
                            
						    <div class="row mb-3">
						   <label for="dob" class="col-2 col-form-label">Date of Birth :</label>
						   <div class="col-3">
						       <input type="date" class="form-control" name="dob" id="dob" value="${datalist[0].dob}"/>
						   </div>
						   <div class="col-1"></div>
						   <label for="qf" class="col-2 col-form-label">Qualification :</label>
						   <div class="col-3">
						       <input type="text" class="form-control" name="qlf" id="qlf" value="${datalist[0].qlf}"/>
						   </div>
						</div>
						
						<div class="row mb-3">
						   <label for="phn" class="col-2 col-form-label">Phone Number :</label>
						   <div class="col-3">
						   <input type="tel" class="form-control" name="phn" id="phn"value="${datalist[0].phn}" />
  						 </div>
						   <div class="col-1"></div>
						   <label for="email" class="col-2 col-form-label">Email :</label>
						   <div class="col-3">
						       <input type="email" class="form-control" name="email" id="email"value="${datalist[0].email}"/>
						   </div>
						</div>
						
						<div class="row mb-3">
						   <label for="exp" class="col-2 col-form-label">Years of Experience :</label>
						   <div class="col-3">
						       <input type="number"  class="form-control" name="exp" id="exp" value="${datalist[0].exp}"/>
						   </div>
						   <div class="col-1"></div>
						   <label for="cmpname" class="col-2 col-form-label">Previous Company Name :</label>
						   <div class="col-3">
						       <input type="text" class="form-control" name="cmpname" id="cmpname"/>
						   </div>
						</div>
						
						<div class="row mb-3">
						   <label for="add" class="col-2 col-form-label">Address :</label>
						   <div class="col-3">
						       <input type="text" class="form-control" name="add" id="add" value="${datalist[0].add}"/>       
						   </div>
						   <div class="col-1"></div>
						   <label for="doj" class="col-2 col-form-label">Date Of Joining :</label>
						   <div class="col-3">
						       <input type="date" class="form-control" name="doj" id="doj" value="${datalist[0].doj}"/>
						   </div>
						</div>
						
<div class="row mb-3">
    <label for="dept" class="col-2">Department:</label>
    <div class="col-3">
        <select class="form-select"  name="dept" id="dept" >
        <option value="">--choose--</option>
            <c:forEach items="${DepartmentList}" var="s">
                <option value="${s.id}">${s.deptname}</option>
            </c:forEach>
        </select>
    </div>
</div>
					    
</form>
</div>
</div>
</body>

</html>