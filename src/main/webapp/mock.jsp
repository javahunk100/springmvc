<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mock Example!</title>
</head>
<body>
	<img src="${pageContext.request.contextPath}/img/user-icon.png">
	 <H2 style="color:maroon;">Hello Spring  MVC</H2>
	  <form action="${pageContext.request.contextPath}/math/reverse">
	  	    Enter Name <input type="text" name="sname" style="height: 26px;background-color: pink;width: 300px;]">
	  	    <br/><br/><br/>
	  	    <input type="submit" value="Compute">
	  	     <hr/>
	  	     Result is........................  ${sresult} 
	  </form>
</body>
</html>