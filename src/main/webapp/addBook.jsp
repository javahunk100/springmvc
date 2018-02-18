<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height: 20px;background-color: pink;">
</header>
<div class="container" style="width: 60%">
<img src="${pageContext.request.contextPath}/img/user-icon.png">
  <h2>Book  Form</h2>
   <span style="color:red;font-size: 15px;">${ApplicationMessage}</span>
  <sf:form class="form-horizontal" action="${pageContext.request.contextPath}/addUpdateBook" method="post" commandName="bookForm">
    <sf:hidden path="bid"/>
   <div class="form-group">
      <label class="control-label col-sm-2" for="name">Name:</label>
      <div class="col-sm-10">
        <sf:input  class="form-control"   path="name" placeholder="Enter name"/>
      </div>
    </div>
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="auther">Author:</label>
      <div class="col-sm-10">
         <sf:input  class="form-control"   path="author" placeholder="Enter author"/>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="mobile">publication:</label>
      <div class="col-sm-10">          
       <sf:input  class="form-control"   path="publication" placeholder="Enter publication"/>
      </div>
    </div>
   <div class="form-group">
      <label class="control-label col-sm-2" for="price">Price:</label>
      <div class="col-sm-10">          
       <sf:input  class="form-control"   path="price" placeholder="Enter price"/>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="checkbox" name="remember"> Remember me</label>
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">${ButtonLable}</button>
      </div>
    </div>
</sf:form>
</div>
</body>
</html>
