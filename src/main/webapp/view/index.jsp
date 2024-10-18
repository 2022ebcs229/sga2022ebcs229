<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bits Pizzas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <body>

    <div class="container p-3 my-3 bg-light">
      <h1>Welcome to Bits Pizzas</h1>
      <br>
      <img src="pizza.png" alt=""  width="50" height="50">
    </div>

    <div class="container p-3 my-3 border">
      <a href="http://localhost:8080/menu"> View Menu</a>
    </div>

    <div class="container p-3 my-3 border">

      <div class="p-3 mb-2 bg-light text-dark"><h4>Customers</h4></div><br>
    <!-- goes to the customer registration form -->
    <p><a href="http://localhost:8080/customerReg">Register me</a></p> 
    <!-- goes to the customer deletion form -->
    <p><a href="http://localhost:8080/deleteCustomer">Delete me</a></p>
    <!-- goes to the order form -->
    <p><a href="http://localhost:8080/order"> Place an Order</a></p>

    </div>

    <div class="container p-3 my-3 border">
    <div class="p-3 mb-2 bg-light text-dark"><h4>Staff</h4></div><br>
      <p>
        Modify Menu : 
      <!-- goes to the add item form -->
       <a href="http://localhost:8080/saveItem">Add Item</a> |
      <!-- goes to delete item page where you can enter the Item ID from the menu shown below it -->
       <a href="http://localhost:8080/deleteItem">Delete Item</a> |
      <!-- goes to the add item form -->
       <a href="http://localhost:8080/saveItem">Edit Item</a> 
      </p>

      
      <p>
        Customer control : 
        <a href="http://localhost:8080/customers">View All</a> |
        <a href="http://localhost:8080/deleteCustomer">Delete</a>
      </p>

      
      <p></p>
      
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>