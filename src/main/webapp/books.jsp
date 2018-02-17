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
</head>
<body>
<header style="height: 20px;background-color: pink;">
</header>
<div class="container" style="width: 60%">
<img src="${pageContext.request.contextPath}/img/user-icon.png">
  <h2>Book Detaisl</h2>
  <table class="table">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${bookForms }" var="item">
      <tr>
        <td>${item.bid}</td>
        <td>${item.name}</td>
        <td>${item.publication}</td>
        </tr>
      </c:forEach>
          </tbody>
  </table>
</div>
</body>
</html>
