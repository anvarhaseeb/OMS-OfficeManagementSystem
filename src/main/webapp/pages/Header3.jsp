<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OMS</title>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div>
    <!-- Horizontal Navbar -->
    <nav class="navbar navbar-expand-md   navbarbg ">
        <div class="container">
            <span class="navbar-brand mb-0 h1 "
                style="color: white; letter-spacing: 5px; border-radius: 25px;">OMS</span>

            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav mr-auto">

                    <li class="nav-item dropdown"><a
                        class="nav-link dropdown-toggle" href="#" id="dropdown2"
                        data-toggle="dropdown"> Features </a>
                        <div class="dropdown-menu" aria-labelledby="dropdown2">
                            <a class="dropdown-item"
                                href="EmployeeProfile?empid=${requestScope.empid}">View Profile</a>
                            <a class="dropdown-item" href="LeaveC?empid=${requestScope.empid}">Apply Leaves</a>
                        </div>
                    </li>
  
                    <li class="nav-item">
                        <a class="nav-link" href="LeaveStatus?empid=${requestScope.empid}">Leave Status</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>