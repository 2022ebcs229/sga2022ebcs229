<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <form action="/delCustDone" method="post">
        <div class="form-control">
            <label for="id">Enter customer ID to be deleted:</label>
            <input type="number" id="id" name="id" required/>
        </div>
       <button>Submit</button>
    </form>

    
</body>
</html>