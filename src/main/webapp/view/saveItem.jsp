<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Customer Registration</title>
    <link rel="stylesheet" href="pizza.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>
    ${cr}<br><br><br>
    <a href="http://localhost:8080"> Return to home page </a>
    <div class="container">
        <div class="header">
            <h2>Add or Update Menu Item</h2>
        </div>
        <form action="/item" method="post">
            <div class="form-control">
                <label for="id">ID:</label>
                <input type="number" id="id" name="id" required/>
            </div>
            <div class="form-control">
                <label for="dish">Dish:</label>
                <input type="text" id="dish" name="dish" required/>
            </div>
            <div class="form-control">
                <label for="price">Price in Rupees:</label>
                <input type="number" step="0.01" id="price" name="price" required/>
            </div>
            <button>Submit</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>


