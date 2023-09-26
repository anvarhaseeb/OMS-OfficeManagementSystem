<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
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
	
   <h2 class="mt-2"> ${requestScope.action}</h2>
 </div >
<form action="SalarytoUpdate" method="get">

        <div class="mb-3 mt-3">	
        <input type="submit" class="btn btn-primary" value="Submit" >
        <input type="hidden" name="action" value="${requestScope.action}">
        <input type="hidden" name="empida" value="${requestScope.empida}">
        </div>
  
        <div class="row mb-3">
	       <label for="salary" class="col-2 col-form-label">Salary :</label>
	       <div class="col-3">
                <input type="number" name="salary" class="form-control" id="salary" value="${salList[0].amount}">	
			</div>
            <div class="col-1"></div>
          <label for="bonus" class="col-2 col-form-label">Bonus:</label> 
         <div class="col-3">
                <input type="number" name="bonus" class="form-control" id="bonus" value="${salList[0].bonus}">	
            </div>
     	</div>
     	
              <div class="row mb-3">  
            <label for="Dsalary" class="col-2 col-form-label"> Date Of Salary :</label>
            <div class="col-3">
                <input type="date" name="Dsalary" class="form-control" id="Dsalary" value="${salList[0].SDate}">	
            </div>
            <div class="col-1"></div>
        </div>       

    </form>
    <a class="btn btn-secondary" href="AdminHome.jsp">cancel</a>
    </div>
    </div>
</body>
</html>
