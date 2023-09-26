<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script> 

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"></head>
<body>
 <div>
          <!-- Horizontal Navbar -->
          <nav class="navbar navbar-expand-md   navbarbg ">
            <div class="container">
               <span class="navbar-brand mb-0 h1 " style="color: white;letter-spacing: 5px;border-radius: 25px;">OMS</span>
              <!--   <button class="navbar-toggler ms-auto" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                    <span class="navbar-toggler-icon"></span>
                </button> -->
                <div class="collapse navbar-collapse" id="collapsibleNavbar">
     <ul class="navbar-nav mr-auto">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle"  href="#" id="dropdown1" data-toggle="dropdown" style="background-color: #454545">
                    Features
                </a>  
                <div class="dropdown-menu" aria-labelledby="dropdown1">
                	<form method="post" action="AdminHome.jsp">
                    <button type="submit" class="dropdown-item" >Add/View Employee</button>
                    </form>
                    <a class="dropdown-item" href="AdmEmpLog.jsp">Employee Login Creation</a>
                     <!-- <a class="dropdown-item" href="AdmEmpEdit.jsp"> Edit Employee</a> -->
                      <a class="dropdown-item" href="#">Link </a>
                </div>
            </li>
                    <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="dropdown2" data-toggle="dropdown">
                   Reports
                </a>
                <div class="dropdown-menu" aria-labelledby="dropdown2">
                    <a class="dropdown-item" href="#">Link 1.1</a>
                    <a class="dropdown-item" href="#">Link 1.2</a>
                </div>
            </li>
            
                    <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="dropdown3" data-toggle="dropdown">
                  Tables
                </a>
                <div class="dropdown-menu" aria-labelledby="dropdown3">
                 <form method="post" action="AdminDept.jsp">
                    <button class="dropdown-item"  type="submit" >Add Department</button>
                     </form>
                    <a class="dropdown-item" href="#">Link 1.2</a>
                </div>
            </li>
        

                    </ul>
                    <div class="d-flex ms-auto">

                      <ul class="navbar-nav ">
                          <li class="nav-item">
                              <a href="#" class="nav-link">
                                  <i class="fas fa-home text-white"></i>
                              </a>
                          </li>
                         
                          <li class="nav-item">
                            <a href="#" class="nav-link">
                                <i class="fa fa-bell text-white"></i> 
                            </a>
                        </li>
                        <li class="nav-item">
                          <a href="#" class="nav-link">
                            <i class="fa-solid fa-gauge-high text-white"></i>
                          </a>
                      </li>
                         
                      <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">  <i class="fa-solid fa-wrench text-white"></i></a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">Link</a></li>
                            <li><a class="dropdown-item" href="#">Another link</a></li>
                            <li><a class="dropdown-item" href="#">A third link</a></li>
                        </ul>
                    </li>

                        <li class="nav-item dropdown">
                          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown">  <i class="fa-solid fa-star text-white"></i></a>
                          <ul class="dropdown-menu">
                              <li><a class="dropdown-item" href="#">Link</a></li>
                              <li><a class="dropdown-item" href="#">Another link</a></li>
                              <li><a class="dropdown-item" href="#">A third link</a></li>
                          </ul>
                        </li>
                         

                          <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"> <i class="fas fa-question-circle text-white"></i></a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Link</a></li>
                                <li><a class="dropdown-item" href="#">Another link</a></li>
                                <li><a class="dropdown-item" href="#">A third link</a></li>
                            </ul>
                        </li>


                          <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"><i class="fas fa-book text-white"></i></a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Link</a></li>
                                <li><a class="dropdown-item" href="#">Another link</a></li>
                                <li><a class="dropdown-item" href="#">A third link</a></li>
                            </ul>
                        </li>
                          <li class="nav-item">
                              <a href="#" class="nav-link">
                                  <i class="fas fa-envelope text-white"></i> 
                              </a>
                          </li>
  
                      </ul>
                  </div>
                </div>
            </div>
        </nav>
                 
        
    </div>
   <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
</body>
</html>