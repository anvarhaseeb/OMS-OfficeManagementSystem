<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
	<br>
	<div class="content">
		<div class="container mt-3"
			style="height: auto; background: #95959513; padding: 20px;">

			<div style="margin-bottom: 5px; border-bottom: 5px solid green;">
				<h2 class="mt-2">Employee Login Creation</h2>
			</div>
			<form action="AdmEmpLog" method="post">
				<div class="mb-3 mt-3">
					<input type="submit" class="btn btn-primary" value="Submit">
				</div>

				<div class="row mb-3">
					<label for="empid" class="col-2 col-form-label">Employee id
						:</label>
					<div class="col-3">
						<input type="text" name="empid" class="form-control" id="empid" required>
					</div>
				</div>

				<div class="row mb-3">
					<label for="username" class="col-2 col-form-label">Username
						:</label>
					<div class="col-3">
						<input type="text" name="username" class="form-control"
							id="username" required>
					</div>
					<div class="col-1"></div>

					<label for="psswd" class="col-2 col-form-label">Password :</label>
					<div class="col-3">
						<input type="text" name="psswd" class="form-control" id="psswd" required>
					</div>
				</div>
			</form>

			<c:if test="${not empty errorMessage}">
				<div class="alert alert-danger alert-dismissible fade show"
					role="alert">
					${errorMessage}
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
			</c:if>

			<c:if test="${not empty successMessage}">
				<div class="alert alert-success alert-dismissible fade show"
					role="alert">
					${successMessage}
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
			</c:if>
		</div>
	</div>
</body>
</html>
