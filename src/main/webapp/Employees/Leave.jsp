<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                <h2>Apply Leaves</h2>
            </div>
            <form action="ApplyLeaves" method="post">
                <div class="mb-3 mt-3">
                    <input type="submit" class="btn btn-primary" value="Apply">
                    <input type="hidden" name="empid" value="${requestScope.empid}">
                </div>

                <div class="row mb-3">
                    <label for="from" class="col-2 col-form-label">From:</label>
                    <div class="col-3">
                        <input type="date" name="from" class="form-control" id="from">
                    </div>
                    <div class="col-1"></div>
                    <label for="to" class="col-2 col-form-label">To:</label>
                    <div class="col-3">
                        <input type="date" name="to" class="form-control" id="to">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="deptid" class="col-2 col-form-label">Type:</label>
                    <div class="col-3">
                        <select name="type" class="form-select" id="type">
                            <option value="casual">Casual</option>
                            <option value="sick">Sick leave</option>
                        </select>
                    </div>
                    <div class="col-1"></div>
                    <label for="reason" class="col-2 col-form-label">Reason:</label>
                    <div class="col-3">
                        <textarea name="reason" class="form-control" id="reason" rows="4"></textarea>
                    </div>
                </div>
            </form>
            <br>
            
        </div>
    </div>
</body>
</html>
