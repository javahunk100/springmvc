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
  <form class="form-horizontal" action="${pageContext.request.contextPath}/addBook" method="post">
  
   <div class="form-group">
      <label class="control-label col-sm-2" for="name">Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
      </div>
    </div>
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="auther">Author:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="author" placeholder="Enter author" name="author">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="mobile">publication:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="publication" placeholder="Enter publication" name="publication">
      </div>
    </div>
   <div class="form-group">
      <label class="control-label col-sm-2" for="price">Price:</label>
      <div class="col-sm-10">          
        <input type="text" class="form-control" id="price" placeholder="Enter price" name="price">
      </div>
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
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>
