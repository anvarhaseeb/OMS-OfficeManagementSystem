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
<jsp:include page="pages/Header2.jsp" />
       <br>
<jsp:include page="pages/Sidebar2.jsp" />
<br>
<div class="content">
<div class="container mt-3" style="height: auto ;background:#95959513 ;padding: 20px;"> 

<div style="margin-bottom: 5px; border-bottom: 5px solid green;">
   <h2 class="mt-2">Add Department</h2>
 </div >
<form action="DeptAddServ" method="post">
        <div class="mb-3 mt-3">
        <input type="submit" class="btn btn-primary" value="Submit"></div>


        
        <div class="row mb-3">
            <label for="deptid" class="col-2 col-form-label">Department id :</label>
            <div class="col-3">
                <input type="text" name="deptid" class="form-control" id="deptid">				
            </div>
            
            <div class="col-1"></div>
            
            <label for="deptname" class="col-2 col-form-label">Department Name :</label>
            <div class="col-3">
                <input type="text" name="deptname" class="form-control" id="deptname">	
            </div>
        </div>
    </form>
    </div>
    </div>
</body>
</html>
