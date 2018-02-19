<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <script type="text/javascript">
  		function deleteBook(bid) {
	  		 $("input[type='hidden'][name='bid']").val(bid);
	  		//Submitting form through jQuery
	  		$("#deleteBookForm").submit();
  		}
  		
  		function editBook(bid) {
	  		 $("input[type='hidden'][name='bid']").val(bid);
	  		//Submitting form through jQuery
	  		$("#editBookForm").submit();
 		}
  </script>
  
	
</head>

<body>
  <form id="deleteBookForm" action="${pageContext.request.contextPath}/deleteBook" method="post">
  		<input type="hidden" name="bid" id="bid" value="0"/>
  </form>
    <form id="editBookForm" action="${pageContext.request.contextPath}/editBook" method="post">
  		<input type="hidden" name="bid" id="bid" value="0"/>
  	</form>
<header style="height: 20px;background-color: pink;">
</header>
<div class="container" style="width: 60%">
<img src="${pageContext.request.contextPath}/img/user-icon.png">
	
  <h2>Book Detaisl</h2>
     <a href="${pageContext.request.contextPath}/addBook"><img src="${pageContext.request.contextPath}/img/add-book.png"></a>
   <span style="color:green;font-size: 16px;">${param.message}</span>
  <table class="table">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
         <th>Photo</th>
         <th>Action</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${bookForms }" var="item">
      <tr>
        <td>${item.bid}</td>
        <td>${item.name}</td>
        <td>${item.publication}</td>
           <td><img src="${pageContext.request.contextPath}/find-book-image?bid=${item.bid}" style="height: 40px;"/></td>
                <td><a href="javascript:deleteBook(${item.bid})"><img src="${pageContext.request.contextPath}/img/delete.png" style="height: 32px;"></a>
                	/<a href="javascript:editBook(${item.bid})"><img src="${pageContext.request.contextPath}/img/edit.png" style="height: 20px;"></a>
                </td>
        </tr>
      </c:forEach>
          </tbody>
  </table>
</div>
</body>
</html>
