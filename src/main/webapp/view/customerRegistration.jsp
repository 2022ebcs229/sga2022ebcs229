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
    <div class="container">
        <div class="header">
            <h2>Create Account</h2>
        </div>
        <form action="/customer" method="post">
            <div class="form-control">
                <label for="id">ID:</label>
                <input type="number" id="id" name="id" required/>
            </div>
            <div class="form-control">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required/>
            </div>
            <div class="form-control">
                <label for="address">Address:</label>
                <input type="text" id="address" name="address" required/>
            </div>
            <div class="form-control">
                <label for="phone">Phone Number:</label>
                <input type="text" id="phone" name="phone" required/>
            </div>
            <div class="form-control">
                <label for="email">Email:</label>
                <input type="text" id="email" name="email" required/>
            </div>
            <button>Submit</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>


