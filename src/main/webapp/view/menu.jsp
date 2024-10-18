<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> -->
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bits Pizzas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
    ${cr}<br><br><br>
    <a href="http://localhost:8080"> Return to home page </a>
    <h2> </h2> <br><br>
    <table class="table">
      <c:forEach items="${menu}" var="dish">
        ${dish}
      </c:forEach>
    </table>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>