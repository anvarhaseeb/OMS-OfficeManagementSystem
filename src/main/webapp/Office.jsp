<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Office</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
        <link href="Office.css" rel="stylesheet">
      
    
        <script src="https://kit.fontawesome.com/f8ecaab97d.js" crossorigin="anonymous"></script>
  
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
     <title>OMS</title>

    
</head>
<body class="bg-light ">
<jsp:include page="pages/Header.jsp" />
       <br>

    <!-- Page content -->
    <div class="content ">
    <div class="container mt-5 txt-wght " style="height: auto ;padding: 20px;">
<%-- ---Admin Login  --%> 
         <center>
        <div id="admin-login-form" class="login-container">
        
     <div style="width: 600px;height:auto; padding: 30px; border-radius: 25px; border: 3px solid white; background-image: url('images/bgocr.jpg'); ;">
        <form action="AdmLog" method="post">
            <fieldset  style="border:3px solid white;padding: 20px;border-radius: 10px;">
                <legend  class="float-none w-auto bg-transparent p-1" style="color: #1e90ff;border-radius: 10px;border:2px solid white;">Admin </legend>
            <div class="row mb-2">
            <div class="col-6">
            <label class="font-weight-bold" style="font-weight: 500;color:white" for="username">Username:</label>
            </div>
            <div class="col-6">
            <input type="text"  style="border: 0;  background: transparent; border-bottom: 2px solid white;color:white;  id="username" name="uname" required><br>
            </div>
            </div>
            <div class="row mb-2">
        <div class="col-6">
           <label for="password" style="font-weight: 500; color: white;">Password:</label>
   </div>
            <div class="col-6">
            <input type="password"  style="border: 0;  background: transparent; border-bottom: 2px solid white;color:white"  id="password" name="psswd" required><br>
        </div>   
         </div> 
         <div class="row mb-2">
        <div class="col-6">
            <button class="btn btn-warning " style="border: 2px solid white" type="submit">Login</button>
            </div>
            <div class="col-6"></div>    
        </div> 
      </div>
        </fieldset>
        </form> 
    </div>
    </div>
      </center>  
 
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="sidebar.js"></script>

</body>
</html>
