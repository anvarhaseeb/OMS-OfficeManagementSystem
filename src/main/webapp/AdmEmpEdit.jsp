<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<title>OMS</title>
</head>

<body class="bg-light">

	<jsp:include page="pages/Header2.jsp" />
	<br>
	<jsp:include page="pages/Sidebar2.jsp" />
	<div class="content ">

		<div class="container mt-5 txt-wght "
			style="height: auto; background: #95959513; padding: 20px;">


			<div style="margin-bottom: 5px; border-bottom: 5px solid green;">
				<h2 class="mt-2">Edit Employee</h2>
			</div>

			<form method="post" action="AdmEditEmp">
				<input type="submit" class="btn btn-primary" value="Edit">

				<div class="row mb-3 mt-3">
					<label for="empid" class="col-2 col-form-label">Employee ID
						:</label>
					<div class="col-3">
						<input type="text" class=" form-control" name="empid" id="emp" />
					</div>
				</div>
				<br>

				<div class="row mb-3 mt-3">
					<label for="empname" class="col-2  col-form-label">Employee
						Name : </label>

					<div class="col-3">
						<input type="text" class=" form-control" name="empname"
							id="empname" />
					</div>

					<div class="col-1"></div>
					<label for="dob" class="col-2 col-form-label">Date of Birth
						:</label>
					<div class="col-3">
						<input type="date" class="form-control" name="dob" id="dob" />
					</div>
				</div>

				<div class="row mb-3">
					<label for="qf" class="col-2 col-form-label">Qualification
						:</label>
					<div class="col-3">
						<input type="text" class="form-control" name="qlf" id="qlf" />
					</div>
					<div class="col-1"></div>
					<label for="phn" class="col-2 col-form-label">Phone Number
						:</label>
					<div class="col-3">
						<input type="number" class="form-control" name="phn" id="phn" />
					</div>
				</div>

				<div class="row mb-3">


					<label for="email" class="col-2 col-form-label">Email :</label>
					<div class="col-3">
						<input type="email" class="form-control" name="email" id="email" />
					</div>
					<div class="col-1"></div>
					<label for="exp" class="col-2 col-form-label">Years of
						Experience :</label>
					<div class="col-3">
						<input type="text" class="form-control" name="exp" id="exp" />
					</div>
				</div>

				<div class="row mb-3">

					<label for="cmpname" class="col-2 col-form-label">Previous
						Company Name :</label>
					<div class="col-3">
						<input type="text" class="form-control" name="cmpname"
							id="cmpname" />
					</div>
					<div class="col-1"></div>
					<label for="add" class="col-2 col-form-label">Address :</label>
					<div class="col-3">
						<input type="text" class="form-control" name="add" id="add" />
					</div>
					</div>
					<div class="row mb-3">
						<label for="doj" class="col-2 col-form-label">Date Of
							Joining :</label>
						<div class="col-3">
							<input type="date" class="form-control" name="doj" id="doj" />
						</div>
						<div class="col-1"></div>
						<label for="dept" class="col-2">Department:</label>
						<div class="col-3">
							<select class="form-select" name="dept" id="dept"
								>
						
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
</html> --%>